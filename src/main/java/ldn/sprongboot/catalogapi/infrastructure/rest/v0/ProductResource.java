package ldn.sprongboot.catalogapi.infrastructure.rest.v0;

import ldn.sprongboot.catalogapi.core.domain.ProductDto;
import ldn.sprongboot.catalogapi.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v0/products")
public class ProductResource {

    private ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> products() {
        return ResponseEntity.ok(productService.products());
    }
}
