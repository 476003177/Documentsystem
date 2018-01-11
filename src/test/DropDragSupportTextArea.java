package test;

import java.awt.datatransfer.*;  
import java.awt.dnd.*;  
import java.io.*;  
import java.util.*;  
import javax.swing.*;  
  
/** 
 * 
 * @author Administrator 
 */  
public class DropDragSupportTextArea extends JTextArea implements DropTargetListener{  
    private DropTarget dropTarget;  
  
    public DropDragSupportTextArea() {  
        //ע��DropTarget������������������������ĸ����������  
        //����ͨ�������һ��this����Listener(�ڶ���this)  
        dropTarget = new DropTarget(this,DnDConstants.ACTION_COPY_OR_MOVE, this, true);  
    }  
      
    /** 
     * �����ļ����ַ���,����ֻ˵������ק����δ���ļ�����ʾ���ı������� 
     */  
    public void dragEnter(DropTargetDragEvent dtde) {  
        DataFlavor[] dataFlavors = dtde.getCurrentDataFlavors();  
        if(dataFlavors[0].match(DataFlavor.javaFileListFlavor)){  
            try {  
                Transferable tr = dtde.getTransferable();  
                Object obj = tr.getTransferData(DataFlavor.javaFileListFlavor);  
                List<File> files = (List<File>)obj;  
                for(int i = 0; i < files.size(); i++){  
                    append(files.get(i).getAbsolutePath()+"/r/n");  
                }  
            } catch (UnsupportedFlavorException ex) {  
  
            } catch (IOException ex) {  
  
            }  
        }  
    }  
  
    public void dragOver(DropTargetDragEvent dtde) {  
        
    }  
  
    public void dropActionChanged(DropTargetDragEvent dtde) {  
         
    }  
  
    public void dragExit(DropTargetEvent dte) {  
          
    }  
  
    public void drop(DropTargetDropEvent dtde) {  
          
    }  
  
}  