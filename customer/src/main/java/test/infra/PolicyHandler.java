package test.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import test.config.kafka.KafkaProcessor;
import test.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CustomerRepository customerRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentCreated'"
    )
    public void wheneverPaymentCreated_UpdatePoint(
        @Payload PaymentCreated paymentCreated
    ) {
        PaymentCreated event = paymentCreated;
        System.out.println(
            "\n\n##### listener UpdatePoint : " + paymentCreated + "\n\n"
        );

        // Sample Logic //
        Customer.updatePoint(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
