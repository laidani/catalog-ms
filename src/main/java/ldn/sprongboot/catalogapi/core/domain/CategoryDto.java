package ldn.sprongboot.catalogapi.core.domain;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CategoryDto {
    private String title;
    private String description;
}
