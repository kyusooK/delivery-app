package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateNotificationCommand {

    private CustomerId customerId;
    private OrderId orderId;
    private String message;
}
