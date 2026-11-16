package defpackage;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ak0 implements ok1 {
    public final Object a;
    public Timeline b;

    @Override // defpackage.ok1
    public final Timeline getTimeline() {
        return this.b;
    }

    @Override // defpackage.ok1
    public final Object getUid() {
        return this.a;
    }

    public ak0(Object obj, Timeline timeline) {
        this.a = obj;
        this.b = timeline;
    }
}
