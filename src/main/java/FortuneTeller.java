import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userFirstName, userLastName, userFavColor;
        int userAge, userBirthMonth, userNumSib;

        // Calculated outputs
        int retirementYears;
        String retirementCity, modeTransportation;
        double bankBalance;

        System.out.println("Hello, and welcome to the Auto-Fortune Teller!\nPlease sit and let your future unfold in front of you!");
        System.out.println("Before we start I am going to need a little information about you...");
        System.out.println("First, tell me your first name: "); userFirstName = input.nextLine();
        System.out.println("Next, please tell me your last name: "); userLastName = input.nextLine();
        System.out.println("Now I need to know your favorite color (ROYGBIV, input 'help' for explanation): ");
        userFavColor = input.nextLine();
        while (userFavColor.equalsIgnoreCase("help")) {
            System.out.println("To clarify, I mean enter either Red, Orange, Yellow, Green, Blue, Indigo, or Violet: ");
            userFavColor = input.nextLine();
        }
        System.out.println("Good... good, the fortune is forming... next your birth month, as a number please (Feb = 2, Dec = 12): ");
        userBirthMonth = input.nextInt();
        System.out.println("Almost there, just a couple more. I require your age (don't lie, the fates will know...): "); userAge = input.nextInt();
        System.out.println("And Finally... How many siblings do you have?: ");
        userNumSib = input.nextInt();

        System.out.println("Excellent! now give me a moment while I consult the fates...");

        //determining years until retirement
        if (userAge%2 == 0){
            retirementYears = 20;
        } else {
            retirementYears = 35;
        }

        //determining where they will live
        if (userNumSib == 0){
            retirementCity = "Tokyo, Japan";
        } else if (userNumSib == 1){
            retirementCity = "Naples, Italy";
        } else if (userNumSib == 2){
            retirementCity = "Honolulu, Hawaii";
        } else if (userNumSib >= 3){
            retirementCity = "Bern, Switzerland";
        } else {
            retirementCity = "Atqasuk, Alaska";
        }

        //Determining what you will drive
        switch (userFavColor.toLowerCase()){
            case "red":
                modeTransportation = "Lamborghini";
                break;
            case "orange":
                modeTransportation = "Uber";
                break;
            case "yellow":
                modeTransportation = "Personal Jetpack";
                break;
            case "green":
                modeTransportation = "Subaru Outback";
                break;
            case "blue":
                modeTransportation = "Serenity";
                break;
            case "indigo":
                modeTransportation = "Really Fancy Roller Skates";
                break;
            case "violet":
                modeTransportation = "Hovercraft";
                break;
            default :
                modeTransportation = "Pogo Stick";
                break;
        }

        //Determining Bank Balance
        switch (userBirthMonth){
            case 1:
            case 2:
            case 3:
            case 4:
                bankBalance = 985675.23;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                bankBalance = 200000001.50;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                bankBalance = 8675309.00;
                break;
            default:
                bankBalance = 0.00;
                break;
        }

        System.out.println("Yes, now to put it all together... *lots of whooshing sounds* ...");
        System.out.println(userFirstName + " " + userLastName + " will retire in " + retirementYears + " years, with " +
                    bankBalance + " in the bank, a vacation home in " + retirementCity + " and will travel by " +
                    modeTransportation);

        System.out.println("\n\n\nAll foretold fortunes are final, have a wonderful life!");

    }
}
