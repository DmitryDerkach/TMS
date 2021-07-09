package homework_lesson12_13.examplesfromconspect;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.TreeSet;

public class AdvanceSorting {
    public static void main(String[] args) {
        /*Начиная с ЖДК 8 в механизм работы компараторов были внесены некоторые дополнения. В частности, теперь мы можем применять сразу
        * несколько компараторов по принципу приоритета. Например:*/
        Comparator <Personv3> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Personv3> people = new TreeSet<Personv3>(pcomp);
        people.add(new Personv3("Dima",23));
        people.add(new Personv3("Angela",40));
        people.add(new Personv3("Vasya",21));
        people.add(new Personv3("Vasya",19));
        for (Personv3 p: people){
            System.out.println(p.getName() + "  " + p.getAge());
        }
    }
}
class Personv3{
    private  String name;
    private int age;

    public  Personv3 (String a, int b){
        name = a;
        age = b;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
/*Допустим, надо отсортиовать пользователей по имоени и по возрасту. Для этого определим 2 компаратора*/
class PersonNameComparator implements Comparator <Personv3>{
    @Override
    public int compare(Personv3 o1, Personv3 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class PersonAgeComparator implements Comparator<Personv3>{
    @Override
    public int compare(Personv3 o1, Personv3 o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        } else {
            if (o1.getAge() < o2.getAge()){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
/*Интерфейс компаратора определяет специальный метод по умолчанию thenComparing, который позволяет использовать цепочки ком-
* параторов для сортировки набора
* См. psvm и смотри на решение*/