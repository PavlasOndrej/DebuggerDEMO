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

        int test = factorial(5);
        
    }

    private static int soucet(int b) {
        int a = 5;
        return a + b;
    }
    
    private static int factorial (int cislo){
        if(cislo <= 1){
            return 1;
        }
        else return cislo*factorial(cislo - 1);
    }
}
