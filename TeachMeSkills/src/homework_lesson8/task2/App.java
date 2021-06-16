package homework_lesson8.task2;

public class App {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(8);
        Drums drums = new Drums(3);
        Pipe pipe = new Pipe(2);
        Instrument[] instruments = {guitar,drums,pipe}; /*Создали массив типа Инструмент, содержащий инструменты разного типа.*/
        for(Instrument i: instruments){/*В цикле вызван метод play() для каждого инструмента, который выводитстроку:"Играет инструмент, с такими-то
характеристиками".*/
            i.play();
        }
    }
}
