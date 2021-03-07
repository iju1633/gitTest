package ch9;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class changingNumRandom{
public static void main(String[] args) {
  
       int a[] = new int[5];
       ArrayList<Integer> list = new ArrayList<>();
       Random r = new Random();

       for(int i=0;i<=4;i++)
       {
           a[i] = r.nextInt(10)+1; 
           for(int j=0;j<i;j++) 
           {
               if(a[i]==a[j])
               {
                   i--;
               }
           }
       }

       for (int value : a) {
           list.add(value);
       }

       Collections.sort(list);
       System.out.println(list);
   }
}