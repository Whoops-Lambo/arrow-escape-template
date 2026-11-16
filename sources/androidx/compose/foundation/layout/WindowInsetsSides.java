package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "Companion", "value", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowInsetsSides {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public static String a() {
        StringBuilder sb = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb2 = new StringBuilder();
        if (a == 0) {
            b(sb2, "Start");
        }
        if (c == 0) {
            b(sb2, "Left");
        }
        if (b == 0) {
            b(sb2, "End");
        }
        if (d == 0) {
            b(sb2, "Right");
        }
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof WindowInsetsSides;
    }

    public static final void b(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public final String toString() {
        return a();
    }
}
