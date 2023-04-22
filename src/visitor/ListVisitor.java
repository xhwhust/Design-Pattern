package visitor;

import java.util.Iterator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:56
 */
public class ListVisitor extends Visitor {
    private String currentDir = "" ;

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file.getName());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory.getName());
        String saveDir = currentDir ;
        currentDir = currentDir + "/" + directory.getName() ;
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()){
            Entry next = it.next() ;
            next.accept(this) ;
        }
        currentDir = saveDir ;
    }
}
