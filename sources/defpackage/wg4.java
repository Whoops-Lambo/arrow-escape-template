package defpackage;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfos;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wg4 implements zzfos {
    public final zzfjg a;
    public final zzfji b;
    public final zzm c;
    public final String d;
    public final Executor e;
    public final zzx f;
    public final zzfoi g;

    @Override // com.google.android.gms.internal.ads.zzfos
    public final Executor zza() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final zzfoi zzb() {
        return this.g;
    }

    public wg4(zzfjg zzfjgVar, zzfji zzfjiVar, zzm zzmVar, String str, Executor executor, zzx zzxVar, zzfoi zzfoiVar) {
        this.a = zzfjgVar;
        this.b = zzfjiVar;
        this.c = zzmVar;
        this.d = str;
        this.e = executor;
        this.f = zzxVar;
        this.g = zzfoiVar;
    }
}
