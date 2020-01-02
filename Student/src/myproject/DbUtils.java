/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class DbUtils {
    public static TableModel resultSetToTableModel(ResultSet rs) 
    {
        try 
        {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
            for (int column = 0; column < numberOfColumns; column++)
            {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }
            Vector rows = new Vector();
            while (rs.next()) 
            {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) 
                {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }
            return new DefaultTableModel(rows, columnNames);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            return null;
        }
    }
   private void updateTable()
    {
        Connection c=null;
        PreparedStatement s;
        ResultSet r=null;
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  

            c=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            String sql="SELECT * FROM listeeleve";
            System.out.println("1");
            s=(PreparedStatement)c.prepareStatement(sql);
            System.out.println("2");
            r=(ResultSet)s.executeQuery();
            if(r==null)
            System.out.println("err");
            c.close();
        }
        catch(Exception e)
        {
            System.out.println("Error !");
        }
    }
    
}