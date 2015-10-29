/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Soaint
 */

public class UtilLog {
    
    final static Logger logger =  LoggerFactory.getLogger(UtilLog.class);

    public static void log(String mensaje){
    	System.out.println("HOLA");
	try{
            logger.debug(mensaje);
            logger.debug("HELLO VIVIANA");	
	} catch(Exception e){
System.out.println("ERROR EN LOG");
}	
    }
}