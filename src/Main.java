import java.util.Scanner;

public class Main {
    public static void main(String[] args) {calculator();}

    public static void calculator(){
        while(true){
           try {
               System.out.print("\n\t\t<Fuel Consumption Calculator>" +
                       "\n\t\t1 = The cost of travel" +
                       "\n\t\t2 = Average Fuel Consumption" +
                       "\n\t\t3 = How Much Fuel Is Enough" +
                       "\n\t\t0 = Exit: ");
               Scanner console = new Scanner(System.in);
               String menu = console.nextLine();
               switch (menu){
                   case "1"-> costOfTravel();
                   case "2"-> averageFuelConsumption();
                   case "3"-> howMuchFuelIsEnough();
                   case "0"-> {return;}
                   default -> System.out.println("\n\t\tWrong Data!");
               }
           }
           catch (Exception ex){System.out.println("\nError: "+ex.getMessage());}
        }
    }

    public static void costOfTravel(){
        Scanner console = new Scanner(System.in);
        System.out.print("\n\tEnter Distance(km): ");
        int Distance = console.nextInt();
        System.out.print("\tAverage fuel consumption(l/100km): ");
        int AverFuelCons = console.nextInt();
        System.out.print("\tEnter The Cost Of 1 l. Fuel(grn): ");
        double FuelCost = console.nextDouble();
        double Fuel = (Distance/100)*AverFuelCons;
        double TravelCost = FuelCost * Fuel;
        System.out.println("\nRequired Amount Of Fuel = " + Fuel + "l." +
                "\nThe Cost Of Travel = " + TravelCost + "hrn.");
    }

    public static void averageFuelConsumption(){
        Scanner console = new Scanner(System.in);
        System.out.print("\n\tI Fill Up The Fuel(l): ");
        double Fuel = console.nextDouble();
        System.out.print("\tAnd I'm Passing(km): ");
        double Distance = console.nextDouble();
        double FuelCons = (Fuel/Distance)*100;
        System.out.println("\n\tThe Fuel Consumption Of Your Car Is " + FuelCons + " l. Per 100km.");
    }

    public  static void howMuchFuelIsEnough(){
        Scanner console = new Scanner(System.in);
        System.out.print("\n\tVehicle Fuel Consumption(l/100km): ");
        double Vehicle = console.nextDouble();
        System.out.print("\tI Flooded(l): ");
        double Fuel = console.nextDouble();
        double Distance = Fuel/(Vehicle/100);
        System.out.println("\n\tYou can drive  " + Distance + "km.");
    }
}