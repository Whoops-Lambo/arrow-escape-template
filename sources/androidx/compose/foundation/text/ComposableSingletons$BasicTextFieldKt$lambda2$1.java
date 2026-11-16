package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Laz2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "invoke", "(Lzr0;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ComposableSingletons$BasicTextFieldKt$lambda2$1 extends rc1 implements as0 {
    public static final ComposableSingletons$BasicTextFieldKt$lambda2$1 i = new ComposableSingletons$BasicTextFieldKt$lambda2$1(3);

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zr0 zr0Var = (zr0) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        zr0Var.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.l(zr0Var) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer.b()) {
            composer.h();
        } else {
            zr0Var.invoke(composer, Integer.valueOf(iIntValue & 14));
        }
        return az2.a;
    }
}
