package homework_lesson12_13.examplesfromconspect;

import java.util.Set;
import java.util.TreeSet;

/*Обобщенный класс TreeSet<E> представляет структру данных в виде дерева, в котором все объекты хранятся в остортированном виде
* по возрастанию. TreeSet является наследником AbstractClass и реализует интерфейс NavigableSet, а следоватльно, и интерфейс SortedSet*/
public class TreeSetexample {
    public static void main(String[] args) {
        Set <String> states = new TreeSet<String>();
            //Добавим в список ряд элементов
            states.add("Germany");
            states.add("France");
            states.add("Italy");
            states.add("Great Britain");
        System.out.println("State size: " + states.size());
        //удаление элемента
        states.remove("Germany");
        for(String state: states){
            System.out.println(state);
            /*Полскольку при вставке все объекты сразу же сортируются по возрастанию, то при выводе в цикл for мы получим
            * отсортированный набор*/
        }
        /*В примере выше мы добавляли строки в TreeSet. При добавлении новых элементов объект TreeSet автоматически проводит
        * сортиоовку , помещая новый объект на правильнгое для него место. Однако со строками все понятно. А что если бы
        * мы использовали не строкит, а свои класс:*/
//*        TreeSet <Person> people = new TreeSet<Person>();    --- кидает ошибку, см. ниже почему
//*        people.add(new Person("Mike"));
        TreeSet <Personv2> per2 = new TreeSet<Personv2>();
        per2.add(new Personv2("Mike"));
        per2.add(new Personv2("Tom"));
        for (Personv2 p: per2){
            System.out.println(p.getName());

        }
    }
}
class Personv2 implements Comparable<Personv2>{
    private String name;
    public Personv2 (String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    @Override
    public int compareTo(Personv2 o) {
        return name.compareTo(o.getName());
    }
}
/*Объект TreeSet мы не сможем типизировать данным классом, полскольку в случае добавления объектов TreeSet не будет
* знать, как их сравнивать, и кусок кода помеченный (*) не будет работать*/
/*Для того, чтобы объекты Person можно было сравнить и сортировать, они должны применять интерфейс Comparable<E>. При
* применении интерфейса он типизируется текущим классом. Применим его к классу Person*/
