import java.io.*;
import java.util.*;

public class party {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(bf.readLine());
			long[] cats = new long[n];
			long[] dogs = new long[n];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0; i<n; i++) cats[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(bf.readLine());
			for(int i=0; i<n; i++) dogs[i] = Integer.parseInt(st.nextToken());
			int counter = 0;
			for(int i=0; i<n; i++) {
				int d=0, c=0;
				for(int j=i; j<n; j++) {
					d += dogs[j];
					c += cats[j];
					if(d==c) counter++;
				}
			}
			System.out.println(counter);
		}
	}
}
