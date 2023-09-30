package HW_Sem4.task2;

// В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:

// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

import java.util.LinkedList;



class MyQueue <T> { 
    private LinkedList<T> elements = new LinkedList<>();  // создаем новый экземпляр связанного списка elements

    public MyQueue() {                                    //  и инициализирует его пустыми элементами.
    }
    
    public MyQueue(LinkedList<T> elements) {
        this.elements = elements;                         //В данном случае поле elements присваивается значение, переданное в конструктор как параметр elements.
    }
    
    public void enqueue(T element){
        elements.add(element);                              //добавляем элемент element в связанный список elements
    }
    
    public T dequeue(){
        T first = elements.getFirst();                      //получаем первый элемент из связанного списка elements и сохраняем его в переменную first
        elements.removeFirst();                             //удаляем первый элемент из списка elements
        return first;                                       //возвращаем значение переменной first
    }
    
    public T first(){
        return elements.getFirst();                         //возвращаем первый элемент из связанного списка(оставшегося) elements
    }
    
    public LinkedList<T> getElements() {
        return elements;                                    //возвращаем связанный список elements
    }
    
    public void setElements(LinkedList<T> elements) {
        this.elements = elements;
    }
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}