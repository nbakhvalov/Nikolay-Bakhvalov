package ru.geekbrains.homework.lesson6;


//        1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//        В качестве параметра каждому методу передается величина, означающая или длину
//        препятствия (для бега и плавания), или высоту (для прыжков).
//        3. У каждого животного есть ограничения на действия
//        (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
//        плавание: кот не умеет плавать, собака 10 м.).
//        4. При попытке животного выполнить одно из этих действий,
//        оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
//        5. * Добавить животным разброс в ограничениях.
//        То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.


import org.w3c.dom.ls.LSOutput;

// класс описывающий животных
class Animal {
    double run;        //дистанция бега
    double swim;       //дистанция плавания
    double jump;    //высота прыжка


    void info() {
        System.out.println("Дистанция бега " + run + "м. " + "высота прыжка " +
                jump + "м. " + "дистанция плавания " + swim + "м. ");


    }
}
// подкласс описывающий котов,
// производный от класса животных
class Cat extends Animal {
    String type;

    double opportunities() {  // возможности котов

        System.out.print("Котейка не умеет плавать, расстояние которое преодолел " + type);
        return run + jump;

    }
    void showType() {
        System.out.println("Котейка " + type);
    }
}

// подкласс описывающий собак,
// производный от класса животных
class Dog extends Animal {
    String type;

    double opportunities() {  // возможности собак
        System.out.println("Расстояние которое преодолел " + type);
        return run + jump + swim;
    }
    public void showType() {
        System.out.println("Песель " + type);
    }
}

class Actions extends Animal{
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        // наделяем животных сверхсилами
        cat1.run = 200;
        cat1.jump = 2;
        cat1.swim = 0;
        cat1.type = "мэйкун";

        cat2.run = 3500;
        cat2.jump = 3.5;
        cat2.swim = 5;
        cat2.type = "дворовый";

        dog1.run = 500;
        dog1.jump = 0.5;
        dog1.swim = 10;
        dog1.type = "овчарка";

        dog2.run = 700;
        dog2.jump = 1.5;
        dog2.swim = 50;
        dog2.type = "бультерьер";

        System.out.println("Информация о " + cat1.type);
        cat1.showType();
        cat1.info();
        System.out.println(" " + cat1.opportunities());

        System.out.println("Информация о " + cat2.type);
        cat2.showType();
        cat2.info();
        System.out.println(" " + cat2.opportunities());

        System.out.println("Информация о " + dog1.type);
        dog1.showType();
        dog1.info();
        System.out.println(" " + dog1.opportunities());

        System.out.println("Информация о " + dog2.type);
        dog2.showType();
        dog2.info();
        System.out.println(" " + dog2.opportunities());

    }
}