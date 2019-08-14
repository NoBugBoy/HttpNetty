##请求方式:POST,GET,DELETE,PUT 
````
multipart/form-data
application/json
application/x-www-form-urlencoded
 ````
 因为要打jar包没有引入web.xml所以不能引入监听器了注入的方式有点僵硬
 使用注入器就方便多了：https://github.com/NoBugBoy/Guice
 
 非GET方式请求必须以对象作为参数，并且用@NettyRequestBody注解修饰，否则400
 
# 喜欢的话帮忙点个Star谢谢啦
# qq：754369677
