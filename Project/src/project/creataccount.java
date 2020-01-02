/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.Connection;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Random;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
/**
 *
 * @author userJT
 */
public class creataccount extends JFrame implements ActionListener{
    
    JFrame a;
    JPanel p1,p11,p2,p3,p4,s1,s2;
    JLabel l1,l2,l3,l4,in;
    JRadioButton e,p,ep;
    ButtonGroup bg;
    JTextField t1;
    JPasswordField t2,t3;
    JButton b1,b2;
    
    public creataccount(){
        ImageIcon m;
        m=new ImageIcon("C:\\Users\\jhon\\Documents\\NetBeansProjects\\img\\Folders-OS-User-No-Frame-Metro-icon.png");
        a=new JFrame("New Account");
        a.setLayout(null);
        p1=(JPanel)a.getContentPane();
        p11=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        s1=new JPanel();
        s2=new JPanel();
        l1=new JLabel("IDentification:  ");
        l1.setFont(new Font("MS UI Gothic", Font.BOLD, 16));
        l2=new JLabel("New Password:  ");
        l2.setFont(new Font("MS UI Gothic", Font.BOLD, 16));
        l3=new JLabel("Confirme Password");
        l3.setFont(new Font("MS UI Gothic", Font.BOLD, 16));
        in=new JLabel("                           Sign Up");
        in.setFont(new Font("Candara", Font.PLAIN, 24));
        l4=new JLabel();
        l4.setIcon(m);
        bg= new ButtonGroup();
        e= new JRadioButton("Etudiant");
        ep= new JRadioButton("Employer");
        p= new JRadioButton("Profe");
        bg.add(e);
        bg.add(ep);
        bg.add(p);
        e.setFont(new Font("MS UI Gothic", Font.BOLD, 16));
        ep.setFont(new Font("MS UI Gothic", Font.BOLD, 16));
        p.setFont(new Font("MS UI Gothic", Font.BOLD, 16));
        t1 = new JTextField(12) {
  @Override protected void paintComponent(Graphics g) {
    if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
      Graphics2D g2 = (Graphics2D) g.create();
      g2.setPaint(getBackground());
      g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
          0, 0, getWidth() - 1, getHeight() - 1));
      g2.dispose();
    }
    super.paintComponent(g);
  }
  @Override public void updateUI() {
    super.updateUI();
    setOpaque(false);
    setBorder(new RoundedCornerBorder());
  }
};
        t2= new JPasswordField(12) {
  @Override protected void paintComponent(Graphics g) {
    if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
      Graphics2D g2 = (Graphics2D) g.create();
      g2.setPaint(getBackground());
      g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
          0, 0, getWidth() - 1, getHeight() - 1));
      g2.dispose();
    }
    super.paintComponent(g);
  }
  @Override public void updateUI() {
    super.updateUI();
    setOpaque(false);
    setBorder(new RoundedCornerBorder());
  }
};
        t3= new JPasswordField(10) {
  @Override protected void paintComponent(Graphics g) {
    if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
      Graphics2D g2 = (Graphics2D) g.create();
      g2.setPaint(getBackground());
      g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
          0, 0, getWidth() - 1, getHeight() - 1));
      g2.dispose();
    }
    super.paintComponent(g);
  }
  @Override public void updateUI() {
    super.updateUI();
    setOpaque(false);
    setBorder(new RoundedCornerBorder());
  }
};
        b1=new JButton("Create");  
        b1.setFont(new Font("MS UI Gothic", Font.CENTER_BASELINE, 16));
        b1.setBackground(new Color(223, 234, 234));
        b1.addActionListener(this);
        b2=new JButton("Retour");  
        b2.setFont(new Font("MS UI Gothic", Font.CENTER_BASELINE, 16));
        b2.setBackground(new Color(223, 234, 234));
        b2.addActionListener(this);
        
        p1.setLayout(new GridLayout(1,2));
        p11.setLayout(new GridLayout(6,1));
        p2.setLayout(new FlowLayout());
        p3.setLayout(new FlowLayout());
        p4.setLayout(new FlowLayout());
        
        p11.setBackground(new  Color(223, 234, 234));
        p1.setBackground(new  Color(59, 128, 255));
        p2.setBackground(new  Color(223, 234, 234));
        s1.setBackground(new  Color(223, 234, 234));
        p3.setBackground(new  Color(223, 234, 234));
        p4.setBackground(new  Color(223, 234, 234));
        s2.setBackground(new  Color(223, 234, 234));
        e.setBackground(new  Color(223, 234, 234));
        ep.setBackground(new  Color(223, 234, 234));
        p.setBackground(new  Color(223, 234, 234));
        
        p2.add(l1);
        p2.add(t1);
        s1.add(e);
        s1.add(ep);
        s1.add(p);
        p3.add(l2);
        p3.add(t2);
        p4.add(l3);
        p4.add(t3);
        s2.add(b1);
        s2.add(b2);
        
        p1.add(l4);
        p1.add(p11);
        p11.add(in);
        p11.add(p2);
        p11.add(s1);
        p11.add(p3);
        p11.add(p4);
        p11.add(s2);
        
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	a.setVisible(true);
        int frameWidth = 350;
        int frameHeight = 90;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        a.setBounds((int) screenSize.getWidth()/2 -frameWidth, (int) screenSize.getHeight()/2 -frameHeight*3, frameWidth, frameHeight);
        a.setResizable(false);
        a.setSize(650,480);
        pack();
    }
    public int IDgenerat(){
        String p=positionSelected(bg);
        int r = 0;
    if(p.equals("Etudiant"))
        r = new Random().nextInt(10001 -800)+800;
    if(p.equals("Employer"))
        r = new Random().nextInt(301 -10)+10;
    if(p.equals("Profe"))
        r = new Random().nextInt(801 -300)+300;
    int s=(r);
    while(CheckId(s,tabtouse())==1){
        r = IDgenerat();
        s=(r);
    }
    return s;
    }
    
    public void actionPerformed(ActionEvent e){
        if((JButton)e.getSource()==b1){
            if(!(t1.getText().trim().isEmpty()||t2.getPassword().length==0||t3.getPassword().length==0||bg.getSelection()==null)){
               if(t2.getText().equals(t3.getText())){
                    if(Checkusers(t1.getText(),tabtouse())==0){
                        Object s=IDgenerat();
                        JOptionPane.showMessageDialog(this,"               "+s,"Your ID",JOptionPane.INFORMATION_MESSAGE);
                        Project p=new Project();
                        a.setVisible(false);
                        UpdateTable((int) s,t2.getText(),t1.getText(),tabtouse());
                   }
                   else
                        JOptionPane.showMessageDialog(this,"User already existe","WARNING",JOptionPane.INFORMATION_MESSAGE);
                   }
               else 
                    JOptionPane.showMessageDialog(this,"Password not the same","WARNING",JOptionPane.INFORMATION_MESSAGE);
            }   
        if(t1.getText().trim().isEmpty()&&t2.getPassword().length==0&&t3.getPassword().length==0){
               JOptionPane.showMessageDialog(this,"WRITE SOMTHING !","WARNING",JOptionPane.INFORMATION_MESSAGE);
           }
        else{
             if(bg.getSelection()==null||t2.getPassword().length==0||t3.getPassword().length==0||t1.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(this,"FILL THE FORM PROPERLY","WARNING",JOptionPane.INFORMATION_MESSAGE);}
             else{
                    if(bg.getSelection()==null){
                    JOptionPane.showMessageDialog(this,"CHEK YOUR POSITION","WARNING",JOptionPane.INFORMATION_MESSAGE);}
                    else{
                            if(bg.getSelection()==null&&t2.getPassword().length==0 && t3.getPassword().length==0){
                    JOptionPane.showMessageDialog(this,"FILL THE FORM PROPERLY","WARNING",JOptionPane.INFORMATION_MESSAGE);}
                else{

                    if(t2.getPassword().length==0&&t3.getPassword().length==0){
                            JOptionPane.showMessageDialog(this,"PASSWORD IS EMPTY","WARNING",JOptionPane.INFORMATION_MESSAGE);}
                            else {
                                if(t3.getPassword().length==0){
                                    JOptionPane.showMessageDialog(this,"REWRITE PASSWORD","WARNING",JOptionPane.INFORMATION_MESSAGE);
                                    }
                    }
                }   
            }	

                    }

            }
        }
        if((JButton)e.getSource()==b2){
            Project p=new Project();
            a.setVisible(false);
        }
}      
    
