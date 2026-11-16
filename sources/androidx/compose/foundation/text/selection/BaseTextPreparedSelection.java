package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public final AnnotatedString a;
    public final long b;
    public final TextLayoutResult c;
    public final OffsetMapping d;
    public final TextPreparedSelectionState e;
    public long f;
    public final AnnotatedString g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;", "", "", "NoCharacterFound", "I", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final Integer a() {
        TextLayoutResult textLayoutResult = this.c;
        if (textLayoutResult == null) {
            return null;
        }
        int iC = TextRange.c(this.f);
        OffsetMapping offsetMapping = this.d;
        return Integer.valueOf(offsetMapping.a(textLayoutResult.e(textLayoutResult.f(offsetMapping.b(iC)), true)));
    }

    public final int b(TextLayoutResult textLayoutResult, int i) {
        AnnotatedString annotatedString = this.a;
        if (i >= annotatedString.a.length()) {
            return annotatedString.a.length();
        }
        int length = this.g.a.length() - 1;
        if (i <= length) {
            length = i;
        }
        long jL = textLayoutResult.l(length);
        int i2 = TextRange.c;
        int i3 = (int) (jL & 4294967295L);
        return i3 <= i ? b(textLayoutResult, i + 1) : this.d.a(i3);
    }

    public final int c(TextLayoutResult textLayoutResult, int i) {
        if (i < 0) {
            return 0;
        }
        int length = this.g.a.length() - 1;
        if (i <= length) {
            length = i;
        }
        long jL = textLayoutResult.l(length);
        int i2 = TextRange.c;
        int i3 = (int) (jL >> 32);
        return i3 >= i ? c(textLayoutResult, i - 1) : this.d.a(i3);
    }

    public final boolean d() {
        ResolvedTextDirection resolvedTextDirectionK;
        TextLayoutResult textLayoutResult = this.c;
        if (textLayoutResult != null) {
            long j = this.f;
            int i = TextRange.c;
            resolvedTextDirectionK = textLayoutResult.k((int) (j & 4294967295L));
        } else {
            resolvedTextDirectionK = null;
        }
        return resolvedTextDirectionK != ResolvedTextDirection.b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (r4 <= r3.d.b.getLineLeft(r0 - r7.d)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(androidx.compose.ui.text.TextLayoutResult r8, int r9) {
        /*
            r7 = this;
            long r0 = r7.f
            int r2 = androidx.compose.ui.text.TextRange.c
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            androidx.compose.ui.text.input.OffsetMapping r1 = r7.d
            int r0 = r1.b(r0)
            androidx.compose.foundation.text.selection.TextPreparedSelectionState r2 = r7.e
            java.lang.Float r3 = r2.a
            if (r3 != 0) goto L23
            androidx.compose.ui.geometry.Rect r3 = r8.c(r0)
            float r3 = r3.a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2.a = r3
        L23:
            int r0 = r8.f(r0)
            androidx.compose.ui.text.MultiParagraph r3 = r8.b
            int r0 = r0 + r9
            if (r0 >= 0) goto L2e
            r7 = 0
            return r7
        L2e:
            int r9 = r3.f
            if (r0 < r9) goto L3b
            androidx.compose.ui.text.AnnotatedString r7 = r7.g
            java.lang.String r7 = r7.a
            int r7 = r7.length()
            return r7
        L3b:
            float r9 = r8.d(r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r4
            java.lang.Float r2 = r2.a
            r2.getClass()
            float r4 = r2.floatValue()
            boolean r5 = r7.d()
            if (r5 == 0) goto L72
            r3.c(r0)
            java.util.ArrayList r5 = r3.h
            int r6 = androidx.compose.ui.text.MultiParagraphKt.b(r0, r5)
            java.lang.Object r5 = r5.get(r6)
            androidx.compose.ui.text.ParagraphInfo r5 = (androidx.compose.ui.text.ParagraphInfo) r5
            androidx.compose.ui.text.platform.AndroidParagraph r6 = r5.a
            int r5 = r5.d
            int r5 = r0 - r5
            androidx.compose.ui.text.android.TextLayout r6 = r6.d
            android.text.Layout r6 = r6.b
            float r5 = r6.getLineRight(r5)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L99
        L72:
            boolean r7 = r7.d()
            if (r7 != 0) goto L9f
            r3.c(r0)
            java.util.ArrayList r7 = r3.h
            int r3 = androidx.compose.ui.text.MultiParagraphKt.b(r0, r7)
            java.lang.Object r7 = r7.get(r3)
            androidx.compose.ui.text.ParagraphInfo r7 = (androidx.compose.ui.text.ParagraphInfo) r7
            androidx.compose.ui.text.platform.AndroidParagraph r3 = r7.a
            int r7 = r7.d
            int r7 = r0 - r7
            androidx.compose.ui.text.android.TextLayout r3 = r3.d
            android.text.Layout r3 = r3.b
            float r7 = r3.getLineLeft(r7)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 > 0) goto L9f
        L99:
            r7 = 1
            int r7 = r8.e(r0, r7)
            return r7
        L9f:
            float r7 = r2.floatValue()
            long r2 = androidx.compose.ui.geometry.OffsetKt.a(r7, r9)
            int r7 = r8.j(r2)
            int r7 = r1.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.BaseTextPreparedSelection.e(androidx.compose.ui.text.TextLayoutResult, int):int");
    }

    public final void f() {
        this.e.a = null;
        AnnotatedString annotatedString = this.g;
        if (annotatedString.a.length() > 0) {
            String str = annotatedString.a;
            int iC = TextRange.c(this.f);
            str.getClass();
            int length = iC + 1;
            int length2 = str.length();
            while (length < length2) {
                if (str.charAt(length) == '\n') {
                    k(length, length);
                }
                length++;
            }
            length = str.length();
            k(length, length);
        }
    }

    public final void g() {
        this.e.a = null;
        AnnotatedString annotatedString = this.g;
        if (annotatedString.a.length() > 0) {
            String str = annotatedString.a;
            int iD = TextRange.d(this.f);
            str.getClass();
            int i = iD - 1;
            while (i > 0) {
                if (str.charAt(i - 1) == '\n') {
                    k(i, i);
                }
                i--;
            }
            i = 0;
            k(i, i);
        }
    }

    public final void h() {
        Integer numA;
        this.e.a = null;
        if (this.g.a.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        k(iIntValue, iIntValue);
    }

    public final void i() {
        Integer numValueOf = null;
        this.e.a = null;
        if (this.g.a.length() > 0) {
            TextLayoutResult textLayoutResult = this.c;
            if (textLayoutResult != null) {
                int iD = TextRange.d(this.f);
                OffsetMapping offsetMapping = this.d;
                numValueOf = Integer.valueOf(offsetMapping.a(textLayoutResult.h(textLayoutResult.f(offsetMapping.b(iD)))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                k(iIntValue, iIntValue);
            }
        }
    }

    public final void j() {
        if (this.g.a.length() > 0) {
            int i = TextRange.c;
            this.f = TextRangeKt.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.a = annotatedString;
        this.b = j;
        this.c = textLayoutResult;
        this.d = offsetMapping;
        this.e = textPreparedSelectionState;
        this.f = j;
        this.g = annotatedString;
    }

    public final void k(int i, int i2) {
        this.f = TextRangeKt.a(i, i2);
    }
}
