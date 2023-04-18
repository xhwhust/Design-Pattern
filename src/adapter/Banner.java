package adapter;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/18 20:53
 */
public class Banner {
    private String string ;

    public Banner(String string){
        this.string = string ;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
