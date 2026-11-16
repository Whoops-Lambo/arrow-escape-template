package com.adsurge.adn.p008b0;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.adsurge.adn.D0.a;
import com.adsurge.adn.I0.d;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public final String a;
    public final Thread b;
    public final Throwable c;
    public final long d;
    public final long e;
    public final StackTraceElement[] f;
    public final String g;
    public File h;
    public final boolean i;
    public byte[] j;

    public final Pair a(String str) {
        int iIndexOf = str.indexOf(45);
        long j = 0;
        if (iIndexOf == -1) {
            return new Pair(null, 0L);
        }
        String strSubstring = str.substring(iIndexOf + 1);
        try {
            j = Long.parseLong(str.substring(0, iIndexOf));
        } catch (NumberFormatException unused) {
        }
        return new Pair(strSubstring, Long.valueOf(j));
    }

    public b(Thread thread, Throwable th) {
        boolean z;
        String strA = a.c().e().a();
        this.a = strA;
        long jCurrentTimeMillis = com.adsurge.adn.Z.a.a().currentTimeMillis();
        this.d = jCurrentTimeMillis;
        this.g = jCurrentTimeMillis + "-" + strA;
        this.e = jCurrentTimeMillis - com.adsurge.adn.Z.a.e();
        this.b = thread;
        this.c = th;
        this.f = th.getStackTrace();
        if (thread == Looper.getMainLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
    }

    public boolean a() {
        return (TextUtils.isEmpty(this.a) || this.d == 0) ? false : true;
    }

    public b(String str, File file) {
        this.g = str;
        Pair pairA = a(str);
        this.a = (String) pairA.first;
        this.d = ((Long) pairA.second).longValue();
        this.b = null;
        this.c = null;
        this.e = 0L;
        this.f = null;
        this.h = file;
        this.j = d.a(file);
        this.i = false;
    }

    public b(byte[] bArr) {
        this.j = bArr;
        this.g = "";
        this.a = "";
        this.d = 0L;
        this.e = 0L;
        this.b = null;
        this.c = null;
        this.f = null;
        this.h = null;
        this.i = false;
    }
}
