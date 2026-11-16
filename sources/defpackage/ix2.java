package defpackage;

import android.content.Context;
import com.ecffri.arrows.R;
import com.usercentrics.sdk.ui.components.UCTextView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ix2 extends UCTextView {
    public ix2(Context context, int i) {
        super(context, null, 0);
        setPaddingRelative((int) context.getResources().getDimension(R.dimen.ucCardHorizontalMargin), (int) context.getResources().getDimension(R.dimen.ucCardVerticalMargin), 0, 0);
    }

    public final void w(qx2 qx2Var) {
        qx2Var.getClass();
        vv2 vv2Var = qx2Var.b;
        setTypeface(vv2Var.a, 1);
        setTextSize(2, vv2Var.c.b);
        Integer num = qx2Var.a.a;
        if (num != null) {
            setTextColor(num.intValue());
        }
        setPaintFlags(1);
    }
}
