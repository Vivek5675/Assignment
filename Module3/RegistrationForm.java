package Module3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RegistrationForm 
{
	JFrame frame;
	JLabel lbl1,lblid,lblnm,lblgen,lbladrs,lblcont;
	JTextField tfid,tfnm,tfadrs,tfcont;
	JRadioButton rbm,rbf;
	JButton btnexit,btnregi,btndelete,btnupdate,btnreset,btnrefresh;
	DefaultTableModel tablemodel;
	JScrollPane jscroll;
	
	Connection conn;
	
	
	
	public RegistrationForm()
	{
		frame = new JFrame("REGISTRATION FORM");
		//label
		lbl1 = new JLabel("Registration Form");
		lbl1.setBounds(35, 10, 105, 15);
		
		//ID...
		lblid = new JLabel("ID");
		lblid.setBounds(10, 50, 49, 14);
		
		tfid = new JTextField();
		tfid.setBounds(80, 45, 120, 20);
		
		//NAME...
		lblnm = new JLabel("Name");
		lblnm.setBounds(10, 90, 49, 14);
		
		tfnm = new JTextField();
		tfnm.setBounds(80, 85, 120, 20);
		
		//GENDER...
		lblgen = new JLabel("Gender");
		lblgen.setBounds(10, 130, 49, 14);
		
		rbm = new JRadioButton("Male");
		rbm.setBounds(80, 125, 53, 20);
		
		rbf = new JRadioButton("Female");
		rbf.setBounds(130, 125, 70, 20);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbm);
		bg.add(rbf);
		
		//ADDRESS...
		lbladrs = new JLabel("Address");
		lbladrs.setBounds(10, 170, 49, 14);
		
		tfadrs = new JTextField();
		tfadrs.setBounds(80, 165, 120, 20);
		
		//CONTACT
		lblcont = new JLabel("Contact");
		lblcont.setBounds(10, 210, 49, 14);
		
		tfcont = new JTextField();
		tfcont.setBounds(80, 205, 120, 20);
		
		//BUTTONS....
		btnexit = new JButton("Exit");
		btnexit.setBounds(10, 250, 89, 23);
		
		btnregi = new JButton("Register");
		btnregi.setBounds(110, 250, 89, 23);
		
		btndelete = new JButton("Delete");
		btndelete.setBounds(10, 300, 89, 23);
		
		btnupdate = new JButton("Update");
		btnupdate.setBounds(110, 300, 89, 23);
		
		btnreset = new JButton("Reset");
		btnreset.setBounds(50, 350, 89, 23);
		
		//JTable Panel...
		String columns[] = {"S.NO","ID","Name","Gender","Address","Contact"};
		tablemodel = new DefaultTableModel(columns,0);
		JTable tb = new JTable(tablemodel);
		tb.setBounds(200, 20, 200, 300);
		JScrollPane sp = new JScrollPane(tb);
		jscroll = new JScrollPane(sp);
		jscroll.setBounds(250, 20, 490, 300);

		
		//Button Refresh
		btnrefresh = new JButton("Refresh Table");
		btnrefresh.setBounds(450, 350, 120, 23);
		
		
		
		frame.add(lbl1);
		frame.add(lblid);
		frame.add(lblnm);
		frame.add(lblgen);
		frame.add(lbladrs);
		frame.add(lblcont);
		
		frame.add(tfid);
		frame.add(tfnm);
		frame.add(tfadrs);
		frame.add(tfcont);
		frame.add(rbm);
		frame.add(rbf);
		
		frame.add(btnexit);
		frame.add(btnregi);
		frame.add(btndelete);
		frame.add(btnupdate);
		frame.add(btnreset);
		
		frame.add(jscroll);
		frame.add(btnrefresh);
		
		frame.setSize(800, 450);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btnregi.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				RegisterData();
			}
		});
		
		btnrefresh.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				RefreshData();
			}
		});
		
		btnupdate.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				UpdateData();
			}
		});
		
		btndelete.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				DeleteData();
			}
		});
		
		btnreset.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				ResetData();
			}
		});
		
		btnexit.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				Exit();
			}
		});
		
		connectDatabase();
		 
	}
	private void connectDatabase()
	{
		try 
		{
			String db = "regform";
			String host = "jdbc:mysql://localhost:3306/";
			String url = host + db;

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void RegisterData()
	{
		String id = tfid.getText();
        String name = tfnm.getText();
        String gender = rbm.isSelected() ? "Male" : "Female";
        String address = tfadrs.getText();
        String contact = tfcont.getText();

        try 
        {
            String query = "INSERT INTO data56 (id, name, gender, address, contact) VALUES ('" + id + "', '" + name + "', '" + gender + "', '" + address + "', '" + contact + "')";
            Statement stmt = conn.createStatement();
			int data = stmt.executeUpdate(query);
			RefreshData();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
	
	private void RefreshData()
	{
		try 
		{
            String query = "SELECT * FROM data56";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            tablemodel.setRowCount(0); 
            
            while (rs.next())
            {
                int sNo = rs.getRow();
                String id = rs.getString("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                tablemodel.addRow(new Object[]{sNo, id, name, gender, address, contact});
            }
        } 
		catch (Exception e) 
		{
            e.printStackTrace();
        }
    }	
	
	private void UpdateData()
	{
		String id = tfid.getText();
        String name = tfnm.getText();
        String gender = rbm.isSelected() ? "Male" : "Female";
        String address = tfadrs.getText();
        String contact = tfcont.getText();

        try
        {
            String query = "UPDATE data56 SET name='" + name + "', gender='" + gender + "', address='" + address + "', contact='" + contact + "' WHERE id='" + id + "'";
            PreparedStatement pstmt= conn.prepareStatement(query);
			pstmt.executeUpdate();
			RefreshData();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
	
	private void DeleteData()
	{
		String id = tfid.getText();
		try 
		{
			String query = "DELETE FROM data56 WHERE id='" + id + "' ";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.executeUpdate();
			RefreshData();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	private void ResetData()
	{
		tfid.setText("");
		tfnm.setText("");
		//bg.clearSelection();
		tfadrs.setText("");
		tfcont.setText("");
	}
	
	private void Exit()
	{
		frame.dispose();
	}
	
	
	public static void main(String[] args)
	{
		new RegistrationForm();
	}
}
