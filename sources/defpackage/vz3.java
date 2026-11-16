package defpackage;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzdmj;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vz3 implements zzaa {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zza c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ Map e;

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if (this.a) {
            return;
        }
        zza zzaVar = this.c;
        if (z && this.b) {
            ((zzdmj) zzaVar).W();
        }
        this.a = true;
        String str = (String) this.e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.d;
        map.put(str, boolValueOf);
        ((zzbtq) zzaVar).m("openIntentAsync", map);
    }

    public vz3(zzbrg zzbrgVar, boolean z, zza zzaVar, HashMap map, Map map2) {
        this.b = z;
        this.c = zzaVar;
        this.d = map;
        this.e = map2;
        Objects.requireNonNull(zzbrgVar);
        this.a = false;
    }
}
