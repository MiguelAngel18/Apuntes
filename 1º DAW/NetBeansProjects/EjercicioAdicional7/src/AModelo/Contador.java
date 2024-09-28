/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

/**
 * @author Miguel Ángel
 */
public class Contador
{
    private int cont,limiteSuperior,limiteInferior;

    public Contador()
    {
        limiteSuperior = 100;
        limiteInferior = 0;
        cont =0;
    }

    public int getCont()
    {
        return cont;
    }

    public void setCont(int cont)
    {
        this.cont = cont;
    }

    public int getLimiteSuperior()
    {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior)
    {
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInferior()
    {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior)
    {
        this.limiteInferior = limiteInferior;
    }

    @Override
    public String toString()
    {
        return "Contador{" + "cont=" + cont + ", limiteSuperior=" + limiteSuperior + ", limiteInferior=" + limiteInferior + '}';
    }   
}
