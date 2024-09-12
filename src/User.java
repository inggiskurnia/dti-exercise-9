import utils.InputValues;

import java.util.HashMap;

public class User {
    HashMap<String, String> user = new HashMap<>();

    public void register(){
        System.out.println("Register new user");

        System.out.println("Input username");
        String tempUsername = InputValues.check();

        System.out.println("Input password");
        String tempPassword = InputValues.check();

        this.user.put(tempUsername, tempPassword);
        System.out.println("New user has been created !");
    }

    public boolean login(){
        System.out.println("Login user");

        System.out.println("Input username");
        String loginUsername = InputValues.check();

        if (!user.containsKey(loginUsername)){
            System.out.println("User not found");
            return false;
        };

        System.out.println("Input password");
        String loginPassword = InputValues.check();

        if (!user.get(loginUsername).equals(loginPassword) ) {
            System.out.println("Password incorrect");
            return false;
        }

        System.out.println("Successfully logged in !");
        return true;
    }
}
