package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        IBOKPSPublicSoap publicSoap=new IBOKPSPublicSoap();
        try {
            return publicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
                    customer.getDateOfBirth().getYear());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
