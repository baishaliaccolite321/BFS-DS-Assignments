package org.example;
public class Leader
{
    public static void getResult(int arr[], int N)
    {
        for (int i = 0; i < N; i++)
        {
            int j;
            for (j = i + 1; j < N; j++)
            {
                if (arr[i] <=arr[j])
                {
                    break;
                }
            }

            // The loop didn't break
            if (j == N)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        Leader res = new Leader();
        int arr[] = new int[]{1,2,3,4,0};
        int n = arr.length;
        System.out.print("Input :-");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("Output :-");

        res.getResult(arr, n);
    }
}