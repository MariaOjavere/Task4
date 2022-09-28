/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task4mariaojavere;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class Sptv21task4MariaOjavere {
    public static void main(String[] args) {
        int[] arr = new int [100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0)
            System.out.println(arr[i] + ", ");
            Arrays.sort(arr);
        }
    double average = 0;
        for (int i = 0; i < 5; i++){
            average += arr[i];
           
        }
        average/=5;
        System.out.println("Среднее арифметическое массива: " + average);
    }
    
}
