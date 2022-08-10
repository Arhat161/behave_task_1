public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Random digit: " + r);
            if (r == 100) {
                System.out.println("Number 100 came up, let's end it");
                break;
            }
        }
    }
}
