package androidx.compose.material;

import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends rc1 implements zr0 {
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        DismissDirection dismissDirection;
        DismissValue dismissValue = (DismissValue) obj;
        DismissValue dismissValue2 = (DismissValue) obj2;
        dismissValue.getClass();
        dismissValue2.getClass();
        DismissValue dismissValue3 = DismissValue.a;
        if (dismissValue == dismissValue2 && dismissValue == dismissValue3) {
            dismissDirection = null;
        } else {
            DismissValue dismissValue4 = DismissValue.b;
            if (dismissValue == dismissValue2 && dismissValue == dismissValue4) {
                dismissDirection = DismissDirection.a;
            } else {
                DismissValue dismissValue5 = DismissValue.c;
                if (dismissValue != dismissValue2 || dismissValue != dismissValue5) {
                    if (dismissValue != dismissValue3 || dismissValue2 != dismissValue4) {
                        if (dismissValue != dismissValue3 || dismissValue2 != dismissValue5) {
                            if (dismissValue != dismissValue4 || dismissValue2 != dismissValue3) {
                                if (dismissValue != dismissValue5 || dismissValue2 != dismissValue3) {
                                    dismissDirection = null;
                                }
                            }
                        }
                    }
                    dismissDirection = DismissDirection.a;
                }
                dismissDirection = DismissDirection.b;
            }
        }
        dismissDirection.getClass();
        throw null;
    }
}
