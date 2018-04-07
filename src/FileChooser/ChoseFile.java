package FileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChoseFile extends Component implements ActionListener{
    //Select two txt file to compare them
    private JFileChooser fc_1=new JFileChooser();
    private JFileChooser fc_2=new JFileChooser();

    private FileInputStream fin_1;
    private FileInputStream fin_2;

    private boolean select1=false;
    private boolean select2=false;
    private boolean isSame = true;

    private JButton button_1 ;
    private JButton button_2;
    private JButton button_3;

    ChoseFile(){
        JFrame frame = new JFrame("File Compare");
        frame.setLayout(new FlowLayout());
        frame.setSize(300,200);
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

        if (actionEvent.getSource()==button_1){
            int i=fc_1.showOpenDialog(this);
            if (i==JFileChooser.APPROVE_OPTION){
                try {
                    fin_1 = new FileInputStream(fc_1.getSelectedFile());
                    select1=true;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        if (actionEvent.getSource()==button_2){
            int i=fc_2.showOpenDialog(this);
            if (i==JFileChooser.APPROVE_OPTION){
                try {
                    fin_2 = new FileInputStream(fc_2.getSelectedFile());
                    select2=true;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        if (actionEvent.getSource()==button_3){
            if (select1 & select2){
                try {
                    do {
                        if (fin_1.read()!=fin_2.read()) {
                            isSame = false;
                            break;
                        }
                    } while (fin_1.read() != -1 & fin_2.read() != -1);

                    if( isSame )
                        JOptionPane.showMessageDialog(null, "Files are Same");
                    else
                        JOptionPane.showMessageDialog(null, "Files are NOT Same");

                }catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Please Select File !!");
            }
        }
    }
}
