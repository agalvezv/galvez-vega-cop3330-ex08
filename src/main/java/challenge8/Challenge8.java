package challenge8;
//AGV
//6-5-2021
import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("How many people?");
        String people = inputs.nextLine();
        int peopleUp = Integer.parseInt(people);

        System.out.println("How many pizzas do you have?");
        String pizzaAmount = inputs.nextLine();
        int pizzaAmountUp = Integer.parseInt(pizzaAmount);

        System.out.println("How many slices per pizza?");
        String sliceAmount = inputs.nextLine();
        int sliceAmountUp = Integer.parseInt(sliceAmount);
        int sliceTotal = sliceAmountUp * pizzaAmountUp;
        String slicesTotalUp = String.valueOf(sliceTotal);

        System.out.println(people + " people with " + pizzaAmount + " pizzas ("+ slicesTotalUp + " slices)"  );
        int slicePerPerson = sliceTotal / peopleUp;
        String slicesPerPersonUp = String.valueOf(slicePerPerson);
        int sliceRem = sliceTotal % peopleUp;
        String sliceRemUp = String.valueOf(sliceRem);
        System.out.println("Each person gets " + slicesPerPersonUp + " pieces of pizza");
        System.out.println("There are " + sliceRem + " leftover pieces.");

    }
}
