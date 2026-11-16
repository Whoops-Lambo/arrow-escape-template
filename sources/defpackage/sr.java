package defpackage;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class sr {
    public final TrackOutput a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public final SeekPoint a(int i) {
        return new SeekPoint((this.d / ((long) this.e)) * ((long) this.l[i]), this.k[i]);
    }

    public final SeekMap.SeekPoints b(long j) {
        int i = (int) (j / (this.d / ((long) this.e)));
        int iBinarySearchFloor = Util.binarySearchFloor(this.l, i, true, true);
        if (this.l[iBinarySearchFloor] == i) {
            return new SeekMap.SeekPoints(a(iBinarySearchFloor));
        }
        SeekPoint seekPointA = a(iBinarySearchFloor);
        int i2 = iBinarySearchFloor + 1;
        return i2 < this.k.length ? new SeekMap.SeekPoints(seekPointA, a(i2)) : new SeekMap.SeekPoints(seekPointA);
    }

    public sr(int i, int i2, long j, int i3, TrackOutput trackOutput) {
        int i4;
        int i5;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        Assertions.checkArgument(z);
        this.d = j;
        this.e = i3;
        this.a = trackOutput;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        int i6 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = i4 | i6;
        if (i2 == 2) {
            i5 = i6 | 1650720768;
        } else {
            i5 = -1;
        }
        this.c = i5;
        this.k = new long[512];
        this.l = new int[512];
    }
}
