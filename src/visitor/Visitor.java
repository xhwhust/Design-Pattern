package visitor;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:53
 */
public abstract class Visitor {
    public abstract void visit(File file) ;
    public abstract void visit(Directory directory) ;
}
