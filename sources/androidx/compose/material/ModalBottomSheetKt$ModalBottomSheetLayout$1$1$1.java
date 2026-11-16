package androidx.compose.material;

import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1 extends rc1 implements sr0 {

    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    @t50(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", l = {335}, m = "invokeSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends ul2 implements zr0 {
        public int r;
        public final /* synthetic */ ModalBottomSheetState s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, dy dyVar) {
            super(2, dyVar);
            this.s = modalBottomSheetState;
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
                ModalBottomSheetState modalBottomSheetState = this.s;
                modalBottomSheetState.getClass();
                Object objB = SwipeableState.b(modalBottomSheetState, ModalBottomSheetValue.a, this);
                dz dzVar = dz.a;
                if (objB != dzVar) {
                    objB = az2Var;
                }
                if (objB == dzVar) {
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

    @Override // defpackage.sr0
    public final Object invoke() {
        throw null;
    }
}
