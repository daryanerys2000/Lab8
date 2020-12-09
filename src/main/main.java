package main;
import people.*;

public class main {
    public static void main(String[] args) {

        Person[]p = new Person[5]; // создаём массив из 5 объектов класса Person
        p[0] = new Person("Коваленко", 48, true);  // создаём первый объект массива
                                                                        // с помощью конструктора с полным набором параметров
        p[1]= new Person("Петрова", 30, false);
        p[2]= new Person();  // заполняем третий с помощью конструктора по умолчанию - все поля проинициализированы нулями
        p[3]= new Person(p[0]); // вызов конструктора копий - копируем информацию из первого объекта
        p[4]= new Person("Ковальски", false); // заполненяем пятый без параметра возраста

        for(int i = 0; i < 5; i++){
            p[i].print();
            System.out.println("_____________");
        }

        // выводим через вызов статистического метода
        System.out.println("Средний возраст: "+ Person.averageAge(p));
        System.out.println("Количество мужчин: "+ Person.numMale(p));
    }
}
