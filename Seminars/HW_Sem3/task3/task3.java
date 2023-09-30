package HW_Sem3.task3;
import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + Arrays.stream(arr).min(Integer::compareTo).get());
        System.out.println("Maximum is " + Arrays.stream(arr).max(Integer::compareTo).get());
        System.out.println("Average is = " + (int) (Arrays.stream(arr).mapToInt(value -> value).sum() / Arrays.stream(arr).count()));    
    }
}


// // ЭТАЛОН
// class Answer {
//     public static void analyzeNumbers(Integer[] arr) {
//         ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
//         ints.sort(Integer::compareTo); // сортировка списка по возрастанию
//         System.out.println(ints); // вывод списка на экран
//         System.out.println("Minimum is " + ints.get(0)); // нахождение минимального значения в списке и вывод на экран
//         System.out.println("Maximum is " + ints.get(ints.size()-1)); // нахождение максимального значения в списке и вывод на экран

//         int sum = 0;
//         for(int i : ints){ // вычисление суммы всех элементов списка
//             sum += i;
//         }
//         System.out.println("Average is = " + sum / ints.size()); // вычисление среднего арифметического значений списка и вывод на экран
//     }
// }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task3{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}