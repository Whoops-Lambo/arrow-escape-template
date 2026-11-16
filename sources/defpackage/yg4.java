package defpackage;

import com.google.android.gms.internal.auth.zzez;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yg4 extends ch4 {
    @Override // defpackage.ch4
    public final void a(long j, Object obj) {
        ((zzez) jv4.d(obj, j)).zzb();
    }

    @Override // defpackage.ch4
    public final void b(long j, Object obj, Object obj2) {
        zzez zzezVarZzd = (zzez) jv4.d(obj, j);
        zzez zzezVar = (zzez) jv4.d(obj2, j);
        int size = zzezVarZzd.size();
        int size2 = zzezVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVarZzd.zzc()) {
                zzezVarZzd = zzezVarZzd.zzd(size2 + size);
            }
            zzezVarZzd.addAll(zzezVar);
        }
        if (size > 0) {
            zzezVar = zzezVarZzd;
        }
        jv4.j(j, obj, zzezVar);
    }
}
