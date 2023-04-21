package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/21 17:33
 */
// Composite 角色，表示文件夹
public class Directory extends Entry {
    //文件夹名
    private String name;
    //文件、文件夹列表
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
