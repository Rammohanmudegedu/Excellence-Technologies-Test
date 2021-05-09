// Question 2 -- to find consecutive one's

class FindMaxConsecutiveOnes {
	public static void main(String[] arg) {
		int[] arr = new int[] {0,0,1,1,0,0,0,1,0,0,1,1,1,0};
		int[] arr2 = new int[] {1,0,0,0,0,1,0,0,0,1};
		System.out.println(findMaxinumOnes(arr));
		System.out.println(findMaxinumOnes(arr2));
	}
	
	private static int findMaxinumOnes(int[] arr) {
		int count = 0, maxCount = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count +=1;
			}else {
				count = 0;
			}
			maxCount = count > maxCount ? count : maxCount;
		}
		return maxCount;
	}
}
