package by.berdmival.derevenskoe.entity.product;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

    private String title;
    private String description;

    @OneToMany
    private List<Category> childCategories;
}
