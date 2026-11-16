package androidx.compose.ui.text.input;

import androidx.compose.ui.text.InternalTextApi;
import defpackage.n8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@InternalTextApi
public final class PartialGapBuffer {
    public String a;
    public GapBuffer b;
    public int c;
    public int d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final int a() {
        GapBuffer gapBuffer = this.b;
        String str = this.a;
        if (gapBuffer == null) {
            return str.length();
        }
        return (gapBuffer.a - gapBuffer.a()) + (str.length() - (this.d - this.c));
    }

    public final String toString() {
        GapBuffer gapBuffer = this.b;
        String str = this.a;
        if (gapBuffer == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.c);
        sb.append(gapBuffer.b, 0, gapBuffer.c);
        char[] cArr = gapBuffer.b;
        int i = gapBuffer.d;
        sb.append(cArr, i, gapBuffer.a - i);
        String str2 = this.a;
        sb.append((CharSequence) str2, this.d, str2.length());
        return sb.toString();
    }

    public final void b(int i, int i2, String str) {
        str.getClass();
        GapBuffer gapBuffer = this.b;
        if (gapBuffer == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            int i3 = i - iMin;
            GapBufferKt.a(this.a, cArr, 0, i3, i);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            GapBufferKt.a(this.a, cArr, i4, i2, i5);
            GapBufferKt.a(str, cArr, iMin, 0, str.length());
            int length = str.length() + iMin;
            GapBuffer gapBuffer2 = new GapBuffer();
            gapBuffer2.a = iMax;
            gapBuffer2.b = cArr;
            gapBuffer2.c = length;
            gapBuffer2.d = i4;
            this.b = gapBuffer2;
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= gapBuffer.a - gapBuffer.a()) {
            int length2 = str.length() - (i8 - i7);
            if (length2 > gapBuffer.a()) {
                int iA = length2 - gapBuffer.a();
                int i9 = gapBuffer.a;
                do {
                    i9 *= 2;
                } while (i9 - gapBuffer.a < iA);
                char[] cArr2 = new char[i9];
                n8.R(gapBuffer.b, cArr2, 0, 0, gapBuffer.c);
                int i10 = gapBuffer.a;
                int i11 = gapBuffer.d;
                int i12 = i10 - i11;
                int i13 = i9 - i12;
                n8.R(gapBuffer.b, cArr2, i13, i11, i12 + i11);
                gapBuffer.b = cArr2;
                gapBuffer.a = i9;
                gapBuffer.d = i13;
            }
            int i14 = gapBuffer.c;
            if (i7 < i14 && i8 <= i14) {
                int i15 = i14 - i8;
                char[] cArr3 = gapBuffer.b;
                n8.R(cArr3, cArr3, gapBuffer.d - i15, i8, i14);
                gapBuffer.c = i7;
                gapBuffer.d -= i15;
            } else if (i7 < i14 && i8 >= i14) {
                gapBuffer.d = i8 + gapBuffer.a();
                gapBuffer.c = i7;
            } else {
                int iA2 = i7 + gapBuffer.a();
                int iA3 = i8 + gapBuffer.a();
                int i16 = gapBuffer.d;
                char[] cArr4 = gapBuffer.b;
                n8.R(cArr4, cArr4, gapBuffer.c, i16, iA2);
                gapBuffer.c += iA2 - i16;
                gapBuffer.d = iA3;
            }
            GapBufferKt.a(str, gapBuffer.b, gapBuffer.c, 0, str.length());
            gapBuffer.c = str.length() + gapBuffer.c;
            return;
        }
        this.a = toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        b(i, i2, str);
    }
}
