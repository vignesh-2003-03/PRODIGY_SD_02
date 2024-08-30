import java.awt.*;
import java.awt.event.*;
public class NumGuess {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Frame frame=new Frame();
	 frame.setTitle("Number Guess Game");
     frame.setSize(500,250);
     frame.setLayout(null);
     frame.setVisible(true);
     
     Label label=new Label("Enter the number between 1-99");
     label.setBounds(170,70,200,30);
     TextField inputfield=new TextField();
     inputfield.setBounds(190,100,100,20);
     
     Button button=new Button("Check");
     button.setBounds(200,130,70,30);
     Label emptylabel=new Label("");
     emptylabel.setBounds(140,160,300,30);
     
     frame.add(label);
     frame.add(inputfield);
     frame.add(button);
     frame.add(emptylabel);
     
     frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
    	  System.exit(0);
      }
     });
 	button.addActionListener(new ActionListener() {
 		public void actionPerformed (ActionEvent e){
 			try {
 				int randnum=(int)((Math.random()*100));
 				System.out.println(randnum);
 				for(int i=0;i<1;i++) {
 					int input=Integer.parseInt(inputfield.getText());
 					
 				if(input==randnum)
 				{
 					emptylabel.setText("The randomnumber is :"+randnum+" your Guess is correct ");
 					break;
 				}
 				else if(input>=randnum-5&&input<=randnum+5) {
 					emptylabel.setText("The randomnumber is :"+randnum+" Your Guess is almost correct");
 					break;
 				}
 				else {
 					emptylabel.setText(" Your Guess is wrong try again |'-'| \n the Num is :"+randnum);
 				}
 				System.out.println("");
 			}
 			}catch(NumberFormatException ex) {
 				emptylabel.setText("Enter the valid number");
 				
 			}
 		}
 		
 	});

     }
	
}
