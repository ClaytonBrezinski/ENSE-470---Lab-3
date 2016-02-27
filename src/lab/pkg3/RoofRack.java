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
public class RoofRack extends ColoradoDecorator
{
    public RoofRack(Colorado inColorado)
    {
        super(inColorado);
        System.out.println("Adding roof rack");
    }
    public String getDescription()
    {
        return tempColorado.getDescription() + ", roof rack";
    }
    public double getCost()
    {
        return tempColorado.getCost() + 250.00;
    }
}
