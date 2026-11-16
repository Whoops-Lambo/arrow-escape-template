package androidx.compose.ui.text;

import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PlatformTextStyle {
    public final PlatformSpanStyle a;
    public final PlatformParagraphStyle b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return s71.b(this.b, platformTextStyle.b) && s71.b(this.a, platformTextStyle.a);
    }

    public final int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.a;
        int iHashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.b;
        return iHashCode + (platformParagraphStyle != null ? Boolean.hashCode(platformParagraphStyle.a) : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.a = platformSpanStyle;
        this.b = platformParagraphStyle;
    }
}
