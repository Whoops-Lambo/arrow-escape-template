package com.adsurge.adn.F1;

import com.adsurge.adn.I0.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    public String a;
    public String[] b;

    public String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("(");
            String[] strArr = this.b;
            if (strArr != null && strArr.length > 0) {
                sb.append(l.a(",", strArr));
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public c(String str, String... strArr) {
        this.a = str;
        this.b = strArr;
    }
}
