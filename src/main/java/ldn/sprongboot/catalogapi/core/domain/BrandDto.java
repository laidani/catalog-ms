package ldn.sprongboot.catalogapi.core.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class BrandDto {
    private String ref;
    private String description;
    private String madeIn;
}
