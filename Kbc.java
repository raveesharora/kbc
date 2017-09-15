import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Kbc extends Applet implements ActionListener{
 Label l1,l2,l3;
 Panel p1,p2,p3,p4;
 CheckboxGroup c1,c2,c3;
 Checkbox  ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12;
 Button b1,b2,b3,b4;
 
 
 public void init()
 {
  setLayout(null);
  setSize(750,450);
  p1=new Panel();
  p1.setBounds(0,0,750,450);
  add(p1);
  c1=new CheckboxGroup();
  c2=new CheckboxGroup();
  c3=new CheckboxGroup();
  b1= new Button("lock the answer");
  l1 = new Label();
  l1.setText("Q1: what is the capital of india?");
  p1.add(l1);
  ch1= new Checkbox("delhi",c1,false);
  ch2= new Checkbox("chandigarh", c1,false);
  ch3= new Checkbox("manipur", c1,false);
  ch4= new Checkbox("mumbai", c1,false);
  p1.add(ch1);
  p1.add(ch2);
  p1.add(ch3);
  p1.add(ch4);
  p1.add(b1);
  b1.addActionListener(this);
  p2=new Panel();
  p2.setBounds(0,0,750,450);
  add(p2);
  b2= new Button("lock the answer");
  l2 = new Label();
  l2.setText("Q2: who is the founder of facebook");
  p2.add(l2);
  ch5= new Checkbox("mark zukerberg",c2,false);
  ch6= new Checkbox("james wat", c2,false);
  ch7= new Checkbox("sherlock", c2,false);
  ch8= new Checkbox("orkut", c2,false);
  p2.add(ch5);
  p2.add(ch6);
  p2.add(ch7);
  p2.add(ch8);
  p2.add(b2);
  b2.addActionListener(this);
  p3=new Panel();
  p3.setBounds(0,0,750,450);
  add(p3);
  b3= new Button("lock the answer");
  l3 = new Label();
  l3.setText("Q2: what is the capital of punjab?");
  p3.add(l3);
  ch9= new Checkbox("iraq",c3,false);
  ch10= new Checkbox("chandigarh", c3,false);
  ch11= new Checkbox("crap", c3,false);
  ch12= new Checkbox("mumbai", c3,false);
  p3.add(ch9);
  p3.add(ch10);
  p3.add(ch11);
  p3.add(ch12);
  p3.add(b3);
  b3.addActionListener(this);
  
  p1.setBackground(Color.blue);
  p2.setBackground(Color.cyan);
  p3.setBackground(Color.pink);
  
  
  p4=new Panel();
  p4.setBounds(0,0,750,450);
  add(p4);
  p4.setBackground(Color.gray);
  b4=new Button("done");
  p4.add(b4);
  b4.addActionListener(this);
  p1.setVisible(true);
  p2.setVisible(false);
  p3.setVisible(false);
  p4.setVisible(false);
 }
 public void actionPerformed(ActionEvent e) {
  String a=" ", b=" ";
  
  if(e.getSource()==b1)
  {
   if(ch1.getState()==true)
    a="right"; 
   else if(ch2.getState()==true)
    b="wrong";
   else if(ch3.getState()==true)
    b="wrong";
   else if(ch4.getState()==true)
    b="wrong";
     
  JOptionPane.showMessageDialog(this, "u have selected "+a+b);
  p1.setVisible(false);
  p2.setVisible(true);
  p3.setVisible(false);
  p4.setVisible(false);
 }
  if(e.getSource()==b2)
  {
   if(ch5.getState()==true)
    a="right";
   else if(ch6.getState()==true)
     b="wrong";
   else if(ch7.getState()==true)
      b="wrong";
   else if(ch8.getState()==true)
        b="wrong";
  JOptionPane.showMessageDialog(this, "u have selected "+a+b);
  p1.setVisible(false);
  p2.setVisible(false);
  p3.setVisible(true);
  p4.setVisible(false);
 }
  if(e.getSource()==b3)
  {
   if(ch9.getState()==true)
    b="wrong";
   else if(ch10.getState()==true)
     a="right";
   else if(ch11.getState()==true)
      b="wrong";
   else if(ch12.getState()==true)
        b="wrong";
  JOptionPane.showMessageDialog(this,"u have selected "+a+b);
  p1.setVisible(false);
  p2.setVisible(false);
  p3.setVisible(false);
  p4.setVisible(true);
}
  if(e.getSource()==b4)
   System.exit(0);
  }}   
