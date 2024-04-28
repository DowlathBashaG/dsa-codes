package io.dowlath.interface_override;

public class AddImplementation implements Add1Interface, Add2Interface{
	public static void main(String args[]){
		AddImplementation ai = new AddImplementation();
		ai.add(5,6);
		
	}
	public void add(int i, int j){
		System.out.println("The Result.....:"+ (i+j));
	}	
//	public void add(int i, int j){
//		System.out.println("The Result.....:"+ (i+j));
//	}	
}
