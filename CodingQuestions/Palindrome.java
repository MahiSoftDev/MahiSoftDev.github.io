public class Palindrome {

	public static void main(String []args){
		String sentenceOrNumber = args[0],reversed="";
		for(int i=sentenceOrNumber.length()-1;i>=0;--i){
			reversed=reversed+sentenceOrNumber.charAt(i);
		}
		System.out.println("Original data "+args[0]+"\nThe reversed data is: " + reversed);
		
		if(sentenceOrNumber.toLowerCase().equals(reversed.toLowerCase())){
			System.out.println("Entered Data "+sentenceOrNumber+" is Polindrome");
		}else{
			System.out.println("Entered Data "+sentenceOrNumber+" is Not Polindrome");
		}
	}
	
}
//-------------------------------------------------------------------------------------------------------
//recursive----------------------------------------------------------------------------------------------
  /*
  public static void main(String[] args) {
    String sentenceOrNumber = args[0]; //assigning cmd argument to sentence
    String reversed = reverse(sentenceOrNumber);
    System.out.println("Original data "+args[0]+"\nThe reversed data is: " + reversed);
		
		if(sentenceOrNumber.toLowerCase().equals(reversed.toLowerCase())){
			System.out.println("Entered Data "+sentenceOrNumber+" is Polindrome");
		}else{
			System.out.println("Entered Data "+sentenceOrNumber+" is Not Polindrome");
		}
  }
  public static String reverse(String sentenceOrNumber) {
    if (sentenceOrNumber.isEmpty()){
      return sentenceOrNumber;
	}
    return reverse(sentenceOrNumber.substring(1))+ sentenceOrNumber.charAt(0);
 }
 */
 //-------------------------------------------------------------------------------------------------------
 
 
 //non - recursive----------------------------------------------------------------------------------------g  a n e s h a
			//0 1 2 3 4 5 6
			//  reversed="ahsenag"