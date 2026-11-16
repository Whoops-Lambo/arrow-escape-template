package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.Cue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class np {
    public static final x c = new x(3);
    public final Cue a;
    public final int b;

    public np(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        Cue.Builder size = new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(alignment).setLine(f, 0).setLineAnchor(i).setPosition(f2).setPositionAnchor(i2).setSize(-3.4028235E38f);
        if (z) {
            size.setWindowColor(i3);
        }
        this.a = size.build();
        this.b = i4;
    }
}
