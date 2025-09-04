package company.view;

import java.util.Scanner;

public class HandleError {

    // tratar erros

    public static String verifyState(String text) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                if (text.length() == 2 ) {
                    return text;
                } else {
                    System.out.println("Erro: O estado deve ter exatamente duas letras. Tente novamente.");
                    System.out.print("Digite o estado (2 letras): ");
                    text = input.nextLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
        return text;
    }
}
