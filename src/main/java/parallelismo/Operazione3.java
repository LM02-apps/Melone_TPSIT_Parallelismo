/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallelismo;

/**
 *
 * @author Melone
 */
public class Operazione3 extends Thread
{
    //z=3*(c-3)
    //z=a*(c-b)
    Buffer dati;
    private double b=3;
    private double c;
    private double a=3;
    public Operazione3(Buffer d)
    {
        dati=d;
        c=dati.c;
    }
    public void run()
    {
        dati.z=a*(c-b);
        System.out.println("Ho calcolato z:"+dati.z);
    }
}
