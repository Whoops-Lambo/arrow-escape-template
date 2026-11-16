package defpackage;

import com.google.android.gms.internal.ads.zzghg;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.ads.zzgri;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgvq;
import com.google.android.gms.internal.ads.zzhdy;
import com.google.android.gms.internal.ads.zzheh;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class an4 {
    public final zzgri a;
    public final zzgpm b;
    public final zzgqg c;
    public final zzgsw d;
    public final zzghg e;
    public final boolean f;
    public final long g;
    public final long h;

    public final zzhdy a() {
        zzhdy zzhdyVarS = zzhdy.s(this.c.zzb());
        qm4 qm4Var = qm4.c;
        fu4 fu4Var = fu4.a;
        ct4 ct4VarE = zzheh.e(zzhdyVarS, Throwable.class, qm4Var, fu4Var);
        zzgri zzgriVar = this.a;
        Objects.requireNonNull(zzgriVar);
        return zzheh.h(zzheh.i(ct4VarE, new wm4(zzgriVar, 11), fu4Var), new vm4(this, 0), fu4Var);
    }

    public final zzhdy b(final int i) {
        zzhdy zzhdyVarS = zzhdy.s(this.b.zza());
        wm4 wm4Var = new wm4(this, 0);
        fu4 fu4Var = fu4.a;
        ct4 ct4VarE = zzheh.e(zzheh.e(zzheh.e(zzheh.i(zzheh.h(zzheh.i(zzhdyVarS, wm4Var, fu4Var), new vm4(this, 1), fu4Var), qm4.d, fu4Var), tm4.class, xm4.b, fu4Var), um4.class, xm4.c, fu4Var), sm4.class, new zzgvq() { // from class: ym4
            @Override // com.google.android.gms.internal.ads.zzgvq
            public final /* synthetic */ Object apply(Object obj) {
                an4 an4Var = this.a;
                if (an4Var.f) {
                    int i2 = i;
                    if (i2 < an4Var.g) {
                        an4Var.e.a(an4Var.h * ((long) Math.pow(2.0d, i2)), new ei1(i2, 6, an4Var));
                    }
                }
                return zm4.f;
            }
        }, fu4Var);
        this.d.e(1002, ct4VarE);
        return ct4VarE;
    }

    public an4(zzgri zzgriVar, zzgpm zzgpmVar, zzgqg zzgqgVar, zzgsw zzgswVar, zzghg zzghgVar, boolean z, long j, long j2) {
        this.a = zzgriVar;
        this.b = zzgpmVar;
        this.c = zzgqgVar;
        this.d = zzgswVar;
        this.e = zzghgVar;
        this.f = z;
        this.g = j;
        this.h = j2;
    }
}
