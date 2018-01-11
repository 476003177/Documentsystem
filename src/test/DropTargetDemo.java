package test;

import javax.swing.*;  
/** 
 * 
 * @author zhang xiaojin 
 * 演示Swing文件拖拽 
 */  
public class DropTargetDemo extends JFrame{ 
	
	JPanel panel;
	JTextArea textArea;
	JScrollPane jsp;
	
	
	public DropTargetDemo()
	{
		this.panel=new JPanel();
		this.textArea=new DropDragSupportTextArea();
		this.jsp=new JScrollPane(); 
		
		this.panel.setBorder(BorderFactory.createTitledBorder("文件拖拽演示"));  
		this.jsp.setViewportView(this.textArea); 
		this.textArea.setColumns(40);  
		this. textArea.setRows(20);
		
		this.panel.add(this.jsp); 
		this.add(this.panel);
		
		this.setTitle("文件拖拽Demo");
		this.setSize(500, 400);  
	    this.setResizable(false);  
	    this.setLocationRelativeTo(null);  
	    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
	    
	    this.setVisible(true);
	}
	
	
    public static void main(String[] args){  

    	DropTargetDemo droptargetDemo=new DropTargetDemo();
    	
    }  
}  