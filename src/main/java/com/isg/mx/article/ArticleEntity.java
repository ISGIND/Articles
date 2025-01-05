package com.isg.mx.article;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;

@Entity
@Table(name = "articles")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ArticleEntity {

    @Id
    @Size(min = 0, max = 10)
    private String id;

    @Size(min = 0, max = 20)
    private String nombre;

    @Size(min = 0, max = 200)
    private String descripcion;

    private BigDecimal precio;

    @Size(min = 0, max = 10)
    private String modelo;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}