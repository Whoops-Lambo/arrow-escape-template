package io.p071bidmachine.media3.common.util;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public static t b() {
        t tVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                tVar = arrayList.isEmpty() ? new t() : (t) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    public final void c(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void d(int i) {
        a.c(i != 0);
        this.a.removeMessages(i);
    }

    public final void e(int i) {
        this.a.sendEmptyMessage(i);
    }

    public u(Handler handler) {
        this.a = handler;
    }

    public final t a(int i, Object obj) {
        t tVarB = b();
        tVarB.a = this.a.obtainMessage(i, obj);
        return tVarB;
    }
}
