package OOP_HW1;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}