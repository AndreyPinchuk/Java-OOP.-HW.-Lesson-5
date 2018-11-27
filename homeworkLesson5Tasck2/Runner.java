package homeworkLesson5Tasck2;

public class Runner {
    public static void main(String[] args) {
        Directory doc = new Directory("Dco");
        doc.add(new File("ror.exe", 54))
                .add(new File("muzon.mp3", 3576))
                .add(new Directory("Nun"))
                .add(new File("video.avi", 35890));


        File fileXO = new File("XO.exe", 3502);
        Symlink symlink = new Symlink("Game.lnk", fileXO);
        doc.add(symlink);

        System.out.println(doc.toString());
        System.out.println("Total size=" + doc.getSize() + " Kb");
    }
}
/*
Directory Dco  [
      File{ror.exe  size=54 Kb}, 
      File{muzon.mp3  size=3576 Kb}, 
Directory Nun  [], 
      File{video.avi  size=35890 Kb}, 
      File{XO.lnk size=1 Kb}]
Total size=39521 Kb

Process finished with exit code 0
*/
