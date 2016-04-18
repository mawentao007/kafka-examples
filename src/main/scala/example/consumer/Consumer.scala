package example
package consumer

import example.utils.KafkaConfig
import kafka.consumer.{Consumer => KafkaConsumer, _}

abstract class Consumer(topics: List[String]) {
  protected val kafkaConfig = KafkaConfig()
  protected val config = new ConsumerConfig(kafkaConfig)

  def read(): Iterable[String]
}