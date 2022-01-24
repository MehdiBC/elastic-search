package com.elasticsearch.catalogue.repositories;

import com.elasticsearch.catalogue.documents.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {
}
