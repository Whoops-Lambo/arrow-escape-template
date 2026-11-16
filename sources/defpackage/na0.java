package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.gms.internal.ads.zzacx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class na0 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public na0(zzacx zzacxVar, Runnable runnable) {
        this.b = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DefaultTrackSelector) obj).maybeInvalidateForAudioChannelCountConstraints();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DefaultTrackSelector) obj).maybeInvalidateForAudioChannelCountConstraints();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public na0(DefaultTrackSelector defaultTrackSelector) {
        this.b = defaultTrackSelector;
    }
}
