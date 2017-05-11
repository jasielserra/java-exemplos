import java.util.*;
import java.lang.*;
import java.io.*;

public class Vetor {

    public static void main(String[] args) throws java.lang.Exception {

    	int[] vetor = new int[4];
    	int n=1;
 
        
        for(int i=0; i < vetor.length; i++){
            	vetor[i] = n+i;
        }


        for(int i=0; i < vetor.length; i++){
        	System.out.println(vetor[i]);
        }
       
       
    }
}
