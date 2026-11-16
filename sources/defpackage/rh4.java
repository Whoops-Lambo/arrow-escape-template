package defpackage;

import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.measurement.zzlk;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rh4 implements ThreadFactory {
    public static final /* synthetic */ rh4 b = new rh4(1);
    public final /* synthetic */ int a;

    public /* synthetic */ rh4(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                String str = zzfq.a;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            default:
                Object obj = zzlk.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
