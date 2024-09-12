import Exeptions.EmptyInputException;

import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class ToDoList {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> list = new HashMap<>();


    public void createList(){
        System.out.println("Input some to do list : ");
        String newList = scanner.nextLine();
        if (newList.isEmpty()) {
            throw new EmptyInputException();
        }
        list.put(UUID.randomUUID().toString(), newList);
    }

    public void showAllList(){
        if (list.isEmpty()){
            System.out.println("List is empty !");
            return;
        }

        for (String key : list.keySet()){
            System.out.println();
            System.out.println("ID : " + key);
            System.out.println("To do : " + list.get(key));
        }
    }

    public void deleteList(){
        System.out.println("Input list id : ");
        String key = scanner.nextLine();

        if (!list.containsKey(key)) {
            System.out.println("List is not found !");
            return;
        }
        list.remove(key);
        System.out.println("Successfully delete list !");
    }
}
