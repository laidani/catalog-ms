package ldn.sprongboot.catalogapi.core.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ProductDto {
    private String ref;
    private String description;
    private CategoryDto category;
    private BrandDto brand;
}
