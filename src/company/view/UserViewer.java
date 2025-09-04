package company.view;

import company.model.Cliente;
import company.model.Motorista;

import java.util.Scanner;

public class UserViewer {

    static Scanner input = new Scanner(System.in);
    public static int mainMenu() {
        System.out.println("Menu Principal:");
        System.out.println("1 - Cadastrar Pessoa");
        System.out.println("2 - Criar Pedido");
        System.out.println("3 - Gerar Entrega");
        System.out.println("4 - Histórico");
        System.out.println("5 - Atualizar Status da Entrega");
        System.out.println("6 - Listar Todas as Entregas");
        System.out.println("7 - Relatório: Total de Entregas por Motorista");
        System.out.println("8 - Relatório: Clientes com Maior Volume Entregue");
        System.out.println("9 - Relatório: Pedidos Pendentes por Estado");
        System.out.println("10 - Relatório: Entregas Atrasadas por Cidade");
        System.out.println("11 - Buscar Pedido por CPF/CNPJ do Cliente");
        System.out.println("12 - Cancelar Pedido");
        System.out.println("13 - Excluir Entrega");
        System.out.println("14 - Excluir Cliente");
        System.out.println("15 - Excluir Motorista");
        System.out.println("0 - Sair");

        System.out.print("Escolha uma opção: ");
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
        System.out.println("2- Register a Trucker");
        System.out.print("Enter your choose: ");
        return input.nextInt();


    }

    public static Motorista registerTrucker(){
        System.out.println("======================\nRegister a Trucker\n======================");
        input.nextLine();
        System.out.print("Enter the trucker's name: ");
        String name = input.nextLine();
        System.out.print("Enter the trucker's CNH: ");
        int cnh = input.nextInt();
        input.nextLine();
        System.out.print("Enter the trucker's vehicle: ");
        String vehicle = input.nextLine();
        System.out.print("Enter the trucker's city: ");
        String city = input.nextLine();
        return new Motorista(name, cnh, vehicle, city);
    }

}
