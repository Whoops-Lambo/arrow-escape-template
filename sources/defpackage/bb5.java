package defpackage;

import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.zzvr;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwl;
import com.google.android.gms.internal.measurement.zzwq;
import com.google.android.gms.internal.measurement.zzws;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class bb5 extends na5 implements ma5 {
    public final Exception g;
    public final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public bb5(String str, ma5 ma5Var, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        super("<missing root>:".concat(str), (ia5) ma5Var, zzwl.a(zzwlVar, j.f), zzwqVar);
        this.g = ma5Var.zzf();
        this.h = z;
    }

    @Override // defpackage.ma5
    public final bb5 F(String str, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        boolean z2 = this.h;
        if (z && !z2) {
            AtomicReference atomicReference = zzvy.a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new bb5(str, this, zzwlVar, z3, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws e(String str, zzwl zzwlVar, zzwq zzwqVar) {
        AtomicReference atomicReference = zzvy.a;
        return F(str, zzwlVar, true, zzwqVar);
    }

    @Override // defpackage.ma5
    public final Exception zzf() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return j.e;
    }

    public bb5(UUID uuid, String str, String str2, zzwl zzwlVar, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>:".concat(str2), uuid, str, zzwl.a(zzwlVar, j.f), zzwqVar);
        this.g = zzvrVar;
        this.h = false;
    }
}
