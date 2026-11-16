package defpackage;

import com.google.android.gms.internal.measurement.zzabt;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzo;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fd5 implements zzzo {
    public final /* synthetic */ int a;

    private final void b(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
    }

    @Override // com.google.android.gms.internal.measurement.zzzo
    public final void a(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (!zzylVar.c) {
                    e32.i("non repeating key");
                } else if (zzylVar.d && ((zzabt) zzabt.b.get()).a > 20) {
                    while (it.hasNext()) {
                        zzzcVar.a(it.next(), zzylVar.a);
                    }
                } else {
                    zzylVar.a(it, zzzcVar);
                }
                break;
        }
    }
}
