
abstract public class Quickride {
    int bookingid;

    abstract void bookingid();

    abstract void schedule();

    abstract void refund();

    public static void main(String[] args) {
//       EXCEPTION HANDLING
//         try {
//             System.out.println("10/0");
//         } catch (ArithmeticException e) {
//             System.out.println(e);
//             e.printStackTrace();
        cab cab = new cab();
        cab.bookingid();
        cab.schedule();
        cab.refund();

        train train = new train();
        train.bookingid();
        train.schedule();
        train.refund();

        bus bus = new bus();
        bus.bookingid();
        bus.refund();
        bus.schedule();

    }

}