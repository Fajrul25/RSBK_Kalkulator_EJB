/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.ejb;

import javax.ejb.Local;

/**
 *
 * @author FadliCo
 */
@Local
public interface SessionBeanLocal {
    public double result(double res);  
}
