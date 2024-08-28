package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointUpdated extends AbstractEvent {

    private Long customerId;
    private String name;
    private String phone;
    private Address address;
    private Integer totalPoints;

    public PointUpdated(Customer aggregate) {
        super(aggregate);
    }

    public PointUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
