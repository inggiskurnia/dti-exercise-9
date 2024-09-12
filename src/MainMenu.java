import java.util.HashMap;
import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void run(){
        //HashMap<String, String> userList = new HashMap<>();
        User user = new User();
        int selectedMenu = 0;

        while (true){
            switch (selectedMenu) {
                // main menu
                case 0 : {
                    System.out.println("***********************");
                    System.out.println("To Do List App");
                    System.out.println();
                    System.out.println("1. Register");
                    System.out.println("2. Login ");
                    System.out.println();
                    System.out.println("***********************");

                    int tempSelectedMenu = scanner.nextInt();

                    if (tempSelectedMenu> 0 && tempSelectedMenu < 3) {
                        selectedMenu = tempSelectedMenu;
                    } else {
                        System.out.println("Please select the correct menu");
                    }
                    break;
                }
                // register menu
                case 1 : {
                    user.register();
                    selectedMenu = 0;
                    break;
                }
                // login menu
                case 2 : {
                    if (user.login()) {
                        selectedMenu = App.run();
                    }else {
                        selectedMenu = 0;
                    }
                    break;
                }
            }
        }
    }
}
