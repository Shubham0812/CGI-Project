package cgi;
import javax.swing.*;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.awt.*;  
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;  

public class helpCandidate implements KeyListener {
	 private static JDialog d;  
	 JLabel heading,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;
	 helpCandidate(){
	       
		  JFrame f= new JFrame();
		  
	        d = new JDialog(f , "Master Referral Validation Automator", true);  
	        d.setLayout(null);  
	        heading = new JLabel("Please Check that the Candidate Referral Input File has these fields in any order : ");
	        heading.setBounds(10,20,900,30); 
	        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
	        heading.setForeground(Color.BLUE);
	        l1 = new JLabel(" Candidate First Name");
	        l1.setBounds(10,80,200,30);
	        l1.setFont(new Font("Tahoma",Font.BOLD,15));
	        l2 = new JLabel(" Candidate Last Name");
	        l2.setFont(new Font("Tahoma",Font.BOLD,15));
	        l2.setBounds(210,80,250,30);
	        l3 = new JLabel(" Candidate Email");
	        l3.setBounds(410,80,150,30);
	        l3.setFont(new Font("Tahoma",Font.BOLD,15));
	        l4 = new JLabel(" Candidate Source");
	        l4.setBounds(580,80,150,30);
	        l4.setFont(new Font("Tahoma",Font.BOLD,15));
	        l5 = new JLabel(" Referral Name");
	        l5.setBounds(750,80,150,30);
	        l5.setFont(new Font("Tahoma",Font.BOLD,15));
	        l6 = new JLabel(" Referral Email");
	        l6.setBounds(10,120,250,30);
	        l6.setFont(new Font("Tahoma",Font.BOLD,15));
	        l7 = new JLabel(" JOB ID");
	        l7.setBounds(210,120,250,30);
	        l7.setFont(new Font("Tahoma",Font.BOLD,15));
	        l8 = new JLabel(" Job Title");
	        l8.setBounds(410,120,250,30);
	        l8.setFont(new Font("Tahoma",Font.BOLD,15));
	        l9 = new JLabel(" Candidate Stage");
	        l9.setBounds(580,120,250,30);
	        l9.setFont(new Font("Tahoma",Font.BOLD,15));
	        l10 = new JLabel(" Application Status");
	        l10.setBounds(750,120,250,30);
	        l10.setFont(new Font("Tahoma",Font.BOLD,15));
	        l11 = new JLabel(" Application Date");
	        l11.setFont(new Font("Tahoma",Font.BOLD,15));
	        l11.setBounds(10,160,250,30);
	        l12 = new JLabel(" Ref. Survey Status");
	        l12.setFont(new Font("Tahoma",Font.BOLD,15));
	        l12.setBounds(210,160,250,30);
	        l13 = new JLabel(" Date Survey Taken");
	        l13.setFont(new Font("Tahoma",Font.BOLD,15));
	        l13.setBounds(410,160,250,30);
	        l14 = new JLabel(" Date Survey Invite Sent");
	        l14.setFont(new Font("Tahoma",Font.BOLD,15));
	        l14.setBounds(580,160,250,30);
	        l15 = new JLabel(" Candidate Enter Date");
	        l15.setFont(new Font("Tahoma",Font.BOLD,15));
	        l15.setBounds(10,200,250,30);
	        l16 = new JLabel(" Referral Type");
	        l16.setFont(new Font("Tahoma",Font.BOLD,15));
	        l16.setBounds(210,200,250,30);
	        l17 = new JLabel(" Placement Date");
	        l17.setFont(new Font("Tahoma",Font.BOLD,15));
	        l17.setBounds(410,200,250,30);
	        l18 = new JLabel(" Start Date");
	        l18.setFont(new Font("Tahoma",Font.BOLD,15));
	        l18.setBounds(580,200,250,30);
	        l19 = new JLabel(" Business Unit");
	        l19.setFont(new Font("Tahoma",Font.BOLD,15));
	        l19.setBounds(7500,200,250,30);
	        l20 = new JLabel(" CandidateID");
	        l20.setFont(new Font("Tahoma",Font.BOLD,15));
	        l20.setBounds(10,240,250,30);
	        l21 = new JLabel(" Last Activity Date");
	        l21.setFont(new Font("Tahoma",Font.BOLD,15));
	        l21.setBounds(210,240,250,30);
	        l22 = new JLabel(" Referral ID");
	        l22.setFont(new Font("Tahoma",Font.BOLD,15));
	        l22.setBounds(410,240,250,30);
	        l23 = new JLabel(" SVP/VP");
	        l23.setFont(new Font("Tahoma",Font.BOLD,15));
	        l23.setBounds(580,240,250,30);
	        l24 = new JLabel(" VP/Director");
	        l24.setFont(new Font("Tahoma",Font.BOLD,15));
	        l24.setBounds(750,240,250,30);
	        JLabel txt = new JLabel("Press any key to Exit...");
	        txt.setBounds(370,280,250,30);
	        txt.setForeground(Color.RED);
	        txt.setFont(new Font("Tahoma",Font.PLAIN,14));
	        
	        
	        
	        
	        d.addKeyListener(this);  
	        d.add(heading);d.add(txt);
	        d.add(l1);d.add(l2);d.add(l3);d.add(l4);d.add(l5);d.add(l6);d.add(l7);d.add(l8);d.add(l9);d.add(l10);
	        d.add(l11);d.add(l12);d.add(l13);d.add(l14);d.add(l15);d.add(l16);d.add(l17);d.add(l18);d.add(l19);d.add(l20);
	        d.add(l21);d.add(l22);d.add(l23);d.add(l24);
	        d.setSize(940,360);
	        d.setLocation(250,30);
	      
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        d.setVisible(true);  
	       
	        
	 }
	 
