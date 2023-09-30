package Seminars.Sem6;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//1. Напишите метод, который заполнит массив из 1000 элементов 
// случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив 
// и с помощью Set вычислите процент уникальных значений в данном 
// массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных 
// чисел * 100 / общее количество чисел в массиве.

public class sem6 {
public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(0, 25);
        }
        System.out.println(getNumSet(arr));
    }
    public static float getNumSet(int[] array){
        Set<Integer> numSet = new TreeSet<Integer>();
        for(int i = 0; i < array.length; i++){
            numSet.add(array[i]);
        }
        return (float) (numSet.size() * 100) / array.length;
    }
}




