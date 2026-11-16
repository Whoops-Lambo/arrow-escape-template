package androidx.compose.ui.text;

import android.text.Layout;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.platform.AndroidParagraph;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import com.unity3d.services.UnityAdsConstants;
import defpackage.du;
import defpackage.e32;
import defpackage.eu;
import defpackage.gd1;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import java.text.BreakIterator;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextLayoutResult {
    public final TextLayoutInput a;
    public final MultiParagraph b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public final ResolvedTextDirection a(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.b(i);
        int length = multiParagraph.a.a.a.length();
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? eu.o(arrayList) : MultiParagraphKt.a(i, arrayList));
        return paragraphInfo.a.b(paragraphInfo.a(i));
    }

    public final Rect b(int i) {
        MultiParagraph multiParagraph = this.b;
        ArrayList arrayList = multiParagraph.h;
        AnnotatedString annotatedString = multiParagraph.a.a;
        if (i < 0 || i >= annotatedString.a.length()) {
            e32.j(jc1.s(i, "offset(", ") is out of bounds [0, "), annotatedString.a.length(), 41);
            return null;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        int iA = paragraphInfo.a(i);
        TextLayout textLayout = androidParagraph.d;
        float fD = TextLayout.d(textLayout, iA);
        float fD2 = TextLayout.d(textLayout, iA + 1);
        int lineForOffset = textLayout.b.getLineForOffset(iA);
        return new Rect(fD, textLayout.c(lineForOffset), fD2, textLayout.b(lineForOffset)).g(OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paragraphInfo.f));
    }

    public final Rect c(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.b(i);
        int length = multiParagraph.a.a.a.length();
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? eu.o(arrayList) : MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        int iA = paragraphInfo.a(i);
        CharSequence charSequence = androidParagraph.a.g;
        TextLayout textLayout = androidParagraph.d;
        if (iA < 0 || iA > charSequence.length()) {
            StringBuilder sbS = jc1.s(iA, "offset(", ") is out of bounds (0,");
            sbS.append(charSequence.length());
            throw new AssertionError(sbS.toString());
        }
        float fD = TextLayout.d(textLayout, iA);
        int lineForOffset = textLayout.b.getLineForOffset(iA);
        return new Rect(fD, textLayout.c(lineForOffset), fD, textLayout.b(lineForOffset)).g(OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paragraphInfo.f));
    }

    public final float d(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.c(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        return androidParagraph.d.b(i - paragraphInfo.d) + paragraphInfo.f;
    }

    public final int e(int i, boolean z) {
        int lineEnd;
        MultiParagraph multiParagraph = this.b;
        multiParagraph.c(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        int i2 = i - paragraphInfo.d;
        TextLayout textLayout = androidParagraph.d;
        if (z) {
            Layout layout = textLayout.b;
            if (layout.getEllipsisStart(i2) == 0) {
                lineEnd = layout.getLineVisibleEnd(i2);
            } else {
                lineEnd = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            Layout layout2 = textLayout.b;
            lineEnd = layout2.getEllipsisStart(i2) == 0 ? layout2.getLineEnd(i2) : layout2.getText().length();
        }
        return lineEnd + paragraphInfo.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextLayoutResult) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
            if (this.a.equals(textLayoutResult.a) && this.b == textLayoutResult.b && IntSize.a(this.c, textLayoutResult.c) && this.d == textLayoutResult.d && this.e == textLayoutResult.e && s71.b(this.f, textLayoutResult.f)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.b(i);
        int length = multiParagraph.a.a.a.length();
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? eu.o(arrayList) : MultiParagraphKt.a(i, arrayList));
        return paragraphInfo.a.d.b.getLineForOffset(paragraphInfo.a(i)) + paragraphInfo.d;
    }

    public final int g(float f) {
        int iO;
        MultiParagraph multiParagraph = this.b;
        ArrayList arrayList = multiParagraph.h;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            iO = 0;
        } else {
            iO = f >= multiParagraph.e ? eu.o(arrayList) : MultiParagraphKt.c(arrayList, f);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(iO);
        int i = paragraphInfo.c;
        int i2 = paragraphInfo.b;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        AndroidParagraph androidParagraph = paragraphInfo.a;
        float f2 = f - paragraphInfo.f;
        TextLayout textLayout = androidParagraph.d;
        return textLayout.b.getLineForVertical(textLayout.d + ((int) f2)) + paragraphInfo.d;
    }

    public final int h(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.c(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        return androidParagraph.d.b.getLineStart(i - paragraphInfo.d) + paragraphInfo.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + n30.b(this.e, n30.b(this.d, pv1.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final float i(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.c(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        return androidParagraph.d.c(i - paragraphInfo.d) + paragraphInfo.f;
    }

    public final int j(long j) {
        int iO;
        MultiParagraph multiParagraph = this.b;
        ArrayList arrayList = multiParagraph.h;
        if (Offset.d(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            iO = 0;
        } else {
            iO = Offset.d(j) >= multiParagraph.e ? eu.o(arrayList) : MultiParagraphKt.c(arrayList, Offset.d(j));
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(iO);
        int i = paragraphInfo.c;
        int i2 = paragraphInfo.b;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        AndroidParagraph androidParagraph = paragraphInfo.a;
        long jA = OffsetKt.a(Offset.c(j), Offset.d(j) - paragraphInfo.f);
        TextLayout textLayout = androidParagraph.d;
        return textLayout.b.getOffsetForHorizontal(textLayout.b.getLineForVertical(textLayout.d + ((int) Offset.d(jA))), Offset.c(jA)) + i2;
    }

    public final ResolvedTextDirection k(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.b(i);
        int length = multiParagraph.a.a.a.length();
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? eu.o(arrayList) : MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        int iA = paragraphInfo.a(i);
        TextLayout textLayout = androidParagraph.d;
        return textLayout.b.getParagraphDirection(textLayout.b.getLineForOffset(iA)) == 1 ? ResolvedTextDirection.a : ResolvedTextDirection.b;
    }

    public final long l(int i) {
        int iPreceding;
        int iPreceding2;
        int iFollowing;
        int iFollowing2;
        MultiParagraph multiParagraph = this.b;
        multiParagraph.b(i);
        int length = multiParagraph.a.a.a.length();
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? eu.o(arrayList) : MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.a;
        int iA = paragraphInfo.a(i);
        gd1 gd1Var = androidParagraph.f;
        WordIterator wordIterator = ((WordBoundary) gd1Var.getValue()).a;
        wordIterator.a(iA);
        BreakIterator breakIterator = wordIterator.d;
        if (wordIterator.e(breakIterator.preceding(iA))) {
            wordIterator.a(iA);
            iPreceding = iA;
            while (iPreceding != -1 && (!wordIterator.e(iPreceding) || wordIterator.c(iPreceding))) {
                wordIterator.a(iPreceding);
                iPreceding = breakIterator.preceding(iPreceding);
            }
        } else {
            wordIterator.a(iA);
            if (wordIterator.d(iA)) {
                if (!breakIterator.isBoundary(iA) || wordIterator.b(iA)) {
                    iPreceding2 = breakIterator.preceding(iA);
                    iPreceding = iPreceding2;
                } else {
                    iPreceding = iA;
                }
            } else if (wordIterator.b(iA)) {
                iPreceding2 = breakIterator.preceding(iA);
                iPreceding = iPreceding2;
            } else {
                iPreceding = -1;
            }
        }
        if (iPreceding == -1) {
            iPreceding = iA;
        }
        WordIterator wordIterator2 = ((WordBoundary) gd1Var.getValue()).a;
        wordIterator2.a(iA);
        BreakIterator breakIterator2 = wordIterator2.d;
        if (wordIterator2.c(breakIterator2.following(iA))) {
            wordIterator2.a(iA);
            iFollowing = iA;
            while (iFollowing != -1 && (wordIterator2.e(iFollowing) || !wordIterator2.c(iFollowing))) {
                wordIterator2.a(iFollowing);
                iFollowing = breakIterator2.following(iFollowing);
            }
        } else {
            wordIterator2.a(iA);
            if (wordIterator2.b(iA)) {
                if (!breakIterator2.isBoundary(iA) || wordIterator2.d(iA)) {
                    iFollowing2 = breakIterator2.following(iA);
                    iFollowing = iFollowing2;
                } else {
                    iFollowing = iA;
                }
            } else if (wordIterator2.d(iA)) {
                iFollowing2 = breakIterator2.following(iA);
                iFollowing = iFollowing2;
            } else {
                iFollowing = -1;
            }
        }
        if (iFollowing != -1) {
            iA = iFollowing;
        }
        long jA = TextRangeKt.a(iPreceding, iA);
        int i2 = TextRange.c;
        int i3 = paragraphInfo.b;
        return TextRangeKt.a(((int) (jA >> 32)) + i3, ((int) (jA & 4294967295L)) + i3);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) IntSize.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }

    public TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        float fA;
        float fA2;
        this.a = textLayoutInput;
        this.b = multiParagraph;
        this.c = j;
        ArrayList arrayList = multiParagraph.h;
        boolean zIsEmpty = arrayList.isEmpty();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zIsEmpty) {
            fA = 0.0f;
        } else {
            fA = ((ParagraphInfo) arrayList.get(0)).a.d.a(0);
        }
        this.d = fA;
        if (!arrayList.isEmpty()) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) du.h0(arrayList);
            AndroidParagraph androidParagraph = paragraphInfo.a;
            int i = androidParagraph.b;
            TextLayout textLayout = androidParagraph.d;
            int i2 = textLayout.c;
            if (i < i2) {
                fA2 = textLayout.a(i - 1);
            } else {
                fA2 = textLayout.a(i2 - 1);
            }
            f = fA2 + paragraphInfo.f;
        }
        this.e = f;
        this.f = multiParagraph.g;
    }
}
