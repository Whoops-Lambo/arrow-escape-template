package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcfm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p14 extends zzcfm {
    public final /* synthetic */ QueryInfoGenerationCallback a;

    public p14(zzcaw zzcawVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.a = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void q0(String str, Bundle bundle, String str2) {
        this.a.onSuccess(new QueryInfo(new zzex(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zza(String str) {
        this.a.onFailure(str);
    }
}
