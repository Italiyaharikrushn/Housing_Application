package com.Housing.Housing.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private int bedrooms;
    private int bathrooms;
    private int squareFootage;
    private String location;
    private int salePrice;
}