

package com.ecommerceapp.product_service.Service;

import com.ecommerceapp.product_service.DTO.productRequest;
import com.ecommerceapp.product_service.DTO.productResponse;
import com.ecommerceapp.product_service.Model.product;
import com.ecommerceapp.product_service.Repository.productRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class productService {
    private static final Logger log = LoggerFactory.getLogger(productService.class);
    @Autowired
    private  productRepository repo;


    public void create(productRequest Product){
        product pre=new product();
        pre.setName(Product.getName());
        pre.setDescription(Product.getDescription());
        pre.setPrice(Product.getPrice());
        repo.save(pre);
        log.info("product {} is save",pre.getId());
    }

    public List<productResponse> getAllproducts(){
        List<product> arr= repo.findAll();
        return arr.stream().map(this::mappingTo).toList();

    }
    public productResponse mappingTo(product pro){
        productResponse prs=new productResponse();
        prs.setName(pro.getId());
        prs.setName(pro.getName());
        prs.setDescription(pro.getDescription());
        prs.setPrice(pro.getPrice());
        return prs;
    }

}
