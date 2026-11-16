package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzgrr;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzheh;
import com.google.android.gms.internal.ads.zzher;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jo4 implements zzgrr, zzghy {
    public final Context a;
    public final zzgsw b;
    public final zzgfx c;
    public final zzher d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public ListenableFuture f = zzheh.a("E");

    public final void d(HashMap map) {
        synchronized (this) {
            map.put("ai", this.f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final ListenableFuture zza() {
        if (this.e.getAndSet(true)) {
            return nu4.b;
        }
        return this.d.submit(new hg4(this, 9));
    }

    public jo4(Context context, zzgsw zzgswVar, zzgfx zzgfxVar, zzher zzherVar) {
        this.a = context;
        this.b = zzgswVar;
        this.c = zzgfxVar;
        this.d = zzherVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void a(HashMap map) {
        d(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void b(HashMap map) {
        d(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void c(HashMap map, Context context, View view) {
        d(map);
    }
}
