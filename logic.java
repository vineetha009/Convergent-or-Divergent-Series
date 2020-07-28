
public class logic {
	public static void main(String[] args)
	{ 
		
		series logic1=new series();
		series logic2=new series();
		series logic3=new series();
		series logic4=new series();
		series logic5=new series();
		series logic6=new series();
		series logic7=new series();
		series logic8=new series();
		series logic9=new series();
		series logic10=new series();
		double added_sum1=logic1.code(1000);
		double added_sum2=logic2.code(2000);
	    double D1=added_sum2 - added_sum1;
	    double added_sum3=logic3.code(3000);
	    double D2=added_sum3 - added_sum2;
	    double added_sum4=logic4.code(4000);
	    double D3=added_sum4 - added_sum3;
	    double added_sum5=logic5.code(5000);
        double D4=added_sum5 - added_sum4;
        double added_sum6=logic6.code(6000);
	    double D5=added_sum6 - added_sum5;
	    double added_sum7=logic7.code(7000);
	    double D6=added_sum7 - added_sum6;
	    double added_sum8=logic8.code(8000);
	    double D7=added_sum8 - added_sum7;
	    double added_sum9=logic9.code(9000);
	    double D8=added_sum9 - added_sum8;
	    double added_sum10=logic10.code(10000);
	    System.out.println("sum of 10000 terms:" +added_sum10);
	    double D9=added_sum10 - added_sum9;
	    System.out.format("Difference b/w last consecutive sums is %.4f%n",D9);
	    
	   if(D1>D2 && D2>D3 && D3>D4 && D4<0.0001 && D5<0.0001 && D6<0.0001 && D7<0.0001 && D8<0.0001 && D9<0.0001)
	   {
		   System.out.println("**The series is  Likely Convergent**" );
		   
	   }	
	   else
		    {
		   System.out.println("**The series is Divergent**");
	   }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    
	    
	    
	    
	   
		
	}

}
