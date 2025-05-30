package JEMB.Models;

public class Persona {
    private String nombre;
    private double altura;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double CalcularIMC(){
        return peso / (altura * altura);
    }

    public String clasificarIMC(){
        double imc = CalcularIMC();
        String clasificacion = "";
        if (imc < 18.5){
            clasificacion = "Bajo peso";
        }else if (imc >= 18.5 && imc < 25){
            clasificacion = "Normal";
        } else if (imc >= 25 && imc < 30) {
            clasificacion = "Sobrepeso";
        } else if (imc >= 30) {
            clasificacion = "Obesidad";
        }
        return clasificacion;
    }

}
