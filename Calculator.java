package calculator;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
    Frame f;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,percent,point,equal,plus,minus,multiply,divide,backspace,clear;
   static TextField tf,tf2,tf3;
   Label l1;
   Dialog d1;
           

    double result=0;
    stack getresult=new stack();
    Calculator()
    {
         f=new Frame("Personal calculator");
         d1=new Dialog(f,"Invalid Input",true);
         tf=new TextField("0");
         tf.setBounds(10,50,80,20);
         tf2=new TextField("0");
         tf2.setBounds(10,90,80,20);
         tf3=new TextField("0");
         tf3.setBounds(100,63,100,30);
         l1=new Label(" ");
         l1.setBounds(40,75,15,10);
         b7=new Button("7");
         b7.setBounds(10,200,50,50);
         b8=new Button("8");
         b8.setBounds(60,200,50,50);
         b9=new Button("9");
         b9.setBounds(110,200,50,50);
         b4=new Button("4");
         b4.setBounds(10,250,50,50);
         b5=new Button("5");
         b5.setBounds(60,250,50,50);
         b6=new Button("6");
         b6.setBounds(110,250,50,50);
         b1=new Button("1");
         b1.setBounds(10,300,50,50);
         b2=new Button("2");
         b2.setBounds(60,300,50,50);
         b3=new Button("3");
         b3.setBounds(110,300,50,50);
         b0=new Button("0");
         b0.setBounds(60,350,50,50);
         percent=new Button("%");
         percent.setBounds(10,350,50,50);
         point=new Button(".");
         point.setBounds(110,350,50,50);
         equal=new Button("=");
         equal.setBounds(160,300,50,100);
         plus=new Button("+");
         plus.setBounds(160,250,50,50);
         minus=new Button("-");
         minus.setBounds(160,200,50,50);
         multiply=new Button("x");
         multiply.setBounds(160,150,50,50);
         divide=new Button("/");
         divide.setBounds(110,150,50,50);
         backspace=new Button("<x|");
         backspace.setBounds(60,150,50,50);
         clear=new Button("AC");
         clear.setBounds(10,150,50,50);
         f.add(tf);
         f.add(tf2);
         f.add(tf3);
         f.add(l1);
         f.add(point);
         f.add(equal);
         f.add(plus);
         f.add(minus);
         f.add(multiply);
         f.add(divide);
         f.add(backspace);
         f.add(clear);
         f.add(percent);
         f.add(b0);
         f.add(b1);
         f.add(b2);
         f.add(b3);
         f.add(b4);
         f.add(b5);
         f.add(b6);
         f.add(b7);
         f.add(b8);
         f.add(b9);
         f.setSize(210,400);
         f.setLayout(null);
         f.setVisible(true);
         f.setResizable(false);
         b0.addActionListener(this);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         percent.addActionListener(this);
         point.addActionListener(this);
         plus.addActionListener(this);
         equal.addActionListener(this);
         minus.addActionListener(this);
         multiply.addActionListener(this);
         divide.addActionListener(this);
         clear.addActionListener(this);
         backspace.addActionListener(this);
    }
    public static void main(String[] args) {
       new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
           String s1;
           Double op1=new Double("0"),op2 = new Double("0"),op3= new Double("0");
      if(l1.getText().equals("+")||l1.getText().equals("*")||l1.getText().equals("-")||l1.getText().equals("/"))
       s1=tf2.getText();
        else
       s1=tf.getText();
       
       if(e.getSource()==b0)
       {
           s1=s1+"0";
       }
       else if(e.getSource()==b1)
       {
           s1=s1+"1";
       }
       else if(e.getSource()==b2)
       {
           s1=s1+"2";
       }
       else if(e.getSource()==b3)
       {
           s1=s1+"3";
       }
        else if(e.getSource()==b4)
       {
           s1=s1+"4";
       }
        else if(e.getSource()==b5)
       {
           s1=s1+"5";
       }
        else if(e.getSource()==b6)
       {
           s1=s1+"6";
       }
        else if(e.getSource()==b7)
       {
           s1=s1+"7";
       }
        else if(e.getSource()==b8)
       {
           s1=s1+"8";
       }
        else if(e.getSource()==b9)
       {
           s1=s1+"9";
       }
        else  if(e.getSource()==percent)
       {
           Double i=Double.parseDouble(s1);
           i=i/100;
           s1=Double.toString(i);
       }
        else if(e.getSource()==point)
        {
            s1=s1+".";
        }
       else if(e.getSource()==plus)
        {           
            printresult(); 
            l1.setText("+");          
            s1="0";     
        }
       else if(e.getSource()==minus)
        {             
            printresult();  
            l1.setText("-");
             s1="0";             
        }
       else if(e.getSource()==multiply)
        {       
             printresult();
            l1.setText("*");
             s1="0";        
        }
       else if(e.getSource()==divide)
       {         
            printresult();
            l1.setText("/");           
            s1="0";    
        }
       else if(e.getSource()==equal)
       {
          printresult();
          tf.setText(tf3.getText());
          s1="0";         
       }
       else if(e.getSource()==clear)
       {
           getresult.clearstack();
           l1.setText("");
           tf.setText("0");
           tf2.setText("0");
           tf3.setText("0");
           s1="0";
       }
       else if(e.getSource()==backspace)
       {
           getresult.push(s1);
           getresult.pop();
           s1="0";
           
       }
      if(l1.getText().equals("+")||l1.getText().equals("*")||l1.getText().equals("-")||l1.getText().equals("/"))
           tf2.setText(s1);
       else
           tf.setText(s1);         
    }    
    
    void printresult(){
           getresult.push(tf.getText());
           getresult.push(l1.getText());
           if(l1.getText().equals("*")&&tf2.getText().equals("0"))
           {
               getresult.push("1");
           }
           else
           getresult.push(tf2.getText());
           tf3.setText(getresult.calculation());
           getresult.clearstack();
           tf.setText(tf3.getText());
           
    }
}

