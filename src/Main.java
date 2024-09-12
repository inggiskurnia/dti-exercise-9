import Exeptions.EmptyInputException;

public class Main {
    public static void main(String[] args) {
        try{
            MainMenu.run();
        } catch (EmptyInputException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}