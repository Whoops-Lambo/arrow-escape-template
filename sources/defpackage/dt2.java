package defpackage;

import com.ecffri.arrows.R;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dt2 extends rc1 implements sr0 {
    public final /* synthetic */ et2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt2(et2 et2Var) {
        super(0);
        this.i = et2Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return Integer.valueOf(this.i.getResources().getDimensionPixelOffset(R.dimen.ucFirstLayerPopupMargin));
    }
}
