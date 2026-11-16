package com.adsurge.adn.N0;

import android.text.TextUtils;
import defpackage.dr0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class e {
    public int a;
    public int b;
    public int c;
    public int d;

    public static int a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() == 4) {
            return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
        }
        return -1159790593;
    }

    public void b(com.adsurge.adn.O0.a aVar) throws IOException {
        int iAvailable = aVar.available();
        a(aVar);
        int iAvailable2 = iAvailable - aVar.available();
        int i = this.a;
        if (iAvailable2 <= i) {
            if (iAvailable2 < i) {
                aVar.skip(i - iAvailable2);
                return;
            }
            return;
        }
        dr0.h("Out of chunk area");
    }

    public void a(com.adsurge.adn.O0.a aVar) {
    }
}
