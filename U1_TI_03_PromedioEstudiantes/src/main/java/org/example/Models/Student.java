package org.example.Models;

public class Student {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    //getters & setters

    public String getNombre() {
        return this.nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public String getStudentID() {
        return this.matricula;
    }

    public void setMatricula(String studentID) {
        this.matricula = studentID;
    }

    public double getNotas(int i) {
        return  this.notas[i];
    }

    public void setNotas(int i, double nota) {
        notas[i] = nota;
    }

    public double getAverage(){
        double sum = 0;
        for (int i = 0; i < notas.length; i++){
            sum += notas[i];
        }
        return sum/notas.length;
    }

    public boolean approved(){
        return getAverage() >= 70;
    }
}
