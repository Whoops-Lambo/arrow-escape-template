package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldKt$TextField$2 extends rc1 implements as0 {
    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zr0 zr0Var = (zr0) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        zr0Var.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.l(zr0Var) ? 4 : 2;
        }
        if ((iIntValue & 91) != 18 || !composer.b()) {
            throw null;
        }
        composer.h();
        return az2.a;
    }
}
