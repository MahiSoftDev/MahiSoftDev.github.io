public class Reverse {
//non - recursive----------------------------------------------------------------------------------------
public static void main(String []args){
  String sentenceOrNumber = args[0],reversed="";
  for(int i=sentenceOrNumber.length()-1;i>=0;--i){
    reversed=reversed+sentenceOrNumber.charAt(i);
  }
  System.out.println("Original String "+args[0]+"\nThe reversed sentence is: " + reversed);
}
}
//-------------------------------------------------------------------------------------------------------
  //recursive----------------------------------------------------------------------------------------------
  
  /*
  public class Reverse {
  public static void main(String[] args) {
    String sentenceOrNumber = args[0]; //assigning cmd argument to sentence
    String reversed = reverse(sentenceOrNumber);
    System.out.println("Original String "+args[0]+"\nThe reversed sentence is: " + reversed);
  }
  public static String reverse(String sentenceOrNumber) {
    if (sentenceOrNumber.isEmpty()){
      return sentenceOrNumber;
	}
    return reverse(sentenceOrNumber.substring(1))+ sentenceOrNumber.charAt(0);
 }
 */
 //-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
  //recursive----------------------------------------------------------------------------------------------
  /*
  To reverse only numbers
  public class Reverse {
  	public static void main(String []args){
	    int n = 113132, reverse=0,remainder;
		
		  while(n!=0){
			  remainder=n%10;
			  reverse=reverse*10+remainder;
			  n/=10;
		  }
		  System.out.println(reverse);
    }
	}

 */

 //-------------------------------------------------------------------------------------------------------
