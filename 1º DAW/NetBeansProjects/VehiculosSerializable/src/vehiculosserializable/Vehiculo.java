/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosserializable;

import java.io.Serializable;

/**
 *
 * @author Mariajo
 */
public class Vehiculo implements Serializable {
    private String matricula;
   private String marca;
    private String modelo;
    private double deposito;

    public Vehiculo(String matricula, String marca, String modelo, double deposito) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.deposito = deposito;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDeposito() {
        return deposito;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", deposito=" + deposito + '}';
    }
    
    
}
