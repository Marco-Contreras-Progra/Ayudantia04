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
    public void mostrarLibros() {
        System.out.println("Listado de todos los libros:");
        System.out.println("-------------------------");
        for (Libro libro : this.libros) {
            System.out.println("Información del libro:");
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Género: " + libro.getGenero());
            System.out.println("ISBN: " + libro.getISBN());
            System.out.println("Cantidad disponible: " + libro.getCantidadDisponible());
            System.out.println("Disponible: " + (libro.isDisponible() ? "Sí" : "No"));
        }
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
    public Libro buscarLibroPorNombre(String nombre) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equalsIgnoreCase(nombre)) {
                return libro;
            }
        }
        return null; 
    }

    public Libro buscarLibroPorAutor(String autor) {
        for (Libro libro : this.libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) { 
                return libro;
            }
        }
        return null; 
    }

    public boolean eliminarLibro(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getCantidadDisponible() == 0) {
                this.libros.remove(libro);
                System.out.println("El libro " + titulo + " ha sido eliminado de la biblioteca.");
                return true; 
            }
        }
        System.out.println("No se puede eliminar el libro" + titulo + "Puede que tenga copias disponibles o no esté en la biblioteca.");
        return false; 
    }
    public void prestarLibro(String titulo) {
        Libro libro = buscarLibroPorNombre(titulo);
        
        if (libro != null) {
            if (libro.isDisponible()) {
                libro.prestar();
                System.out.println("---------------------------------------------------");
                System.out.println("El libro " + titulo + " ha sido prestado.");
            } else {
                System.out.println("---------------------------------------------------");
                System.out.println("El libro " + titulo + " no está disponible para prestar.");
            }
        } else {
            System.out.println("---------------------------------------------------");
            System.out.println("El libro " + titulo +  " no se encuentra en la biblioteca");
        }

    }
    public void devolverLibro(String titulo) {
        Libro libro = buscarLibroPorNombre(titulo);
        
        if (libro != null) {
            libro.devolver();
            System.out.println("El libro " + titulo + "ha sido devuelto");
        } else {
            System.out.println("El libro " + titulo + " no se encuentra en la biblioteca.");
        }
    }

}


