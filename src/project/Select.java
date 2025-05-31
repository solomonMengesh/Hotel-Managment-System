/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sol
 */
public class Select {
    public static  Resultset getData(String query)
    {
        Connection con = null;
        Statement st = null;
        Resultset rs = null;
        try
        {
            con = connectionProvider.getCon();
            st=con.createStatement();
            rs=(Resultset) st.executeQuery(query);
            return rs;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null ;
        }
        
    }
    
}
