package com.imdad.cakestroy.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ProductDTO {

    @Getter
    @Setter
    private Long id;
    private String name;
    private int categoryId;
    private double price;
     private double weight;
    private String description;
    private String imageName;

}
