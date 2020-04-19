import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends JPanel
{
    public JTextArea textArea=new JTextArea();
    public TextAreaPanel()
    {
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea),BorderLayout.CENTER);
        /*textArea.setColumns(50);*/

    }
    public void getText(String text)
    {
        textArea.append(text+"\n");
    }
}
