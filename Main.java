import java.io.IOException;
import java.util.Scanner;

public class Main {
    static user nn = new user();
    static Admission_Committee nns = new Admission_Committee();
    static teachers tch = new teachers();
    static Classification cl = new Classification();
    static Scanner i = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {

        print("Добро пожаловать, вы попали в регистрацию в нашу шарагу\nВведите Ваш имя: ");
        nn.name = i.next();
        print("Введите Вашу фамилию: ");
        nn.surname = i.next();
        print("Введите Ваш возраст: ");
        nn.Age = i.nextInt();
        if(nn.Age > 15 && nn.Age < 22){
            nns.reshenie = true;
        }
        else{
            nns.reshenie = false;
        }
        rez(nns);
    }
    static void print(Object a){
        System.out.print(a);
    }
    static void printl(Object a) {
        System.out.println(a);
    }
    static void rez(Admission_Committee b){
        if(b.reshenie == true){
            uspeh();
        }
        else{
            printl("К сожалению, вы не прошли по критериям, приходите в следующем году");
        }

    }
    static void uspeh(){
        cl.title = "Программист";
        cl.period_of_study = 4;
        cl.number_of_items = 1;
        cl.number_of_teachers = 1;
        tch.name = "Дмитрий";
        tch.fa = "Владимирович";
        tch.Age = 22;
        tch.item = "html";
        vivod();
    }
    static void vivod(){
        printl("Решение о вашем поступлении было одобрено, поэтому ваши данные выглядят вот так:");
        printl("Имя: " + nn.name + '\t' + '\t' + "Преподаватель: " + tch.name + " " + tch.fa);
        printl("Фамилия: " + nn.surname + '\t' + '\t' + "Ведет: " + tch.item);
        printl("Возраст: " + nn.Age);
        printl("Ваша квалификация: " + cl.title);
        printl("Количество ваших преподов: " + cl.number_of_teachers);
        printl("Количество ваших предметов: " + cl.number_of_items);
        printl("Количество учебных лет: " + cl.period_of_study);
    }
}

class user{
    public String name;
    public String surname;
    public int Age;
}
class Admission_Committee{
    public boolean reshenie;
}
class Classification{
    public String title;
    public int period_of_study;
    public int number_of_items;
    public int number_of_teachers;
}
class teachers{
    public String name;
    public String fa;
    public int Age;
    public String item;
}