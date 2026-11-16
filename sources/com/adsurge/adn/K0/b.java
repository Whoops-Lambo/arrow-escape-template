package com.adsurge.adn.K0;

import android.util.Log;
import com.ironsource.C4664b4;
import defpackage.h50;
import defpackage.n30;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final AtomicLong a = new AtomicLong(0);

    public static void a(String str, String str2) {
        String strM = n30.m(str, str2);
        if (strM.length() < 3800) {
            Log.d("gdt_tag_zhc", strM);
            return;
        }
        long jIncrementAndGet = a.incrementAndGet();
        int length = (strM.length() / 3800) + 1;
        StringBuilder sbO = h50.o(jIncrementAndGet, C4664b4.j.d, "] msg length is ");
        sbO.append(strM.length());
        sbO.append(", split to ");
        sbO.append(length);
        sbO.append(" parts");
        Log.d("gdt_tag_zhc", sbO.toString());
        int i = 0;
        while (i < length) {
            StringBuilder sb = new StringBuilder(C4664b4.j.d);
            sb.append(jIncrementAndGet);
            sb.append("] part ");
            sb.append(i);
            sb.append(", ");
            int i2 = i * 3800;
            i++;
            sb.append(strM.substring(i2, Math.min(i * 3800, strM.length())));
            Log.d("gdt_tag_zhc", sb.toString());
        }
    }

    public static void a(String str, Throwable th) {
        Log.e("gdt_tag_zhc", str, th);
    }
}
