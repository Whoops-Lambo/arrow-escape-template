package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextDrawStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextStyle {
    public static final TextStyle d = new TextStyle(0, 0, null, null, null, 0, null, null, 0, 262143);
    public final SpanStyle a;
    public final ParagraphStyle b;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final PlatformTextStyle platformStyle;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return s71.b(this.a, textStyle.a) && s71.b(this.b, textStyle.b) && s71.b(this.platformStyle, textStyle.platformStyle);
    }

    public TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i) {
        this(new SpanStyle(TextDrawStyle.Companion.a((i & 1) != 0 ? Color.i : j), (i & 2) != 0 ? TextUnit.c : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (FontSynthesis) null, (i & 32) != 0 ? null : fontFamily, (String) null, (i & 128) != 0 ? TextUnit.c : j3, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.i, (i & 4096) != 0 ? null : textDecoration, (Shadow) null, (PlatformSpanStyle) null), new ParagraphStyle((i & 16384) != 0 ? null : textAlign, null, (i & 65536) != 0 ? TextUnit.c : j4, null, null, null), null);
    }

    public static TextStyle a(TextStyle textStyle, long j, long j2, FontFamily fontFamily, TextAlign textAlign, int i) {
        long a = (i & 1) != 0 ? textStyle.a.a.getA() : j;
        long j3 = (i & 2) != 0 ? textStyle.a.b : j2;
        SpanStyle spanStyle = textStyle.a;
        FontWeight fontWeight = spanStyle.fontWeight;
        FontStyle fontStyle = spanStyle.fontStyle;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? spanStyle.fontFamily : fontFamily;
        String str = spanStyle.fontFeatureSettings;
        long j4 = spanStyle.letterSpacing;
        BaselineShift baselineShift = spanStyle.baselineShift;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        LocaleList localeList = spanStyle.localeList;
        long j5 = spanStyle.background;
        TextDecoration textDecoration = spanStyle.textDecoration;
        Shadow shadow = spanStyle.shadow;
        TextAlign textAlign2 = (i & 16384) != 0 ? textStyle.b.a : textAlign;
        ParagraphStyle paragraphStyle = textStyle.b;
        TextDirection textDirection = paragraphStyle.b;
        long j6 = paragraphStyle.c;
        TextIndent textIndent = paragraphStyle.d;
        SpanStyle spanStyle2 = new SpanStyle(Color.c(a, spanStyle.a.getA()) ? spanStyle.a : TextDrawStyle.Companion.a(a), j3, fontWeight, fontStyle, fontSynthesis, fontFamily2, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, spanStyle.platformStyle);
        ParagraphStyle paragraphStyle2 = textStyle.b;
        return new TextStyle(spanStyle2, new ParagraphStyle(textAlign2, textDirection, j6, textIndent, paragraphStyle2.e, paragraphStyle2.f), textStyle.platformStyle);
    }

    public final long b() {
        return this.a.a.getA();
    }

    public final TextStyle c(TextStyle textStyle) {
        return (textStyle == null || textStyle.equals(d)) ? this : new TextStyle(this.a.b(textStyle.a), this.b.a(textStyle.b));
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) Color.i(b()));
        sb.append(", brush=null, fontSize=");
        SpanStyle spanStyle = this.a;
        spanStyle.a.getClass();
        sb.append((Object) TextUnit.d(spanStyle.b));
        sb.append(", fontWeight=");
        sb.append(spanStyle.fontWeight);
        sb.append(", fontStyle=");
        sb.append(spanStyle.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(spanStyle.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(spanStyle.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(spanStyle.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.d(spanStyle.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(spanStyle.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(spanStyle.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(spanStyle.localeList);
        sb.append(", background=");
        sb.append((Object) Color.i(spanStyle.background));
        sb.append(", textDecoration=");
        sb.append(spanStyle.textDecoration);
        sb.append(", shadow=");
        sb.append(spanStyle.shadow);
        sb.append(", textAlign=");
        ParagraphStyle paragraphStyle = this.b;
        sb.append(paragraphStyle.a);
        sb.append(", textDirection=");
        sb.append(paragraphStyle.b);
        sb.append(", lineHeight=");
        sb.append((Object) TextUnit.d(paragraphStyle.c));
        sb.append(", textIndent=");
        sb.append(paragraphStyle.d);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append("lineHeightStyle=");
        sb.append(paragraphStyle.f);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        spanStyle.getClass();
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        PlatformParagraphStyle platformParagraphStyle = paragraphStyle.e;
        this(spanStyle, paragraphStyle, (platformSpanStyle == null && platformParagraphStyle == null) ? null : new PlatformTextStyle(platformSpanStyle, platformParagraphStyle));
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        spanStyle.getClass();
        this.a = spanStyle;
        this.b = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }
}
