package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

public enum DeliveryStatusType {
    대기중,
    픽업,
    배달중,
    완료,
}
