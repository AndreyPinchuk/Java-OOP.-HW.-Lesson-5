package homeworkLesson5Tasck2;

import java.util.ArrayList;
import java.util.List;

public class Directory extends NamedFSItems {
    private List<FSItem> fsItems = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem fsItem) {
//        try {
        fsItems.add(fsItem);
/*        } catch(IllegalArgumentException e){
            System.out.println("This bad");
        }*/
        return this;
    }

    public int getSize() {
        int size = 0;
        for (FSItem fsItem : fsItems) {
            size += fsItem.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "\nDirectory " + super.toString() + fsItems;
    }
}
