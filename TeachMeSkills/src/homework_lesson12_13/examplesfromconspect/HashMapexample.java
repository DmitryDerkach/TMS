package homework_lesson12_13.examplesfromconspect;

import java.util.HashMap;
import java.util.Map;

/*Карты отображений. HashMap
* Базовым классом для вскх отображений является класс абстрактный класс AbstractMap, который реализует большую часть иетодов интерфейса
* Map.
* Наиболее распростраенным классом отображений явялется HashMap, который реализует интерфейс Map и наследуется от класса AbstractMap*/
public class HashMapexample {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italys");
    }
}
