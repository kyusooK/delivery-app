package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

public enum OrderStatusType {
    주문됨,
    수락됨,
    거절됨,
    요리중,
    요리완료,
    배달중,
    배달완료,
    취소됨,
}
