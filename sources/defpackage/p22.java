package defpackage;

import android.graphics.Bitmap;
import coil.request.RequestDelegate;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p22 extends fy {
    public q22 r;
    public RequestDelegate s;
    public l21 t;
    public ei0 u;
    public Bitmap v;
    public /* synthetic */ Object w;
    public final /* synthetic */ q22 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p22(q22 q22Var, fy fyVar) {
        super(fyVar);
        this.x = q22Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return q22.a(this.x, null, 0, this);
    }
}
