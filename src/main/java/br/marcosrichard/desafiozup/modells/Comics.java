package br.marcosrichard.desafiozup.modells;





import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.CodePointLength;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;

@Entity
public class Comics<T> {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long ComicId;

    @Column(name="ComicId")
    private Long id;

    private String title;

    @Transient
    private List<T> prices;

    @Column(name = "DESCRIPTION")
    @Size(min=0,max=1000)
    private String description;

    private String isbn;

    @Transient
    private Object creators;

    public Comics() {

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<T> getPrices() {
        return prices;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public Object getCreators() {
        return creators;
    }

    public Long getComicId() {
        return ComicId;
    }

    public Comics(Long comicId, Long id, String title, List<T> prices, String description, String isbn, Object creators) {
        ComicId = comicId;
        this.id = id;
        this.title = title;
        this.prices = prices;
        this.description = description;
        this.isbn = isbn;
        this.creators = creators;
    }
}
