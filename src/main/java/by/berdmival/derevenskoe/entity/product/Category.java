package by.berdmival.derevenskoe.entity.product;

import lombok.Data;

import javax.persistence.*;

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

    @ManyToOne
    private Category parentCategory;
}
