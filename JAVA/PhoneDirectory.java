import java.util.Scanner;
import java.util.ArrayList;
 public class PhoneDirectory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<PersonalDirectory> phone = new ArrayList<>();

        phone.add(new PersonalDirectory("Ej", "09453567412"));
        phone.add(new PersonalDirectory("Jeff", "09657894231"));
        phone.add(new PersonalDirectory("Woodie", "09645123148"));
        phone.add(new PersonalDirectory("Brader", "0945315487"));
        phone.add(new PersonalDirectory("Emil", "09413487631"));
        phone.add(new PersonalDirectory("John", "09487894231"));
        phone.add(new PersonalDirectory("Ongart", "09457864231"));
        phone.add(new PersonalDirectory("Viterbs", "09987456212"));
        phone.add(new PersonalDirectory("Pablo", "09478953142"));
        phone.add(new PersonalDirectory("Cayao", "09767487421"));

        while (true) {
            System.out.print("Input Name ('quit' to exit): ");
            String PName = in.nextLine();

            if (PName.equalsIgnoreCase("quit")) {
                System.out.println("Program Exit");
                break;
            }
            boolean found = false;
            for(PersonalDirectory p : phone) {
                if(p.getName().equalsIgnoreCase(PName)) {
                    System.out.println("Phone Number: " + p.getNum());
                    found = true;
                    break;
                }
            }

             if (!found) {
                if (phone.size() >= 30){
                    System.out.println("Contact is full");
                    break;
                }

                System.out.print("Not Found. Input Phone Number: ");
                String PNumber = in.nextLine(); 
                phone.add(new PersonalDirectory(PName, PNumber));
                System.out.println("New Phone Number Added");
            }
        }
    }
}