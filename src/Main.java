import Abstract.BaseCustomerManager;
import Adapters.IBOKPSPublicSoap;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class  Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"1543543646364",
                "rümeysa",
                "yük",
                LocalDate.parse("1999-11-23")));

    }
}
