class SortingArrayAccending{
	public static void main(String args []){
		int [] arr = {4,2,1,5,3};
		System.out.println("======before sorting elements======");
		for(int i=0; i<arr.length; i++){
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]< arr[i]){
					int temp= arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		System.out.println("======after sorting elements======");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		}
	}