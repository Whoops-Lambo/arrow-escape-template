package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class EditingBufferKt {
    public static final long a(long j, long j2) {
        int iC;
        int iD;
        int iD2 = TextRange.d(j);
        int iC2 = TextRange.c(j);
        if (TextRange.d(j2) < TextRange.c(j) && TextRange.d(j) < TextRange.c(j2)) {
            if (TextRange.d(j2) <= TextRange.d(j) && TextRange.c(j) <= TextRange.c(j2)) {
                iD2 = TextRange.d(j2);
                iC2 = iD2;
            } else {
                if (TextRange.d(j) <= TextRange.d(j2) && TextRange.c(j2) <= TextRange.c(j)) {
                    iC = TextRange.c(j2);
                    iD = TextRange.d(j2);
                } else {
                    int iD3 = TextRange.d(j2);
                    if (iD2 < TextRange.c(j2) && iD3 <= iD2) {
                        iD2 = TextRange.d(j2);
                        iC = TextRange.c(j2);
                        iD = TextRange.d(j2);
                    } else {
                        iC2 = TextRange.d(j2);
                    }
                }
                iC2 -= iC - iD;
            }
        } else if (iC2 > TextRange.d(j2)) {
            iD2 -= TextRange.c(j2) - TextRange.d(j2);
            iC = TextRange.c(j2);
            iD = TextRange.d(j2);
            iC2 -= iC - iD;
        }
        return TextRangeKt.a(iD2, iC2);
    }
}
