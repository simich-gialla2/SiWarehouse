package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "product_state")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductState {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_product_state")
    private Integer idProductState;
    @Column
    private String description;

    public Integer getIdProductState() {
        return idProductState;
    }

    public void setIdProductState(Integer idProductState) {
        this.idProductState = idProductState;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
