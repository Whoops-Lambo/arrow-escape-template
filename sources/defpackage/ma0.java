package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ma0 implements Comparable {
    public final boolean a;
    public final boolean b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ma0 ma0Var = (ma0) obj;
        return ev.a.d(this.b, ma0Var.b).d(this.a, ma0Var.a).f();
    }

    public ma0(Format format, int i) {
        this.a = (format.selectionFlags & 1) != 0;
        this.b = DefaultTrackSelector.isSupported(i, false);
    }
}
