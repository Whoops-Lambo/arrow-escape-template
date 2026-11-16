package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutParams;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StaticLayoutParams {
    public final CharSequence a;
    public final int b;
    public final TextPaint c;
    public final int d;
    public final TextDirectionHeuristic e;
    public final Layout.Alignment f;
    public final int g;
    public final TextUtils.TruncateAt h;
    public final int i;
    public final int j;
    public final boolean k;

    public StaticLayoutParams(CharSequence charSequence, int i, TextPaint textPaint, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z) {
        charSequence.getClass();
        textPaint.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = textPaint;
        this.d = i2;
        this.e = textDirectionHeuristic;
        this.f = alignment;
        this.g = i3;
        this.h = truncateAt;
        this.i = i4;
        this.j = i5;
        this.k = z;
        if (i >= 0) {
            int length = charSequence.length();
            if (i >= 0 && i <= length) {
                if (i3 >= 0) {
                    if (i2 >= 0) {
                        if (i4 >= 0) {
                            return;
                        }
                        d.r("Failed requirement.");
                        throw null;
                    }
                    d.r("Failed requirement.");
                    throw null;
                }
                d.r("Failed requirement.");
                throw null;
            }
            d.r("Failed requirement.");
            throw null;
        }
        d.r("Failed requirement.");
        throw null;
    }
}
