package ShoppingApplication.SignUp;

import ShoppingApplication.Exceptions.AccountIsAlreadyCreated;
import ShoppingApplication.Exceptions.InvalidEmailException;
import ShoppingApplication.Exceptions.InvalidPasswordException;
import ShoppingApplication.Validation;

import java.util.HashMap;

public class SignUp implements Validation {

    private String nameForSignUp;
    private String emailForSignUp;
    private String passwordForSignUp;

    static HashMap<String,String> signUpedUsers = new HashMap<>();

    /**
     *
     * @param nameForSignUp    name for creating new account
     * @param emailForSignUp    valid email for creating new account
     * @param passwordForSignUp    valid password for creating new account
     * @throws Exception
     */
    public void createNewAccount(String nameForSignUp, String emailForSignUp, String passwordForSignUp) throws Exception {
        if (!signUpedUsers.containsValue(emailForSignUp) && isValidEmail(emailForSignUp) && isValidPassword(passwordForSignUp)){

            signUpedUsers.put(nameForSignUp, passwordForSignUp);
            System.out.println("The account is created!");

        }else {
            throw new AccountIsAlreadyCreated("The account has been already created!");
        }
    }

    public String getNameForSignUp() {
        return nameForSignUp;
    }

    public void setNameForSignUp(String nameForSignUp) {
        this.nameForSignUp = nameForSignUp;
    }

    public String getEmailForSignUp() {
        return emailForSignUp;
    }

    public void setEmailForSignUp(String emailForSignUp) {
        this.emailForSignUp = emailForSignUp;
    }

    public String getPasswordForSignUp() {
        return passwordForSignUp;
    }

    public void setPasswordForSignUp(String passwordForSignUp) {
        this.passwordForSignUp = passwordForSignUp;
    }


    @Override
    public boolean isValidEmail(String email) throws InvalidEmailException {
        if (!email.matches(EMAIL_REGEX)) {
            throw new InvalidEmailException("The mail is invalid!");
        }else{
            return true;
        }
    }

    @Override
    public boolean isValidPassword(String password) throws InvalidPasswordException {
        if (!password.matches(EMAIL_REGEX)) {
            throw new InvalidPasswordException("The password is invalid!");
        }else{
            return true;
        }
    }
}
