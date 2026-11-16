package defpackage;

import com.usercentrics.sdk.ui.components.UCImageView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yv2 extends fy {
    public UCImageView r;
    public String s;
    public Object t;
    public Throwable u;
    public /* synthetic */ Object v;
    public final /* synthetic */ UCImageView w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv2(UCImageView uCImageView, fy fyVar) {
        super(fyVar);
        this.w = uCImageView;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return UCImageView.d(this.w, null, this);
    }
}
