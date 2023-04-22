package visitor;

import java.util.Iterator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:42
 */
public abstract class Entry implements Element{

    public abstract String getName() ;
    public abstract int getSize() ;

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException() ;
    }

    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException() ;
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")" ;
    }
}
