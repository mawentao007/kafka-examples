package example.topic

import java.util.Properties

import kafka.admin.AdminUtils
import kafka.utils.ZkUtils
import org.I0Itec.zkclient.ZkClient

case class TopicAdmin(zkUtils: ZkUtils) {

  def createTopic(name: String, partitionNum: Int = 1, replicationFactor: Int = 1, config: Properties = new Properties()): Unit = {
    AdminUtils.createTopic(zkUtils, name, partitionNum, replicationFactor, config)
  }

  def deleteTopic(topicName: String) {
    AdminUtils.deleteTopic(zkUtils, topicName)
  }
}
