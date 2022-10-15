package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Freqelements implements Comparable<Freqelements>
{
    int value, count, index;

    public Freqelements(int value, int count, int index)
    {
        this.value = value;
        this.count = count;
        this.index = index;
    }

    public int compareTo(Freqelements obj)
    {

        if (this.count != obj.count) {
            return obj.count - this.count;
        }

        return this.index - obj.index;
    }
}

class Main
{
    public static void sortByFrequencyAndIndex(int[] arr)
    {
        if (arr == null || arr.length < 2) {
            return;
        }

        // insert frequency of each array element into the map
        // and index of its first occurrence in the array
        Map<Integer, Freqelements> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            hm.putIfAbsent(arr[i], new Freqelements(arr[i], 0, i));
            hm.get(arr[i]).count++;
        }

        // sort the values based on a custom comparator
        List<Freqelements> values = hm.values().stream()
                .sorted()
                .collect(Collectors.toList());

        int k = 0;
        for (Freqelements Freqelements: values)
        {
            for (int j = 0; j < Freqelements.count; j++) {
                arr[k++] = Freqelements.value;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr =  {5,5,4,6,4};

        sortByFrequencyAndIndex(arr);
        System.out.println(Arrays.toString(arr));
    }
}
