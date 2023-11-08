/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.LibreriaNani.Servicios;

import com.example.LibreriaNani.Entidades.Libro;
import com.example.LibreriaNani.Repositorios.RepositorioLibreria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author double
 */
public class ServicioLibreria {

    //inyectar el repositorio en el servicio
    //inyección de dependencias
    @Autowired
    RepositorioLibreria rLibro;

    public List<Libro> obtenerTodosLosLibros() {
        return rLibro.findAll();
    }

    public boolean insertarLibro(Libro a) {
        boolean respuesta = false;
        try {
            rLibro.save(a);//insert o update a nicel de bd
            respuesta=true;
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }
    public boolean actualizarLibro(Libro a) {
        boolean respuesta = false;
        try {
            rLibro.save(a);//insert o update a nicel de bd
            respuesta=true;
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }
    public boolean eliminarLibro(Libro a) {
        boolean respuesta = false;
        try {
            rLibro.delete(a);//delete a nicel de bd
            respuesta=true;
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

}
