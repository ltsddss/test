package com.lts.main;

import java.util.HashMap;
import java.util.Map;


//  笑死根本看不懂
class Solution {
    int INF = 0x3f3f3f3f;
    String b;
    int m;
    Map<String, Integer> map = new HashMap<>();
    public int findMinStep(String a, String _b) {
        b = _b;
        m = b.length();
        int ans = dfs(a, 1 << m);
        return ans == INF ? -1 : ans;
    }
    int dfs(String a, int cur) {
        if (a.length() == 0) {
            return 0;
        }
        if (map.containsKey(a)) {
            return map.get(a);
        }
        int ans = INF;
        int n = a.length();
        for (int i = 0; i < m; i++) {
            if (((cur >> i) & 1) == 1) {
                continue;
            }
            int next = (1 << i) | cur;
            for (int j = 0; j <= n; j++) {
                if (j > 0 && j < n - 1 && a.charAt(j) == a.charAt(j - 1)) {
                    continue;
                }
                if (j > 0 && j < n - 1 && a.charAt(j) != b.charAt(i)) {
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(a.substring(0, j)).append(b.substring(i, i + 1));
                if (j != n) {
                    sb.append(a.substring(j));
                }
                int k = j;
                while (0 <= k && k < sb.length()) {
                    char c = sb.charAt(k);
                    int l = k, r = k;
                    while (l >= 0 && sb.charAt(l) == c) {
                        l--;
                    }
                    while (r < sb.length() && sb.charAt(r) == c) {
                        r++;
                    }
                    if (r - l - 1 >= 3) {
                        sb.delete(l + 1, r);
                        k = l >= 0 ? l : r;
                    } else {
                        break;
                    }
                }
                ans = Math.min(ans, dfs(sb.toString(), next) + 1);
            }
        }
        map.put(a, ans);
        return ans;
    }
}
