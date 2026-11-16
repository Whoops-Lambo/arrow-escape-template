package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.จ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C0733 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List f1924;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int f1925;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m592() {
        String string;
        List<Integer> list = this.f1924;
        if (list.isEmpty()) {
            string = StringFog.decrypt("Z5yLdg==\n", "CfPlE52c5lY=\n");
        } else {
            TreeSet<Integer> treeSet = new TreeSet();
            for (Integer num : list) {
                if (num != null) {
                    treeSet.add(num);
                }
            }
            if (treeSet.isEmpty()) {
                string = StringFog.decrypt("UThk3w==\n", "P1cKulEUQ3E=\n");
            } else {
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (Integer num2 : treeSet) {
                    if (!z) {
                        sb.append(',');
                    }
                    sb.append(num2);
                    z = false;
                }
                string = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringFog.decrypt("69o7f+bAlaWn\n", "negADIWv58A=\n"));
        sb2.append(this.f1925);
        sb2.append(StringFog.decrypt("2Q==\n", "9mjvYuWdy9g=\n"));
        sb2.append(13);
        return AbstractC0529.m515("ElweZw5y6awT\n", "KS93AGAThd8=\n", sb2, string);
    }

    public C0733(C0754 c0754) {
        this.f1925 = c0754.f2000;
        Collections.unmodifiableList(new ArrayList(c0754.f1999));
        Collections.unmodifiableList(new ArrayList(c0754.f1998));
        Collections.unmodifiableMap(new HashMap(c0754.f1997));
        this.f1924 = Collections.unmodifiableList(new ArrayList(c0754.f1996));
        Collections.unmodifiableList(new ArrayList(c0754.f1995));
    }
}
