public class Reverse {
//recursive----------------------------------------------------------------------------------------------
  /*
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