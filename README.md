# Design-Pattern
图解设计模式

#### 1. [Iterator](./src/iterator) 迭代器模式
* 使用者不需要关心集合具体的底层实现
* 不管是数组还是链表，统一可以通过迭代器访问

#### 2. [Adapter](./src/adapter) 适配器模式
* 使用者可以使用新的调用方式调用老的方法
* 不需要修改老方法，只需要借助适配者类调用老方法
* 适配类并不扩展老方法功能，和代理模式有区别
* 有两种实现方式：
  * 第一种继承被适配者类，适配方法使用接口实现
  * 第二种继承适配类，被适配者作为成员变量进行组合
  
#### 3. [Template Method](./src/templateMethod) 模板方法模式
* 在父类中定义执行流程以及流程中所需要的抽象方法
* 在子类中实现父类定义的抽象方法
* 所有子类都统一以父类的执行流程函数为模板执行

#### 4. [Factory Method](./src/factoryMethod) 工厂方法模式
* 工厂方法模式可以视为模板方法模式的一种具体应用
* 在抽象工厂中定义产品生产所需要的抽象方法，以及具体的生产流程
* 在具体工厂中实现生产方法，以抽象工厂中的生产流程为模板执行获取产品

#### 5. [Singleton](./src/singleton) 单例模式
* 单例模式保证了全局只有一个对象实例
* 单例模式有多种实现方式
  * 饿汉式（静态变量、静态代码块、枚举类）
  * 懒汉式（线程不安全按、线程安全、双重校验锁、静态内部类）
* 饿汉推荐使用枚举类实现，简单安全

#### 6. [Prototype](./src/prototype) 原型模式
* 原型模式的本质就是通过克隆对象来生成对象
* 可以避免直接 new 具体类名 产生的耦合，便于代码复用
* 在 Spring 中配置 bean 时可以指定 singleton 模式和 prototype 模式来生成对象

#### 7. [Builder](./src/builder) 建造模式
* 监工负责制造流程
* 具体建造者负责具体方法的实现

#### 8. [Bridge](./src/bridge) 桥接模式
* 桥接模式使用委托的方式将类的功能层次和类的实现层次分开了
* 通过使用委托来替代继承减少类之间的关联关系
* 注：组合和委托的区别
  * 组合是对对象功能的静态复用，将具体对象作为成员变量
  * 委托是对对象功能的动态复用，将对象接口作为成员变量，在运行时确定具体的实现

#### 9. [Strategy](./src/strategy) 策略模式
* 通过委托的方式将策略算法与算法调用分离开来
* 委托这种弱关联关系可以很方便的替换整体算法

#### 10. [Composite](./src/composite) 组合模式
* 一种可以实现文件系统递归结构的模式
* 保存该类接口的成员变量循环调用

#### 11. [Decorator](./src/decorator) 装饰器模式
* 通过委托将装饰功能转交给其它类处理
* 不需要修改被装饰的类，可以像递归一样进行多次装饰
* java 中的 IO 包中的类使用了装饰器模式

#### 12. [Visitor](./src/visitor) 访问者模式
* 依旧是使用委托将数据访问与数据存储的功能分离开来
* 将访问处理数据的功能委托给了访问器类进行处理
* 数据类需要提供访问数据的方式如迭代器给访问器类获取

#### 13. [ChainOfResponsibility](./src/chainOfResponsibility) 责任链模式
* 通过委托将无法处理的任务委托给下一个对象处理
* 被委托的对象和当前对象继承了相同的父类
* 父类中实现了解决问题的模板，即实现了模板方法模式



