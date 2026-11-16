package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import defpackage.az2;
import defpackage.cz;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.t50;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DrawerKt$ModalDrawer$1$2$2 extends rc1 implements sr0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ DrawerState j;
    public final /* synthetic */ dn k;

    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @t50(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends ul2 implements zr0 {
        public int r;
        public final /* synthetic */ DrawerState s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DrawerState drawerState, dy dyVar) {
            super(2, dyVar);
            this.s = drawerState;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass1(this.s, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            int i = this.r;
            az2 az2Var = az2.a;
            if (i == 0) {
                wz2.a0(obj);
                this.r = 1;
                DrawerState drawerState = this.s;
                drawerState.getClass();
                TweenSpec tweenSpec = DrawerKt.a;
                SwipeableState swipeableState = drawerState.a;
                Object objCollect = swipeableState.j.collect(new SwipeableState$animateTo$2(DrawerValue.a, swipeableState, tweenSpec), this);
                dz dzVar = dz.a;
                if (objCollect != dzVar) {
                    objCollect = az2Var;
                }
                if (objCollect != dzVar) {
                    objCollect = az2Var;
                }
                if (objCollect != dzVar) {
                    objCollect = az2Var;
                }
                if (objCollect == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$2(boolean z, DrawerState drawerState, dn dnVar) {
        super(0);
        this.i = z;
        this.j = drawerState;
        this.k = dnVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        if (this.i) {
            DrawerState drawerState = this.j;
            if (((Boolean) drawerState.a.b.invoke(DrawerValue.a)).booleanValue()) {
                tb5.t(this.k, null, null, new AnonymousClass1(drawerState, null), 3);
            }
        }
        return az2.a;
    }
}
