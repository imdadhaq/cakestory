package com.imdad.cakestroy.service;


import com.imdad.cakestroy.model.Product;
import com.imdad.cakestroy.respository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepository;
    public List<Product> getAllProduct() {
        return productRepository.findAll() ;
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public  void removeProductById(long id) {
        productRepository.deleteById(id);
    }
    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);}
    public List<Product> getAllProductsBycategoryId(int id){
        return  productRepository.findAllByCategory_Id(id);
    }


}
