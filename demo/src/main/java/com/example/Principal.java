package com.example;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("El Principito", "Antoine", "Cuento", "987", 0, false);
        biblioteca.agregarLibro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", "345", 2, true);
        biblioteca.agregarLibro("Matar a un Ruiseñor", "Harper", "Ficción", "456", 4, true);
        biblioteca.agregarLibro("Orgullo y Prejuicio", "Jane Austen", "Romance", "123", 1, true);
        biblioteca.agregarLibro("El Gran Gatsby", "Scott", "Ficción", "012", 6, true);
        
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.prestarLibro("El Principito");
        biblioteca.prestarLibro("Don Quijote de la Mancha");
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.devolverLibro("El Principito");
        biblioteca.devolverLibro("Don Quijote de la Mancha");
        biblioteca.mostrarLibrosDisponibles();

        Libro libro1 = biblioteca.buscarLibroPorNombre("El Principito");
        System.out.println(libro1.toString());

        Libro libro2 = biblioteca.buscarLibroPorAutor("Harper");
        System.out.println(libro2.toString());
        Libro libro3 = biblioteca.buscarLibroPorAutor("Antoine");
        System.out.println(libro3.toString());

        biblioteca.eliminarLibro("El Principito");
        biblioteca.mostrarLibros();





    

    }
    
}
