package by.berdmival.derevenskoe.entity.product;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "categories")
public class Category implements Serializable {
    private static final long serialVersionUID = -5839004845179759699L;
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
