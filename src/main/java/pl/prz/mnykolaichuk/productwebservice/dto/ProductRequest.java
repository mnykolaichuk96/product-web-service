package pl.prz.mnykolaichuk.productwebservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

//Data Transfer Object obiekt zawierający wszystkie dane o tabeli wykorzystujacy sie dla przekazania tych danych
//pomiedzy warstwami
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
