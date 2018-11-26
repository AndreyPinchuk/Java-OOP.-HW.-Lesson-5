package homeworkLesson5Tasck2;

public class File extends NamedFSItems {
    private final int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "\n      File{" + super.toString() +
                "size=" + size +
                " Kb}";
    }
}
