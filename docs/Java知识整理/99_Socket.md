# Socket 是什么

在unix系统中，一切皆文件，socket也不例外。

可以把它想象成一个文件，操作对象是网络中不同的主机。



# 解决了什么问题

它解决了网络中的两台主机应该如何通信。

![image-20200609071456416](C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200609071456416.png)

如图，它对应用层来说，封装了底层的传输协议（TCP/IP协议簇），使应用开发无需关注具体的传输协议。



对于socket套接字来说，它只需要关系如何标记网络中的两台主机进程：

- 通过IP标定某一台主机
- 通过传输层的协议族(TCP/UDP) + 端口号, 来确定某一台主机上的进程



为什么在4-5层之间建立socket套接字标准

- 顶上三层处理具体网络应用的(FTP/HTTP/Telnet)的细节，不关心通信细节
- 底下四层对具体应用的了解不多，却需要处理所有的通信细节：发送数据、等待确认、无序数据排序、计算校验和、拥塞控制
- 上三层一般作为用户进程、下四层一般作为操作系统的内核部分



# 它是怎么解决的

## 设计架构图

### Unix系统Socket模型

![image-20200608233505136](C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200608233505136.png)



### Java封装的Socket模型

![image-20200609073600115](C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200609073600115.png)



## 主要流程

### 服务器为监听套接字维护的队列

<img src="C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200609074211745.png" alt="TCP为监听套接字维护的两个队列" style="zoom: 67%;" />



### Unix 系统的处理过程

1. 服务端先行**创建Socket**（new Socket()），**绑定**相应端口( bind() )，并使之在该端口上进行**监听**连接**准备就绪队列**( listen() )，当监听有连接时，调用**accpet()** 方法，在服务端fork一个进程，用于具体的应用通信
2. 客户端指定IP，协议，端口来**创建Socket**，并进行**连接**，经过三次握手，服务器把该连接从未完成连接队列放入已完成队列，并分配给具体执行的socket进程进行处理
3. 经过具体的数据请求与应答后，两者之间进行**关闭**Socket套接字操作





# I/O模型



## 系统调用/用户进程的理解





## 阻塞式I/O

![image-20200609080901136](C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200609080901136.png)

## 非阻塞式I/O

## I/O复用

## 信号驱动I/O

## 异步I/O







![image-20200609075948686](C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200609075948686.png)







针对一个TCP客户端来说，它有两个输入需要处理

1. 标准输入
2. Socket 套接字输入

问题来了，当TCP客户端处理标准输入时，服务端的被杀死? 这里个人有个问题，为什么会是杀死，而不是进行休眠？

如图是《Unix网络编程卷1》第六章概述中描述。

![image-20200609080227164](C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200609080227164.png)

我下面的问题以休眠进行讨论，因为杀死的话，它还需要再走一遍TCP的连接，感觉有点突兀。







![image-20200609001917563](C:\Users\16794\AppData\Roaming\Typora\typora-user-images\image-20200609001917563.png)