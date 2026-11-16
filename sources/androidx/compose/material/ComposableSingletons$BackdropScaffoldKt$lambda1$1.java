package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "it", "Laz2;", "invoke", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ComposableSingletons$BackdropScaffoldKt$lambda1$1 extends rc1 implements as0 {
    public static final ComposableSingletons$BackdropScaffoldKt$lambda1$1 i = new ComposableSingletons$BackdropScaffoldKt$lambda1$1(3);

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarHostState snackbarHostState = (SnackbarHostState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        snackbarHostState.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.l(snackbarHostState) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer.b()) {
            composer.h();
        } else {
            SnackbarHostKt.a(snackbarHostState, null, null, composer, iIntValue & 14);
        }
        return az2.a;
    }
}
