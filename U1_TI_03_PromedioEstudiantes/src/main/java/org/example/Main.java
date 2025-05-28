package org.example;

import org.example.Models.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Eduardo");
        student1.setMatricula("20243ds041");
        student1.setNotas(0,90);
        student1.setNotas(1,100);
        student1.setNotas(2,80);
        student1.setNotas(3,90);
        student1.setNotas(4,100);

        System.out.println("-----------------------\n Estudiante: " + student1.getNombre() + "\n Promedio: "+student1.getAverage() +
                "\n Aprobado: " + student1.approved());

        Student student2 = new Student();
        student2.setName("Juan");
        student2.setMatricula("20243ds045");
        student2.setNotas(0,90);

        System.out.println("-----------------------\n Estudiante: " + student2.getNombre() + "\n Promedio: "+student2.getAverage() +
                "\n Aprobado: " + student2.approved());

        Student student3 = new Student();
        student3.setName("Fernando");
        student3.setMatricula("20243ds046");
        student3.setNotas(0,80);

        System.out.println("-----------------------\n Estudiante: " + student3.getNombre() + "\n Promedio: "+student3.getAverage() +
                "\n Aprobado: " + student3.approved());

        Student student4 = new Student();
        student4.setName("Aldo");
        student4.setMatricula("20243ds047");
        student4.setNotas(0,60);

        System.out.println("-----------------------\n Estudiante: " + student4.getNombre() + "\n Promedio: "+student4.getAverage() +
                "\n Aprobado: " + student4.approved());

        Student student5 = new Student();
        student5.setName("Alex");
        student5.setMatricula("20243ds042");
        student5.setNotas(0,90);

        System.out.println("-----------------------\n Estudiante: " + student5.getNombre() + "\n Promedio: "+student5.getAverage() +
                "\n Aprobado: " + student5.approved());
    }
}