package defpackage;

import com.usercentrics.sdk.ui.components.UCImageView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class aw2 extends fy {
    public UCImageView r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ UCImageView u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw2(UCImageView uCImageView, fy fyVar) {
        super(fyVar);
        this.u = uCImageView;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return UCImageView.f(this.u, null, null, this);
    }
}
