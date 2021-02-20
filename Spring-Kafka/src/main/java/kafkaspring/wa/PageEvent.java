package kafkaspring.wa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class PageEvent {
    private String page;
    private Date date;
    private int duration;
}
