package com.shop.dao;

import com.shop.models.laptop.Laptop;
import com.shop.models.laptop.laptopDetails.LaptopManufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface DAOLaptopInterface extends JpaRepository<Laptop, Long>, JpaSpecificationExecutor<Laptop> {
    Optional<Laptop> findById(Long id);
    Optional<Laptop> findByLaptopManufacturerAndModel(LaptopManufacturer manufacturer, String model);
}
