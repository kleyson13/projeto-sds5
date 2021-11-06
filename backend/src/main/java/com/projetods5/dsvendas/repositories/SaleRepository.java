package com.projetods5.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetods5.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
