package defpackage;

import com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v02 {
    public final ElementaryStreamReader a;
    public final TimestampAdjuster b;
    public final ParsableBitArray c = new ParsableBitArray(new byte[64]);
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;

    public v02(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
        this.a = elementaryStreamReader;
        this.b = timestampAdjuster;
    }
}
