package defpackage;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sk1 implements ok1 {
    public final MaskingMediaSource a;
    public int d;
    public boolean e;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    @Override // defpackage.ok1
    public final Timeline getTimeline() {
        return this.a.getTimeline();
    }

    @Override // defpackage.ok1
    public final Object getUid() {
        return this.b;
    }

    public sk1(MediaSource mediaSource, boolean z) {
        this.a = new MaskingMediaSource(mediaSource, z);
    }
}
