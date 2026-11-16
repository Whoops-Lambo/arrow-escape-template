package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class r4 {
    public final MediaSource.MediaPeriodId a;
    public final ArrayList b = new ArrayList();
    public Uri c;
    public MediaSource d;
    public Timeline e;
    public final /* synthetic */ AdsMediaSource f;

    public r4(AdsMediaSource adsMediaSource, MediaSource.MediaPeriodId mediaPeriodId) {
        this.f = adsMediaSource;
        this.a = mediaPeriodId;
    }
}
