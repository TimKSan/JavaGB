class Calculator {
    public int calculate(char op, int a, int b) {
      // Введите свое решение ниже
        //int ans = 0;
        if (op == '+'){return a + b;}
        if (op == '-'){return a - b;}
        if (op == '/'){return a / b;}
        if (op == '*'){return a * b;}
        else 
            return 1;
        
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task3{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 16;
            op = '/';
            b = 4;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}