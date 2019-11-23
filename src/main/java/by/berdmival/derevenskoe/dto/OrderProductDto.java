package by.berdmival.derevenskoe.dto;

import by.berdmival.bookstore.entity.book.Book;
import lombok.Data;

@Data
public class OrderProductDto {
    private Book book;
    private int quantity;
}
