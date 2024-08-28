package test.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.DeliveryApplication;
import test.domain.DeliveryCreated;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryId;

    @Embedded
    private OrderId orderId;

    @Embedded
    private RiderId riderId;

    private Date pickupTime;

    private String deliveryStatus;

    @Enumerated(EnumType.STRING)
    private DeliveryStatusType deliveryStatusType;

    @PostPersist
    public void onPostPersist() {
        DeliveryCreated deliveryCreated = new DeliveryCreated(this);
        deliveryCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
//>>> DDD / Aggregate Root
