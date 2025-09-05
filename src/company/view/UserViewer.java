package company.view;

import company.model.Cliente;
import company.model.Motorista;

import java.util.Scanner;

public class UserViewer {
    
    static Scanner input = new Scanner(System.in);
    
    public static int mainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1 - Register Person");
        System.out.println("2 - Create Order");
        System.out.println("3 - Generate Delivery");
        System.out.println("4 - History");
        System.out.println("5 - Update Delivery Status");
        System.out.println("6 - List All Deliveries");
        System.out.println("7 - Report: Total Deliveries per Driver");
        System.out.println("8 - Report: Clients with Highest Delivered Volume");
        System.out.println("9 - Report: Pending Orders by State");
        System.out.println("10 - Report: Late Deliveries by City");
        System.out.println("11 - Search Order by Client CPF/CNPJ");
        System.out.println("12 - Cancel Order");
        System.out.println("13 - Delete Delivery");
        System.out.println("14 - Delete Client");
        System.out.println("15 - Delete Driver");
        System.out.println("0 - Exit");

        System.out.print("Choose an option: ");
        return input.nextInt();
    }

    public static Cliente registerClient(){
        System.out.println("==================\nRegister a Client\n==================");
        input.nextLine();
        System.out.print("Enter the client's name: ");
        String name = input.nextLine();
        System.out.print("Enter the client's CPF or CNPJ: ");
        String cpf_cnpj = input.nextLine();
        System.out.print("Enter the client's adress: ");
        String adress = input.nextLine();
        System.out.print("Enter the client's city: ");
        String city = input.nextLine();
        System.out.print("Enter the client's state: ");
        String state = input.nextLine();
        return new Cliente(name, cpf_cnpj, adress, city, state);
    }

    public static int chooseTypeRegister(){
        System.out.println("======================\nChoose a Type to Register\n======================");
        System.out.println("1- Register a Client");
        System.out.println("2- Register a Driver");
        System.out.print("Enter your choose: ");
        return input.nextInt();

    }

    public static Motorista registerTrucker(){
        System.out.println("======================\nRegister a Trucker\n======================");
        input.nextLine();
        System.out.print("Enter the driver's name: ");
        String name = input.nextLine();
        System.out.print("Enter the driver's CNH: ");
        int cnh = input.nextInt();
        input.nextLine();
        System.out.print("Enter the driver's vehicle: ");
        String vehicle = input.nextLine();
        System.out.print("Enter the driver's city: ");
        String city = input.nextLine();
        return new Motorista(name, cnh, vehicle, city);
    }

}
