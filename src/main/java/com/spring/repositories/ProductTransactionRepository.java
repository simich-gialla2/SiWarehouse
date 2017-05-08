package com.spring.repositories;


import com.spring.model.ProductTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "product_transaction", path = "producttransaction")
public interface ProductTransactionRepository extends CrudRepository<ProductTransaction, Integer> {
}
