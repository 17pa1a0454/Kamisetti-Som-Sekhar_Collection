package com.code.List;

import java.util.*;
import org.apache.logging.log4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logr=LogManager.getLogger(App.class);
	
	
    public static void main( String[] args )
    {
    	Scanner in=new Scanner(System.in);
        logr.info("Give minimum of 10 elements to form list of Integers.Ex:1 2 3 ");
        String s=in.nextLine();
        logr.info("Functions applicable are :1.append 2.pop 3.print 4.break");
        logr.info("For append write an Integer EX: append 10");
        int i;
        for(i=0;;i++) {
        	String str=in.nextLine();
        	if(str.charAt(0)=='a') { 
        		int k=str.indexOf(' ');
        		s=s+"  "+str.substring(k+1);
        	}
        	else if(str.charAt(0)=='p' &&str.charAt(1)=='o') {
        		if(s.length()==0) { 
        			logr.info("List is empty and list is breaking");
        		break;
        		}
        		logr.info(s.substring(s.lastIndexOf(' ')));
        		s=s.substring(0,s.lastIndexOf(' ')+1);
        	}
        	else if(str.charAt(0)=='p')
        		logr.info(s);
        	else break;
        }
        
    }
}
