package org.example;
import java.util.*;

class Getminelement {
    Stack<Integer> s;
    Integer minEle;

    // Constructor
    Getminelement() { s = new Stack<Integer>(); }

    void getMin()
    {
        if (s.isEmpty())
            System.out.println("");

        else
            System.out.println("" + minEle);
    }

    void peek()
    {
        if (s.isEmpty()) {
            System.out.println("");
            return;
        }

        Integer t = s.peek();

        System.out.print("");

        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }

    void pop()
    {
        if (s.isEmpty()) {
            System.out.println("");
            return;
        }

        System.out.print("");
        Integer t = s.pop();

        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        }

        else
            System.out.println(t);
    }

    void push(Integer x)
    {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("" + x);
            return;
        }

        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        }

        else
            s.push(x);

        System.out.println("" + x);
    }


public static void main(String[]args)
        {
        Getminelement s=new Getminelement();

        s.push(2);
        s.push(3);
        s.pop();
        s.getMin();
        s.push(1);
        s.getMin();

        }
        }
