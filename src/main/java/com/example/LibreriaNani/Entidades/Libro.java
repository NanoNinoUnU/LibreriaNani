package com.example.LibreriaNani.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    private int id;
    @Column(length = 50)
    private String nombreLi;
    private String autorLi;
    private int numPagLi;
    private String editorialLi;
    private String idiomaLi;

    public Libro(int id, String nombreLi, String autorLi, int numPagLi, String editorialLi, String idiomaLi) {
        this.id = id;
        this.nombreLi = nombreLi;
        this.autorLi = autorLi;
        this.numPagLi = numPagLi;
        this.editorialLi = editorialLi;
        this.idiomaLi = idiomaLi;
    }

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLi() {
        return nombreLi;
    }

    public void setNombreLi(String nombreLi) {
        this.nombreLi = nombreLi;
    }

    public String getAutorLi() {
        return autorLi;
    }

    public void setAutorLi(String autorLi) {
        this.autorLi = autorLi;
    }

    public int getNumPagLi() {
        return numPagLi;
    }

    public void setNumPagLi(int numPagLi) {
        this.numPagLi = numPagLi;
    }

    public String getEditorialLi() {
        return editorialLi;
    }

    public void setEditorialLi(String editorialLi) {
        this.editorialLi = editorialLi;
    }

    public String getIdiomaLi() {
        return idiomaLi;
    }

    public void setIdiomaLi(String idiomaLi) {
        this.idiomaLi = idiomaLi;
    }
}
