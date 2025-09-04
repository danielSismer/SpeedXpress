package company.app;

import company.service.ServiceJDBC;
import company.view.UserViewer;

public class Main {

    public static void main(String [] args ){



        while(true){
            int pageChose = UserViewer.mainMenu();
            ServiceJDBC.mainFlux(pageChose);
        }

    }
}
