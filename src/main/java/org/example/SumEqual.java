package org.example;

import java.util.*;
public class SumEqual
{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int sum = scn.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> test = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
            Integer j = test.get(arr[i]);
            test.put(arr[i], (j == null) ? 1 : j + 1);
        }
        int result = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == sum - arr[i])
            {
                result += (test.get(arr[i]) - 1);
            }
            else
            {
                Integer j = test.get(sum - arr[i]);
                if(j!=null)
                    result += j;
            }
        }
        result /= 2;
        System.out.println("Number of pairs with the given sum are: "+result);
    }
}
