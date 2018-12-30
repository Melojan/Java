/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

/**
 *
 * @author meloj
 */
public class DeadLockDemo {
    
    public static void main(String [] args)
    {
        DeadLockDemo dld = new DeadLockDemo();
        dld.method1();
        dld.method2();
    }
    
    public void method1()
    {
        synchronized(String.class){
            System.out.println("Aquired lock on String.class object");
        }
        
        synchronized(Integer.class){
            System.out.println("Aquired lock on Integer.class object");
        }
    }
    
    public void method2()
    {
        synchronized(String.class){
            System.out.println("Aquired lock on Integer.class object");
        }
        
        synchronized(Integer.class){
            System.out.println("Aquired lock on String.class object");
        }
    }
}
