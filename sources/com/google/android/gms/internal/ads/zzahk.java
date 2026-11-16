package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahk implements zzahr {
    public final zzei a;
    public final zzei b;
    public final long c;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        zzei zzeiVar = this.b;
        int i = zzeiVar.a;
        if (i == 0) {
            zzahs zzahsVar = zzahs.c;
            return new zzahp(zzahsVar, zzahsVar);
        }
        String str = zzfq.a;
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i4 <= i2) {
            int i5 = (i4 + i2) >>> 1;
            if (zzeiVar.c(i5) < j) {
                i4 = i5 + 1;
            } else {
                i2 = i5 - 1;
            }
        }
        int i6 = i2 + 1;
        if (i6 < zzeiVar.a && zzeiVar.c(i6) == j) {
            i3 = i6;
        } else if (i2 != -1) {
            i3 = i2;
        }
        long jC = zzeiVar.c(i3);
        zzei zzeiVar2 = this.a;
        zzahs zzahsVar2 = new zzahs(jC, zzeiVar2.c(i3));
        if (jC == j || i3 == zzeiVar.a - 1) {
            return new zzahp(zzahsVar2, zzahsVar2);
        }
        int i7 = i3 + 1;
        return new zzahp(zzahsVar2, new zzahs(zzeiVar.c(i7), zzeiVar2.c(i7)));
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return this.b.a > 0;
    }

    public zzahk(long[] jArr, long[] jArr2, long j) {
        boolean z;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        if (length2 > 0 && jArr2[0] > 0) {
            int i = length2 + 1;
            zzei zzeiVar = new zzei(i);
            this.a = zzeiVar;
            zzei zzeiVar2 = new zzei(i);
            this.b = zzeiVar2;
            zzeiVar.a();
            zzeiVar2.a();
        } else {
            this.a = new zzei(length2);
            this.b = new zzei(length2);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }
}
