package company.service;

import company.dao.ClienteDAO;
import company.dao.MotoristaDAO;
import company.view.UserViewer;

public class ServiceJDBC {

    public static void mainFlux(int option) {

        switch (option) {

            case 1 -> {
                int typeRegister = UserViewer.chooseTypeRegister();

                switch (typeRegister) {
                    case 1 -> {
                        var client = UserViewer.registerClient();
                        ClienteDAO.insertClient(client);
                    }
                    case 2 ->{
                        var trucker = UserViewer.registerTrucker();

                        MotoristaDAO.insertTrucker(trucker);
                    }
                }
            }

            case 2 -> {

            }

            case 3 -> {

            }

            case 4 -> {

            }

            case 5 -> {

            }

            case 6 -> {

            }

            case 7 -> {

            }

        }

    }
}
