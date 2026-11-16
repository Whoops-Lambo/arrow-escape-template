package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public final float a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public LineHeightStyleSpan(float f, int i, boolean z, boolean z2, int i2) {
        this.a = f;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
        if ((i2 >= 0 && i2 < 101) || i2 == -1) {
            return;
        }
        e32.i("topRatio should be in [0..100] range or -1");
        throw null;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        double dCeil;
        charSequence.getClass();
        fontMetricsInt.getClass();
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 > 0) {
            boolean z2 = false;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 == this.b) {
                z2 = true;
            }
            boolean z3 = this.d;
            boolean z4 = this.c;
            if (z && z2 && z4 && z3) {
                return;
            }
            if (z) {
                int i9 = i7 - i8;
                int iCeil = (int) Math.ceil(this.a);
                int i10 = iCeil - i9;
                int iAbs = this.e;
                if (iAbs == -1) {
                    iAbs = (int) ((Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent)) * 100.0f);
                }
                if (i10 <= 0) {
                    dCeil = Math.ceil((i10 * iAbs) / 100.0f);
                } else {
                    dCeil = Math.ceil(((100 - iAbs) * i10) / 100.0f);
                }
                int i11 = (int) dCeil;
                int i12 = fontMetricsInt.descent;
                int i13 = i11 + i12;
                this.h = i13;
                int i14 = i13 - iCeil;
                this.g = i14;
                if (z4) {
                    i14 = fontMetricsInt.ascent;
                }
                this.f = i14;
                if (z3) {
                    i13 = i12;
                }
                this.i = i13;
                this.j = fontMetricsInt.ascent - i14;
                this.k = i13 - i12;
            }
            if (z) {
                i5 = this.f;
            } else {
                i5 = this.g;
            }
            fontMetricsInt.ascent = i5;
            if (z2) {
                i6 = this.i;
            } else {
                i6 = this.h;
            }
            fontMetricsInt.descent = i6;
        }
    }
}