	 public static int checkFormat(String input1){
		 try{
			 java.util.List<String> fields = new ArrayList<String>();
			 int count2=0;
			 if(input1.contains(".xls")||input1.contains(".xlsx")){
		     FileInputStream inputStream = new FileInputStream(new File(input1));
		     Workbook workbook = WorkbookFactory.create(inputStream);
		     Sheet sheet = workbook.getSheet("Sheet1");
		     int rowEnd = sheet.getLastRowNum() ;
		         Row ttya = sheet.getRow(5);
		         int colcount2 = ttya.getLastCellNum();
		         for(int i =0;i<colcount2;i++){
		        	 Cell cell = ttya.getCell(i);
		        	 fields.add(cell.getStringCellValue());
		         }for(int x = 0;x<fields.size();x++){
		        	 if(fields.get(x).equals("Candidate First Name")){ count2++;}if(fields.get(x).equals("Candidate Last Name")){ count2++;}
		        	 if(fields.get(x).equals("Candidate Email")){ count2++;}if(fields.get(x).equals("Candidate Source")){ count2++;}
		        	 if(fields.get(x).equals("Referral Name")){ count2++;}if(fields.get(x).equals("Referral Email")){ count2++;}
		        	 if(fields.get(x).equals("Job ID")){ count2++;}if(fields.get(x).equals("Job Title")){ count2++;}
		        	 if(fields.get(x).equals("Candidate Stage")){ count2++;}if(fields.get(x).equals("Application Status")){ count2++;}
		        	 if(fields.get(x).equals("Application Date")){ count2++;}if(fields.get(x).equals("Ref. Survey Status")){ count2++;}
		        	 if(fields.get(x).equals("Date Survey Taken")){ count2++;}if(fields.get(x).equals("Date Survey Invite Sent")){ count2++;}
		        	 if(fields.get(x).equals("Candidate Enter Date")){ count2++;}if(fields.get(x).equals("Referral Type")){ count2++;}
		        	 if(fields.get(x).equals("Placement Date")){ count2++;}if(fields.get(x).equals("Start Date")){ count2++;}
		        	 if(fields.get(x).equals("Business Unit")) {count2++;}if(fields.get(x).equals("CandidateID")) {count2++;}
		        	 if(fields.get(x).equals("Last Activity Date")) {count2++;}if(fields.get(x).equals("Referral ID")) {count2++;}
		        	 if(fields.get(x).equals("SVP/VP")) {count2++;}if(fields.get(x).equals("VP/Director")) {count2++;}
		         }
		        	 if(count2==24){
		        		return count2;
		        	 }
		        	 return count2;
			 } 
			 else{
				 throw new IOException();
			 }
		 }catch (IOException | EncryptedDocumentException | IndexOutOfBoundsException
		         | InvalidFormatException ex) {
		     JOptionPane.showMessageDialog(null, "Error : Invalid File Selected");
		     return -1;
		 }
	}	 
	 
	 
	 public static void main(String...args){
		 new helpCandidate();
		 String x ="Candidate Referrals (Generic).xls";
		 checkFormat(x);
	 }

	@Override
	public void keyPressed(KeyEvent e) {
		d.dispose();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		}
		
}
