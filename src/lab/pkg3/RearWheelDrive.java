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
public class RearWheelDrive extends ColoradoDecorator
{
    public RearWheelDrive(Colorado inColorado)
    {
        super(inColorado);
        System.out.println("Adding rear wheel drive");
    }
    public String getDescription()
    {
        return tempColorado.getDescription() + ", rear wheel drive";
    }
    public double getCost()
    {
        return tempColorado.getCost() + 0.0;
    }
}
