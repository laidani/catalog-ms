package ldn.sprongboot.catalogapi.services;

import ldn.sprongboot.catalogapi.core.domain.ProductDto;
import ldn.sprongboot.catalogapi.infrastructure.feign.ProductFeign;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {

    private ProductFeign productFeign;

    public ProductService(ProductFeign productFeign) {
        this.productFeign = productFeign;
    }

    public List<ProductDto> products() {
        ResponseEntity<List<ProductDto>> products = productFeign.products();
        if(products.getStatusCode().is2xxSuccessful()){
            return products.getBody();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Products not founds");
    }

}
