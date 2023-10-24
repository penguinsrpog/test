

    import java.util.*;
    public class main{
        private double kilometers;
        public kilometersSaid(double km){
            kilometers = km;
        }
        public double getKilometers{
            return kilometers
        }
        public static void Distance(String[] args){
        System.out.println("What do you want to do?");
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your kilometers?");
        double input = scanner.nextInt();
        Scanner operation = new Scanner(System.in);
        System.out.println("what would you like to convert to?");
        String input1 = scanner.nextLine();
        Object input2;
        if (input1 == Kilometers){
            input2 = input2 * 1.609;
            System.out.println(input2);


        }
        else if (input1 == Leagues){
            input2 = input2 / 5.556;
            System.out.println(input2);
        }
        else if (input1 == miles){
            input2 = input2 / 1.609;
        }

        else if (input1 == doubleMiles){
            input2 = input2 / 1.609
            input2 = input2 * 2 

        }
        else{
            return kilometersSaid
        }
    }