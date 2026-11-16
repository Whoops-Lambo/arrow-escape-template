package com.adsurge.adn.p036k1;

import android.os.SystemClock;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.p006a1.a;
import com.adsurge.adn.w1.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m {
    public static void a(a aVar, String str, boolean z, boolean z2) {
        e eVar = new e(1190105);
        c cVar = new c();
        cVar.a(aVar);
        cVar.f(str);
        eVar.a(cVar);
        eVar.d(z ? 2 : 1);
        eVar.e(z2 ? 2 : 1);
        b.a(eVar);
    }

    public static void a(a aVar, int i) {
        e eVar = new e(1190007);
        c cVar = new c();
        cVar.a(aVar);
        eVar.a(cVar);
        eVar.d(3);
        eVar.e(i);
        b.a(eVar);
    }

    public static void a(c cVar, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            b.a(6001100, cVar);
        } else if (iIntValue == 2 || iIntValue == 3) {
            b.b(6001102, cVar, num);
        }
    }

    public static void a(c cVar, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            b.c(6001101, cVar, num2);
        } else if (iIntValue == 2 || iIntValue == 3) {
            b.b(6001103, cVar, num, num2);
        }
    }

    public static void a(c cVar, boolean z, long j) {
        b.a(z ? 6001106 : 6001105, cVar, Integer.valueOf((int) (SystemClock.elapsedRealtime() - j)));
    }

    public static void a(Integer num) {
        b.c(6001104, null, num);
    }
}
