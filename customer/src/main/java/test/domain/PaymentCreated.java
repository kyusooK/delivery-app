package test.domain;

import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
@ToString
public class PaymentCreated extends AbstractEvent {

    private Long paymentId;
    private Object orderId;
    private Object amount;
}
