package defpackage;

import android.os.Build;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzwp;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eb5 implements hb5, zzdjz {
    public static final /* synthetic */ eb5 a = new eb5();
    public static final /* synthetic */ eb5 b = new eb5();

    @Override // defpackage.hb5
    public /* synthetic */ int zza(Object obj) {
        HashMap map = zzwp.a;
        String str = ((zzvy) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
    }
}
