public class RotateAnArrayBy2Places{

    public static void main(String[] args){

		int[] ra = leftRotate(new int[]{1,2,3,4,5},2);
		//3,4,5,1,2
        for(int elm : ra){
			System.out.println(elm);
		}

	}


	public static int[] leftRotate(int[] a, int d){
	
        if(a.length==0) return a;

		for(int i = 0; i<d; i++){
		
		       int first = a[0];
		       for(int j = 1; j<a.length; j++){

				a[j-1] = a[j];	
			}
			a[a.length-1] = first;
		}	

		

        return a;
	}
}