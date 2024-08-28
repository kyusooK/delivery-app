package test.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.OrderApplication;
import test.domain.StoreCreated;

@Entity
@Table(name = "Store_table")
@Data
//<<< DDD / Aggregate Root
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeId;

    private String name;

    @Embedded
    private Address address;

    private String phone;

    @PostPersist
    public void onPostPersist() {
        StoreCreated storeCreated = new StoreCreated(this);
        storeCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static StoreRepository repository() {
        StoreRepository storeRepository = OrderApplication.applicationContext.getBean(
            StoreRepository.class
        );
        return storeRepository;
    }
}
//>>> DDD / Aggregate Root
