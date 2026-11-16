package androidx.compose.foundation.gestures;

import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dy;
import defpackage.j32;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Laz2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/ScrollScope;)V"}, k = 3, mv = {1, 6, 0})
final class ScrollExtensionsKt$scrollBy$2 extends ul2 implements zr0 {
    public /* synthetic */ Object r;
    public final /* synthetic */ j32 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(j32 j32Var, dy dyVar) {
        super(2, dyVar);
        this.s = j32Var;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.s, dyVar);
        scrollExtensionsKt$scrollBy$2.r = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = (ScrollExtensionsKt$scrollBy$2) create((ScrollScope) obj, (dy) obj2);
        az2 az2Var = az2.a;
        scrollExtensionsKt$scrollBy$2.invokeSuspend(az2Var);
        return az2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        this.s.a = ((ScrollScope) this.r).a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return az2.a;
    }
}
