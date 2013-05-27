
public class craps {
		public static void main(String[] args) {
			int numWins = 0;
			int numLosses = 0;
	
for (int i = 1; i<=100; i++){
	
		int x=(int)(Math.random()*6);
		int y=(int)(Math.random()*6);   //random number gen, generates first 2 rolls
		int roll= x+y; 
		if (roll == 7 || roll == 11){
		 numWins = numWins +1;
		 System.out.println("Your rolls are ["+x+"] [" +y+"]=["+roll+"]you win.");}
		 else if (roll ==2 || roll==3 || roll==12) {
		  numLosses = numLosses + 1;
		  System.out.println("Your rolls are ["+x+"] ["+y+"]=["+roll+"] you lose.");}
			else  {										//if first roll doesnt win or loss goes to second roll, 
		   int x2 = (int)(Math.random()*6); int y2=(int)(Math.random()*6);  //random num gen for second rolls
		   int dice= x2+y2;
		    System.out.print("Your rolls are ["+x+"] ["+y+"] = ["+roll+"] and ["+x2+"] and ["+y2+"]=["+dice+"]");
			  if (roll == dice){numWins = numWins+1;
			  System.out.println("you win.");}
			  else {
		  numLosses=numLosses+1;
		  System.out.println("you lose.");}
	} 
				  // Output probability of winning
}	System.out.println("In the simulation, we won " + numWins +
				" times and lost " + numLosses + " times, ");		//print out of total wins and losses
			}
}