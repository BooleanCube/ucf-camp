import java.io.*;
import java.util.*;

public class ksums {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			long[] pre = new long[n+1]; pre[0] = 0;
			st = new StringTokenizer(bf.readLine());
			for(int i=1; i<=n; i++) pre[i] = pre[i-1]+Long.parseLong(st.nextToken());
			ArrayList<window> windows = new ArrayList<>();
			for(int i=1; i<=n-k+1; i++) {
				long sum = pre[i+k-1]-pre[i-1];
				windows.add(new window(i, sum));
			}
			windows.sort((a,b) -> Long.compare(b.sum, a.sum));
			StringBuilder sb = new StringBuilder();
			for(window w : windows) sb.append(w.label).append(" ");
			System.out.println(sb.toString().trim());
		}
	}
}

class window {
	public int label = -1;
	public long sum = -1;
	public window(int l, long s) {
		label = l;
		sum = s;
	}
}