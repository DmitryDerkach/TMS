package homework_lesson12_13.examplesfromconspect;
/*См. описание в конспекте. Класс HashSet не добавялет новых методов, реализуя лишь те, что объявлены в родительских классах и применяемых в
* интерфейсах*/
import java.util.HashSet;
import java.util.Set;

public class HashSetexample {
    public static void main(String[] args) {
        Set <String> states =  new HashSet<String>();
        /*добавим к списку пару элементов*/
        states.add("Germany");
        states.add("France");
        states.add("Italy");
       /*Попытаемся добавить элемент, который уже есть в коллекции*/
        boolean check = states.add("Germany");
        /*Так как элемент уже существет - возвращает false*/
        System.out.println(check);
        System.out.println("=================================");
        /*Находим размер нашей коллекции*/
        System.out.println(states.size());
        System.out.println("=================================");
        /*Проходимся по элементам нашей коллекции*/
        for (String /*тип*/ a: states){
            System.out.println(a);
        }
        System.out.println("=================================");
        /*Проход через обычный цикл for*/
        Object [] array = states.toArray();
        for (int i = 0; i < states.size(); i++){
            System.out.println((String)array[i]);
        }
        System.out.println("=================================");
        /*Удаление объекта из коллекции*/
        states.remove("Germany");
        array = states.toArray();
        for (int i = 0; i < states.size(); i++){
            System.out.println((String)array[i]);
        }
        System.out.println("=================================");
        /*Создадим хеш-таблицу !объектов! Person*/
        /*Пример*/
        HashSet <Person> person = new HashSet<Person>();
        person.add(new Person("Mike"));
        Object [] arr = person.toArray();
        String s = (String)arr[0].toString();
        System.out.println(s);
        Person p1 = new Person("Tom");
        person.add(p1);
        person.add(new Person("Nick"));
            for (Person p: person){
                System.out.println(p.getName());
            }
    }
}
class Person{
    private  String name;
    public Person (String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.name;
    }
}