package main;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Selectionsort s = new Selectionsort(n);
        System.out.println("Enter the values for the array");
        for (int i = 0; i < n ; i++) {
            s.insert(scanner.nextLong());
        }
        System.out.println("The values before sorting: ");
        s.display();
        s.sort();
        System.out.println("The values after sorting: ");
        s.display();
    }
}
