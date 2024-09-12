package com.ecommerceapp.product_service.Repository;

import com.ecommerceapp.product_service.Model.product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends MongoRepository<product, String> {
}
