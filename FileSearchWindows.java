import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;

public class FileSearchWindows extends JFrame
{
    private JButton button1 = new JButton("Szukaj");
    private ResultToolbar result;
    private TextAreaPanel textAreaPanel;
    public FileSearchWindows()
    {
        setLayout(new BorderLayout());
        result=new ResultToolbar();
        textAreaPanel=new TextAreaPanel();
        add(result,BorderLayout.NORTH);
        add(textAreaPanel,BorderLayout.CENTER);
        add(button1,BorderLayout.SOUTH);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e )
            {
               textAreaPanel.textArea.setText("");
               String name1=result.labelSearchName.getText();
               String dir=result.labelSetDir.getText();
               File file=new File(dir);
               FilenameFilter filter=new FilenameFilter()
               {
                    @Override
                    public boolean accept( File dir, String name )
                    {
                        return name.startsWith(name1);
                    }
               };
                String[]children = file.list(filter);
                if(children==null)
                {
                   textAreaPanel.getText("Plik nie istnieje lub b³êdny katalog");
                }
                else
                {
                    for(int i=0;i<children.length;i++)
                    {
                        String filename=children[i];
                        textAreaPanel.getText(filename);//append nie kasuje poprzednich wartoœci
                    }
                }

            }
        });

    }


}
