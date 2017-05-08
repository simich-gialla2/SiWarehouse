package com.spring.repositories;


import com.spring.model.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "product_type", path = "producttype")
public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {
}
