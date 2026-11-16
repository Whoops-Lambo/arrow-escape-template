package androidx.compose.ui.text;

import defpackage.ak1;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextRangeKt {
    public static final long a(int i, int i2) {
        if (i < 0) {
            ak1.n(n30.k("start cannot be negative. [start: ", i, ']'));
            return 0L;
        }
        if (i2 < 0) {
            ak1.n(n30.k("end cannot negative. [end: ", i2, ']'));
            return 0L;
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = TextRange.c;
        return j;
    }
}
