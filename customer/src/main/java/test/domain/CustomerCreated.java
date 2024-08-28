package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CustomerCreated extends AbstractEvent {

    private Long customerId;
    private String name;
    private String phone;
    private Address address;

    public CustomerCreated(Customer aggregate) {
        super(aggregate);
    }

    public CustomerCreated() {
        super();
    }
}
//>>> DDD / Domain Event
