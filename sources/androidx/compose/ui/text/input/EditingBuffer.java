package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.d;
import defpackage.jc1;
import defpackage.nj;
import defpackage.vq2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EditingBuffer {
    public final PartialGapBuffer a;
    public int b;
    public int c;
    public int d;
    public int e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "", "NOWHERE", "I", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final char b(int i) {
        PartialGapBuffer partialGapBuffer = this.a;
        GapBuffer gapBuffer = partialGapBuffer.b;
        if (gapBuffer == null) {
            return partialGapBuffer.a.charAt(i);
        }
        if (i < partialGapBuffer.c) {
            return partialGapBuffer.a.charAt(i);
        }
        int iA = gapBuffer.a - gapBuffer.a();
        int i2 = partialGapBuffer.c;
        if (i >= iA + i2) {
            return partialGapBuffer.a.charAt(i - ((iA - partialGapBuffer.d) + i2));
        }
        int i3 = i - i2;
        int i4 = gapBuffer.c;
        char[] cArr = gapBuffer.b;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + gapBuffer.d];
    }

    public final int c() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final boolean d() {
        return this.d != -1;
    }

    public final void f(int i, int i2) {
        PartialGapBuffer partialGapBuffer = this.a;
        if (i < 0 || i > partialGapBuffer.a()) {
            vq2.q(partialGapBuffer.a(), jc1.s(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > partialGapBuffer.a()) {
            vq2.q(partialGapBuffer.a(), jc1.s(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            d.r(nj.i(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void g(int i, int i2) {
        PartialGapBuffer partialGapBuffer = this.a;
        if (i < 0 || i > partialGapBuffer.a()) {
            vq2.q(partialGapBuffer.a(), jc1.s(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > partialGapBuffer.a()) {
            vq2.q(partialGapBuffer.a(), jc1.s(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            d.r(nj.i(i, i2, "Do not set reversed range: ", " > "));
        } else {
            this.b = i;
            this.c = i2;
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    public EditingBuffer(AnnotatedString annotatedString, long j) {
        String str = annotatedString.a;
        str.getClass();
        PartialGapBuffer partialGapBuffer = new PartialGapBuffer();
        partialGapBuffer.a = str;
        partialGapBuffer.c = -1;
        partialGapBuffer.d = -1;
        this.a = partialGapBuffer;
        this.b = TextRange.d(j);
        this.c = TextRange.c(j);
        this.d = -1;
        this.e = -1;
        int iD = TextRange.d(j);
        int iC = TextRange.c(j);
        if (iD >= 0 && iD <= str.length()) {
            if (iC >= 0 && iC <= str.length()) {
                if (iD <= iC) {
                    return;
                }
                d.r(nj.i(iD, iC, "Do not set reversed range: ", " > "));
                throw null;
            }
            vq2.q(str.length(), jc1.s(iC, "end (", ") offset is outside of text region "));
            throw null;
        }
        vq2.q(str.length(), jc1.s(iD, "start (", ") offset is outside of text region "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jA = TextRangeKt.a(i, i2);
        this.a.b(i, i2, "");
        long jA2 = EditingBufferKt.a(TextRangeKt.a(this.b, this.c), jA);
        this.b = TextRange.d(jA2);
        this.c = TextRange.c(jA2);
        if (d()) {
            long jA3 = EditingBufferKt.a(TextRangeKt.a(this.d, this.e), jA);
            if (TextRange.b(jA3)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = TextRange.d(jA3);
                this.e = TextRange.c(jA3);
            }
        }
    }

    public final void e(int i, int i2, String str) {
        str.getClass();
        PartialGapBuffer partialGapBuffer = this.a;
        if (i >= 0 && i <= partialGapBuffer.a()) {
            if (i2 >= 0 && i2 <= partialGapBuffer.a()) {
                if (i <= i2) {
                    partialGapBuffer.b(i, i2, str);
                    this.b = str.length() + i;
                    this.c = str.length() + i;
                    this.d = -1;
                    this.e = -1;
                    return;
                }
                d.r(nj.i(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            vq2.q(partialGapBuffer.a(), jc1.s(i2, "end (", ") offset is outside of text region "));
            return;
        }
        vq2.q(partialGapBuffer.a(), jc1.s(i, "start (", ") offset is outside of text region "));
    }
}
