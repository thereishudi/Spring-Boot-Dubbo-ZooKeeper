### 分布式开发解决四大问题 -> 高可用、高性能、高并发

1. 客户端如何访问这么多服务

API网关

2. 服务于服务之间如何通信

   - 同步通信

     - HTTP
     - RPC


3.  这么多服务如何管理

   - 服务治理

     - 服务注册与发现

       - 客户端的

         ZooKeeper

       - 服务端的

       - Netfilix

4. 服务挂了怎么办

   - 重启
   - 服务降级
   - 服务熔断
   - 服务限流





   ## 分布式锁



   ### 分布式锁具有的特点

   - 分布式环境下一个方法同一时间只能被一个机器的一个线程执行


   ### Redis作为锁
   1. 先去redis使用setnx(Key，value)
   2. 发现redis有数据，说明已经加锁
   3. 你redis没数据，说明可以获得锁
   4. 使用redis del Key
       显示
       Java 调用Redis setnx
       Java 调用Redis del
    5. 锁超时 30秒-> expire

    三大致命问题
    1. 非原子性操作
      1.1 setnx
          宕机
      1.2 expire
      解决方案
      set （key，value，expire） redis2.6以上
    2. 误删锁
      解决方案
      判断是不是自己的锁
    3. 加守护线程

   ### Zookeeper
   实现了分布式锁的解决方案，专门负责分布式锁
   分布式协调服务
