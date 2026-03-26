public class OrderTest {
    public static void main(String[] args) {
        // Instantiate the specific processor we need
        OrderProcessor orderProcessor = new StandardOrderProcessor();
        
        // Process the standard order
        orderProcessor.calculateTotal(10.0, 2);
        orderProcessor.placeOrder("John Doe", "123 Main St");

        // Conditionally handle invoices and emails
        boolean needsInvoiceAndEmail = true; 
        
        if (needsInvoiceAndEmail) {
            InvoiceGenerator invoiceGen = new PdfInvoiceGenerator();
            invoiceGen.generateInvoice("order_123.pdf");
            
            Notifier notifier = new EmailNotifier();
            notifier.sendNotification("johndoe@example.com");
        }
    }
}