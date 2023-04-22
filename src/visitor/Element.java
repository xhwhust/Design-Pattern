package visitor;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:43
 */
public interface Element {
    public abstract void accept(Visitor visitor) ;
}
