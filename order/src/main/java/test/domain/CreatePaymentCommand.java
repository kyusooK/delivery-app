package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreatePaymentCommand {

    private OrderId orderId;
    private Money amount;
    private String paymentMethod;
}
