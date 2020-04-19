import javax.swing.*;

public class FileSearchWindowsMain
{
    public static void main(String []args)
    {
        FileSearchWindows fsw=new FileSearchWindows();
        fsw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fsw.setTitle("Search");
        fsw.setSize(400,300);
        fsw.setVisible(true);

    }
}
