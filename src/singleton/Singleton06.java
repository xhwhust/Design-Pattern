package singleton;

// 枚举类型实现的单例模式
// 在静态代码块中创建枚举实例
// 枚举类型中的每个枚举实例只有一个对象，是线程安全的
// 可以避免被反序列化，因为默认实现了序列化，在序列化时只输出枚举对象名字
// 可以避免被反射攻击，因为构造函数是私有的
public enum Singleton06 {
    INSTANCE;
    public void method(){
        System.out.println("Hello");
    }
}
