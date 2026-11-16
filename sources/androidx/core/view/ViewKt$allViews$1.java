package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.e52;
import defpackage.l92;
import defpackage.m92;
import defpackage.n92;
import defpackage.t50;
import defpackage.wz2;
import defpackage.zr0;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, TTAdConstant.IMAGE_URL_CODE}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln92;", "Landroid/view/View;", "Laz2;", "<anonymous>", "(Ln92;)V"}, k = 3, mv = {1, 8, 0})
final class ViewKt$allViews$1 extends e52 implements zr0 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ View t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, dy dyVar) {
        super(2, dyVar);
        this.t = view;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.t, dyVar);
        viewKt$allViews$1.s = obj;
        return viewKt$allViews$1;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewKt$allViews$1) create((n92) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.r;
        View view = this.t;
        dz dzVar = dz.a;
        if (i == 0) {
            wz2.a0(obj);
            n92 n92Var = (n92) this.s;
            this.s = n92Var;
            this.r = 1;
            n92Var.b(this, view);
            return dzVar;
        }
        az2 az2Var = az2.a;
        if (i != 1) {
            if (i == 2) {
                wz2.a0(obj);
                return az2Var;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        n92 n92Var2 = (n92) this.s;
        wz2.a0(obj);
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) view;
            l92 l92Var = new l92() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
                @Override // defpackage.l92
                public final Iterator iterator() {
                    return new TreeIterator(new ViewGroupKt$children$1(viewGroup).iterator());
                }
            };
            this.s = null;
            this.r = 2;
            n92Var2.getClass();
            Iterator it = l92Var.iterator();
            m92 m92Var = (m92) n92Var2;
            if (((TreeIterator) it).c.hasNext()) {
                m92Var.c = it;
                m92Var.a = 2;
                m92Var.d = this;
                obj2 = dzVar;
            } else {
                obj2 = az2Var;
            }
            if (obj2 != dzVar) {
                obj2 = az2Var;
            }
            if (obj2 == dzVar) {
                return dzVar;
            }
        }
        return az2Var;
    }
}
