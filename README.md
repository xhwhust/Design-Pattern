# Design-Pattern
图解设计模式

#### 1. Iterator 迭代器模式
* 使用者不需要关心集合具体的底层实现
* 不管是数组还是链表，统一可以通过迭代器访问

#### 2. Adapter 适配器模式
* 使用者可以使用新的调用方式调用老的方法
* 不需要修改老方法，只需要借助适配者类调用老方法
* 适配类并不扩展老方法功能，和代理模式有区别
* 有两种实现方式：
  * 第一种继承被适配者类，适配方法使用接口实现
  * 第二种继承适配类，被适配者作为成员变量进行组合

