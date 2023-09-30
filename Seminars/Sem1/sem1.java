package Seminars.Sem1;

// public class sem1 {
//     public static void main(String[] args) {
//         int a = 10;
//         String b = "hello";
//         Integer d = a;
//         System.out.println(d.intValue());
//     }
// }

/**
 * sem1
 */
// public class sem1 {
//     public static void main(String[] args) {
//         String a = "hello";
//         a = a + " world";
//         System.out.println(a);
//     }
    
// }

/**
 * 
 */
// public class sem1 {
//     public static void main(String[] args) {
//         String a = "hello";
//         StringBuilder stringBuilder = new StringBuilder();
//         stringBuilder.append(a).append(" world");
//         System.out.println(stringBuilder.toString());
//     }
// }

// Дано четное число N (>0) и символы c1 и c2. Написать метод, 
// который вернет строку длины N, которая состоит из чередующихся 
// символов c1 и c2, начиная с c1.

/**
 * sem1
 */
// public class sem1 {
//     public static void main(String[] args) {
//         int N = 6;
//         String a = "c1";
//         String b = "c2";

//         StringBuilder stringBuilder = new StringBuilder("");
//         for (int i = 0; i < N; i++){
//             stringBuilder.append(a).append(b);
//         }
//         System.out.println(stringBuilder);
//     }      
// }


/**
 * Напишите метод, который сжимает строку. 
 * Пример: вход aaaabbbcdd
 */
// public class sem1 {
//     public static void main(String[] args) {
//         String input = "aaaabbbcdd";
//         StringBuilder compressed = new StringBuilder();
//         char currentChar = input.charAt(0);

//         for (int i = 1; i < input.length(); i++) {
//             char nextChar = input.charAt(i);
//             if (nextChar != currentChar) {
//                 compressed.append(currentChar);
//                 currentChar = nextChar;
//             }
//         }

//         compressed.append(currentChar);
//         System.out.println(compressed.toString()); 
//     }
// }




/**
 * Напишите метод, который принимает на вход строку (String) 
 * и определяет является ли строка палиндромом 
 * (возвращает boolean значение).
 */
// public class sem1 {
//     public static void main(String[] args) {
//         StringBuilder str = new StringBuilder("арозаупаланалапуазора");
//         StringBuilder reverse_str = new StringBuilder(str);
//         reverse_str.reverse();

//         String str_st = str.toString();
//         String reverse_str_st = reverse_str.toString();

//         if (str_st.equals(reverse_str_st)) {
//             System.out.println("YES");
//         }
//         else {
//             System.out.println("NO");
//         }

//         System.out.println(str);
//         System.out.println(reverse_str);
//     }

//     public static boolean isPalindrome(String input) {
//         return input.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(input).reverse().toString().replaceAll("\\s", ""));
//     }
// }



/**
 * ЛОГИРОВАНИЕ
 */
/*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class sem1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(sem1.class.getName());
        try{
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write("hello");
            fileWriter.flush();
        }catch (IOException etyrwety){
            etyrwety.printStackTrace();

        }

        try {
            // Создаем FileHandler, указывая путь к файлу и максимальный размер файла (в байтах)
            FileHandler fileHandler = new FileHandler("mylog.txt");

            // Настраиваем формат сообщений
            fileHandler.setFormatter(new SimpleFormatter());

            // Устанавливаем FileHandler как обработчик для логгера
            logger.addHandler(fileHandler);

            // Устанавливаем уровень логирования (например, ALL, INFO, WARNING, SEVERE и т. д.)
            logger.setLevel(Level.ALL);

            // Примеры логирования
            logger.info("This is an informational message.");
            logger.warning("This is a warning message.");
            logger.severe("This is a severe error message.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/


/*
 * Напишите метод, который составит строку, 
 * состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, 
 * обработайте исключения.
 */

// Полный цикл записи текста в файл
            // try{
            //     FileWriter fileWriterTest = new FileWriter("text2.txt");
            //     for (int i = 0; i < 100; i++) {
            //         fileWriterTest.write("hello");
            //     }
            //     fileWriterTest.flush(); //закрывает буфер - важно и нужно!
            // } catch (IOException e){
            //     e.printStackTrace();
            // }