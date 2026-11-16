package defpackage;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mj2 {
    public TrackOutput b;
    public ExtractorOutput c;
    public es1 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final cs1 a = new cs1(0);
    public uf1 j = new uf1(27, false);

    public abstract long b(ParsableByteArray parsableByteArray);

    public abstract boolean c(ParsableByteArray parsableByteArray, long j, uf1 uf1Var);

    public void a(long j) {
        this.g = j;
    }

    public void d(boolean z) {
        if (z) {
            this.j = new uf1(27, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
