
public class BubbleSort implements sortStrategy{

	long startTime;
	long endTime;
	long totalTime;
	
public long[] sort(long ar[]) {
	
	resetTime();
	
	   for (int i = (ar.length - 1); i >= 0; i--)
	   {
	      for (int j = 1; j <= i; j++)
	      {
	         if (ar[j-1] > ar[j])
	         {
	              long temp = ar[j-1];
	              ar[j-1] = ar[j];
	              ar[j] = temp;
	         } 
	       } 
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
		return "BubbleSort";
	}
	

}
