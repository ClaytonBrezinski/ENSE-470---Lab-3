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
public class ShortBox extends ColoradoDecorator
{
    public ShortBox(Colorado inColorado)
    {
        super(inColorado);
        System.out.println("Adding short box");
    }
    public String getDescription()
    {
        return tempColorado.getDescription() + ", short box";
    }
    public double getCost()
    {
        return tempColorado.getCost() - 2000.0;
    }
}
