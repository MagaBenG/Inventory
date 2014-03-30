package InventoryMain;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * 
 * @author Benjamin DosSantos
 * Inventory application for 
 * BPSII
 *
 */

public class Inventory {

	public static void main(String args[]){
		
		// Var & Strings
		
		String MainWindow = "Test";
		
		String InventoryPanelName = "Inventory";
		
		// Buttons
		
		JButton BPSI = new JButton("BPS I");
		
		BPSI.setPreferredSize(new Dimension(100, 100));
		
		// Words
		
		JLabel OpenText = new JLabel("Pick An Inventory");
		
		// JPanels
		
		JPanel InventoryPanel = new JPanel();
		
		InventoryPanel.setVisible(true);
		
		InventoryPanel.setBackground(Color.CYAN);
		
		// Jframe Setup
		
		JFrame Inventory = new JFrame(MainWindow);
		
		Inventory.setVisible(true);
		
		Inventory.getContentPane().add(InventoryPanel);
		
		Inventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Inventory.setSize(800, 600);
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		// All Together Now!
		
		InventoryPanel.add(BPSI);
		
	}
	
}
