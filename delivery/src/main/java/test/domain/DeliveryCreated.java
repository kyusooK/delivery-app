package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCreated extends AbstractEvent {

    private Long deliveryId;
    private OrderId orderId;
    private RiderId riderId;

    public DeliveryCreated(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCreated() {
        super();
    }
}
//>>> DDD / Domain Event
