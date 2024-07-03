package ro.ase.acs.command;

import java.util.ArrayList;
import java.util.List;

public class TaxiOrdering {

        private List<TaxiOrder> orders = new ArrayList<>();
        public void addOrder(TaxiOrder taxiOrder)
        {
            orders.add(taxiOrder);
        }
        public void contactDriver()
        {
            for(TaxiOrder order : orders)
            {
                order.pickUpClient();
            }
            orders.clear();
        }

}
