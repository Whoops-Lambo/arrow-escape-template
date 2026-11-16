package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends i {
    public static final String e = "f";
    public final e a;
    public final d b;
    public final g c;
    public final m d;

    @Override // com.vungle.ads.internal.task.i
    public final int a() {
        return this.a.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.d;
        if (mVar != null) {
            try {
                int iA = ((h) mVar).a(this.a);
                Process.setThreadPriority(iA);
                boolean z = u.a;
                String str = e;
                str.getClass();
                t.a(str, "Setting process thread prio = " + iA + " for " + this.a.d());
            } catch (Throwable unused) {
                boolean z2 = u.a;
                String str2 = e;
                str2.getClass();
                t.b(str2, "Error on setting process thread priority");
            }
        }
        try {
            String strD = this.a.d();
            Bundle bundleC = this.a.c();
            boolean z3 = u.a;
            String str3 = e;
            str3.getClass();
            t.a(str3, "Start job " + strD + "Thread " + Thread.currentThread().getName());
            int iA2 = ((o) this.b).a(strD).a(bundleC, this.c);
            t.a(str3, "On job finished " + strD + " with result " + iA2);
            if (iA2 == 2) {
                this.a.getClass();
            }
        } catch (Exception e2) {
            boolean z4 = u.a;
            String str4 = e;
            str4.getClass();
            t.b(str4, "Cannot create job" + e2.getLocalizedMessage());
        }
    }

    public f(e eVar, d dVar, g gVar, m mVar) {
        eVar.getClass();
        dVar.getClass();
        gVar.getClass();
        this.a = eVar;
        this.b = dVar;
        this.c = gVar;
        this.d = mVar;
    }
}
