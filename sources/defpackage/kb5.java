package defpackage;

import com.google.android.gms.internal.ads.zzus;
import com.google.android.gms.internal.ads.zzut;
import com.google.android.gms.internal.ads.zzxa;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzxt;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzye;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kb5 implements zzye, zzut {
    public final Object a;
    public zzyd b;
    public zzus c;
    public final /* synthetic */ zzxa d;

    public final boolean a(zzxt zzxtVar) {
        zzxt zzxtVarT;
        Object obj = this.a;
        zzxa zzxaVar = this.d;
        if (zzxtVar != null) {
            zzxtVarT = zzxaVar.t(obj, zzxtVar);
            if (zzxtVarT == null) {
                return false;
            }
        } else {
            zzxtVarT = null;
        }
        zzxaVar.s(obj);
        zzyd zzydVar = this.b;
        zzydVar.getClass();
        if (!Objects.equals(zzydVar.a, zzxtVarT)) {
            this.b = new zzyd(zzxaVar.c.b, zzxtVarT);
        }
        zzus zzusVar = this.c;
        zzusVar.getClass();
        if (Objects.equals(zzusVar.a, zzxtVarT)) {
            return true;
        }
        this.c = new zzus(zzxaVar.d.b, zzxtVarT);
        return true;
    }

    public final void e(zzxp zzxpVar, zzxt zzxtVar) {
        long j = zzxpVar.c;
        zzxa zzxaVar = this.d;
        Object obj = this.a;
        zzxaVar.u(j, obj);
        zzxaVar.u(zzxpVar.d, obj);
    }

    public kb5(zzxa zzxaVar, Object obj) {
        this.d = zzxaVar;
        this.b = new zzyd(zzxaVar.c.b, null);
        this.c = new zzus(zzxaVar.d.b, null);
        this.a = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void b(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar) {
        if (a(zzxtVar)) {
            zzyd zzydVar = this.b;
            e(zzxpVar, zzxtVar);
            zzydVar.getClass();
            zzydVar.a(new yb5(zzydVar, zzxkVar, zzxpVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void d(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar) {
        if (a(zzxtVar)) {
            zzyd zzydVar = this.b;
            e(zzxpVar, zzxtVar);
            zzydVar.getClass();
            zzydVar.a(new yb5(zzydVar, zzxkVar, zzxpVar, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void g(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar, int i2) {
        if (a(zzxtVar)) {
            zzyd zzydVar = this.b;
            e(zzxpVar, zzxtVar);
            zzydVar.getClass();
            zzydVar.a(new hf2(zzydVar, zzxkVar, zzxpVar, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void h(int i, zzxt zzxtVar, zzxp zzxpVar) {
        if (a(zzxtVar)) {
            zzyd zzydVar = this.b;
            e(zzxpVar, zzxtVar);
            zzydVar.getClass();
            zzydVar.a(new v35(9, zzydVar, zzxpVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void l(int i, zzxt zzxtVar, zzxk zzxkVar, zzxp zzxpVar, IOException iOException, boolean z) {
        if (a(zzxtVar)) {
            zzyd zzydVar = this.b;
            e(zzxpVar, zzxtVar);
            zzydVar.getClass();
            zzydVar.a(new xw1(zzydVar, zzxkVar, zzxpVar, iOException, z));
        }
    }
}
