package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateStoreCommand {

    private String name;
    private Address address;
    private String phone;
}
