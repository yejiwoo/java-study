package ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= new int[3];
		for(int i=0;i<3;i++)
			System.out.println("arr1["+i+"] : "+arr1[i]);
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=(i+1)*10;
		}
		for(int i=0;i<3;i++)
			System.out.println("arr1["+i+"] : "+arr1[i]);
		
		
		double[] arr2=new double[3];
		for(int i=0;i<3;i++)
			System.out.println("arr2["+i+"] : "+arr2[i]);
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=(i+1)/10.0;
		}
		for(int i=0;i<3;i++)
			System.out.println("arr2["+i+"] : "+arr2[i]);
		
		String[] arr3=new String[3];
		for(int i=0;i<3;i++)
			System.out.println("arr3["+i+"] : "+arr3[i]);
		for(int i=0;i<arr3.length;i++) 
			arr3[i]=(i+1)+"월";
		for(int i=0;i<3;i++)
			System.out.println("arr3["+i+"] : "+arr3[i]);
			
	}

}
