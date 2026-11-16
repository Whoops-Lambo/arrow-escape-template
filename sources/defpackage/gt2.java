package defpackage;

import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gt2 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ it2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt2(it2 it2Var, int i) {
        super(0);
        this.i = i;
        this.j = it2Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        it2 it2Var = this.j;
        switch (i) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(it2Var.a);
                frameLayout.setVisibility(4);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(it2Var.d);
                Integer num = it2Var.c;
                if (num == null) {
                    num = it2Var.b.a.i;
                }
                if (num != null) {
                    frameLayout.setBackgroundColor(num.intValue());
                }
                return frameLayout;
            default:
                return (FrameLayout) it2Var.f.getValue();
        }
    }
}
