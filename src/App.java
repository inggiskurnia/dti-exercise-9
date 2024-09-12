import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static int selectedMenu = 0;
    static ToDoList newList = new ToDoList();

    public static int run(){

        while(true) {
            switch (selectedMenu){
                case 0 :
                    // to do list menu
                    System.out.println("***********************");
                    System.out.println("To Do List App");
                    System.out.println();
                    System.out.println("1. Create new list");
                    System.out.println("2. Show all list ");
                    System.out.println("3. Delete list");
                    System.out.println("4. Log out");
                    System.out.println();
                    System.out.println("***********************");

                    int tempSelectedMenu = scanner.nextInt();

                    if (tempSelectedMenu> 0 && tempSelectedMenu < 5) {
                        selectedMenu = tempSelectedMenu;
                    } else {
                        System.out.println("Please select the correct menu");
                    }
                    break;
                case 1 : {
                    // create new list
                    newList.createList();
                    selectedMenu = 0;
                    break;
                }
                case 2 : {
                    // show all list
                    newList.showAllList();
                    System.out.println("Press 0 to back to previous menu");
                    int goBack = scanner.nextInt();

                    if (goBack == 0) {
                        selectedMenu = 0;
                    } else {
                        System.out.println("Invalid input ! ");
                    }
                    break;
                }
                case 3 : {
                    // delete list
                    newList.deleteList();
                    selectedMenu = 0;
                    break;
                }
                case 4 : {
                    selectedMenu = 0;
                    return 0;
                }
            }
        }
    }
}
