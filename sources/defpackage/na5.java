package defpackage;

import com.google.android.gms.internal.measurement.zzwl;
import com.google.android.gms.internal.measurement.zzwq;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class na5 extends ia5 {
    public final zzwl f;

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwl.a(this.f, zzl());
    }

    public na5(String str, ia5 ia5Var, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, ia5Var, zzwqVar);
        fs1.g(zzwlVar.c);
        this.f = zzwlVar;
    }

    public na5(String str, UUID uuid, String str2, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, uuid, str2, zzwqVar);
        fs1.g(zzwlVar.c);
        this.f = zzwlVar;
    }
}
