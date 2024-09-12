import Exeptions.EmptyInputException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private Scanner scanner = new Scanner(System.in);

    public void register(){
        this.username = inputUsername();
        this.password = inputPassword();
        System.out.println("New user has been created !");
    }

    public boolean login(HashMap<String, String> userList){
        String loginUsername = inputUsername();
        if (!userList.containsKey(loginUsername)){
            System.out.println("User not found");
            return false;
        };

        String loginPassword = inputPassword();
        if (!userList.get(loginUsername).equals(loginPassword) ) {
            System.out.println("Password incorrect");
            return false;
        }

        System.out.println("Successfully logged in !");
        return true;

    }

    private String inputUsername(){
        System.out.println("Enter username : ");
        String inputtedUsername = scanner.nextLine();
        if (inputtedUsername.isEmpty()) {
            throw new EmptyInputException();
        }
        return inputtedUsername;
    }

    private String inputPassword(){
        System.out.println("Enter password : ");
        String inputtedPassword = scanner.nextLine();
        if(inputtedPassword.isEmpty()){
            throw new EmptyInputException();
        }
        return inputtedPassword;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
