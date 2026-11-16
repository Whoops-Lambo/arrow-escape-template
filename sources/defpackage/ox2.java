package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ox2 extends ClickableSpan {
    public final bx1 a;
    public final wr0 b;
    public final boolean c;

    public ox2(bx1 bx1Var, wr0 wr0Var, boolean z) {
        this.a = bx1Var;
        this.b = wr0Var;
        this.c = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        this.b.invoke(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.c);
    }
}
