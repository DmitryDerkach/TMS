package homework_lesson8.task1;

public class Magazine implements Printable{/*Определили класс Magazine, реализующий интерфейс Printable.*/
	 private String magazineName;
	    private String article;

	    public Magazine() {
	    }

	    public Magazine(String magazineName, String article) {
	        this.magazineName = magazineName;
	        this.article = article;
	    }

	    public String getMagazineName() {
	        return magazineName;
	    }

	    public String getArticle() {
	        return article;
	    }

	    public void setArticle(String article) {
	        this.article = article;
	    }

	    public void setMagazineName(String magazineName) {
	        this.magazineName = magazineName;
	    }
	    @Override
	    public void print(){
	        System.out.printf("Magazine: %s, article: %s\n",magazineName,article);
	    }
	    public static void printMagazines(Printable[] printables){/*Создали статический метод printMagazines(Printable[] printable) в классе 
	    Magazine, который выводит на консоль названия только журналов.*/
	        for(Printable i: printables){
	            if (i instanceof Magazine){
	            i.print();
	        }
	    }}

	}