package hello;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by lcsontos on 2/21/17.
 */
@Component
public class GenerateUUIDListener extends AbstractMongoEventListener<Customer> {

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Customer> event) {
        Customer customer = event.getSource();
        if (customer.id == null) {
            customer.id = UUID.randomUUID();
        }
    }

}
