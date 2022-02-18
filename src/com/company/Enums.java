package com.company;

public class Enums {
    Seasons season;
    public Enums(Seasons season) {
        this.season = season;
    }
    public void getDescription() {
        switch (season) {
            case WINTER:
                System.out.println(Seasons.WINTER.name()+" cold time in seasons");
                break;
            case AUTUMN:
                System.out.println(Seasons.AUTUMN.name()+" winding time in seasons");
                break;
            case SUMMER:
                System.out.println(Seasons.SUMMER.name()+"the hottest time in seasons");
                break;
            case SPRING:
                System.out.println(Seasons.SPRING.name() +" time is not hot and not cold in seasons");
                break;
            default:
                System.out.println("it is not a season");
                break;
        }
    }

    public void getEnum() {
        System.out.println(season);
        switch (season) {

            case WINTER:
                System.out.println("I love winter ");
                break;
            case SPRING:
                System.out.println("I love spring ");
                break;
            case SUMMER:
                System.out.println("I love summer ");
                break;
            case AUTUMN:
                System.out.println("i love autumn ");
                break;
            default:
                System.out.println("it is not a season");
                break;
        }
    }
    public static void main(String[] args) {

        Enums winter = new Enums(Seasons.WINTER);
        winter.getEnum();
        Enums spring = new Enums(Seasons.SPRING);
        spring.getEnum();
        Enums summer = new Enums(Seasons.SUMMER);
        summer.getEnum();
        Enums autumn = new Enums(Seasons.AUTUMN);
        autumn.getEnum();
        System.out.println("-----------------------------------");
        Enums winter2 = new Enums(Seasons.WINTER);
        winter2.getDescription();
        Enums spring2 = new Enums(Seasons.SPRING);
        spring2.getDescription();
        Enums summer2 = new Enums(Seasons.SUMMER);
        summer2.getDescription();
        Enums autumn2 = new Enums(Seasons.AUTUMN);
        autumn2.getDescription();



    }
}
/*
Времена года
Создать перечисление, содержащее названия времен года.
Создать объект содержащую с типом Enum
Создать метод, который принимает на вход Enum. Если значение равно Лето,
 выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.


Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
Добавить конструктор принимающий на вход среднюю температуру.
Создать метод getDescription, возвращающий строку “Холодное время года”.
 Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
В цикле распечатать все времена года, среднюю температуру и описание времени года
 */