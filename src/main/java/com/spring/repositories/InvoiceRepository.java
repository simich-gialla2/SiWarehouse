package com.spring.repositories;


import com.spring.model.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "invoice", path = "invoice")
public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {
}
