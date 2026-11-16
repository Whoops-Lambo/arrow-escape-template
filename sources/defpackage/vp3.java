package defpackage;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzagr;
import com.google.android.gms.internal.measurement.zzlg;
import com.google.android.gms.internal.measurement.zzmg;
import com.google.android.gms.internal.measurement.zzmi;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zznh;
import com.google.android.gms.internal.measurement.zzni;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zzno;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.internal.measurement.zzqw;
import com.google.android.gms.internal.measurement.zzqx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vp3 implements gs0 {
    public static final /* synthetic */ vp3 b = new vp3(0);
    public static final /* synthetic */ vp3 c = new vp3(1);
    public static final /* synthetic */ vp3 d = new vp3(2);
    public static final /* synthetic */ vp3 e = new vp3(3);
    public final /* synthetic */ int a;

    public /* synthetic */ vp3(int i) {
        this.a = i;
    }

    @Override // defpackage.gs0
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                String strB = zzagr.b;
                if (strB == null) {
                    synchronized (zzagr.class) {
                        try {
                            strB = zzagr.b;
                            if (strB == null) {
                                strB = zzlg.b(context, "com.google.android.gms.measurement");
                                zzagr.b = strB;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strB;
            case 1:
                zzpe zzpeVar = zzpg.i;
                return "";
            case 2:
                zzmg zzmgVar = (zzmg) obj;
                zzqu zzquVarF = zzqv.F();
                if (zzmgVar == null) {
                    return (zzqv) zzquVarF.n();
                }
                for (zzmi zzmiVar : zzmgVar.D()) {
                    zzqw zzqwVarF = zzqx.F();
                    String strZ = zzmiVar.z();
                    zzqwVarF.l();
                    ((zzqx) zzqwVarF.b).H(strZ);
                    int iO = zzmiVar.O();
                    int i = iO - 1;
                    if (iO == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jA = zzmiVar.A();
                        zzqwVarF.l();
                        ((zzqx) zzqwVarF.b).I(jA);
                    } else if (i == 1) {
                        boolean zB = zzmiVar.B();
                        zzqwVarF.l();
                        ((zzqx) zzqwVarF.b).J(zB);
                    } else if (i == 2) {
                        double dC = zzmiVar.C();
                        zzqwVarF.l();
                        ((zzqx) zzqwVarF.b).K(dC);
                    } else if (i == 3) {
                        String strD = zzmiVar.D();
                        zzqwVarF.l();
                        ((zzqx) zzqwVarF.b).L(strD);
                    } else {
                        if (i != 4) {
                            e32.i("No known flag type");
                            return null;
                        }
                        zzacr zzacrVarE = zzmiVar.E();
                        zzqwVarF.l();
                        ((zzqx) zzqwVarF.b).M(zzacrVarE);
                    }
                    zzqx zzqxVar = (zzqx) zzqwVarF.n();
                    zzquVarF.l();
                    ((zzqv) zzquVarF.b).M(zzqxVar);
                }
                String strC = zzmgVar.C();
                zzquVarF.l();
                ((zzqv) zzquVarF.b).K(strC);
                String strZ2 = zzmgVar.z();
                zzquVarF.l();
                ((zzqv) zzquVarF.b).I(strZ2);
                long jE = zzmgVar.E();
                zzquVarF.l();
                ((zzqv) zzquVarF.b).L(jE);
                if (zzmgVar.A()) {
                    zzacr zzacrVarB = zzmgVar.B();
                    zzquVarF.l();
                    ((zzqv) zzquVarF.b).J(zzacrVarB);
                }
                return (zzqv) zzquVarF.n();
            default:
                zzmk zzmkVar = (zzmk) obj;
                if (zzmkVar.d() != 29514) {
                    throw zzmkVar;
                }
                zznn zznnVarC = zzno.C();
                zznh zznhVarN = zzni.N();
                long jCurrentTimeMillis = System.currentTimeMillis();
                zznhVarN.l();
                ((zzni) zznhVarN.b).P(jCurrentTimeMillis);
                zznnVarC.l();
                ((zzno) zznnVarC.b).D((zzni) zznhVarN.n());
                return (zzno) zznnVarC.n();
        }
    }
}
