import javax.swing.*;
import java.awt.*;

public class ResultToolbar extends JPanel
{

    JTextField labelSearchName = new JTextField(20);
    JTextField labelSetDir = new JTextField(20);
    JLabel what=new JLabel("Nazwa pliku (lub fragment):");
    JLabel where=new JLabel("Nazwa katalogu:");
    public ResultToolbar()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=1;
        add(what,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=1;
        add(labelSearchName,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=2;
        add(where,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=2;
        add(labelSetDir,gbc);
      /*  gbc.fill=GridBagConstraints.NORTHEAST;
        gbc.gridx=1;
        gbc.gridy=3;*/

        /* textArea.setPreferredSize(new Dimension(200,150));*/
    }


}


