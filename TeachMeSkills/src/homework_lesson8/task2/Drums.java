package homework_lesson8.task2;

public class Drums implements Instrument{/*Барабан содержит переменную класса "Размер"*/
    private int size;

    public Drums(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public void play(){
        System.out.printf("Играют барабаны, размер: %d\n",size);
    }
}
