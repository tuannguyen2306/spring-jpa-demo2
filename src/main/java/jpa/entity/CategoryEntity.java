package jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by E6430 on 06/08/17.
 */
@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<BookEntity> bookEntity;

    public CategoryEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BookEntity> getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(List<BookEntity> bookEntity) {
        this.bookEntity = bookEntity;
    }
}
