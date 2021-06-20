package homework_lesson6.taskreader;

public enum Ticket {
	TICKET1(1),
	TICKET2(2),
	TICKET3(3);
	private int ticketnum;
	Ticket(int a){
		ticketnum = a;
	}
	public int getTicket() {
		return ticketnum;
	}
}
