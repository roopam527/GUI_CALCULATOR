
package calculator;
import java.awt.*;  
import java.awt.event.*;  
public class invalidInput implements ActionListener {  
    private static Dialog d;
  
    invalidInput() {  
        Frame f1= new Frame();  
        d = new Dialog(f1 , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );
       
        Button b = new Button ("OK");  
        b.addActionListener (this);  
        Label l1=new Label ("INVALID INPUT");
        d.add(l1);  
        d.add(b);   
        d.setSize(200,100);    
        d.setVisible(true);  
        
    }  
    public void actionPerformed( ActionEvent e )  
            {  
               invalidInput.d.setVisible(false);  
            } 
}
