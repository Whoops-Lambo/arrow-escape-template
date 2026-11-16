package defpackage;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C5117a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ou implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                k32 k32Var = (k32) obj3;
                qy qyVar = (qy) obj2;
                ((az2) obj).getClass();
                qyVar.getClass();
                int i2 = k32Var.a;
                k32Var.a = i2 + 1;
                ((sy[]) obj4)[i2] = qyVar;
                return az2.a;
            case 1:
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Context context = (Context) obj;
                bp0 bp0Var = (bp0) obj2;
                context.getClass();
                bp0Var.getClass();
                num.getClass();
                return new k(context, bp0Var, num.intValue(), (int) ((num2 != null ? num2.intValue() : 0) * context.getResources().getDisplayMetrics().density));
            case 2:
                return C5117a.c.a((i) obj4, (sr0) obj3, (Offset) obj, (Offset) obj2);
            case 3:
                return g.b.a((sr0) obj4, (c) obj3, (Offset) obj, (Offset) obj2);
            default:
                return j.g.a((sr0) obj4, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j) obj3, (Offset) obj, (Offset) obj2);
        }
    }
}
