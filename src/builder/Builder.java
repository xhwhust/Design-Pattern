package builder;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 16:46
 */
public abstract class Builder {

    abstract void makeTitle(String title);

    abstract void makeString(String str);

    abstract void makeItems(String[] items);

    abstract void close();

}
