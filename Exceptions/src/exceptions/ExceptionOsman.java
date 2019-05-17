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
public class ExceptionOsman extends Exception{
    private Color color;

    public ExceptionOsman() {
        super();
    }
    
    public ExceptionOsman(Color color) {
        this.color = color;
    }

    public ExceptionOsman(Color color, String message) {
        super(message);
        this.color = color;
    }

    public ExceptionOsman(Color color, String message, Throwable cause) {
        super(message, cause);
        this.color = color;
    }

    public ExceptionOsman(Color color, Throwable cause) {
        super(cause);
        this.color = color;
    }

    public ExceptionOsman(Color color, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
