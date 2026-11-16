package com.inmobi.media;

import android.content.Context;
import defpackage.h50;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Z9 implements Y9 {
    public C3997ej a;
    public final Yl b;

    public final void a(boolean z) {
        C3997ej c3997ej = this.a;
        if (c3997ej != null) {
            c3997ej.b(z);
        }
        if (z) {
            return;
        }
        C3997ej c3997ej2 = this.a;
        if (c3997ej2 == null || !c3997ej2.f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mc.a;
            Lc.a(this.a);
            this.a = null;
        }
    }

    public Z9(Context context, double d, Ac ac, boolean z, int i, long j) {
        context.getClass();
        ac.getClass();
        this.b = new Yl();
        if (!z) {
            C3997ej c3997ej = new C3997ej(context, d, ac, j, i);
            this.a = c3997ej;
            CopyOnWriteArrayList copyOnWriteArrayList = Mc.a;
            Lc.b(c3997ej);
        }
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        C3997ej c3997ej = this.a;
        if (c3997ej != null) {
            c3997ej.a(Ac.ERROR, str, str2);
        }
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        C3997ej c3997ej = this.a;
        if (c3997ej != null) {
            c3997ej.a(Ac.INFO, str, str2);
        }
    }

    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        C3997ej c3997ej = this.a;
        if (c3997ej != null) {
            c3997ej.a(Ac.STATE, str, str2);
        }
    }

    public final void a(String str, String str2, Exception exc) {
        str.getClass();
        str2.getClass();
        exc.getClass();
        C3997ej c3997ej = this.a;
        if (c3997ej != null) {
            c3997ej.a(Ac.ERROR, str, h50.i(str2, "\nError: ", defpackage.l7.D(exc)));
        }
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        C3997ej c3997ej = this.a;
        if (c3997ej != null) {
            c3997ej.a(Ac.DEBUG, str, str2);
        }
    }

    public final void a() {
        C3997ej c3997ej = this.a;
        if (c3997ej != null) {
            c3997ej.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Mc.a;
        Lc.a(this.a);
    }
}
