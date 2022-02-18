package ShoppingApplication;

import ShoppingApplication.Exceptions.InvalidEmailException;
import ShoppingApplication.Exceptions.InvalidPasswordException;


public interface Validation {
    String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    String PASSWORD_REGEX="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$\n";

    public boolean isValidEmail(String email) throws InvalidEmailException;
    public boolean isValidPassword(String password) throws InvalidPasswordException;

}
