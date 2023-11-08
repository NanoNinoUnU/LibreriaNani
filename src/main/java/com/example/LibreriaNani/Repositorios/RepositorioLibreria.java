package com.example.LibreriaNani.Repositorios;

import com.example.LibreriaNani.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibreria extends JpaRepository<Libro, Integer> {
    //Todos los metodos que ejecutaran consultas a la BD
}
