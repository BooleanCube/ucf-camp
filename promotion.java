import java.io.*;
import java.util.*;

public class promotion {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int[] pre = new int[n+1]; pre[0] = 0;
			st = new StringTokenizer(bf.readLine());
			for(int i=1; i<=n; i++) pre[i] = pre[i-1] + Integer.parseInt(st.nextToken());
			for(int i=0; i<g; i++) {
				st = new StringTokenizer(bf.readLine());
				int w = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken());
				int count = 0;
				for(int j=0; j<n-w; j++) {
					int avg = (pre[j+w]-pre[j])/w;
					//System.out.println(j + " " + (j+w) + " " + avg + " " + a);
					if(avg >= a) count++;
				}
				System.out.println(count);
			}
		}
	}
}
