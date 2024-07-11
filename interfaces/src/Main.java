import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.print("enter the amount to be withdrawn:");
        double price=input.nextDouble();

        System.out.print("enter the card number: ");
        String cardNumber=input.next();


        System.out.print("enter the card expiry date: ");
        String date=input.next();

        System.out.print("enter the cvc: ");
        String cvc=input.next();

        System.out.println("1. A bank");
        System.out.println("2. B Bank");
        System.out.println("3. C bank");
        System.out.print(" choose a bank:");
        int selectBank=input.nextInt();

        switch(selectBank){

            case 1:
                ABank aPos= new ABank("A Bank",  "123123234", "562453673");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;

            case 2:
                BBank bPos= new BBank("B Bank",  "123123234", "562453673");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNumber,date,cvc);

            default:
                System.out.println("Invalid selection!");


        }


    }
}
