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
public class Operazione4 extends Thread{
    //t=y*z
    Buffer dati;
    private double y;
    private double z;
    
    public Operazione4(Buffer d)
    {
        dati=d;
        y=dati.y;
        z=dati.z;
    }
    public void run()
    {
        dati.t=y*z;
        System.out.println("Ho calcolato z:"+dati.t);
    }
}
