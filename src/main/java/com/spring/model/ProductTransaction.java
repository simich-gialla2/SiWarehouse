package com.spring.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "product_transaction", indexes = {
        @Index(columnList = "date_in_delivering", name = "date_in_delivering_index")
})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductTransaction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer idProductTransaction;
    @Column
    private String deliver;
    @Column
    private Date dateRequest;
    @Column(name = "date_in_delivering")
    private Date dateInDelivering;
    @Column
    private Date datePartialDelivered;
    @Column
    private Date dateDelivered;
    @Column
    private Date dateReturn;

    /**FKs to
     *      product -> product table
     *      user -> users table
     */
//    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product")
    private Product product;

//    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private User user;

    public Integer getIdProductTransaction() {
        return idProductTransaction;
    }

    public void setIdProductTransaction(Integer idProductTransaction) {
        this.idProductTransaction = idProductTransaction;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver;
    }

    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }

    public Date getDateInDelivering() {
        return dateInDelivering;
    }

    public void setDateInDelivering(Date dateInDelivering) {
        this.dateInDelivering = dateInDelivering;
    }

    public Date getDatePartialDelivered() {
        return datePartialDelivered;
    }

    public void setDatePartialDelivered(Date datePartialDelivered) {
        this.datePartialDelivered = datePartialDelivered;
    }

    public Date getDateDelivered() {
        return dateDelivered;
    }

    public void setDateDelivered(Date dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
