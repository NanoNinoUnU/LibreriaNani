package com.example.LibreriaNani.Controladores;

import com.example.LibreriaNani.Entidades.Libro;
import com.example.LibreriaNani.Servicios.ServicioLibreria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/LibreriaNani")
public class Controlador1 {
    @Autowired
    ServicioLibreria sLibro;
    
    @GetMapping("")//no es un edpoint si no le agregas esto
    public List<Libro> getTodosLosLibros(){
        return sLibro.obtenerTodosLosLibros();
        
    }
    @PostMapping("")
    public List<Libro> postInsertarLIbro(@RequestBody Libro a1){
        if(sLibro.insertarLibro(a1)){
            return sLibro.obtenerTodosLosLibros();
        }else{
            return null;
        }
    }
    @PutMapping("")
    public List<Libro> putActualizarAnimal(@RequestBody Libro a1){
        if(sLibro.actualizarLibro(a1)){
            return sLibro.obtenerTodosLosLibros();
        }else{
            return null;
        }
    }
    @DeleteMapping("")
    public List<Libro> deleteAnimal(@RequestBody Libro a1){
        if(sLibro.eliminarLibro(a1)){
            return sLibro.obtenerTodosLosLibros();
        }else{
            return null;
        }
    }
}
