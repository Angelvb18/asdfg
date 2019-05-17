/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.awt.Color;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Es un error en el momento de ejecucion
        /*thowble*/
 /*Errores no controlables theredDeath
          soutch memorry error, awrerror*/

        //Execptions /*Runtime Exception, Ioexception*/
        //inputmistomted
        //arrayindexofbonds
        /*La exception se manejan por 1try cath -finally
          2throws*/
        boolean v = true;
        while (v) {
            try {
            int x, y, z;
            Scanner sc = new Scanner(System.in);
            System.out.println("x");
            x = sc.nextInt();
            System.out.println("y");
            y = sc.nextInt();
            z = x / y;
            System.out.println("z" + z);
            int []a= new int [10];
            a[98]=500;
        }
        catch (ArithmeticException e) {
            System.out.println("no se puede dividir entre 0");
            v=true;
        }
        catch(InputMismatchException e)
        {
            System.out.println("entrada no valida");
            v=true;
        }
        catch(Exception e)
        {
            v=false;
            System.out.println("ocurio un error fatal");
        }
        }
        
        System.out.println("hola");
        /*Pasos para crear una exception 1.Crear un clase que herede de exception
          2.crear un metodo para hacer la validacion y lanzar la excepcion utulixando throes/throw
        3.al utilzar el metodo,manegar la excepcion por medio de try catch*/
        Scanner lea = new Scanner(System.in);
       
       
           int x,y;
           System.out.println("Ingrese numero");
           x=lea.nextInt();
           System.out.println("Ingrese numero");
           y=lea.nextInt();
           
        try {
            Racional ra = new Racional(x, y);
        } catch (ExceptionOsman ex) {
            System.out.println("jb");
        }
       
    }
    static void validar(int x)throws ExceptionOsman
    {
       if(x<0)
       {
          throw new ExceptionOsman(Color.yellow,"no");
       }
    }
    
    
    
    
    
    
    
    
    
}
