package HW_Sem3.task1;

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int n = a.length;
        if (a.length < 2) return a;         //условия выхода из рекурсии
        int mid = n / 2;                    //делим массив
        int[] l = new int[mid];             //объявляем массив l размером mid
        int[] r = new int[n - mid];         //объявляем массив r размером n - mid
        
        for(int i = 0; i < mid; i++)        
            l[i] = a[i];                    //записываем в int[] l левую часть массива
        for(int i = 0; i < n - mid; i++)
            r[i] = a[i + mid];              //записываем в int[] r правую часть массива

        mergeSort(l);                       //вызываем функцию(рекурсия), что бы продолжать делить массивы на 2
        mergeSort(r);                       //вызываем функцию(рекурсия), что бы продолжать делить массивы на 2
        merge(a, l, r);  

        return a;   
    }

    private static void merge(int[] a, int[] l, int[] r) {      //тут мы непосредственно мёрджим
        int left = l.length;                    //длина массива l
        int right = r.length;                   //длина массива r
        int i = 0;                              //счетчик левой части
        int j = 0;                              //счетчик правой части
        int idx = 0;

        while (i < left && j < right){          
            if (l[i] < r[j]){                   //берем элемент левого массива и правого массива, сравниваем
                a[idx] = l[i];                  //если l[i] меньше, сохраняем его в idx
                i++;
                idx++;
            } else {
                a[idx] = r[j];                  //если r[j] меньше, сохраняем его в idx
                j++;
                idx++;
            }
        }
        // если  левый или правый массив больше по размеру
        for(int ll = i; ll < left; ll++)
            a[idx++] = l[ll];
            
        for(int rr = j; rr < right; rr++)
            a[idx++] = r[rr];
    }
}



// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task1{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4, 9, 55, 66, -1};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}