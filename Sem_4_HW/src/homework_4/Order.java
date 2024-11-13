package homework_4;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order [" + "Customer=" + customer.getFullName() + ", Product=" + product.getName() + ", Quantity=" + quantity +"]";
    }
}
