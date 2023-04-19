package factoryMethod;

import factoryMethod.framework.Product;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/19 19:34
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
