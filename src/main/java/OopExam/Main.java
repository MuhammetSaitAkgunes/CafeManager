package OopExam;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"Muhammet Sait","Akgüneş",
                1999,12345678910L));


        BaseCustomerManager neroManager = new NeroCustomerManager();
        neroManager.Save(new Customer(1,"Engin","Demiroğ",1985,12345678910L));

    }

}
