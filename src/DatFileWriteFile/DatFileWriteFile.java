package DatFileWriteFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DatFileWriteFile implements ActionListener{
    private JTextField name=new JTextField(10);
    private JTextField number=new JTextField(10);
    private JTextField cgpa=new JTextField(10);
    private JButton button=new JButton("Save");
    DatFileWriteFile(){
        JFrame frame = new JFrame("File");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new JLabel("Name: "));
        frame.add(name);
        frame.add(new JLabel("Number: "));
        frame.add(number);
        frame.add(new JLabel("CGPA: "));
        frame.add(cgpa);
        frame.add(button);
        button.addActionListener(this);
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==button){
            saveAllData(name.getText(),Integer.parseInt(number.getText()),Double.parseDouble(cgpa.getText()));
        }

    }

    private void saveAllData(String name, int number, double cgpa) {
        try {
            FileOutputStream fout=new FileOutputStream("file.dat");
            DataOutputStream out = new DataOutputStream(fout);
            out.writeUTF(name);
            out.writeInt(number);
            out.writeDouble(cgpa);
            out.close();
            out.flush();
            System.out.println("Saved All Data");
        }catch(Exception e){
            System.out.println(e);
        }
        /*
        try {
            FileInputStream fout=new FileInputStream("file.dat");
            DataInputStream out = new DataInputStream(fout);
            String a = out.readUTF();
            int b = out.readInt();
            double c = out.readDouble();
            out.close();
            System.out.println("Values: " + a + " " + b + " " + c+" ");
        }catch(Exception e){
            System.out.println(e);
        }*/
    }

}
