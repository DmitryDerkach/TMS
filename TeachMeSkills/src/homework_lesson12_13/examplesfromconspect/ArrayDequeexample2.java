package homework_lesson12_13.examplesfromconspect;

import java.util.ArrayDeque;

public class ArrayDequeexample2 {
    public static void main(String[] args) {
        ArrayDeque <String> states = new ArrayDeque<>();
        /*Add new element*/
        states.add("Germany");
        String str1 = states.peekFirst();
        System.out.println(str1);
        states.addFirst("France"); /*Добавляем элемент в самое начало*/
        boolean chech1 = states.offer("France");
        System.out.println(chech1);
        states.push("Great Britan");/*Добавляем эелемент в самое начало*/
        states.addLast("Spain"); /*Добавляем элемент в конец коллекции*/
        states.add("Italy");
        String strtest = null;

            while ((strtest = states.peek())!= null){
            System.out.println(strtest);
            states.pop();
        }
        System.out.println("====================================");
        System.out.println(states.size()); /*Метод pop удаляет элементы из нашей коллекции, поэтому перечисление коллекции (см. ниже)
        не имеет никакого смысла*/
        while (states.peek() != null){ /**/
            System.out.println(states.pop());
        }


    }
}
