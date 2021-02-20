package kafkaspring.wa;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
@Data
@EnableKafka

public class MyRestController {

    @Autowired
    private KafkaTemplate<String , PageEvent>kafkaTemplate;

    @GetMapping("/send/{page}/{topic}")
    public String send(@PathVariable String page,
                       @PathVariable String topic){
        PageEvent pageEvent=new PageEvent(page,new Date(),new Random().nextInt(1000));
        kafkaTemplate.send(topic,""+pageEvent.getPage(),pageEvent);
        return "message sent ....";
    }
}
