public class Main {
    public static void main(String[] args) {
        Feeder f = new Feeder(1000);
        System.out.println(f.simulateOneDay(5));
        System.out.println(f.simulateManyDays(5, 3));

    }
}
