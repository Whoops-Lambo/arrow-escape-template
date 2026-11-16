package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Color;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/TextDrawStyle;", "", "Companion", "Unspecified", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface TextDrawStyle {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextDrawStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static TextDrawStyle a(long j) {
            return j != Color.i ? new ColorStyle(j) : Unspecified.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextDrawStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextDrawStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Unspecified implements TextDrawStyle {
        public static final Unspecified a = new Unspecified();

        @Override // androidx.compose.ui.text.style.TextDrawStyle
        /* JADX INFO: renamed from: a */
        public final long getA() {
            int i = Color.j;
            return Color.i;
        }
    }

    /* JADX INFO: renamed from: a */
    long getA();

    default TextDrawStyle c(sr0 sr0Var) {
        return !equals(Unspecified.a) ? this : (TextDrawStyle) sr0Var.invoke();
    }

    default TextDrawStyle b(TextDrawStyle textDrawStyle) {
        textDrawStyle.getClass();
        return textDrawStyle.c(new TextDrawStyle$merge$1(this));
    }
}
