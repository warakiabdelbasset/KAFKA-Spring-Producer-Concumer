# KAFKA-Spring-Producer-Concumer

# KAFKA

Apache Kafka is a distributed streaming platform developed in Scala and Java. 
• A streaming platform has three key features: 
• Allowing Kafka client applications to publish and subscribe to streams of records. 
Similar to a queue of messages or a corporate messaging system such as Brokers JMS (ActiveMQ) or AMQP (RabbitMQ) 
• Allows to store the flow of records in a durable and fault tolerant. 
• Allows you to process the flow of records as you go they happen (Real Time Stream Processing)

<p align="center">
  <img src="https://github.com/warakiabdelbasset/KAFKA-Spring-Producer-Concumer/blob/master/img/kaf.jpg">
</p>


## Kafka has four main APIs:

• Producer API: Allows an application to publish a flow of records to one or more Topics Kafka.
• Consumer API: Allows an application to subscribe to one or more Topics and process the flow of records. who are he transmitted.
• Streams API: Allows an application to act as a stream processor, in
• Consuming an input stream from one or more Topics
• Effectively transforming input flows into output flows
• Producing an output flow to one or more output Topics.
• Connector API: Allows you to create and run reusable producers or consumers that connect from Kafka topics to existing applications or data systems. For example, a connector to a database relational data can capture every change made to a table.


## INSTALLATION OF KAFKA
• Download and decompression

``` Ruby
$ wget http://miroir.univ-lorraine.fr/apache/kafka/2.3.0/kafka_2.12-2.3.0.tgz
$ tar -xzf kafka_2.12-2.3.0.tgz
```

## STARTING KAFKA SERVER
• Start zookeeper

``` Ruby
$ cd kafka_2.12-2.3.0
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

## STARTING KAFKA SERVER
• Start kafka server

``` Ruby
$ cd kafka_2.12-2.3.0
$ bin/kafka-server-start.sh config/server.properties
```

## CREATION OF A TOPIC
• Creation of a Topic

``` Ruby
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1
--partitions 1 --topic test
```

## SUBSCRIBE TO A TOPIC TO CONSUME MESSAGES
• Subscribe to the test topic to consume messages

``` Ruby
$ bin/kafka-console-consumer.sh --bootstrap-server
localhost:9092 --topic test --from-beginning
```

## PRODUCE MESSAGES TO THE TOPIC TEST
• Produce messages to the topic

``` Ruby
$ bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
>
```
