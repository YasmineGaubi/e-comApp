package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Commande;

public interface CommandeDAO extends JpaRepository<Commande, Long>{

}
