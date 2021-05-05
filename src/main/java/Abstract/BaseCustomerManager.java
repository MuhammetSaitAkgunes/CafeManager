package Abstract;

import Entities.Customer;

import java.net.MalformedURLException;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public  void Save(Customer customer) throws MalformedURLException {
        System.out.println("veritabanına eklendi : " + customer.FirstName);
    }
}
