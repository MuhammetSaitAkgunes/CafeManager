package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

import java.net.MalformedURLException;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer) throws MalformedURLException {
        if (customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
        else {
            System.out.println("not a valid person");
        }


    }

}
