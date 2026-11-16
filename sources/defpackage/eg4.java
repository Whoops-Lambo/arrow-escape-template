package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfdt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class eg4 implements zzfdt {
    public final boolean a;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.a) {
            bundle.putBoolean("sdk_prefetch", true);
        }
    }
}
