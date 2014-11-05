package view;
import java.awt.*;  
import javax.swing.*;  
   
public class ListTest  
{  
    public static void main(String[] args)  
    {  
        String[] options = { "VERTICAL", "HORIZONTAL_WRAP", "VERTICAL_WRAP" };  
        JList list = new JList(options);  
        list.setVisibleRowCount(1);  
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);  
        JFrame f = new JFrame();  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.getContentPane().add(new JScrollPane(list));  
        f.setSize(400,100);  
        f.setLocation(200,200);  
        f.setVisible(true);  
    }  
} 