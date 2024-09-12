package exeptions;

public class EmptyInputException extends RuntimeException{
    public EmptyInputException(){
        super("Invalid input !");
    }
}
