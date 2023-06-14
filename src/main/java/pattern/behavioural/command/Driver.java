package pattern.behavioural.command;

import pattern.behavioural.command.fx.Button;

public class Driver {
    public static void main(String[] args) {
        /*Button button = new Button();
        button.click(new DeleteCommand());*/

        // Receiver
        CustomerService customerService = new CustomerService();
        // Command Implementation
        AddCustomerCommand addCustomerCommand = new AddCustomerCommand(customerService);
        // Issuer/Sender
        Button button = new Button(addCustomerCommand);
        // I think for composite commands, we can call below snippet in loop.
        button.click();
    }
}
