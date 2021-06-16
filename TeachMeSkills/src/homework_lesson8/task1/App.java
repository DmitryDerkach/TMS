package homework_lesson8.task1;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Programming","Novikov");
        Book book2 = new Book("Power","Ivanov");
        Magazine magazine1 = new Magazine("New York Times","Ecology");
        Magazine magazine2 = new Magazine("Science","Medicine");
        Printable[] library ={book1,book2,magazine1,magazine2}; /*Создали массив типа Printable, который будет содержать книги и журналы.*/
        for(Printable i : library){
            i.print();/*В цикле прошли по массиву и вызвали метод print() для каждого объекта. */
        }
        System.out.println();
        Magazine.printMagazines(library);
        System.out.println();
        Book.printBooks(library);




    }
}
