package ShoppingApplication.Admin;

import ShoppingApplication.Exceptions.ProductAlreadyExistsException;
import ShoppingApplication.Exceptions.ProductDoesNotExistException;
import ShoppingApplication.Product.Product;

import java.util.HashMap;

public class Admin {
    private String adminName;
    public static HashMap<String, Product> products = new HashMap<String, Product>();

    public Admin(String adminName) {
        this.adminName = adminName;
    }

    public Admin() {
    }


    /**
     *
     * @param productId   the unique Id for each product
     * @param product     the product, which will be added
     * @throws ProductAlreadyExistsException
     */
    private void addProductToList(String productId, Product product) throws ProductAlreadyExistsException {

        if(!products.containsKey(productId)) {

            products.put(productId, product);

        }else {
            throw new ProductAlreadyExistsException("Product can't be added, because it already exists.");
        }

    }
    /**
     *
     * @param productId   the unique Id for each product
     * @param product     the product, which will be deleted
     * @throws ProductDoesNotExistException
     */
    private void deleteProductFromList(String productId, Product product) throws ProductDoesNotExistException {

        if(products.containsKey(productId)) {

            products.remove(productId, product);

        }else {
            throw new ProductDoesNotExistException("Product can't be deleted, because it does not exist.");
        }

    }

    /**
     *
     * @param productId   the unique Id for each product
     * @param newProduct   the product, which will be edited
     * @throws ProductDoesNotExistException
     */
    private void editProductFromList(String productId, Product newProduct) throws ProductDoesNotExistException {

        if(products.containsKey(productId)) {

            products.replace(productId, newProduct);

        }else {
            throw new ProductDoesNotExistException("Product can't be edited, because it does not exist.");
        }

    }

    public String getAdminName() {
        return adminName;
    }

}
