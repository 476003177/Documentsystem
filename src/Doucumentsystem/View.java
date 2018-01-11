package Doucumentsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class View extends JFrame{
	
	JPanel panel1;
	JPanel panel2;
	JTextArea textArea;
	JScrollPane jsp;
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	
	public View()
	{
		//拖拽区
		this.panel1=new JPanel();
		this.textArea=new DropDragSupportTextArea();
//		this.textArea.setOpaque(false);//设置透明
		this.jsp=new JScrollPane(); 
		
		this.panel1.setBorder(BorderFactory.createTitledBorder("文件拖拽区"));  
		this.jsp.setViewportView(this.textArea); 
		this.textArea.setColumns(40);  
		this. textArea.setRows(20);
		
		this.panel1.add(this.jsp);
		
		this.add("West",this.panel1);
		
		//功能区
//		Dimension JButtonSize = new Dimension(150,30);
		this.panel2=new JPanel();
		this.jb1=new JButton("虚拟文件目录");
		this.jb1.setFont(new Font("宋体", Font.PLAIN, 21));
//		this.jb1.setPreferredSize(JButtonSize);
		this.jb2=new JButton("修改文件");
		this.jb2.setFont(new Font("宋体", Font.PLAIN, 25));
//		this.jb2.setPreferredSize(JButtonSize);
		this.jb3=new JButton("加密文件");
		this.jb3.setFont(new Font("宋体", Font.PLAIN, 25));
		this.jb4=new JButton("上传文件");
		this.jb4.setFont(new Font("宋体", Font.PLAIN, 25));
		this.jb5=new JButton("下载文件");
		this.jb5.setFont(new Font("宋体", Font.PLAIN, 25));
		this.panel2.setBorder(BorderFactory.createTitledBorder("功能区"));
		this.panel2.setLayout(new GridLayout(5,1,10,35));
//		this.panel2.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));//设置边缘空白
		
		this.panel2.add(jb1);
		this.panel2.add(jb2);
		this.panel2.add(jb3);
		this.panel2.add(jb4);
		this.panel2.add(jb5);
		
		this.add("Center",this.panel2);
		
		this.setTitle("基于机器学习的智能文件管理系统（梁志浩作品）");
		this.setSize(650, 440);  
	    this.setResizable(false);  
	    this.setLocationRelativeTo(null);  
	    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
	    
	    this.setVisible(true);
	}
	
	
    public static void main(String[] args){  

    	View view=new View();
    	
    }  
}
