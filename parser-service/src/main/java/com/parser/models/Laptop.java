package com.parser.models;

import com.parser.models.laptop.laptopDetails.*;
import com.parser.models.laptopDetails.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
    private Long id;
    private String model;
    private Integer price;
    private Integer quantity;
    private DisplayDiagonal displayDiagonal;
    private DisplayResolution displayResolution;
    private DisplayType displayType;
    private LaptopManufacturer laptopManufacturer;
    private List<LaptopPhoto> photo;
    private ProcessorType processorType;
    private RAMSize ramSize;
    private RAMType ramType;
    private StorageType storageType;
    private StorageSize storageSize;

}
