package io.p071bidmachine.media3.datasource;

import android.os.SystemClock;
import defpackage.y32;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.upstream.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements h {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public k d;

    public final void e() {
        for (int i = 0; i < this.c; i++) {
            ((e) this.b.get(i)).getClass();
        }
    }

    public final void c(int i) {
        k kVar = this.d;
        int i2 = x.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            e eVar = (e) this.b.get(i3);
            boolean z = this.a;
            synchronized (eVar) {
                y32 y32Var = e.p;
                if (z && (kVar.h & 8) != 8) {
                    eVar.i += (long) i;
                }
            }
        }
    }

    public final void d() {
        k kVar = this.d;
        int i = x.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            e eVar = (e) this.b.get(i2);
            boolean z = this.a;
            synchronized (eVar) {
                try {
                    y32 y32Var = e.p;
                    if (z && (kVar.h & 8) != 8) {
                        a.i(eVar.g > 0);
                        eVar.d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - eVar.h);
                        eVar.j += (long) i3;
                        long j = eVar.k;
                        long j2 = eVar.i;
                        eVar.k = j + j2;
                        if (i3 > 0) {
                            eVar.f.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                            if (eVar.j >= 2000 || eVar.k >= 524288) {
                                eVar.l = (long) eVar.f.b();
                            }
                            eVar.b(i3, eVar.i, eVar.l);
                            eVar.h = jElapsedRealtime;
                            eVar.i = 0L;
                        }
                        eVar.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void f(k kVar) {
        this.d = kVar;
        for (int i = 0; i < this.c; i++) {
            e eVar = (e) this.b.get(i);
            boolean z = this.a;
            synchronized (eVar) {
                try {
                    y32 y32Var = e.p;
                    if (z && (kVar.h & 8) != 8) {
                        if (eVar.g == 0) {
                            eVar.d.getClass();
                            eVar.h = SystemClock.elapsedRealtime();
                        }
                        eVar.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public c(boolean z) {
        this.a = z;
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final void b(e eVar) {
        eVar.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(eVar)) {
            arrayList.add(eVar);
            this.c++;
        }
    }
}
