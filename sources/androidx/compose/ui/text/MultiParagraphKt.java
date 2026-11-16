package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MultiParagraphKt {
    public static final int a(int i, List list) {
        byte b;
        list.getClass();
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            if (paragraphInfo.b > i) {
                b = 1;
            } else if (paragraphInfo.c <= i) {
                b = -1;
            } else {
                b = 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else if (b > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int b(int i, List list) {
        byte b;
        list.getClass();
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            if (paragraphInfo.d > i) {
                b = 1;
            } else if (paragraphInfo.e <= i) {
                b = -1;
            } else {
                b = 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else if (b > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int c(ArrayList arrayList, float f) {
        byte b;
        arrayList.getClass();
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2);
            if (paragraphInfo.f > f) {
                b = 1;
            } else if (paragraphInfo.g <= f) {
                b = -1;
            } else {
                b = 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else if (b > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
