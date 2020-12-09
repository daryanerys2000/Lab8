package people;

public class Person {
    private String surname;
    private int age;
    private boolean sex;

    // конструктор по умолчанию Person p = new Person(); - не переданы параметры
    // если распечатать информацию - значения по умолчанию, все поля проинициализирует нулями
    public Person() {
    }

    // конструктор с полным набором параметров - переданными значениями будет инициализирован объект
    public Person(String surname, int age, boolean sex) {
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    // конструктор копирования
    public Person(Person o){
        this.surname = o.surname;
        this.age = o.age;
        this.sex = o.sex;
    }

    // конструктор с неполным набором параметров - инициализируется только фамилия и пол
    public Person(String surname, boolean sex){
        this.surname = surname;
        this.sex = sex;
    }

    // методы получения полей объекта
    public String getSurname() {
        return surname;
    }


    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return sex;
    }

    // статический метод подсчёта среднего значения
    // передаём массив Person для подсчёта 5-и объектов
    public static int averageAge(Person[]person){
        int p = 0;
        int average = 0;

        //складываем все возраста
        for(int i = 0; i < 5; i++){
            p += person[i].age;
        }

        average = p/5;
        return average;
    }

    // статический метод подсчёта количества мужчин
    public static int numMale(Person[]person){
        int man = 0;

        for(int i = 0; i < 5; i++) {
            if (person[i].sex == true) // если мужчина, то увеличиваем счётчик
                man++;
        }

        return man;
    }

    // метод вывода информации
    public void print() {

        System.out.println("Фамилия: " + this.getSurname() + "\n" + "Возраст: " + this.getAge());

        if(this.isMale()){
            System.out.println("Пол: Мужчина");
        }
        if(!this.isMale()){
            System.out.println("Пол: Женщина");
        }
    }
}

