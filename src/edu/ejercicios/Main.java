package edu.ejercicios;

import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("001", "Juan Perez", "4444", "5 calle 8-14");
        alumno1.agregarCurso(new Curso("12", "Derecho", 1));

        Alumno alumno2 = new Alumno("002", "Maria Garcia", "5555", "10 avenue 15-20");
        alumno2.agregarCurso(new Curso("15", "Matematicas", 2));

        Alumno alumno3 = new Alumno("003", "Carlos Lopez", "6666", "7 street 12-30");
        alumno3.agregarCurso(new Curso("18", "Historia", 3));

        Alumno alumno4 = new Alumno("004", "Ana Martinez", "7777", "3 road 5-18");
        alumno4.agregarCurso(new Curso("20", "Biologia", 4));

        Curso curso1 = new Curso("555", "Programacion", 500);
        Curso curso2 = new Curso("556", "Inglés", 300);

        System.out.println("Nombre del alumno: " + alumno1.getNombre());
        System.out.println("Carnet: " + alumno1.getCarnet());
        for (Curso curso : alumno1.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + " Valor: " + curso.getCosto());
        }

        System.out.println("Nombre del alumno: " + alumno2.getNombre());
        System.out.println("Carnet: " + alumno2.getCarnet());
        for (Curso curso : alumno2.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + " Valor: " + curso.getCosto());
        }

        System.out.println("Nombre del alumno: " + alumno3.getNombre());
        System.out.println("Carnet: " + alumno3.getCarnet());
        for (Curso curso : alumno3.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + " Valor: " + curso.getCosto());
        }

        System.out.println("Nombre del alumno: " + alumno4.getNombre());
        System.out.println("Carnet: " + alumno4.getCarnet());
        for (Curso curso : alumno4.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + " Valor: " + curso.getCosto());
        }
    }
}
