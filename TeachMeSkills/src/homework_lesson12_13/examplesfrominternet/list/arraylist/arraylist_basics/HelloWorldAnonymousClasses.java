package homework_lesson12_13.examplesfrominternet.list.arraylist.arraylist_basics;

public class HelloWorldAnonymousClasses {
	  
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
        
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();
		/*
		 * The anonymous class expression consists of the following:
		 * 
		 * The new operator
		 * 
		 * The name of an interface to implement or a class to extend. In this example,
		 * the anonymous class is implementing the interface HelloWorld.
		 * 
		 * Parentheses that contain the arguments to a constructor, just like a normal
		 * class instance creation expression. Note: When you implement an interface,
		 * there is no constructor, so you use an empty pair of parentheses, as in this
		 * example.
		 * 
		 * A body, which is a class declaration body. More specifically, in the body,
		 * method declarations are allowed but statements are not.
		 */
        HelloWorld frenchGreeting = new HelloWorld() { /*Анонимный класс*/
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        HelloWorld spanishGreeting = new HelloWorld() { /*Анонимный класс*/
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
            new HelloWorldAnonymousClasses();
        myApp.sayHello();
    } 
}
