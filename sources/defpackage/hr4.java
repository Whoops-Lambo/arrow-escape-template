package defpackage;

import com.google.android.gms.internal.ads.zzgwa;
import com.google.android.gms.internal.ads.zzgwz;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class hr4 extends zzgwz {
    public final /* synthetic */ Iterator c;
    public final /* synthetic */ zzgwa d;

    public hr4(Iterator it, zzgwa zzgwaVar) {
        this.c = it;
        this.d = zzgwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final Object a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.b = 3;
                return null;
            }
            next = it.next();
        } while (!this.d.zza(next));
        return next;
    }
}
