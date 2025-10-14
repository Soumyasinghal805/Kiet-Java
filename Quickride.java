// Abstract base class representing a generic ride booking
abstract public class Quickride {
    int bookingId;

    // Abstract methods to be implemented by subclasses
    abstract void bookingid();
    abstract void schedule();
    abstract void refund();

    public static void main(String[] args) {
        try {
            // Demonstrating polymorphism with different ride types
            Quickride cab = new Cab();
            cab.bookingid();
            cab.schedule();
            cab.refund();

            Quickride train = new Train();
            train.bookingid();
            train.schedule();
            train.refund();

            Quickride bus = new Bus();
            bus.bookingid();
            bus.schedule();
            bus.refund();

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        }
    }
}

// Concrete class for Cab
class Cab extends Quickride {
    void bookingid() {
        bookingId = 101;
        System.out.println("Cab Booking ID: " + bookingId);
    }

    void schedule() {
        System.out.println("Cab scheduled for 9:00 AM");
    }

    void refund() {
        System.out.println("Cab refund processed");
    }
}

// Concrete class for Train
class Train extends Quickride {
    void bookingid() {
        bookingId = 202;
        System.out.println("Train Booking ID: " + bookingId);
    }

    void schedule() {
        System.out.println("Train scheduled for 6:30 AM");
    }

    void refund() {
        System.out.println("Train refund processed");
    }
}

// Concrete class for Bus
class Bus extends Quickride {
    void bookingid() {
        bookingId = 303;
        System.out.println("Bus Booking ID: " + bookingId);
    }

    void schedule() {
        System.out.println("Bus scheduled for 8:15 AM");
    }

    void refund() {
        System.out.println("Bus refund processed");
    }
}
