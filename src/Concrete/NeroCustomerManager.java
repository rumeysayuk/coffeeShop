package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    CustomerCheckService checkService;

    public NeroCustomerManager(CustomerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void save(Customer customer) {
        if(checkService.checkIfRealPerson(customer))
        super.save(customer);
        else
            System.out.println("not a valid person .");
    }
}
