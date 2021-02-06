package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produit;
public interface ProduitDAO extends JpaRepository<Produit, Long> {

}
