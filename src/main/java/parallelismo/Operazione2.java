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
public class Operazione2 extends Thread
{
    //y=2*(b-2)
    //y=c*(b-a)
    Buffer dati;
    private double b;
    private double c=2;
    private double a=2;
    public Operazione2(Buffer d)
    {
        dati=d;
        b=dati.b;
    }
    public void run()
    {
        dati.y=c*(b-a);
        System.out.println("Ho calcolato y:"+dati.y);
    }
}
