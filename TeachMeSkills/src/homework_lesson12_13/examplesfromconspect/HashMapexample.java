package homework_lesson12_13.examplesfromconspect;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Карты отображений. HashMap
* Базовым классом для вскх отображений является класс абстрактный класс AbstractMap, который реализует большую часть методов интерфейса
* Map.
* Наиболее распростраенным классом отображений явялется HashMap, который реализует интерфейс Map и наследуется от класса AbstractMap*/
public class HashMapexample {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");
        /*Получим объект по ключу 2*/
        String second = states.get(2);
        System.out.println(second);
        System.out.println("==========================");
        /*Получим весь набор ключей*/
        Set <Integer> keys = states.keySet();
        for (Integer i: keys) {
        	System.out.println(i);
        }
        System.out.println("==========================");
        /*Получим набор всех значений*/
        Collection<String> values = states.values();
        for (String s: values) {
        	System.out.println(s);
        }
        System.out.println("==========================");
        /*Замена элемента*/
        states.replace(1, "Poland");
        for (String s: values) {
        	System.out.println(s);
        }
        System.out.println("==========================");
        /*Удаление элемента по ключу 2*/
        states.remove(2);
        for (String s: values) {
        	System.out.println(s);
        }
        System.out.println("==========================");
        /*Перебор элементов*/
        for (Map.Entry<Integer, String> item: states.entrySet()) {
        	System.out.println("Key: " + item.getKey() + " Value: " + item.getValue());
        }
        System.out.println("==========================");
        /*Попробуем проделать тоже самое, когда коллекция из элементов класса Person*/
        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));
        for(Map.Entry<String, Person> item : people.entrySet()) {
        	System.out.println("Key: " + item.getKey() + " Value: " + item.getValue().getName());
        }
        
        
        
        
        
        
    }  
}
