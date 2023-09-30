package HW_Sem6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop("iMac", 8, 500, "macOS", "silver");
        Laptop lp2 = new Laptop("Lenovo", 4, 256, "noOS", "red");
        Laptop lp3 = new Laptop("Asus", 16, 1000, "WniOS", "black");
        Laptop lp4 = new Laptop("Acer", 8, 128, "Linux", "green");


        Set<Laptop> allLaptop = new HashSet<Laptop>();

        allLaptop.add(lp1);
        allLaptop.add(lp2);
        allLaptop.add(lp3);
        allLaptop.add(lp4);


        Map<Integer, String> selectionCriteria = new HashMap<>();

        selectionCriteria.put(1, "Название");
        selectionCriteria.put(2, "Кол-во ОЗУ");
        selectionCriteria.put(3, "Размер ж.диска");
        selectionCriteria.put(4, "Операционная система");
        selectionCriteria.put(5, "Цвет");

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите нужные характеристики: \n1. Количество ОЗУ"); //\n2.  \n3. Размер ж.диска \n4. Операционная система \n5. Цвет"
        int ramUser = sc.nextInt();
        System.out.println("Размер жесткого диска");
        int hddUser = sc.nextInt();

        for(Laptop laptop: allLaptop) {
            if ((laptop.getRam() >= ramUser) && (laptop.getHdd() >= hddUser)) {
                System.out.println(laptop.toString());
            } else {
                System.out.println("К сожалению ноутбука с такими характеристиками у нас нет");
                break;
            }
        }
        sc.close();
    }
}
