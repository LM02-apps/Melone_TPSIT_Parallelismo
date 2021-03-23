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
public class CalcoloParallelo {
    public static void main(String[] args)
    {
        double a,b,c;
        a=2;
        b=3;
        c=4;
        System.out.println("Devo calcolare 3*(a-1)+2*(b-2)*3*(c-3)");
        Buffer parziali=new Buffer(a,b,c);
        Operazione1 thr1=new Operazione1 (parziali);
        Operazione2 thr2=new Operazione2 (parziali);
        Operazione3 thr3=new Operazione3 (parziali);
        Operazione4 thr4=new Operazione4 (parziali);
        thr1.start();
        thr2.start();
        thr3.start();
        try{thr2.join();}
        catch (InterruptedException e) {System.out.println("Errore thr2");}
        try{thr3.join();}
        catch(InterruptedException e) {System.out.println("Errore thr3");}
        
        thr4.start();
        try{thr1.join();}
        catch(InterruptedException e) {System.out.println("Errore thr1");}
        try{thr1.join();}
        catch(InterruptedException e) {System.out.println("Errore thr4");}
        
        //thr5.start();
        
        
        //try{thr5.join();}
        //catch(InterruptedException e) {System.out.println("Errore thr5");}
        
    }
}
