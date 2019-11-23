package by.berdmival.derevenskoe.entity.order;

import by.berdmival.derevenskoe.entity.book.Book;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private int quantity;

    public OrderDetails(Order order, Book book, Integer quantity) {
        this.order = order;
        this.book = book;
        this.quantity = quantity;
    }

    @Transient
    public Double getTotalPrice() {
        return this.getBook().getPrice() * this.getQuantity();
    }
}
