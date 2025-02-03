
public class InsertionSort implements sortStrategy{

	long startTime;
	long endTime;
	long totalTime;
	
	public long[] sort(long ar[]) {

		resetTime();
		
		   for (int i=1; i < ar.length; i++)
		   {
		      long index = ar[i]; int j = i;
		      while (j > 0 && ar[j-1] > index)
		      {
		           ar[j] = ar[j-1];
		           j--;
		      }
		      ar[j] = index;
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
		return "InsertionSort";
	}
}
