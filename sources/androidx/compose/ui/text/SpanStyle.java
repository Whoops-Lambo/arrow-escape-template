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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.pv1;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SpanStyle {
    public final TextDrawStyle a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final FontStyle fontStyle;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final FontSynthesis fontSynthesis;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final FontFamily fontFamily;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final long letterSpacing;

    /* JADX INFO: renamed from: i, reason: from toString */
    public final BaselineShift baselineShift;

    /* JADX INFO: renamed from: j, reason: from toString */
    public final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: from toString */
    public final LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: from toString */
    public final long background;

    /* JADX INFO: renamed from: m, reason: from toString */
    public final TextDecoration textDecoration;

    /* JADX INFO: renamed from: n, reason: from toString */
    public final Shadow shadow;

    /* JADX INFO: renamed from: o, reason: from toString */
    public final PlatformSpanStyle platformStyle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return a(spanStyle) && s71.b(this.a, spanStyle.a) && s71.b(this.textDecoration, spanStyle.textDecoration) && s71.b(this.shadow, spanStyle.shadow);
    }

    public SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, int i) {
        this((i & 1) != 0 ? Color.i : j, (i & 2) != 0 ? TextUnit.c : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.c : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.i : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow);
    }

    public final SpanStyle b(SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        long j = spanStyle.letterSpacing;
        long j2 = spanStyle.b;
        TextDrawStyle textDrawStyleB = this.a.b(spanStyle.a);
        FontFamily fontFamily = spanStyle.fontFamily;
        if (fontFamily == null) {
            fontFamily = this.fontFamily;
        }
        FontFamily fontFamily2 = fontFamily;
        if (TextUnitKt.d(j2)) {
            j2 = this.b;
        }
        long j3 = j2;
        FontWeight fontWeight = spanStyle.fontWeight;
        if (fontWeight == null) {
            fontWeight = this.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = spanStyle.fontStyle;
        if (fontStyle == null) {
            fontStyle = this.fontStyle;
        }
        FontStyle fontStyle2 = fontStyle;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        if (fontSynthesis == null) {
            fontSynthesis = this.fontSynthesis;
        }
        FontSynthesis fontSynthesis2 = fontSynthesis;
        String str = spanStyle.fontFeatureSettings;
        if (str == null) {
            str = this.fontFeatureSettings;
        }
        String str2 = str;
        if (TextUnitKt.d(j)) {
            j = this.letterSpacing;
        }
        long j4 = j;
        BaselineShift baselineShift = spanStyle.baselineShift;
        if (baselineShift == null) {
            baselineShift = this.baselineShift;
        }
        BaselineShift baselineShift2 = baselineShift;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        if (textGeometricTransform == null) {
            textGeometricTransform = this.textGeometricTransform;
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.localeList;
        if (localeList == null) {
            localeList = this.localeList;
        }
        LocaleList localeList2 = localeList;
        long j5 = spanStyle.background;
        if (j5 == Color.i) {
            j5 = this.background;
        }
        long j6 = j5;
        TextDecoration textDecoration = spanStyle.textDecoration;
        if (textDecoration == null) {
            textDecoration = this.textDecoration;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.shadow;
        if (shadow == null) {
            shadow = this.shadow;
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        PlatformSpanStyle platformSpanStyle2 = this.platformStyle;
        return new SpanStyle(textDrawStyleB, j3, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j4, baselineShift2, textGeometricTransform2, localeList2, j6, textDecoration2, shadow2, platformSpanStyle2 == null ? platformSpanStyle : platformSpanStyle2);
    }

    public final int hashCode() {
        long a = this.a.getA();
        int i = Color.j;
        int iHashCode = Long.hashCode(a) * 961;
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        int iD = pv1.d(iHashCode, 31, this.b);
        FontWeight fontWeight = this.fontWeight;
        int i2 = (iD + (fontWeight != null ? fontWeight.a : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iHashCode2 = (i2 + (fontStyle != null ? Integer.hashCode(fontStyle.a) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iHashCode3 = (iHashCode2 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.a) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode4 = (iHashCode3 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iD2 = pv1.d((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31, this.letterSpacing);
        BaselineShift baselineShift = this.baselineShift;
        int iHashCode5 = (iD2 + (baselineShift != null ? Float.hashCode(baselineShift.a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode6 = (iHashCode5 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iD3 = pv1.d((iHashCode6 + (localeList != null ? localeList.a.hashCode() : 0)) * 31, 31, this.background);
        TextDecoration textDecoration = this.textDecoration;
        int i3 = (iD3 + (textDecoration != null ? textDecoration.a : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode7 = (i3 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return iHashCode7 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) Color.i(this.a.getA())) + ", brush=null, fontSize=" + ((Object) TextUnit.d(this.b)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.d(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.i(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ')';
    }

    public final boolean a(SpanStyle spanStyle) {
        spanStyle.getClass();
        if (this == spanStyle) {
            return true;
        }
        if (TextUnit.a(this.b, spanStyle.b) && s71.b(this.fontWeight, spanStyle.fontWeight) && s71.b(this.fontStyle, spanStyle.fontStyle) && s71.b(this.fontSynthesis, spanStyle.fontSynthesis) && s71.b(this.fontFamily, spanStyle.fontFamily) && s71.b(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.a(this.letterSpacing, spanStyle.letterSpacing) && s71.b(this.baselineShift, spanStyle.baselineShift) && s71.b(this.textGeometricTransform, spanStyle.textGeometricTransform) && s71.b(this.localeList, spanStyle.localeList) && Color.c(this.background, spanStyle.background) && s71.b(this.platformStyle, spanStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    public SpanStyle(TextDrawStyle textDrawStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this.a = textDrawStyle;
        this.b = j;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j3;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
    }

    public SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow) {
        this(TextDrawStyle.Companion.a(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null);
    }
}
