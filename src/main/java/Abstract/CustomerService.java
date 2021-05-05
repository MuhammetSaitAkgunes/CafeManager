package Abstract;

import Entities.Customer;

import java.net.MalformedURLException;

public interface CustomerService {
    void Save(Customer customer) throws MalformedURLException;
}
