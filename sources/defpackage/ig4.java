package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzefm;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzher;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ig4 implements zzfdv {
    public final zzher a;
    public final Context b;
    public final zzefm c;
    public final String d;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new hg4(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 38;
    }

    public ig4(zzher zzherVar, Context context, zzefm zzefmVar, String str) {
        this.a = zzherVar;
        this.b = context;
        this.c = zzefmVar;
        this.d = str;
    }
}
