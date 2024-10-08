package test.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.CustomerApplication;
import test.domain.CustomerCreated;
import test.domain.PointUpdated;

@Entity
@Table(name = "Customer_table")
@Data
//<<< DDD / Aggregate Root
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String name;

    private String phone;

    @Embedded
    private Address address;

    private Integer totalPoints;

    @PostPersist
    public void onPostPersist() {
        CustomerCreated customerCreated = new CustomerCreated(this);
        customerCreated.publishAfterCommit();

        PointUpdated pointUpdated = new PointUpdated(this);
        pointUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = CustomerApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updatePoint(PaymentCreated paymentCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        Customer customer = new Customer();
        repository().save(customer);

        PointUpdated pointUpdated = new PointUpdated(customer);
        pointUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCreated.get???()).ifPresent(customer->{
            
            customer // do something
            repository().save(customer);

            PointUpdated pointUpdated = new PointUpdated(customer);
            pointUpdated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
