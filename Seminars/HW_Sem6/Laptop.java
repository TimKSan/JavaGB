package HW_Sem6;

public class Laptop {
    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop(String name, int ram, int hdd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop [Название = " + name + ", Кол-во ОЗУ = " + ram + ", Размер ж.диска = " + hdd + ", Операционная система = " + os + ", Цвет = " + color + "]";
    }    
}
