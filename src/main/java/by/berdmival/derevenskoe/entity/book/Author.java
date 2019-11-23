package by.berdmival.derevenskoe.entity.book;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String secondName;
}
