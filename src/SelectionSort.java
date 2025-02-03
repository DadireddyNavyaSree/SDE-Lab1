
public class SelectionSort implements sortStrategy{
	
	long startTime;
	long endTime;
	long totalTime;
	
	public long[] sort(long ar[]) {
		resetTime();
		
			   for (int i = 0; i < ar.length-1; i++)
			   {
			      int min = i;
			      for (int j = i+1; j < ar.length; j++)
			            if (ar[j] < ar[min]) min = j;
			      long temp = ar[i];
			      ar[i] = ar[min];
			      ar[min] = temp;
			}
			   
        endTime = System.currentTimeMillis();
        return ar;
	}
	
    public void resetTime() {
    	 startTime = System.currentTimeMillis();
    	
    }
	
	public long getTime() {
		totalTime = endTime-startTime;
		return totalTime;
	}
	
	public String setStrategy() {
		return "SelectionSort";
	}
	
}
