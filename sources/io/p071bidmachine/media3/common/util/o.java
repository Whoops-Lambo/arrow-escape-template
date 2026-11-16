package io.p071bidmachine.media3.common.util;

import android.content.Context;
import com.facebook.internal.v;
import io.p071bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.g;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {
    public static o f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public static synchronized o a(Context context) {
        try {
            if (f == null) {
                f = new o(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.b;
        for (n nVar : copyOnWriteArrayList) {
            if (nVar.a.get() == null) {
                copyOnWriteArrayList.remove(nVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (n nVar2 : this.b) {
                    nVar2.b.execute(new v(nVar2, 17));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o(Context context) {
        Executor executorP = a.p();
        this.a = executorP;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorP.execute(new g(14, this, context));
    }
}
