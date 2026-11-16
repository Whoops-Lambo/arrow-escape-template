package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "Companion", "packedValue", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextRange {
    public static final long b = TextRangeKt.a(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final boolean b(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int c(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return i > i2 ? i : i2;
    }

    public static final int d(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return i > i2 ? i2 : i;
    }

    public static final boolean e(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String f(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return h50.l(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextRange) {
            return this.a == ((TextRange) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }

    public /* synthetic */ TextRange(long j) {
        this.a = j;
    }
}
