
public class kind {

	public static void main(String[] args)
	{
	

		geometry kind1=new geometry();
		geometry kind2=new geometry();
		geometry kind3=new geometry();
		geometry kind4=new geometry();
		geometry kind5=new geometry();
		geometry kind6=new geometry();
		geometry kind7=new geometry();
		geometry kind8=new geometry();
		geometry kind9=new geometry();
		geometry kind10=new geometry();
	
	double final_sum1=kind1.trick(1000);
	double final_sum2=kind2.trick(2000);
	double S1 =final_sum2 - final_sum1;
	double final_sum3=kind3.trick(3000);
	double S2 =final_sum3 - final_sum2;
	double final_sum4=kind4.trick(4000);
	double S3 =final_sum4 - final_sum3;
	double final_sum5=kind5.trick(5000);
	double S4 =final_sum5 - final_sum4;
	double final_sum6=kind6.trick(6000);
	double S5 =final_sum6 - final_sum5;
	double final_sum7=kind7.trick(7000);
	double S6 =final_sum7 - final_sum6;
	double final_sum8=kind8.trick(8000);
	double S7 =final_sum8 - final_sum7;
	double final_sum9=kind9.trick(9000);
	double S8 =final_sum9 - final_sum8;
	double final_sum10=kind10.trick(10000);
	System.out.println("Sum of 1000 terms:" +final_sum10);
	double S9 =final_sum10 - final_sum9;
	System.out.format("9th consecutive difference:%.4f%n",S9);
	
	double Final_sum;
	Final_sum=4*final_sum10;
	System.out.format("Value of Final sum when multiplied by 4 is:%.4f%n", Final_sum);
	
	
	if(S2<S1 && S2<0.0001 && S3<0.0001 && S4<0.0001 && S5<0.0001 && S6<0.0001 && S7<0.0001 && S8<0.0001 && S9<0.0001)
	   {
		   System.out.println("**The series is Likely Convergent**" );
		   
	   }	else
	   {
		   System.out.println("**The series is Divergent**");
	
	 }
}

}
