package singlemenu;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

	private JMenuItem item1 = new JMenuItem("Open");
	private JMenuItem item2 = new JMenuItem("Quit");

	public Main()

	{

		JFrame FrameName = new JFrame("Jani");
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("File");

		item1.addActionListener(this);
		item2.addActionListener(this);

		menu1.add(item1);
		menu1.add(item2);

		menubar.add(menu1);

		FrameName.setJMenuBar(menubar);
		FrameName.setSize(300, 100);
		FrameName.setLocationRelativeTo(null);
		FrameName.setVisible(true);
		FrameName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == item1) {
			JFileChooser FrameName = new JFileChooser(".");
			FrameName.showOpenDialog(null);

		}

		if (e.getSource() == item2) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		{
			new Main();
		}
	}

}
