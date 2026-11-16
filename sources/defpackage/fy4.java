package defpackage;

import com.google.android.gms.internal.ads.zzifx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fy4 extends gy4 {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzifx c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzifs
    public final byte zza() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.k(i);
        }
        d.v();
        return (byte) 0;
    }

    public fy4(zzifx zzifxVar) {
        this.c = zzifxVar;
        this.b = zzifxVar.n();
    }
}
