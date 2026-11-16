package androidx.compose.ui.text.style;

import androidx.compose.ui.text.ExperimentalTextApi;
import defpackage.e32;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Alignment", "Companion", "Trim", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LineHeightStyle {
    public static final LineHeightStyle b = new LineHeightStyle(Alignment.b);
    public final int a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @ExperimentalTextApi
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "Companion", "topPercentage", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Alignment {
        public static final int a;
        public static final int b;
        public static final int c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            a(0);
            a(50);
            a = 50;
            a(-1);
            b = -1;
            a(100);
            c = 100;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return b(0);
        }

        public static void a(int i) {
            if ((i < 0 || i >= 101) && i != -1) {
                e32.i("topRatio should be in [0..100] range or -1");
            }
        }

        public static String b(int i) {
            if (i == 0) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (i == a) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (i == b) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            return i == c ? "LineHeightStyle.Alignment.Bottom" : n30.k("LineHeightStyle.Alignment(topPercentage = ", i, ')');
        }

        public final boolean equals(Object obj) {
            return obj instanceof Alignment;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @ExperimentalTextApi
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Trim {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "", "FlagTrimBottom", "I", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final boolean equals(Object obj) {
            return obj instanceof Trim;
        }

        public final String toString() {
            return "LineHeightStyle.Trim.None";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        int i = ((LineHeightStyle) obj).a;
        int i2 = Alignment.a;
        return this.a == i;
    }

    public final int hashCode() {
        int i = Alignment.a;
        return Integer.hashCode(17) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.b(this.a)) + ", trim=" + ((Object) "LineHeightStyle.Trim.Both") + ')';
    }

    public LineHeightStyle(int i) {
        this.a = i;
    }
}
