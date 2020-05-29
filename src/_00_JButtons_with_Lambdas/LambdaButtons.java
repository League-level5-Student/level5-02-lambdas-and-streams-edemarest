package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public void run() {
		addNumbers.addActionListener(e -> {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Input number 1:"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Input number 2:"));
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		});
		randNumber.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Your random number is:  "+new Random().nextInt(50));
		});
		randNumber.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Big Chungus!!!!!");
		});
	}
	
	public static void main(String[] args) {
		new LambdaButtons().run();
		

		
	}
	
	
}
