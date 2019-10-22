import java.util.Arrays;

public class rBSmain 
{
	static int zaehler=0;
	public static void main(String[] args) 
	{
		int[] amount=new int[100];
		for(int i=0;i<100;i++)
		{
			amount[i]=(int)(Math.random() * (amount.length-1-i));
		}
		Arrays.sort(amount);
        int key = 6;
        int pos = binaer(amount,key,0,amount.length);
        for(int o=0;o<100;o++)
          {
          	System.out.println(amount[o]);
          }
        if(pos==-1) {System.out.println("Die gesuchte Zahl is nicht im Array(menge) enthalten!");}
        else {System.out.println("Position: "+pos);}
        System.out.println("Suchschritte: "+zaehler);
	}
	
	public static int binaer(int[] menge, int key, int begin, int end)
	{
        int half = (begin+end) / 2;
        if (begin>end) {
            return -1;
       
        } 
         else if ( menge[half] == key) 
         {
        	zaehler+=1;
            return half;
        }
        else if ( menge[half] > key)
        {
        	zaehler+=1;
            return binaer (menge, key, begin, half-1 );
        }
        else
        {
        zaehler+=1;
        return binaer(menge, key, half+1, end);
        }
    }

}
