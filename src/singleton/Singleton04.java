package singleton;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:52
 * 双重校验锁
 */
public class Singleton04 {

    private static volatile Singleton04 instance ;

    public static Singleton04 getInstance(){
        if(instance == null){
            synchronized (Singleton04.class){
                if(instance == null){
                    instance = new Singleton04() ;
                }
            }
        }
        return instance ;
    }

}
