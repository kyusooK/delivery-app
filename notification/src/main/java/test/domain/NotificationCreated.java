package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class NotificationCreated extends AbstractEvent {

    private Long notificationId;
    private CustomerId customerId;
    private OrderId orderId;
    private String message;

    public NotificationCreated(Notification aggregate) {
        super(aggregate);
    }

    public NotificationCreated() {
        super();
    }
}
//>>> DDD / Domain Event
