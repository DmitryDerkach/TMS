package homework_lesson6.taskreader;

/* Описание (2026): Перечисление с тремя номерами читательских билетов для задачи про библиотеку; getTicket(i) возвращает i-й номер при заполнении массива Reader в цикле. */
public enum Ticket {
	TICKET1(1),
	TICKET2(2),
	TICKET3(3);
	private int ticketnum;
	private int t;
	Ticket(int a){
		ticketnum = a;
	}
	public int getTicket() {
		return ticketnum;
	}
	public int getTicket(int loopnumber) {
		switch (loopnumber) {
		case(0):{
			t = Ticket.TICKET1.getTicket();	
			break;
		}
		case(1):{
			t = Ticket.TICKET2.getTicket();		
			break;
		}
		case(2):{
			t = Ticket.TICKET3.getTicket();		
			break;
		}
		default:{
			System.out.println("Что-то пошло не так...");
		}
		}
		return t;
	}
	
	
	
	
}

