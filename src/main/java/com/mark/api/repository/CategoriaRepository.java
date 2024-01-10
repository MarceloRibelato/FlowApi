package com.mark.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.api.model.Categoria;



public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
