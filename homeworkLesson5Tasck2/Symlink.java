package homeworkLesson5Tasck2;

public class Symlink implements FSItem {
    private final String symlinkName;
    private FSItem item;

    public Symlink(String symlinkName, FSItem item) {
        this.symlinkName = symlinkName;
        this.item = item;
    }

    @Override
    public String getName() {
        String s = item.getName();
        int a = s.indexOf('.');
        return s.replace(s.substring(a), ".lnk");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "\n      File{" + getName() +
                " size=" + getSize() + " Kb}";
    }
}
