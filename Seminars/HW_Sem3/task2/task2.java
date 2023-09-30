package HW_Sem3.task2;

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 1 || arr[i] % 2 == -1){
                even.add(arr[i]);
            }
        } 
        System.out.println(even);
    }
}

// // ЭТАЛОН
// class Answer {
//     public static void removeEvenNumbers(Integer[] arr) {
//         ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
//         for (int i = 0; i < ints.size(); i++) {
//             if (ints.get(i) % 2 == 0) {
//                 ints.remove(i);
//                 i--;
//             }
//         }
//         System.out.println(ints);
//     }
// }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task2{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}
