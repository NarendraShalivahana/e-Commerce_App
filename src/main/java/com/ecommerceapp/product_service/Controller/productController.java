package com.ecommerceapp.product_service.Controller;

import com.ecommerceapp.product_service.DTO.productRequest;
import com.ecommerceapp.product_service.DTO.productResponse;
import com.ecommerceapp.product_service.Service.productService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product_service")
public class productController {

    private final productService service;

    public productController(productService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody productRequest pre){
        service.create(pre);
    }
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<productResponse> getAllProducts(){
        List<productResponse> arr=service.getAllproducts();
        return arr;
    }


}
