package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class pa0 {
    public final int a;
    public final TrackGroup b;
    public final int c;
    public final Format d;

    public abstract int a();

    public abstract boolean b(pa0 pa0Var);

    public pa0(TrackGroup trackGroup, int i, int i2) {
        this.a = i;
        this.b = trackGroup;
        this.c = i2;
        this.d = trackGroup.getFormat(i2);
    }
}
