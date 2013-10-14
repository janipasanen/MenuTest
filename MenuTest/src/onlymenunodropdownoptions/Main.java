package onlymenunodropdownoptions;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {


	public Main()

	{

		JFrame FrameName = new JFrame("Jani");
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("File");

		menubar.add(menu1);

		FrameName.setJMenuBar(menubar);
		FrameName.setSize(300, 100);
		FrameName.setVisible(true);

	}

	public static void main(String[] args) {
		{
			new Main();
		}


}
}