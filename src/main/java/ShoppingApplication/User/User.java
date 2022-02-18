package ShoppingApplication.User;

import ShoppingApplication.Admin.Admin;
import ShoppingApplication.Exceptions.ProductDoesNotExistException;
import ShoppingApplication.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class User extends Admin {

    private String userName;
    private String userEmail;
    static List<Product> savedProducts = new ArrayList<Product>();


    public User(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;
    }

    /**
     *
     * @param product the product, which will be saved
     */
    public static void saveProduct(Product product){
        savedProducts.add(product);
    }


    /**
     *
     * @param productName   the name of the needed product
     * @return
     * @throws ProductDoesNotExistException    the product can't be searched, because it doesn't exist
     */
    public static Product searchTheProduct(String productName) throws ProductDoesNotExistException {

        if(!products.containsValue(productName)){
            throw new ProductDoesNotExistException("The item does not exists.");
        } else {
            return products.get(productName);
        }
    }

    public class SignIn {

        public String nameForSignIn;
        public String passwordForSignIn;

        public SignIn(String nameForSignIn, String passwordForSignIn) {
            this.nameForSignIn = nameForSignIn;
            this.passwordForSignIn = passwordForSignIn;
        }

        /**
         *
         * @param nameForSignIn name for signing in
         * @param passwordForSignIn right password for signing in
         * @throws Exception  the exception will be, if password or name are wrong
         */
        public static void signIn(String nameForSignIn, String passwordForSignIn) throws Exception{

        }


    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
