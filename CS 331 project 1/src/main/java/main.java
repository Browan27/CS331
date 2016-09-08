public class main {
    
    
    public static void main(String[] args) {
        hospital h = new hospital();
        h.fileReader("test.txt");
        System.out.println(h.calculateAverageArray("day", 1, 1));
        h.reset();
        h.fileReader("hospital.txt");
        System.out.println(h.calculateAverageArray("day", 1, 1));
        System.out.println(h.calculateAverageArray("week", 1, 1));
    }
}