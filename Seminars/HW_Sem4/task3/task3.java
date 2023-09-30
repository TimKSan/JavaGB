package HW_Sem4.task3;
// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
// Отмена последней операции должна быть реализована следующим образом: 
// если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

import java.util.ArrayDeque;


class Calculator {
    private ArrayDeque<Integer> results;            //поле класса, которое является массивом и используется для хранения результатов вычислений

    public Calculator() {
        results = new ArrayDeque<Integer>();        //инициализируем results как новый массив
    }

    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        int res = 0;
        if (op == '+') res = a + b;
        else if (op == '-') res = a - b;
        else if (op == '*') res = a * b;
        else if (op == '/') {
            if (b == 0) {
                throw new Error("на 0 делить нельзя");
            }
            res = a / b;
        }

        if (op == '<') {
            results.removeLast();                   //удаляем последний элемент из массива results
            res = results.removeLast();             //в переменную res кладем результат предпоследней операции
        } else
            results.add(res);

        return res;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 2;
            op2 = '*';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}