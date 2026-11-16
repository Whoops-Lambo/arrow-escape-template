package defpackage;

import com.google.android.exoplayer2.Tracks;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class qk2 {
    public final Tracks.Group a;
    public final int b;
    public final String c;

    public qk2(Tracks tracks, int i, int i2, String str) {
        this.a = (Tracks.Group) tracks.getGroups().get(i);
        this.b = i2;
        this.c = str;
    }
}
