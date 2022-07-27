package Programs.FunctionalPrograms;

public class SumOfIntegers {
	public static void main(String[] args) {

		int arr[] = { 2, -1, 4, -3, 1 };
		int n = arr.length;
		findTriplets(arr, n);
	}

	public static void findTriplets(int[] arr, int n) {
		
		for (int i = 0; i < n - 2; i++) {
			
			for (int j = i + 1; j < n - 1; j++) {
				
				for (int k = j + 1; k < n; k++) {
					
					if (arr[i] + arr[j] + arr[k] == 0) {
						
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						
						int sum = (arr[i] + arr[j] + arr[k]);
						System.out.println("Sum of three integers: "+arr[i]+ " + "+ arr[j]+ " + "+arr[k]+" = "+ sum);
					}
				}
			}
		}
	}


}
