/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoap;

import java.io.Serializable;

/**
 *
 * @author Miguel Ángel
 */
public class Vehiculo implements Serializable
{
    private String matricula,marca,modelo;
    private double deposito;

    public Vehiculo(String matricula, String marca, String modelo, double deposito)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        /* transient */ this.deposito = deposito;
    }

    @Override
    public String toString()
    {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", deposito0=" + deposito + '}';
    }
    

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public double getDeposito()
    {
        return deposito;
    }

    public void setDeposito(double deposito0)
    {
        this.deposito = deposito0;
    }
}
