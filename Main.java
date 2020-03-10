package ru.geekbrains.homework;
/*
*
*author: Nikolay Bakhvalov
*time: 2020-03-06
*
 */





//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

class Person {
    private String name;
    private String surname;
    private String post;
    private String email;
    private String phone;
    private double salary;
    private int age;


    Person(String name, String surname, String post, String email, String phone, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        }

    int GerAge() {
        return age;
    }

    void PrintOut() {
        System.out.println(name + " " + surname + " " + post + " " + email + " " + phone + " " + salary + " " + age);
    }
}
public class Main {

    public static void main(String[] args) {
	    Person[] persArray = new Person[5];
	    persArray[0] = new Person("Alexey", "Shoferov",
                "Driver", "driver@email.com", "+123456789", 25000, 21);
        persArray[1] = new Person("Jason", "Stetham",
                "Mechanic", "mechanic@email.com", "+123456788", 30000, 51);
        persArray[2] = new Person("Nikola", "Tesla",
                "Electrician", "electrician@email.com", "+123456787", 35000, 42);
        persArray[3] = new Person("Ashot", "Mavsysyan",
                "Director", "director@email.com", "+123456786", 45000, 38);
        persArray[4] = new Person("Tatyana Ilinishna", "Balance",
                "Accountant", "accountant@email.com", "+123456785", 19500, 60);

        for (Person item : persArray) {
            if(item.GerAge() > 40) item.PrintOut();
        }
    }
}
