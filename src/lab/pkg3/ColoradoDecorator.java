/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

/**
 *
 * @author Dolan
 */
public abstract class ColoradoDecorator implements Colorado
{
    Colorado tempColorado;
    
    public ColoradoDecorator(Colorado inColorado)
    {
        this.tempColorado = inColorado;
    }
    public String getDescription()
    {
        return this.tempColorado.getDescription();
    }
    public double getCost()
    {
        return this.tempColorado.getCost();
    }
}