class RoundedCornerBorder extends AbstractBorder {
   Color ALPHA_ZERO = new Color(0x0, true);
  @Override public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Shape border = getBorderShape(x, y, width - 1, height - 1);
    g2.setPaint(ALPHA_ZERO);
    Area corner = new Area(new Rectangle2D.Double(x, y, width, height));
    corner.subtract(new Area(border));
    g2.fill(corner);
    g2.setPaint(Color.GRAY);
    g2.draw(border);
    g2.dispose();
  }
  public Shape getBorderShape(int x, int y, int w, int h) {
    int r = h; //h / 2;
    return new RoundRectangle2D.Double(x, y, w, h, r, r);
  }
  @Override public Insets getBorderInsets(Component c) {
    return new Insets(4, 8, 4, 8);
  }
  @Override public Insets getBorderInsets(Component c, Insets insets) {
    insets.set(4, 8, 4, 8);
    return insets;
  }
}

public String positionSelected(ButtonGroup btn){
    
    Enumeration<AbstractButton> allRadioButton=btn.getElements();  
        while(allRadioButton.hasMoreElements())  
        {  
           JRadioButton temp=(JRadioButton)allRadioButton.nextElement();  
           if(temp.isSelected())  
           {  
            return temp.getText();  
           }  
        }   
    
    return "wrong";
}
public String tabtouse(){
    String p=positionSelected(bg);
    if(p.equals("Etudiant"))
        return "student";
    if(p.equals("Employer"))
        return "emploiyer";
    if(p.equals("Profe"))
        return "profs";
    
    return "wrongg";
}
public int Checkusers(String id,String position){
        
        Connection con=null;
        java.sql.PreparedStatement sin = null;
        ResultSet r;
        try{     
        Class.forName("com.mysql.jdbc.Driver"); 
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
        String sql="select * from "+position+" where Identifiant='"+id+"'";
        sin=(PreparedStatement)con.prepareStatement(sql);
        r= sin.executeQuery();
        
        if(r.next())
            return 1;
        else
            return 0;
        }
        catch(Exception n){
            System.out.println(n);}
        return 0;
}
public int CheckId(int id,String position){
    Connection con=null;
        java.sql.PreparedStatement sin = null;
        ResultSet r;
        try{     
        Class.forName("com.mysql.jdbc.Driver"); 
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
        String sql="select * from "+position+" where Id='"+id+"'";
        sin=(PreparedStatement)con.prepareStatement(sql);
        r= sin.executeQuery();
        
        if(r.next())
            return 1;
        else
            return 0;
        }
        catch(Exception n){
            System.out.println(n);}
        return 0;
} 
public void UpdateTable(int id,String pass,String identif,String position){
        Connection con=null;
        java.sql.PreparedStatement s;
        ResultSet r=null;
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            String requete = "insert into "+position+" values ("+id+",'"+pass+"','"+identif+"','"+position+"')";
            s=(java.sql.PreparedStatement)con.prepareStatement(requete);
            int nb = s.executeUpdate(requete);
        if(nb==0)
            System.out.println("Echec d'ajout");
        else
            System.out.println("ajout reussi");
            con.close();
 
        }
        catch(Exception e){
            System.out.println(e);}    
        
}
    
    public static void main(String[] args){
        creataccount a = new creataccount();
    }
    
}

    

