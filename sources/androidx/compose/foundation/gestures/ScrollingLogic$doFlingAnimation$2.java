package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.l32;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {TTAdConstant.IMAGE_URL_CODE}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Laz2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/ScrollScope;)V"}, k = 3, mv = {1, 6, 0})
final class ScrollingLogic$doFlingAnimation$2 extends ul2 implements zr0 {
    public Object r;
    public l32 s;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ScrollingLogic w;
    public final /* synthetic */ l32 x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, l32 l32Var, long j, dy dyVar) {
        super(2, dyVar);
        this.w = scrollingLogic;
        this.x = l32Var;
        this.y = j;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.w, this.x, this.y, dyVar);
        scrollingLogic$doFlingAnimation$2.v = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((ScrollScope) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        final ScrollingLogic scrollingLogic;
        l32 l32Var;
        ScrollingLogic scrollingLogic2;
        long j;
        int i = this.u;
        Orientation orientation = Orientation.b;
        if (i == 0) {
            wz2.a0(obj);
            ScrollScope scrollScope = (ScrollScope) this.v;
            scrollingLogic = this.w;
            final ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 scrollingLogic$doFlingAnimation$2$outerScopeScroll$1 = new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(scrollingLogic, scrollScope);
            ?? r12 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public final float a(float f) {
                    ScrollingLogic scrollingLogic3 = scrollingLogic;
                    return scrollingLogic3.d(((Offset) ((ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1) scrollingLogic$doFlingAnimation$2$outerScopeScroll$1).invoke(new Offset(scrollingLogic3.e(f)))).a);
                }
            };
            FlingBehavior flingBehavior = scrollingLogic.e;
            l32 l32Var2 = this.x;
            long j2 = l32Var2.a;
            Orientation orientation2 = scrollingLogic.a;
            long j3 = this.y;
            float fA = orientation2 == orientation ? Velocity.a(j3) : Velocity.b(j3);
            if (scrollingLogic.b) {
                fA *= -1.0f;
            }
            this.v = scrollingLogic;
            this.r = scrollingLogic;
            this.s = l32Var2;
            this.t = j2;
            this.u = 1;
            obj = flingBehavior.a(r12, fA, this);
            dz dzVar = dz.a;
            if (obj == dzVar) {
                return dzVar;
            }
            l32Var = l32Var2;
            scrollingLogic2 = scrollingLogic;
            j = j2;
        } else {
            if (i != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.t;
            l32Var = this.s;
            scrollingLogic = (ScrollingLogic) this.r;
            scrollingLogic2 = (ScrollingLogic) this.v;
            wz2.a0(obj);
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (scrollingLogic2.b) {
            fFloatValue *= -1.0f;
        }
        l32Var.a = scrollingLogic.a == orientation ? VelocityKt.a(fFloatValue, Velocity.b(j)) : VelocityKt.a(Velocity.a(j), fFloatValue);
        return az2.a;
    }
}
