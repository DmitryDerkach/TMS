package homework_lesson12_13.examplesfromconspect;

import java.util.ArrayDeque;

public class ArrayDequeexample {
    public static void main(String[] args) {
        ArrayDeque <String> states = new ArrayDeque<>();
        /*Стандартоное добавление элемента*/
        states.add("Germany");
        /*Извлекает, но не удаляет первый элемент этой двухчторонней очереди, или возвращает null, если эта двухсторонняя очередь пуста*/
	        String str1 = states.peekFirst();
	        System.out.println(str1);
	        System.out.println("====================================");
        states.addFirst("France"); /*Добавим элемент элемент в самое начало, и выполним проверку, так ли это*/
	        str1 = states.peekFirst();
	        System.out.println(str1);
	        System.out.println("====================================");
        /*Метод offer, который добавляет элемент коллекции в самый конец. Возвращает булево значение*/
        boolean chech1 = states.offer("France");
	        System.out.println(chech1);
	        System.out.println("====================================");
        states.push("Great Britan");/*Добавляем элемент в самое начало*/
	        str1 = states.peekFirst();
	        System.out.println(str1);
	        System.out.println("====================================");
        states.addLast("Spain"); /*Добавляем элемент в конец коллекции*/
	        str1 = states.peekLast();
	        System.out.println(str1);
	        System.out.println("====================================");
	    /*Получается, что простым add мы добавляем элемент в конец нашей коллекции, в данном случае*/    
        states.add("Italy");
        String strtest = null;
            while ((strtest = states.peek())!= null){
            System.out.println(strtest);
            states.pop();
        }
        System.out.println("====================================");
        System.out.println(states.size()); /*Метод pop удаляет элементы из нашей коллекции, поэтому дальнейшее 
        перечисление коллекции (см. ниже) не имеет никакого смысла*/
        while (states.peek() != null){ /**/
            System.out.println(states.pop());
        }


    }
}
