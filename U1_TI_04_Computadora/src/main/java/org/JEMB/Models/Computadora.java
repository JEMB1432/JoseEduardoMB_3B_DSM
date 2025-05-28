package org.JEMB.Models;

public class Computadora {
    private String marcaComputadora = "Lenovo";
    private String modeloComputadora;
    private boolean encendida;

    public String getMarcaComputadora() {
        return marcaComputadora;
    }

    public String getModeloComputadora() {
        return modeloComputadora;
    }

    public void setModeloComputadora(String modeloComputadora) {
        this.modeloComputadora = modeloComputadora;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public void encender(){
        if(!encendida){
            encendida = true;
            System.out.println("Encendiendo");
        }
    }

    public void apagar(){
        if(encendida){
            encendida = false;
            System.out.println("Apagando");
        }
    }

}
