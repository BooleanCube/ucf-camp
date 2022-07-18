#include <bits/stdc++.h>
using namespace std;

int main() {
	int t; cin >> t;
	while(t--) {
		int n; cin >> n;
		vector<pair<long double,long double>> coins(n);
		for(int i=0; i<n; i++) {
			pair<long double,long double> p;
			long double f,s; cin >> f >> s;
			p.first=f;
			p.second=s;
			coins[i]=p;
		}
		sort(coins.begin(), coins.end());
		long double s = 0;
		long double px=0, py=0;
		for(int i=0; i<n; i++) {
			long double x=coins[i].first;
			long double y=coins[i].second;
			s += sqrt(pow(x-px,2) + pow(y-py,2));
			px=x; py=y;
		}
		cout << setprecision(20) << s << "\n";
	}
}
