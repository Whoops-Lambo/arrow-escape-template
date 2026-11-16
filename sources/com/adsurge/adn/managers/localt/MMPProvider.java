package com.adsurge.adn.managers.localt;

import android.util.Pair;
import com.adsurge.adn.M.c;
import com.adsurge.adn.N.b;
import com.adsurge.adn.X.q;
import defpackage.og1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MMPProvider {
    public static final int a;
    public static final long b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        void onResult(c cVar);
    }

    public abstract Pair a();

    public abstract c a(String str);

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(int i, Callback callback) {
        Pair pairA;
        try {
            pairA = a();
        } catch (Exception unused) {
            c();
            pairA = null;
        }
        if (pairA != null && pairA.second != null) {
            c();
            callback.onResult(c.a(b(), ((Integer) pairA.second).intValue()));
            return;
        }
        String str = pairA != null ? (String) pairA.first : null;
        if (str != null && !str.isEmpty()) {
            c();
            callback.onResult(a(str));
            return;
        }
        int i2 = i + 1;
        if (i2 >= a) {
            c();
            callback.onResult(c.a(b(), 3));
        } else {
            c();
            q.f.schedule(new og1(this, i2, callback, 1), 2000L, TimeUnit.MILLISECONDS);
        }
    }

    public abstract int b();

    public abstract String c();

    static {
        int iA = b.a("odcmmpn", 5);
        a = iA;
        b = ((long) iA) * 2000;
    }

    public final /* synthetic */ void c(int i, Callback callback) {
        q.b.execute(new og1(this, i, callback, 0));
    }

    public final void a(Callback callback) {
        if (a <= 0) {
            c();
            callback.onResult(c.a(b(), 3));
        } else {
            b(0, callback);
        }
    }
}
