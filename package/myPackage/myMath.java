package myPackage;
import java.util.*;
public class myMath{

	final static double PI = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;

	static Map<Long,Long> f = new HashMap<>();

	//Calculate x**y
	public static double pow(double x, long y){
		double ans = 1;
		for(long i = 0;i<y;i++) ans *= x;
		return ans;

	}

	//Calculate n!

	public static long fact(long n){
		if(f.containsKey(n)) return f.get(n);
		if(n==1 || n==0) return 1;
		else{
			long ans = n*fact(n-1);
			f.put(n,ans);
			return ans;
		}
	}

	//convert x degrees to radians

	public static double degTorad(double x){
		return (x*PI)/180;
	}

	//Calculate cos(x) upto n terms where x is in degrees
	public static double cos(double x, long n){
		double ans = 0;
		x = degTorad(x);

		for(long i = 0;i<n;i++){
			double cal = pow(-1,i)*pow(x,(2*(i)));
			cal = cal/(double)(fact(2*(i)));
			ans += cal;
		}
		return ans;


	}




}
