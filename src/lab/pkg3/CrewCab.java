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
public class CrewCab extends ColoradoDecorator
{
    public CrewCab(Colorado inColorado)
    {
        super(inColorado);
        System.out.println("Adding crew cab");
    }
    public String getDescription()
    {
        return tempColorado.getDescription() + ", crew cab";
    }
    public double getCost()
    {
        return tempColorado.getCost() + 7000.0;
    }
}
