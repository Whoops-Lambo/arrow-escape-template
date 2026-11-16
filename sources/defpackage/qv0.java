package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qv0 {
    public final TrackOutput a;
    public final boolean b;
    public final boolean c;
    public final ParsableNalUnitBitArray f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public pv0 m = new pv0();
    public pv0 n = new pv0();
    public boolean k = false;
    public boolean o = false;

    public qv0(TrackOutput trackOutput, boolean z, boolean z2) {
        this.a = trackOutput;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new ParsableNalUnitBitArray(bArr, 0, 0);
        pv0 pv0Var = this.n;
        pv0Var.b = false;
        pv0Var.a = false;
    }
}
