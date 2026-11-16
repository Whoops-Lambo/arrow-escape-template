package defpackage;

import android.media.MediaParser$InputReader;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ws1 implements DataReader {
    public MediaParser$InputReader a;

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        return hk1.k(Util.castNonNull(this.a)).read(bArr, i, i2);
    }
}
