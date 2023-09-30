/*
 * Напишите функцию printPrimeNums, которая выведет на экран 
 * все простые числа в промежутке от 1 до 1000, каждое на новой строке.

 */

public class task2 {
    public static void main(String[] args) { 
      
        Answer ans = new Answer();      
        ans.printPrimeNums();
      }
}

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 1; i < 1000; i++) {
            int j;
            for (j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
                System.out.print(i + "\n");
            }
        }
    }
}