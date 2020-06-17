/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.ejb;

import javax.ejb.Stateful;

/**
 *
 * @author FadliCo
 */
@Stateful
public class SessionBean implements SessionBeanLocal {
    
    @Override    public double result(double res) {
         return res;    
     }
}
