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
public class ExtendedCab extends ColoradoDecorator
{
    public ExtendedCab(Colorado inColorado)
    {
        super(inColorado);
        System.out.println("Adding extended cab");
    }
    public String getDescription()
    {
        return tempColorado.getDescription() + ", extended cab";
    }
    public double getCost()
    {
        return tempColorado.getCost() + 0.0;
    }
}
