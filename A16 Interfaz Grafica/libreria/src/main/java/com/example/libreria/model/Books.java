package com.example.libreria.model;

import java.time.LocalDate;

public class Books implements Cloneable {
    private long idLibro;
    private String autor;
    private String titulo;
    private LocalDate fechaPublicacion;

    public Books() {}

    public Books(long idLibro, String autor, String titulo, LocalDate fechaPublicacion) {
        this.idLibro = idLibro;
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public long getIdLibro() { return idLibro; }
    public void setIdLibro(long idLibro) { this.idLibro = idLibro; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public LocalDate getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(LocalDate fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    @Override
    public Books clone() {
        try {
            return (Books) super.clone();
        } catch (CloneNotSupportedException error) {
            throw new AssertionError("Error al clonar el libro", error);
        }
    }

    @Override
    public String toString() {
        return "Libros{id=" + idLibro + ", titulo='" + titulo + "', autor='" + autor
                + "', fechaPublicacion=" + fechaPublicacion + "}";
    }
}