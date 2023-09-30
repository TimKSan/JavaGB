package Seminars.Sem6;

import java.util.Date;

// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// //
// //        а) информационной системой ветеринарной клиники
// //
// //        б) архивом выставки котов
// //
// //        в) информационной системой Театра кошек Ю. Д. Куклачёва
// //
// //        Можно записать в текстовом виде, не обязательно реализовывать в java.


public class Dog {
    private String name;
    private String breed;
    private Integer age;
    private String data;
    private Integer weight;
    private Boolean state;


    public Dog(String name, String breed, Integer age, String data, Integer weight, Boolean state) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.data = data;
        this.weight = weight;
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", data=" + data +
                ", weight=" + weight +
                ", state=" + state +
                '}';
    }
}
