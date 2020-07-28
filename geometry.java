
public class geometry {
	  int i;
			double sum=0.0,fraction,a= 1;
			int b=1;
			int n=4;
		
		double trick(int n)
		{
	 		
	        for(i=1;i<=n;i++)
		{     
	        	fraction=1/a;
	          
	        	if(b%2==0)
		    {    
		    	 fraction=((-1)/a);
		    	}
		    else 
		    	{
		    	fraction=1/a;
		    	
		    	}
	            sum +=fraction;
	            a=a+2;
	            b=b+1;
			}return sum;
	        }

}
