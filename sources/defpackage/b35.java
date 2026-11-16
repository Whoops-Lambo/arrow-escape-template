package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzut;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzxt;
import com.google.android.gms.internal.ads.zzye;
import io.p071bidmachine.media3.exoplayer.t0;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b35 implements zzye, zzut {
    public final e35 a;
    public final /* synthetic */ t0 b;

    public final Pair a(zzxt zzxtVar) {
        zzxt zzxtVarA;
        e35 e35Var = this.a;
        zzxt zzxtVar2 = null;
        if (zzxtVar != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = e35Var.c;
                if (i >= arrayList.size()) {
                    zzxtVarA = null;
                    break;
                }
                if (((zzxt) arrayList.get(i)).d == zzxtVar.d) {
                    Object obj = zzxtVar.a;
                    Object obj2 = e35Var.b;
                    int i2 = w35.k;
                    zzxtVarA = zzxtVar.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (zzxtVarA == null) {
                return null;
            }
            zzxtVar2 = zzxtVarA;
        }
        return Pair.create(Integer.valueOf(e35Var.d), zzxtVar2);
    }

    public b35(t0 t0Var, e35 e35Var) {
        this.b = t0Var;
        this.a = e35Var;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void b(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar) {
        Pair pairA = a(zzxtVar);
        if (pairA != null) {
            ((zzea) this.b.k).k(new a35(this, pairA, zzxkVar, zzxpVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void d(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar) {
        Pair pairA = a(zzxtVar);
        if (pairA != null) {
            ((zzea) this.b.k).k(new a35(this, pairA, zzxkVar, zzxpVar, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void g(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar, int i2) {
        Pair pairA = a(zzxtVar);
        if (pairA != null) {
            ((zzea) this.b.k).k(new y15(this, pairA, zzxkVar, zzxpVar, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void h(int i, zzxt zzxtVar, zzxp zzxpVar) {
        Pair pairA = a(zzxtVar);
        if (pairA != null) {
            ((zzea) this.b.k).k(new kw0(this, pairA, zzxpVar, false, 28));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void l(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar, IOException iOException, boolean z) {
        Pair pairA = a(zzxtVar);
        if (pairA != null) {
            ((zzea) this.b.k).k(new jl4(this, pairA, zzxkVar, zzxpVar, iOException, z));
        }
    }
}
