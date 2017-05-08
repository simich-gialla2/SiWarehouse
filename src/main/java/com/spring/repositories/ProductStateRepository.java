package com.spring.repositories;


import com.spring.model.ProductState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "product_state", path = "productstate")
public interface ProductStateRepository extends CrudRepository<ProductState, Integer> {
}
