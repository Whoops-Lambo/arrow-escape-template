package defpackage;

import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdu;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cd5 implements zzdu, zzdjz {
    public static final /* synthetic */ cd5 b = new cd5(0);
    public static final /* synthetic */ cd5 c = new cd5(1);
    public final /* synthetic */ int a;

    public /* synthetic */ cd5(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo82zza(Object obj) {
        switch (this.a) {
            case 0:
                ((dd5) obj).getClass();
                break;
            default:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
                break;
        }
    }
}
