package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RiderCreated extends AbstractEvent {

    private Long riderId;
    private String name;
    private String phone;

    public RiderCreated(Rider aggregate) {
        super(aggregate);
    }

    public RiderCreated() {
        super();
    }
}
//>>> DDD / Domain Event
