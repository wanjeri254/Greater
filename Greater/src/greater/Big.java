/*c
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author eva
 */
public class Big {
    public static void main(String[]array){
        //enter the number of strings you want to input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[]s = new String [n];
    /* the  for loop goes through n which is the number of strings you want to enter.for example if you are entering fivestrings it goes 
 through array[0] which means enter first string until array[4] which is the fifth string */
    for(int i =0; i<n; i++){
        // enter the string inputs directly on the keyboard string by string
    String str = sc.next();
    //we have declare the string array s with the string method bigs
    s[i] = bigs(str);
    
    }
    
      for(int i=0;i< s.length;i++){
//print the string string array
        System.out.println(s[i]);
    }
        
    }

    private static String bigs(String st) {
              String str = st;
         
         //if the length of the string is equals to one then the results in no answer.
         
         //if the length of string is equals to one we will return no anser
         if(str.length()==1){
        return "no answer";
    }
         // store characters in a character array in an array list
           ArrayList<Character> car = new ArrayList<>();
           /*returns  the character at the specified in the specified  indexed of a string.The indexed specified is str.length()-1
           It then adds inthe array list car
           */
           car.add(str.charAt(str.length()-1));
        //a loop that goes through the loop from the last character of the string to the beginning chracter of the string
       for(int i=str.length()-1;i>=1;i--){
           /*gives out a condition  if the subtraction of the maximum length of the stringand the specified indexed(str.charAt(i)) is greater or
           equalto the subtraction of the maximum length of the stringand the specified indexed(str.charAt(i-1))
           */
        if(100- str.charAt(i) >= 100-str.charAt(i-1)){
                       /*returns  the character at the specified in the specified  indexed of a string.The indexed specified is (i-1}
           It then adds inthe array list car
           */
           car.add(str.charAt(i-1));
        }
        else{
            // declare character  with the specified indexed  ofthe string which is (i-1)
            char stop = str.charAt(i-1);
//gets the maximum possible value for any integer of integer min
            int min=Integer.MAX_VALUE;
            
            int min_diff =-1;
            //reverses the order of elements  in the Arraylist (car)
            Collections.reverse(car);
            /* a for loop is included where we take integer j is equal zero , the j is less than the number of objects in the array 
            within the for loop 
           */
for(int j=0;j<car.size();j++){
    
                if(min>( 100-stop - 100-car.get(j)  ) &&  100-stop > 100-car.get(j) ){
                    min_diff = j;
                }
                else{
                    break;
                }

            }

            char r = car.get(min_diff);
            str=str.substring(0,i-1) + r ;
           car.set(min_diff,stop);

            for(int x=car.size()-1;x>=0;x--){
                str=str+ car.get(x);
            }
            //if there duplicates of characters inthe string example 'bb' it gives  out a result of no answer
            return  str==st? "no answer" : str;
        }

    }
    return "no answer";
    }
    
    
    
    

    
}
