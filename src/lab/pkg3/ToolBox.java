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
public class ToolBox extends ColoradoDecorator
{
    public ToolBox(Colorado inColorado)
    {
        super(inColorado);
        System.out.println("Adding tool box");
    }
    public String getDescription()
    {
        return tempColorado.getDescription() + ", tool box";
    }
    public double getCost()
    {
        return tempColorado.getCost() + 500.00;
    }
}
