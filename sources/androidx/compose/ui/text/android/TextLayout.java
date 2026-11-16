package androidx.compose.ui.text.android;

import android.graphics.Rect;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.dt1;
import defpackage.eu;
import defpackage.gd1;
import defpackage.pd1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextLayout {
    public final boolean a;
    public final Layout b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final gd1 g;

    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, LayoutIntrinsics layoutIntrinsics) {
        Layout.Alignment alignment;
        int i5;
        Layout layoutA;
        boolean z2;
        dt1 dt1Var;
        LineHeightStyleSpan[] lineHeightStyleSpanArr;
        charSequence.getClass();
        textPaint.getClass();
        layoutIntrinsics.getClass();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = TextLayoutKt.a(i2);
        Layout.Alignment alignment2 = TextAlignmentAdapter.a;
        if (i == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = i != 4 ? Layout.Alignment.ALIGN_NORMAL : TextAlignmentAdapter.b;
        } else {
            alignment = TextAlignmentAdapter.a;
        }
        Layout.Alignment alignment3 = alignment;
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        BoringLayout.Metrics metrics = (BoringLayout.Metrics) layoutIntrinsics.a.getValue();
        double d = f;
        int iCeil = (int) Math.ceil(d);
        if (metrics == null || ((Number) layoutIntrinsics.c.getValue()).floatValue() > f || z3) {
            this.f = false;
            int length2 = charSequence.length();
            int iCeil2 = (int) Math.ceil(d);
            alignment3.getClass();
            i5 = i3;
            layoutA = StaticLayoutFactory.a.a(new StaticLayoutParams(charSequence, length2, textPaint, iCeil, textDirectionHeuristicA, alignment3, i5, truncateAt, iCeil2, i4, z));
        } else {
            this.f = true;
            alignment3.getClass();
            if (iCeil < 0) {
                d.r("Failed requirement.");
                throw null;
            }
            if (iCeil < 0) {
                d.r("Failed requirement.");
                throw null;
            }
            layoutA = truncateAt == null ? new BoringLayout(charSequence, textPaint, iCeil, alignment3, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, metrics, z) : new BoringLayout(charSequence, textPaint, iCeil, alignment3, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, metrics, z, truncateAt, iCeil);
            i5 = i3;
        }
        this.b = layoutA;
        int iMin = Math.min(layoutA.getLineCount(), i5);
        this.c = iMin;
        if (iMin < i5) {
            z2 = false;
        } else {
            int i6 = iMin - 1;
            if (layoutA.getEllipsisCount(i6) > 0 || layoutA.getLineEnd(i6) != charSequence.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.a = z2;
        dt1 dt1Var2 = TextLayoutKt.a;
        if (z || (!this.f && Build.VERSION.SDK_INT >= 28)) {
            dt1Var = new dt1(0, 0);
        } else {
            TextPaint paint = layoutA.getPaint();
            CharSequence text = layoutA.getText();
            paint.getClass();
            text.getClass();
            Rect rectA = PaintExtensionsKt.a(paint, text, layoutA.getLineStart(0), layoutA.getLineEnd(0));
            int lineAscent = layoutA.getLineAscent(0);
            int i7 = rectA.top;
            int topPadding = i7 < lineAscent ? lineAscent - i7 : layoutA.getTopPadding();
            if (iMin != 1) {
                int lineCount = layoutA.getLineCount() - 1;
                rectA = PaintExtensionsKt.a(paint, text, layoutA.getLineStart(lineCount), layoutA.getLineEnd(lineCount));
            }
            int lineDescent = layoutA.getLineDescent(layoutA.getLineCount() - 1);
            int i8 = rectA.bottom;
            int bottomPadding = i8 > lineDescent ? i8 - lineDescent : layoutA.getBottomPadding();
            dt1Var = (topPadding == 0 && bottomPadding == 0) ? dt1Var2 : new dt1(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
        }
        if (e() instanceof Spanned) {
            lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) e()).getSpans(0, e().length(), LineHeightStyleSpan.class);
            lineHeightStyleSpanArr.getClass();
            if (lineHeightStyleSpanArr.length == 0) {
                lineHeightStyleSpanArr = new LineHeightStyleSpan[0];
            }
        } else {
            lineHeightStyleSpanArr = new LineHeightStyleSpan[0];
        }
        int iMax = 0;
        int iMax2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            int i9 = lineHeightStyleSpan.j;
            iMax = i9 < 0 ? Math.max(iMax, Math.abs(i9)) : iMax;
            int i10 = lineHeightStyleSpan.k;
            if (i10 < 0) {
                iMax2 = Math.max(iMax, Math.abs(i10));
            }
        }
        dt1Var2 = (iMax == 0 && iMax2 == 0) ? dt1Var2 : new dt1(Integer.valueOf(iMax), Integer.valueOf(iMax2));
        this.d = Math.max(((Number) dt1Var.a).intValue(), ((Number) dt1Var2.a).intValue());
        this.e = Math.max(((Number) dt1Var.b).intValue(), ((Number) dt1Var2.b).intValue());
        this.g = eu.v(pd1.c, new TextLayout$layoutHelper$2(this));
    }

    public static float d(TextLayout textLayout, int i) {
        return ((LayoutHelper) textLayout.g.getValue()).a(i, true);
    }

    public final float a(int i) {
        return this.d + this.b.getLineBaseline(i);
    }

    public final float b(int i) {
        return this.d + this.b.getLineBottom(i) + (i == this.c + (-1) ? this.e : 0);
    }

    public final float c(int i) {
        return this.b.getLineTop(i) + (i == 0 ? 0 : this.d);
    }

    public final CharSequence e() {
        CharSequence text = this.b.getText();
        text.getClass();
        return text;
    }
}
