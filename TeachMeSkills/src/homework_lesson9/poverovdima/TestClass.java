package homework_lesson9.poverovdima;


/* Описание (2026): Вспомогательный класс с тремя полями (int, double, String) и переопределённым toString(); используется в Application для демонстрации String.valueOf(Object). */
public class TestClass {

    int a;
    double b;
    String c;

    TestClass(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
	public String toString() {
		return "TestClass [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
    
    
    
    
    
    
    
    
}
