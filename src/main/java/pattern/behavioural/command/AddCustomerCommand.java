package pattern.behavioural.command;

import pattern.behavioural.command.fx.Command;

// Concrete Command
public class AddCustomerCommand implements Command {
    private final CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
     customerService.addCustomer();
    }
}
