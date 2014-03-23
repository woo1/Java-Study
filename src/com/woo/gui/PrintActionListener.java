package com.woo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListener implements ActionListener {
	JTable table;
	PrintActionListener(JTable table){
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent e){
		TableModel model = table.getModel();
		int rownum = model.getRowCount();
		int colnum = model.getColumnCount();
		for(int col = 0; col <colnum; col++){
			String colName = model.getColumnName(col);
			System.out.print(colName + "\t");
		}
		System.out.println();
		for(int row=0; row < rownum; row++){
			for(int col = 0; col <colnum; col++){
				Object obj = model.getValueAt(row, col);
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}
}
