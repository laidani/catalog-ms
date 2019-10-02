package ldn.sprongboot.catalogapi.infrastructure.feign;


import ldn.sprongboot.catalogapi.core.domain.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "store")
public interface ProductFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/v0/products")
    ResponseEntity<List<ProductDto>> products();

}
