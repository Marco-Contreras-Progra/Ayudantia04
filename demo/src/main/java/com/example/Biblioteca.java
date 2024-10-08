package com.example;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }
    public boolean agregarLibro (String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible){
        if (buscarLibro(titulo, ISBN) == null){
        Libro libro = new Libro(titulo, autor, genero, ISBN, cantidadDisponible, disponible);
        this.libros.add(libro);
        return true;
        }
        else{
             return false;
        }
    }
    
    public Libro buscarLibro(String titulo, String ISBN){
        for (Libro libro : this.libros){
            if (libro.getTitulo().equals(titulo) && libro.getISBN().equals(ISBN)){
                return libro;
            }
        }
        return null;
    }
    public void mostrarLibrosDisponibles (){
        System.out.println("Libros disponibles:");

        boolean hayDisponnibles = false;
        for (Libro libro : this.libros) {
            if (libro.isDisponible()){
                libro.mostrarInfo();
                hayDisponnibles = true;

            }
        }
        if (!hayDisponnibles){
            System.out.println("No hay libros disponibles");

        }
    }
    

}


