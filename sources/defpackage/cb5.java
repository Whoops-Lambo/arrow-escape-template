package defpackage;

import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzwh;
import com.google.android.gms.internal.ads.zzwp;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cb5 implements zzwh, zzdjz {
    public static final /* synthetic */ cb5 a = new cb5();
    public static final /* synthetic */ cb5 b = new cb5();

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public /* synthetic */ List a(String str, boolean z, boolean z2) {
        return zzwp.a(str, z, z2);
    }
}
