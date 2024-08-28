package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateDeliveryCommand {

    private OrderId orderId;
    private RiderId riderId;
}
