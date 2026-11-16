package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wz1 {
    public final TrackGroupArray a;
    public final boolean[] b;
    public final boolean[] c;
    public final boolean[] d;

    public wz1(TrackGroupArray trackGroupArray, boolean[] zArr) {
        this.a = trackGroupArray;
        this.b = zArr;
        int i = trackGroupArray.length;
        this.c = new boolean[i];
        this.d = new boolean[i];
    }
}
