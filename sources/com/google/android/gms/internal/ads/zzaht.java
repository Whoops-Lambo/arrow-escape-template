package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaht implements zzago {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public zzagr f;
    public zzaia g;

    @Override // com.google.android.gms.internal.ads.zzago
    public final boolean b(zzagp zzagpVar) {
        int i = this.b;
        int i2 = this.a;
        zzgvz.f((i2 == -1 || i == -1) ? false : true);
        zzey zzeyVar = new zzey(i);
        ((zzagf) zzagpVar).d(zzeyVar.a, 0, i, false);
        return zzeyVar.L() == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void a(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final int c(zzagp zzagpVar, zzaho zzahoVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            io.p071bidmachine.media3.extractor.ts.y.b();
            return 0;
        }
        zzaia zzaiaVar = this.g;
        zzaiaVar.getClass();
        int iD = zzaiaVar.d(zzagpVar, 1024, true);
        if (iD != -1) {
            this.d += iD;
            return 0;
        }
        this.e = 2;
        this.g.e(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void d(zzagr zzagrVar) {
        this.f = zzagrVar;
        zzaia zzaiaVarB = zzagrVar.b(1024, 4);
        this.g = zzaiaVarB;
        zzt zztVar = new zzt();
        String str = this.c;
        zztVar.d(str);
        zztVar.e(str);
        zzaiaVarB.f(new zzv(zztVar));
        this.f.zzw();
        this.f.j(new zzahu());
        this.e = 1;
    }

    public zzaht(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }
}
