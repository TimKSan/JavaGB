package HW_Sem4.task1;

// Пусть дан LinkedList с несколькими элементами.
// Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.
// Дан 
// [1, One, 2, Two]

// // Вывод
// [1, One, 2, Two]
// [Two, 2, One, 1]

import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> llrev = new LinkedList<>();  // объявляем второй список
        for(int i = ll.size()-1; i >= 0; i--){          // проходимся по первому списку с конца ll.size()-1
            llrev.add(ll.get(i));                       // добавляем каждый элемент с конца в новый список
        }
        return llrev;
    }
}


// ЭТАЛОН
// class LLTasks {
//     public static LinkedList<Object> revert(LinkedList<Object> ll) {
//         LinkedList<Object> reversed = new LinkedList<>();
//         for (Object o : ll) {
//             reversed.addFirst(o);
//         }
//         return reversed;
//     }
// }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task1{ 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}
