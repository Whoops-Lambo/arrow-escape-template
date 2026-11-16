package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzfzx;
import com.google.android.gms.internal.ads.zzgag;
import com.google.android.gms.internal.ads.zzgav;
import com.google.android.gms.internal.ads.zzgbm;
import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgij;
import com.google.android.gms.internal.ads.zzgik;
import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgog;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.ads.zzgsu;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgvq;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhdy;
import com.google.android.gms.internal.ads.zzheh;
import com.google.android.gms.internal.ads.zzifx;
import com.google.android.gms.internal.ads.zzigm;
import com.google.android.gms.internal.ads.zzihu;
import com.google.android.gms.internal.ads.zzioz;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class qn4 implements zzgpm {
    public final Context a;
    public final zzioz b;
    public final zzgqg c;
    public final zzgsw d;
    public final ExecutorService e;
    public final zzgog f;
    public final zzfzx g;

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final ListenableFuture zza() {
        zzioz zziozVar = this.b;
        Objects.requireNonNull(zziozVar);
        hg4 hg4Var = new hg4(zziozVar, 8);
        ExecutorService executorService = this.e;
        zzhdy zzhdyVarS = zzhdy.s(zzheh.c(executorService, hg4Var));
        final int i = 0;
        zzgvq zzgvqVar = new zzgvq(this) { // from class: pn4
            public final /* synthetic */ qn4 b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgvq
            public final Object apply(Object obj) {
                int i2 = i;
                boolean zA = false;
                qn4 qn4Var = this.b;
                switch (i2) {
                    case 0:
                        zzbet zzbetVar = (zzbet) obj;
                        if (zzgav.a(zzbetVar)) {
                            return new Integer(0);
                        }
                        qn4Var.d.c(15204, zzbetVar.name());
                        throw new on4(null);
                    default:
                        zzgil zzgilVar = (zzgil) obj;
                        zzioz zziozVar2 = qn4Var.b;
                        String strE = zzgilVar.E().E();
                        String strF = zzgilVar.E().F();
                        zzgsw zzgswVar = qn4Var.d;
                        zzgsu zzgsuVarA = zzgswVar.a(15203);
                        try {
                            zzgsuVarA.a();
                            zzgbm zzgbmVarA = zzgag.a(qn4Var.a, (zzbet) zziozVar2.zzb(), strE, strF, qn4Var.g);
                            int i3 = zzgbmVarA.c;
                            zzgsuVarA.c();
                            int i4 = 2;
                            if (i3 == 2) {
                                zzgswVar.b(15208);
                                return qn4.a(4);
                            }
                            byte[] bArr = zzgbmVarA.b;
                            if (bArr == null || bArr.length == 0) {
                                zzgswVar.b(IronSourceConstants.errorCode_destroy);
                                return qn4.a(8);
                            }
                            try {
                                zzbev zzbevVarI = zzbev.I(bArr, zzigm.a());
                                if (zzbevVarI.E().E().isEmpty() || zzbevVarI.E().F().isEmpty() || zzbevVarI.G().d().length == 0) {
                                    zzgswVar.b(15207);
                                } else {
                                    if (zzgilVar.equals(zzgil.L()) || !TextUtils.equals(zzgilVar.E().E(), zzbevVarI.E().E()) || !TextUtils.equals(zzgilVar.E().F(), zzbevVarI.E().F())) {
                                        if (i3 == 4) {
                                            zzgog zzgogVar = qn4Var.f;
                                            byte[] bArrD = zzbevVarI.F().d();
                                            File file = zzgogVar.a;
                                            try {
                                                zzhcd.b(file);
                                                zzhcd.a(file, bArrD);
                                                zA = zzgogVar.b.a(file);
                                            } catch (IOException | GeneralSecurityException e) {
                                                zzgogVar.c.d(2027, e);
                                            }
                                            try {
                                                file.delete();
                                                break;
                                            } catch (SecurityException unused) {
                                            }
                                            if (!zA) {
                                                zzgswVar.b(15206);
                                                return qn4.a(12);
                                            }
                                            i3 = 4;
                                            break;
                                        }
                                        zzgii zzgiiVarH = zzgij.H();
                                        if (i3 == 2) {
                                            i4 = 4;
                                        } else if (i3 != 3) {
                                            i4 = i3 != 4 ? i3 != 6 ? 1 : 5 : 3;
                                        }
                                        zzgiiVarH.o(i4);
                                        zzgik zzgikVarK = zzgil.K();
                                        zzbfc zzbfcVarE = zzbevVarI.E();
                                        zzgikVarK.l();
                                        ((zzgil) zzgikVarK.b).M(zzbfcVarE);
                                        zzbet zzbetVar2 = (zzbet) zziozVar2.zzb();
                                        zzgikVarK.l();
                                        ((zzgil) zzgikVarK.b).O(zzbetVar2);
                                        zzgil zzgilVar2 = (zzgil) zzgikVarK.m();
                                        zzgiiVarH.l();
                                        ((zzgij) zzgiiVarH.b).I(zzgilVar2);
                                        zzifx zzifxVarF = zzbevVarI.F();
                                        zzgiiVarH.l();
                                        ((zzgij) zzgiiVarH.b).K(zzifxVarF);
                                        zzifx zzifxVarG = zzbevVarI.G();
                                        zzgiiVarH.l();
                                        ((zzgij) zzgiiVarH.b).J(zzifxVarG);
                                        return (zzgij) zzgiiVarH.m();
                                    }
                                    zzgswVar.b(15209);
                                }
                                return qn4.a(11);
                            } catch (zzihu e2) {
                                zzgswVar.d(15205, e2);
                                return qn4.a(9);
                            } catch (NullPointerException unused2) {
                                zzgswVar.b(15210);
                                return qn4.a(10);
                            }
                        } catch (Throwable th) {
                            try {
                                zzgsuVarA.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                zzgsuVarA.c();
                                throw th2;
                            }
                        }
                }
            }
        };
        fu4 fu4Var = fu4.a;
        final int i2 = 1;
        ct4 ct4VarE = zzheh.e(zzheh.i(zzheh.h(zzheh.i(zzhdyVarS, zzgvqVar, fu4Var), new a04(this, 16), fu4Var), new zzgvq(this) { // from class: pn4
            public final /* synthetic */ qn4 b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgvq
            public final Object apply(Object obj) {
                int i3 = i2;
                boolean zA = false;
                qn4 qn4Var = this.b;
                switch (i3) {
                    case 0:
                        zzbet zzbetVar = (zzbet) obj;
                        if (zzgav.a(zzbetVar)) {
                            return new Integer(0);
                        }
                        qn4Var.d.c(15204, zzbetVar.name());
                        throw new on4(null);
                    default:
                        zzgil zzgilVar = (zzgil) obj;
                        zzioz zziozVar2 = qn4Var.b;
                        String strE = zzgilVar.E().E();
                        String strF = zzgilVar.E().F();
                        zzgsw zzgswVar = qn4Var.d;
                        zzgsu zzgsuVarA = zzgswVar.a(15203);
                        try {
                            zzgsuVarA.a();
                            zzgbm zzgbmVarA = zzgag.a(qn4Var.a, (zzbet) zziozVar2.zzb(), strE, strF, qn4Var.g);
                            int i4 = zzgbmVarA.c;
                            zzgsuVarA.c();
                            int i5 = 2;
                            if (i4 == 2) {
                                zzgswVar.b(15208);
                                return qn4.a(4);
                            }
                            byte[] bArr = zzgbmVarA.b;
                            if (bArr == null || bArr.length == 0) {
                                zzgswVar.b(IronSourceConstants.errorCode_destroy);
                                return qn4.a(8);
                            }
                            try {
                                zzbev zzbevVarI = zzbev.I(bArr, zzigm.a());
                                if (zzbevVarI.E().E().isEmpty() || zzbevVarI.E().F().isEmpty() || zzbevVarI.G().d().length == 0) {
                                    zzgswVar.b(15207);
                                } else {
                                    if (zzgilVar.equals(zzgil.L()) || !TextUtils.equals(zzgilVar.E().E(), zzbevVarI.E().E()) || !TextUtils.equals(zzgilVar.E().F(), zzbevVarI.E().F())) {
                                        if (i4 == 4) {
                                            zzgog zzgogVar = qn4Var.f;
                                            byte[] bArrD = zzbevVarI.F().d();
                                            File file = zzgogVar.a;
                                            try {
                                                zzhcd.b(file);
                                                zzhcd.a(file, bArrD);
                                                zA = zzgogVar.b.a(file);
                                            } catch (IOException | GeneralSecurityException e) {
                                                zzgogVar.c.d(2027, e);
                                            }
                                            try {
                                                file.delete();
                                                break;
                                            } catch (SecurityException unused) {
                                            }
                                            if (!zA) {
                                                zzgswVar.b(15206);
                                                return qn4.a(12);
                                            }
                                            i4 = 4;
                                            break;
                                        }
                                        zzgii zzgiiVarH = zzgij.H();
                                        if (i4 == 2) {
                                            i5 = 4;
                                        } else if (i4 != 3) {
                                            i5 = i4 != 4 ? i4 != 6 ? 1 : 5 : 3;
                                        }
                                        zzgiiVarH.o(i5);
                                        zzgik zzgikVarK = zzgil.K();
                                        zzbfc zzbfcVarE = zzbevVarI.E();
                                        zzgikVarK.l();
                                        ((zzgil) zzgikVarK.b).M(zzbfcVarE);
                                        zzbet zzbetVar2 = (zzbet) zziozVar2.zzb();
                                        zzgikVarK.l();
                                        ((zzgil) zzgikVarK.b).O(zzbetVar2);
                                        zzgil zzgilVar2 = (zzgil) zzgikVarK.m();
                                        zzgiiVarH.l();
                                        ((zzgij) zzgiiVarH.b).I(zzgilVar2);
                                        zzifx zzifxVarF = zzbevVarI.F();
                                        zzgiiVarH.l();
                                        ((zzgij) zzgiiVarH.b).K(zzifxVarF);
                                        zzifx zzifxVarG = zzbevVarI.G();
                                        zzgiiVarH.l();
                                        ((zzgij) zzgiiVarH.b).J(zzifxVarG);
                                        return (zzgij) zzgiiVarH.m();
                                    }
                                    zzgswVar.b(15209);
                                }
                                return qn4.a(11);
                            } catch (zzihu e2) {
                                zzgswVar.d(15205, e2);
                                return qn4.a(9);
                            } catch (NullPointerException unused2) {
                                zzgswVar.b(15210);
                                return qn4.a(10);
                            }
                        } catch (Throwable th) {
                            try {
                                zzgsuVarA.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                zzgsuVarA.c();
                                throw th2;
                            }
                        }
                }
            }
        }, executorService), on4.class, xm4.d, fu4Var);
        this.d.e(15202, ct4VarE);
        return ct4VarE;
    }

    public qn4(Context context, zzioz zziozVar, zzgqg zzgqgVar, zzgsw zzgswVar, ExecutorService executorService, zzgog zzgogVar, zzfzx zzfzxVar) {
        this.a = context;
        this.b = zziozVar;
        this.c = zzgqgVar;
        this.d = zzgswVar;
        this.e = executorService;
        this.f = zzgogVar;
        this.g = zzfzxVar;
    }

    public static zzgij a(int i) {
        zzgii zzgiiVarH = zzgij.H();
        zzgiiVarH.o(i);
        return (zzgij) zzgiiVarH.m();
    }
}
