package Abstract;

import Entities.Customer;

import java.net.MalformedURLException;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws MalformedURLException;
}
