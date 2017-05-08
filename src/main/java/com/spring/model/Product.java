package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_product")
    private Integer idProduct;
    @Column
    private String barrCode;
    @Column
    private String name;
    @Column
    private String brand;
    @Column
    private String productModel;
    @Column
    private String description;
    @Column
    private Boolean productCondition;

    /**FKs to
     *      state   -> product_state table
     *      type    -> product_type table
     *      invoice -> invoice table
     */
//    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product_state")
    private ProductType state;

//    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product_type")
    private ProductState type;

//    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_invoice")
    private Invoice invoice;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getBarrCode() {
        return barrCode;
    }

    public void setBarrCode(String barrCode) {
        this.barrCode = barrCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(Boolean productCondition) {
        this.productCondition = productCondition;
    }

    public ProductType getState() {
        return state;
    }

    public void setState(ProductType state) {
        this.state = state;
    }

    public ProductState getType() {
        return type;
    }

    public void setType(ProductState type) {
        this.type = type;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
