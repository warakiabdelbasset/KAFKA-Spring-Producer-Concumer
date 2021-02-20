package kafkaspring.wa;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @KafkaListener(topics = "test7",groupId = "groupe-ms")
    public void onMessage(ConsumerRecord<String,String> consumerRecord) throws Exception{
        System.out.println("************************");
        PageEvent pageEvent=pageEvent(consumerRecord.value());
           System.out.println("Key=> "+
                   consumerRecord.key()+" , "+
                   pageEvent.getPage()+" , "+
                   pageEvent.getDate()+" , "+
                   pageEvent.getDuration());


    }

    private PageEvent pageEvent(String jsonPageEvent) throws Exception {
        JsonMapper jsonMapper=new JsonMapper();
        PageEvent pageEvent=jsonMapper.readValue(jsonPageEvent,PageEvent.class);
        return pageEvent;
    }
}
