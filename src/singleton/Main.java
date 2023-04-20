package singleton;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:26
 */
public class Main {

    // 通过在一个普通类中加入枚举类，并且将普通类构造函数设置为 private
    // 也可以让这个普通类实现单例模式
    private enum MainHolder{
        INSTANCE;
        private Main instance ;
        // 枚举类型的构造函数是私有的
        MainHolder(){
            instance = new Main() ;
        }
        public static Main getInstance(){
            return INSTANCE.instance;
        }
    }

    public static Main getInstance(){
        return MainHolder.getInstance() ;
    }

    private Main(){

    }

    public static void main(String[] args) {
        Singleton05 obj1 = Singleton05.getInstance();
        Singleton05 obj2 = Singleton05.getInstance();
        System.out.println(obj1 == obj2);

        Singleton06 s1 = Singleton06.INSTANCE ;
        Singleton06 s2 = Singleton06.INSTANCE ;
        System.out.println(s1 == s2);
        s1.method();
        s2.method();

        Main m1 = getInstance();
        Main m2 = getInstance();

        System.out.println(m1 == m2);
    }

}
