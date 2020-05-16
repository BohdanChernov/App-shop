package com.parser.models.laptopDetails;

import com.parser.models.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaptopPhoto {
    Integer id;
    String location;
    Laptop photoOwner;
}
