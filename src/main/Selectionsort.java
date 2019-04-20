package main;

import java.util.Scanner;

public class Selectionsort {

    private long[] array;
    private  int numElements;

    public Selectionsort(int n)
    {
        array = new long[n];
        numElements = 0;
    }

    public  void insert(long value)
    {
        array[numElements] = value;
        numElements++;
    }


    public void display()
    {
        for (int i = 0; i < numElements ; i++) {
            System.out.println(array[i] + " ");

        }
        System.out.println("");
    }

    public void sort()
    {
        int i,j,min;
        for ( i=0; i < numElements - 1; i++) {
            min = i;
            for(j=i+1;j < numElements; j++)
            {
                if(array[j]<array[min])
                {
                    min = j;
                    swap(i,min);
                }
            }

        }
    }
    public void  swap(int one, int two)
    {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }





}
