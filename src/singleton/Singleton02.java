package singleton;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:46
 * 静态代码块初始化
 */
public class Singleton02 {

    private static Singleton02 instance ;

    static {
        instance = new Singleton02() ;
    }

    public static Singleton02 getInstance(){
        return instance ;
    }

}
