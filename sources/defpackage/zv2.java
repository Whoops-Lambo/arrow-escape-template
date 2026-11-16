package defpackage;

import com.usercentrics.sdk.ui.components.UCImageView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zv2 extends fy {
    public UCImageView r;
    public String s;
    public UCImageView t;
    public /* synthetic */ Object u;
    public final /* synthetic */ UCImageView v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv2(UCImageView uCImageView, fy fyVar) {
        super(fyVar);
        this.v = uCImageView;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return UCImageView.e(this.v, null, null, this);
    }
}
