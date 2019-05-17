/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.awt.Color;

/**
 *
 * @author Angel
 */
public class Racional {
    int num,den;

    public Racional() {
    }

    public Racional(int num, int den) throws ExceptionOsman{
        this.num = num;
        this.setDen(den);
    }

    public Racional(int num)throws ExceptionOsman {
        this.num = num;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) throws ExceptionOsman{
        if(den==0)
        {
          throw new ExceptionOsman(Color.yellow, "No");
        }
        this.den = den;
    }

    @Override
    public String toString() {
        return "Racional{" + "num=" + num + ", den=" + den + '}';
    }
    
}
