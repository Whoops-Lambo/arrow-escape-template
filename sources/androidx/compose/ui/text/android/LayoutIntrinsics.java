package androidx.compose.ui.text.android;

import android.text.TextPaint;
import defpackage.eu;
import defpackage.gd1;
import defpackage.pd1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutIntrinsics {
    public final gd1 a;
    public final gd1 b;
    public final gd1 c;

    public LayoutIntrinsics(int i, TextPaint textPaint, CharSequence charSequence) {
        charSequence.getClass();
        textPaint.getClass();
        LayoutIntrinsics$boringMetrics$2 layoutIntrinsics$boringMetrics$2 = new LayoutIntrinsics$boringMetrics$2(i, textPaint, charSequence);
        pd1 pd1Var = pd1.c;
        this.a = eu.v(pd1Var, layoutIntrinsics$boringMetrics$2);
        this.b = eu.v(pd1Var, new LayoutIntrinsics$minIntrinsicWidth$2(charSequence, textPaint));
        this.c = eu.v(pd1Var, new LayoutIntrinsics$maxIntrinsicWidth$2(this, charSequence, textPaint));
    }
}
