package prototype;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:28
 */
public interface Product extends Cloneable {

    void use(String s);

    Product createClone();

}
