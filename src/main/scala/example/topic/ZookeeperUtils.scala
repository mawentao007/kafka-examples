package example.topic

import java.util.Properties

import example.utils.KafkaConfig

import scala.util.Random

import kafka.utils.{ZkUtils, ZKStringSerializer}
import kafka.producer.{ Producer => KafkaProducer }
import org.I0Itec.zkclient.{ZkConnection, ZkClient}
import org.I0Itec.zkclient.serialize.ZkSerializer

object ZookeeperUtils {

  def createZkUtils(
    config: Properties = KafkaConfig(),
    sessTimeout: Int = 10000,
    connTimeout: Int = 10000): ZkUtils = {
    val host = config.getProperty("zookeeper.connect")
    val zkClient = ZkUtils.createZkClient(host,sessTimeout,connTimeout)
    new  ZkUtils(zkClient,new ZkConnection(host),false)
  }
}
