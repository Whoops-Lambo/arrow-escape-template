package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class GapBufferKt {
    public static final void a(String str, char[] cArr, int i, int i2, int i3) {
        for (int i4 = i2; i4 < i3; i4++) {
            cArr[(i + i4) - i2] = str.charAt(i4);
        }
    }
}
