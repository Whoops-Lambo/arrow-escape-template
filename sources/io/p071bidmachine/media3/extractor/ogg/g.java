package io.p071bidmachine.media3.extractor.ogg;

import com.google.android.gms.internal.ads.zzey;
import defpackage.cs1;
import defpackage.ei3;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.exoplayer.offline.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {
    public long a;
    public long b;
    public long c;
    public int d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;
    public final Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public abstract long b(q qVar);

    public abstract boolean c(q qVar, long j, b bVar);

    public abstract long f(zzey zzeyVar);

    public abstract boolean g(zzey zzeyVar, long j, ei3 ei3Var);

    public void a(long j) {
        this.c = j;
    }

    public void d(boolean z) {
        if (z) {
            this.m = new b(6);
            this.b = 0L;
            this.d = 0;
        } else {
            this.d = 1;
        }
        this.a = -1L;
        this.c = 0L;
    }

    public void e(boolean z) {
        int i;
        if (z) {
            this.m = new ei3(9);
            this.b = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.d = i;
        this.a = -1L;
        this.c = 0L;
    }

    public void h(long j) {
        this.c = j;
    }

    public g(int i) {
        switch (i) {
            case 1:
                this.i = new cs1(2);
                this.m = new ei3(9);
                break;
            default:
                this.i = new cs1(1);
                this.m = new b(6);
                break;
        }
    }
}
