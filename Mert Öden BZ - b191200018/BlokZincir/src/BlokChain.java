import java.util.ArrayList;

public class BlokChain {
	public static void main(String[] args) 
	{
		
		ArrayList<Blok> blockChain = new ArrayList<Blok>();
		
		//ilk blok
		String[] initialValues = {"mert has $700", "hasan has $550"};
		Blok firstBlock = new Blok(initialValues,0);
		blockChain.add(firstBlock);
		System.out.println("ilk blok : " + firstBlock.toString());
		System.out.println("Blok Zincir: " + blockChain.toString());
		
		//ikinci blok
		String[] initialValues2 = {"mert gives oguzhan $405", " mert gives burak $50", "mert gives omer $45"};
		Blok secondBlock = new Blok(initialValues2,0);
		blockChain.add(secondBlock);
		System.out.println("ikinci blok : " + secondBlock.toString());
		System.out.println("Blok Zincir: " + blockChain.toString());
		
		//???nc? blok
				String[] initialValues3 = {"oguzhan gives mert $405", "hasan gives $60 to ?mer"};
				Blok thirdBlock = new Blok(initialValues2,0);
				blockChain.add(thirdBlock);
				System.out.println("???nc? blok : " + thirdBlock.toString());
				System.out.println("Blok Zincir: " + blockChain.toString());

	}
	

}
