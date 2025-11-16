class TicketBooking {
    private int tickets = 1;

    public synchronized void bookTicket(String customer) {
        if (tickets > 0) {
            System.out.println(customer + " booked the ticket!");
            tickets--;
        } else {
            System.out.println(customer + " tried to book but tickets are sold out!");
        }
    }
}

public class BookingSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Thread t1 = new Thread(() -> booking.bookTicket("Customer 1"));
        Thread t2 = new Thread(() -> booking.bookTicket("Customer 2"));

        t1.start();
        t2.start();
    }
}