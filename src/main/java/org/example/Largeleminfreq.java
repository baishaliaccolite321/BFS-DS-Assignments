package org.example;

import java.util.HashMap;
import java.util.Set;

public class Largeleminfreq {
    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int max = 0, ans = Integer.MIN_VALUE;
        for (int i : arr) {
            if (hm.get(i) > max) {
                max = hm.get(i);
                ans = i;
            }

        }
        return ans;
    }
    public static void main (String[] args) {

        int arr[] = {1, 5, 2, 1, 3, 2, 1};

        System.out.println(maxFrequencyNumber(arr));
    }
        }
