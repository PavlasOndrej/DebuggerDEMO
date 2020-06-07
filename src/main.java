public class main {

    public static void main(String []args){
        System.out.println("Dobry den");

        int b = 4;
        int vypocet;
        vypocet = soucet(b);

        int cyklus = 0;
        for (int i = 1; i<10; i++){
            cyklus += i;
        }
        System.out.println(cyklus);
    }

    private static int soucet(int b) {
        int a = 5;
        return a + b;
    }
}
