/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigger;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author eva
 */
public class Bigger {

    /**
     * @param args the command line arguments
     */
    
    //I have added an explanation to this code to understand the solution of the code challenge
    public static void main(String[] args) {
        
        // TODO code application logic here
        // introduce a variable s with its  data type String
        String s= "";
        // In our case, we will enter our input using the Scanner inbuilt class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");
       s = sc.nextLine();
       
       //Introduce variable result with a data type String.Initialize it with "no answer"
         String result = "no answer";
         //Introduce a boolean flag in the code  and set it to false
        boolean flag=false;
        
        // Introduce char[] c and initialize it with s.toCharArray().
        //toCharArray() will convert a string to a sequence of characters 
        // seperate string or words into characters.
        char[] c = s.toCharArray();
    
    for(int i=c.length-1;i>1;i--){
        for(int j=c.length-2;j>-1;j--){
            //in this condition we determine which character is larger than the other
           if(c[i] > c[j]){
               //when the flag is true that means the condition above is meant 
              flag=true; 
              
              char temp = c[i]; 
              c[i]=c[j];
              c[j]=temp;
              //String.valueOf() converts the value of c and convert it as String 
            String str = String.valueOf(c);
            //provide a substring from the string from index 0 to index i
            String l = str.substring(0,i);
            // introduce char[]t and split the substring into characters
            char[]t=str.substring(i).toCharArray();
            //sort character t
            Arrays.sort(t);
            // get the value of character t and convert it a string 
            String r = String.valueOf(t);
            // get the final result
            result = l + r;
            break;
            }
        }
        // set a condition where if flag is true break the loop
           if(flag==true){
           break;
           }
         }
    // print result
            System.out.println(result);
     
    }
    
}
