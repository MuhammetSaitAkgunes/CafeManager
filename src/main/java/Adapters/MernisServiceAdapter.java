package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws MalformedURLException {
        String endpoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
        URL url = URI.create(endpoint).toURL();
        KPSPublic service = new KPSPublic(url);
        KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
        return port.tcKimlikNoDogrula(customer.nationalityNumber,customer.FirstName.toUpperCase(), customer.LastName.toUpperCase(), customer.dateOfBirth);
    }
}
