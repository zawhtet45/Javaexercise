import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
public class MyPprogram {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			System.out.println("imput number");
			a[i]  = stdIn.nextInt();
		}

		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		System.out.println("めん屋" + "\n" + "桔梗" + ' ' +"新宿区店" + "\n");

		System.out.println("東京都" + ' ' + ' ' + "新宿区" +"\n" + "西新宿" + ' ' + "7-6-8"
				+ ' ' + "ANJ01F" + "\n");

		//"hh" in pattern is for 12 hour time format and "aa" is for AM/PM
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
		//Setting the time zone
		dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(dateTimeInGMT.format(new Date()) + "\n");
		
		


		for(int i = 0; i < n; i++)

		System.out.println("部門01" + ' ' + ' ' + ' ' + ' ' + ' ' + ' ' + "\\" + a[i]);

		System.out.println("内税対象計" + ' ' + ' '+ "\\" + sum);
		System.out.println("内税" + ' ' + ' ' + "8.0%" + ' ' + ' '+ "\\" + sum /8);
		System.out.println("会  計" + ' ' +' ' +' '+' ' +' '+' '  + "\\" + sum);

		int num = stdIn.nextInt();

		System.out.println("お預り" + ' ' + ' ' + ' ' + ' ' + ' ' + ' ' +"\\" + num);

		int res = 0;

		System.out.print("お  釣" + ' ' + ' ' + ' ' + ' ' + ' ' + ' ' + "\\");
		System.out.println(num - sum + res);

	}
}

