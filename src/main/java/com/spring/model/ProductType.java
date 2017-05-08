package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "product_type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_product_type")
    private Integer idProductType;
    @Column
    private String description;

    public Integer getIdProductType() {
        return idProductType;
    }

    public void setIdProductType(Integer idProductType) {
        this.idProductType = idProductType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
