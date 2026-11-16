package defpackage;

import com.google.android.gms.internal.auth.zzfr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ii4 {
    public static final zzfr a(Object obj, Object obj2) {
        zzfr zzfrVarF = (zzfr) obj;
        zzfr zzfrVar = (zzfr) obj2;
        if (!zzfrVar.isEmpty()) {
            if (!zzfrVarF.a) {
                zzfrVarF = zzfrVarF.f();
            }
            zzfrVarF.j();
            if (!zzfrVar.isEmpty()) {
                zzfrVarF.putAll(zzfrVar);
            }
        }
        return zzfrVarF;
    }
}
