package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante estudiante1 = new Estudiante("Juan perez marulanda", 20, 2.5);
        Estudiante estudiante2 = new Estudiante("Ana rocio valderrama", 32, 5.0);    

        // 2. Mostrar la información de ambos estudiantes
        System.out.println("--------estudiante uno----------");
        System.out.println("nombre: " + estudiante1.getNombre() );
        System.out.println( "Edad: " + estudiante1.getEdad() );
        System.out.println("Promedio: " + estudiante1.getPromedio());
        System.out.println();
        System.out.println("--------estudiante dos----------");
        System.out.println("nombre: " + estudiante2.getNombre());
         System.out.println("Edad: " + estudiante2.getEdad());
          System.out.println("Promedio: " + estudiante2.getPromedio()) ;

        // 3. Modificar algún atributo usando un setter
        estudiante1.setEdad(21);
        estudiante2.setPromedio(9.5);       
        // 4. Mostrar la información actualizada

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 15.99);
        Libro libro2 = new Libro("1984", "George Orwell", 12.50);  
        
        System.out.println();

        System.out.println("--------libro uno----------" );

        System.out.println("nombre del libro: " + libro1.getTitulo());
        System.out.println( "Autor: " + libro1.getAutor());  
        System.out.println("Precio: " + libro1.getPrecio());
        System.out.println();

        System.out.println("--------libro dos----------");
        System.out.println("nombre del libro: " + libro2.getTitulo() );
        System.out.print( "Autor: " + libro2.getAutor());
         System.out.println( " Precio: " + libro2.getPrecio());

         System.out.println();

        // 2. Crear un libro usando el constructor con solo titulo y autor
        // 3. Mostrar información de ambos libros
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        System.out.println("--------libro tres----------");
        System.out.println("nombre del libro: " + libro3.getTitulo() );
        System.out.println(" Autor: " + libro3.getAutor()); 
        System.out.println("Precio: " + libro3.getPrecio());  
        // 4. Aplicar descuento usando ambas versiones del método
        // 5. Mostrar información actualizada de los libros
    }
}