##kafka的简单实例,在https://github.com/vngrs/activator-hello-kafka/基础上进行修改
version 0.9.0

#启动zookeeper和kafka
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties

#关配置参见resources下的conf文件
