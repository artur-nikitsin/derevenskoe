package by.berdmival.derevenskoe.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private double coefficient;
    private String description;
    private boolean advisable;
    private boolean enabled;

    @ElementCollection(targetClass = String.class)
    private List<String> pictures;

    @ManyToOne
    private Category category;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "related_products",
            joinColumns = @JoinColumn(name = "parent_id"),
            inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Product> relatedProducts;
}
