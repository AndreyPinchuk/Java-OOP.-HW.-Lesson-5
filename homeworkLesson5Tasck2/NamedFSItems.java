package homeworkLesson5Tasck2;

public class NamedFSItems implements FSItem {
    private String name;

    public NamedFSItems(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String toString() {
        return name + "  ";
    }
}
