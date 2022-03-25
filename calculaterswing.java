import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isOperatorClicked=false;
	JFrame jf;
	JLabel displaylabel;
	JButton sevenButton;
	JButton eigthButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	String oldValue;
	float operator; 
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(400, 100);
		
		
		displaylabel=new JLabel();
		displaylabel.setBounds(20, 20, 490, 30);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.WHITE);
		jf.add(displaylabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,75,75);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		eigthButton=new JButton("8");
		eigthButton.setBounds(130,130,75,75);
		eigthButton.setFont(new Font("Arial",Font.PLAIN,40));
		eigthButton.addActionListener(this);
		jf.add(eigthButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 75, 75);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
	    fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 75, 75);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 75, 75);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 75, 75);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,330, 75, 75);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		

		twoButton=new JButton("2");
		twoButton.setBounds(130,330, 75, 75);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		
		threeButton=new JButton("3");
		threeButton.setBounds(230,330, 75, 75);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,430, 75, 75);
		dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		

		zeroButton=new JButton("0");
		zeroButton.setBounds(130,430, 75, 75);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		
		equalButton=new JButton("=");
		equalButton.setBounds(230,430, 75, 75);
		equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 75, 75);
		divButton.setFont(new Font("Arial",Font.PLAIN,40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(430, 130, 75, 75);
		clearButton.setFont(new Font("Arial",Font.PLAIN,40));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		mulButton=new JButton("x");
		mulButton.setBounds(330, 230, 75, 75);
		mulButton.setFont(new Font("Arial",Font.PLAIN,40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 75, 75);
		minusButton.setFont(new Font("Arial",Font.PLAIN,40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 75, 75);
		plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
	
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//jf.getContentPane().setBackground(Color.black);//
		
		
		if(e.getSource()== sevenButton) {
			
			if(isOperatorClicked) {
				displaylabel.setText("7");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"7");
			}
			
			
		}else if(e.getSource()==eigthButton) {
			
			if(isOperatorClicked) {
				displaylabel.setText("8");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"8");
			}
			
			
	 	}else if(e.getSource()==nineButton) {
			
			if(isOperatorClicked) {
				displaylabel.setText("9");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"9");
			}
			}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displaylabel.setText("4");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"4");
			}
		}else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displaylabel.setText("5");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displaylabel.setText("6");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"6 ");
			}
		}
		else if(e.getSource()==oneButton) {
			displaylabel.setText(displaylabel.getText()+"1");
		}
		
		else if(e.getSource()==twoButton) {
			displaylabel.setText(displaylabel.getText()+"2");
		}
		
		else if(e.getSource()==threeButton) {
			displaylabel.setText(displaylabel.getText()+"3");
		}
		
		else if(e.getSource()==dotButton) {
			displaylabel.setText(displaylabel.getText()+".");
		}
		
		else if(e.getSource()==zeroButton) {
			displaylabel.setText(displaylabel.getText()+"0");
		}
		
		else if(e.getSource()==equalButton) {
			String newValue=displaylabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			float result =oldValueF+newValueF;
			displaylabel.setText(result+"");
			isOperatorClicked=false;
						
		}
		
		
			else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			
			oldValue=displaylabel.getText();
			displaylabel.setText("/");
		}
		
		else if(e.getSource()==mulButton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText("*");
			
		}
		
		else if(e.getSource()==minusButton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText("-");
		}
		
		
		else if(e.getSource()==plusButton) {
			isOperatorClicked=true;
			
			oldValue=displaylabel.getText();
			displaylabel.setText("+");
		}
		
		else if(e.getSource()==clearButton) {
			displaylabel.setText("");
		}
		
		
	}

}
