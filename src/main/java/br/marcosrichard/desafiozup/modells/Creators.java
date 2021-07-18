package br.marcosrichard.desafiozup.modells;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.List;

@Data
@AllArgsConstructor
public class Creators<T> {
    private Integer available;
    private String collectionURI;
    private List<T> items;
    private Integer returned;
}
