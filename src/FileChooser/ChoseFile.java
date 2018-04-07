package FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

public class ChoseFile extends Component implements ActionListener{
    private JButton button_1 ;
    private JButton button_2;
    private JButton button_3;
    ChoseFile(){
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button_1= new JButton("File Selected 1");
        button_2= new JButton("File Selected 2");
        button_3= new JButton("Compare");
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        frame.add(button_1);
        frame.add(button_2);
        frame.add(button_3);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser fc_1=new JFileChooser();
        JFileChooser fc_2=new JFileChooser();

        if (actionEvent.getSource()==button_1){
            fc_1.showOpenDialog(this);
        }
        if (actionEvent.getSource()==button_2){
            fc_2.showOpenDialog(this);
        }
        if (actionEvent.getSource()==button_3){
            if (fc_1.getSelectedFile() != null & fc_2.getSelectedFile() != null){
                boolean isSame = true;
                try {
                    FileInputStream fin_1 = new FileInputStream(fc_1.getSelectedFile());
                    FileInputStream fin_2 = new FileInputStream(fc_2.getSelectedFile());

                    do {
                        if (fin_1.read()!=fin_2.read()) {
                            isSame = false;
                            break;
                        }
                    } while (fin_1.read() != -1 & fin_2.read() != -1);

                    if( isSame )
                        JOptionPane.showMessageDialog(null, "Files are same");
                    else
                        JOptionPane.showMessageDialog(null, "Files are NOT same");

                }catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Please Select File !!");
            }
        }
    }
}
