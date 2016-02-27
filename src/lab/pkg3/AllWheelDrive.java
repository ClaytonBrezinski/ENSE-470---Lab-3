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
public class AllWheelDrive extends ColoradoDecorator
{
    public AllWheelDrive(Colorado inColorado)
    {
        super(inColorado);
        System.out.println("Adding all wheel drive");
    }
    public String getDescription()
    {
        return tempColorado.getDescription() + ", all wheel drive";
    }
    public double getCost()
    {
        return tempColorado.getCost() + 2000.0;
    }
}
