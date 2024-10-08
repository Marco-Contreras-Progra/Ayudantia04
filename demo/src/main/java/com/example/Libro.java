package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private int cantidadDisponible;
    private boolean disponible;

    public Libro (String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = ISBN;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = cantidadDisponible>0;
    }

    public void prestar(){
        if (disponible) {
            cantidadDisponible--;
            System.out.println("Libro prestado" + titulo);

            if (cantidadDisponible ==0){
                disponible = false;
                System.out.println("El libro" + titulo + "no esta disponible");
            }
            
        } else {
            System.out.println("El libro" + titulo + "no esta disponible");
        }
    }

    public void devolver () {
        cantidadDisponible ++;
        disponible = true;
        System.out.println("libro devuelto" + titulo + "cantidad disponible:" +cantidadDisponible);

    }

    public void mostrarInfo(){
        System.out.println("Información del libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString(){
        return "Titulo:" + this.titulo+ "Autor:" + this.autor + "Genero:" + this.genero + "ISBN:" +this.ISBN + "Cantidad:" + cantidadDisponible + "Disponible" + disponible;
    }
    
}
    

   
