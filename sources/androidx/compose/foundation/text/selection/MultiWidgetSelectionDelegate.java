package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.dt1;
import defpackage.sr0;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MultiWidgetSelectionDelegate implements Selectable {
    public final long a;
    public final sr0 b;
    public final sr0 c;

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final LayoutCoordinates a() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.b.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.s()) {
            return null;
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final dt1 b(long j, long j2, Offset offset, boolean z, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection) {
        boolean z2;
        selectionAdjustment.getClass();
        if (selection != null) {
            long j3 = selection.a.c;
            long j4 = this.a;
            if (j4 != j3 || j4 != selection.b.c) {
                d.r("The given previousSelection doesn't belong to this selectable.");
                return null;
            }
        }
        LayoutCoordinates layoutCoordinatesA = a();
        if (layoutCoordinatesA == null) {
            return new dt1(null, Boolean.FALSE);
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null) {
            return new dt1(null, Boolean.FALSE);
        }
        long jR = layoutCoordinates.r(layoutCoordinatesA, Offset.b);
        long jE = Offset.e(j, jR);
        long jE2 = Offset.e(j2, jR);
        Offset offset2 = offset != null ? new Offset(Offset.e(offset.a, jR)) : null;
        long j5 = textLayoutResult.c;
        Rect rect = new Rect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j5 >> 32), (int) (j5 & 4294967295L));
        if (rect.a(jE) || rect.a(jE2)) {
            z2 = true;
        } else {
            SelectionMode selectionMode = SelectionMode.a;
            int iA = selectionMode.a(jE, rect);
            z2 = (selectionMode.a(jE2, rect) > 0) ^ (iA > 0);
        }
        if (!z2) {
            return new dt1(null, Boolean.FALSE);
        }
        int iB = MultiWidgetSelectionDelegateKt.b(textLayoutResult, rect, jE);
        int iB2 = MultiWidgetSelectionDelegateKt.b(textLayoutResult, rect, jE2);
        int iB3 = offset2 != null ? MultiWidgetSelectionDelegateKt.b(textLayoutResult, rect, offset2.a) : -1;
        long jA = selectionAdjustment.a(textLayoutResult, TextRangeKt.a(iB, iB2), iB3, z, selection != null ? new TextRange(TextRangeKt.a(selection.a.b, selection.b.b)) : null);
        Selection selectionA = MultiWidgetSelectionDelegateKt.a(jA, TextRange.e(jA), this.a, textLayoutResult);
        return new dt1(selectionA, Boolean.valueOf((!z ? iB2 != iB3 : iB != iB3) || !selectionA.equals(selection)));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long c(Selection selection, boolean z) {
        Selection.AnchorInfo anchorInfo = selection.b;
        Selection.AnchorInfo anchorInfo2 = selection.a;
        long j = this.a;
        if ((z && anchorInfo2.c != j) || (!z && anchorInfo.c != j)) {
            return Offset.b;
        }
        if (a() == null) {
            return Offset.b;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null) {
            return Offset.b;
        }
        if (z) {
            anchorInfo = anchorInfo2;
        }
        int i = anchorInfo.b;
        return OffsetKt.a(TextSelectionDelegateKt.a(textLayoutResult, i, z, selection.c), textLayoutResult.d(textLayoutResult.f(i)));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final Rect d(int i) {
        int length;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        return (textLayoutResult != null && (length = textLayoutResult.a.a.a.length()) >= 1) ? textLayoutResult.b(tb5.g(i, 0, length - 1)) : Rect.e;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getA() {
        return this.a;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final Selection f() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        return MultiWidgetSelectionDelegateKt.a(TextRangeKt.a(0, textLayoutResult.a.a.a.length()), false, this.a, textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long g(int i) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null) {
            return TextRange.b;
        }
        int length = textLayoutResult.a.a.a.length();
        if (length < 1) {
            return TextRange.b;
        }
        int iF = textLayoutResult.f(tb5.g(i, 0, length - 1));
        return TextRangeKt.a(textLayoutResult.h(iF), textLayoutResult.e(iF, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        return textLayoutResult == null ? new AnnotatedString(6, "", null) : textLayoutResult.a.a;
    }

    public MultiWidgetSelectionDelegate(long j, sr0 sr0Var, sr0 sr0Var2) {
        this.a = j;
        this.b = sr0Var;
        this.c = sr0Var2;
    }
}
