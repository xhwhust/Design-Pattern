package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/19 19:36
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }

}
