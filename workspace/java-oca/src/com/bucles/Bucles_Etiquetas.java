package com.bucles;

public class Bucles_Etiquetas {
    
    public static void main(String[] args) {
        
        int a = 0, s=0, i=1;
        
        principal: for(;i<10;i++) {
        	System.out.println("i"+i);
        	while(a<5) {
        		a=i++;
        		s=a+i;
        		if (s>=10) {
        			break principal;
        		}
        	}
        }
        System.out.println(i+":"+a+":"+s);
    }

}
