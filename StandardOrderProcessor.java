public class StandardOrderProcessor implements OrderProcessor {
    @Override
    public double calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
        return total;
    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}