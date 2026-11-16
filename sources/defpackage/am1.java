package defpackage;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class am1 implements MediaSource.MediaSourceCaller {
    public final zl1 a = new zl1(this);
    public final DefaultAllocator b = new DefaultAllocator(true, 65536);
    public boolean c;
    public final /* synthetic */ bm1 d;

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        if (this.c) {
            return;
        }
        this.c = true;
        MediaPeriod mediaPeriodCreatePeriod = mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.b, 0L);
        this.d.c = mediaPeriodCreatePeriod;
        mediaPeriodCreatePeriod.prepare(this.a, 0L);
    }

    public am1(bm1 bm1Var) {
        this.d = bm1Var;
    }
}
