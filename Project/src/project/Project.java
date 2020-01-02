
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import myproject.Profess;
import com.mysql.jdbc.Connection;
import myproject.Employer;
import myproject.Studen;
import myproject.Profess;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

public class Project extends JFrame implements ActionListener{
    JFrame f;
    JLabel i,s,g,in,h;
    JButton c,cr;
    JTextField d;
    JPasswordField  ps;
    JPanel p,p1,tp,tp1,tp2,tpp,tpp1;
    public Project() {
        ImageIcon m;
        m=new ImageIcon("C:\\Users\\jhon\\Documents\\NetBeansProjects\\img\\Folders-OS-User-No-Frame-Metro-icon.png");
        
        f=new JFrame("Identification");
        p=(JPanel)f.getContentPane();
        p.setLayout(new GridLayout(1,2));
        p1=new JPanel();
        tp=new JPanel();
        tp1=new JPanel();
        tp2=new JPanel();
        tpp=new JPanel();
        tpp1=new JPanel();
        p1.setLayout(new GridLayout(4,1));
        tp.setLayout(new GridLayout(2,1));
        tp1.setLayout(new GridLayout(2,1));
        tp2.setLayout(new FlowLayout());
        tpp.setLayout(new FlowLayout());
        
        i=new JLabel("                       Identifiant ");
        i.setFont(new Font("Candara", Font.PLAIN, 17));
        s=new JLabel("                       Password  ");        
        s.setFont(new Font("Candara", Font.PLAIN, 17));
        in=new JLabel("                           Sign in");
        in.setFont(new Font("Candara", Font.PLAIN, 24));
        
        d= new JTextField(12) {
  @Override protected void paintComponent(Graphics g) {
    if (!isOpaque() && getBorder() instanceof Project.RoundedCornerBorder) {
      Graphics2D g2 = (Graphics2D) g.create();
      g2.setPaint(getBackground());
      g2.fill(((Project.RoundedCornerBorder) getBorder()).getBorderShape(
          0, 0, getWidth() - 1, getHeight() - 1));
      g2.dispose();
    }
    super.paintComponent(g);
  }
  @Override public void updateUI() {
    super.updateUI();
    setOpaque(false);
    setBorder(new Project.RoundedCornerBorder());
  }
};
        ps= new JPasswordField(12) {
  @Override protected void paintComponent(Graphics g) {
    if (!isOpaque() && getBorder() instanceof Project.RoundedCornerBorder) {
      Graphics2D g2 = (Graphics2D) g.create();
      g2.setPaint(getBackground());
      g2.fill(((Project.RoundedCornerBorder) getBorder()).getBorderShape(
          0, 0, getWidth() - 1, getHeight() - 1));
      g2.dispose();
    }
    super.paintComponent(g);
  }
  @Override public void updateUI() {
    super.updateUI();
    setOpaque(false);
    setBorder(new Project.RoundedCornerBorder());
  }
};
        c=new JButton("CONNECT");
        cr=new JButton("CREAT ACCOUNT");
        c.setBackground(new Color(223, 234, 234));
        cr.setBackground(new Color(223, 234, 234));
        g=new JLabel();
        g.setIcon(m);
        c.addActionListener(this);
        cr.addActionListener(this);
        
        p.setBackground(new  Color(59, 128, 255));
        
        
        tp.add(i);
        tpp.add(d);
        tp.add(tpp);
        tp1.add(s);
        tpp1.add(ps);
        tp1.add(tpp1);
        tp2.add(c);
        tp2.add(cr);
        
        p.add(g);
        p.add(p1);
        p1.add(in);
        p1.add(tp);
        p1.add(tp1);
        p1.add(tp2);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
        f.setBounds(600,250,10,10); 
        f.setResizable(false);
        int frameWidth = 350;
        int frameHeight = 90;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        f.setBounds((int) screenSize.getWidth()/2 -frameWidth, (int) screenSize.getHeight()/2 -frameHeight*3, frameWidth, frameHeight);
        f.setPreferredSize( new Dimension(650,480));
        f.pack();
}
        public void actionPerformed(ActionEvent e) {
               if((JButton)e.getSource()==cr)
               {    creataccount a=new creataccount();
                    f.setVisible(false);
               }
               if((JButton)e.getSource()==c){
                   
               if(d.getText().trim().isEmpty()&&ps.getPassword().length==0){
                   JOptionPane.showMessageDialog(this,"WRITE SOMTING BLZ","WARNING",JOptionPane.INFORMATION_MESSAGE);
               }
               else{
                   if(d.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(this,"IDENTIFICATION IS EMPTY","WARNING",JOptionPane.INFORMATION_MESSAGE);}
                    if(ps.getPassword().length==0){
                        JOptionPane.showMessageDialog(this,"PASSWORD IS EMPTY","WARNING",JOptionPane.INFORMATION_MESSAGE);
                    }
               }
               
               if(!(d.getText().trim().isEmpty())&&ps.getPassword().length!=0){
                   
                   String id =d.getText();
                   String password =ps.getText();
                    if(Checkusers(id,password,Poste(Integer.parseInt(id)))==0)
                            {
                                JOptionPane.showMessageDialog(this,"Users do not existe","WARNING",JOptionPane.INFORMATION_MESSAGE);
                            } 
                    if(Checkusers(id,password,Poste(Integer.parseInt(id)))==1)
                            {
                                if(Poste(Integer.parseInt(id)).equals("student")){    
                                    Studen r=new Studen();
                                    r.setVisible(true);}
                                if(Poste(Integer.parseInt(id)).equals("emploiyer")){    
                                    Employer r=new Employer();
                                    r.setVisible(true);}
                                if(Poste(Integer.parseInt(id)).equals("profs")){    
                                    Profess r=new Profess();
                                    r.setVisible(true);}
                                f.setVisible(false);
                                //showTable();
                            }
                    if(Checkusers(id,password,Poste(Integer.parseInt(id)))==-1)
                            {
                                JOptionPane.showMessageDialog(this,"Wrong Password !","WARNING",JOptionPane.INFORMATION_MESSAGE);
                            } 
               }
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
    
    
    public String Poste(int p){
        if(p>=800)
            return "student";
        if(p>=10&&p<=300)
          return "emploiyer";
        if(p>=300&&p<=800)
          return "profs";
        
        return"echec";
    }
    public int Checkusers(String id,String pass,String position){
    Connection con=null;
        java.sql.PreparedStatement sin = null;
        ResultSet res=null;
        try {
        Class.forName("com.mysql.jdbc.Driver"); 
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
        String sql="select password from "+position+" where Id='"+String.valueOf(d.getText())+"'";
        sin=(PreparedStatement)con.prepareStatement(sql);
        res= sin.executeQuery();
        if(res.next())
        {
            String password = String.valueOf(res.getObject(1));
            if(pass.equals(password))
                return 1;
            else
                return -1;
        }
        else
            return 0;
        } 
        catch(Exception n){
            System.out.println(n);
        }
        return 0;

    }
    
    
    public static void main(String[] args) {
        Project f=new Project();
    }
    
}

