package androidx.compose.material;

import androidx.compose.runtime.Composer;
import com.unity3d.services.UnityAdsConstants;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/SnackbarData;", "it", "Laz2;", "invoke", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends rc1 implements as0 {
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 i = new ComposableSingletons$SnackbarHostKt$lambda1$1(3);

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData snackbarData = (SnackbarData) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        snackbarData.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.l(snackbarData) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer.b()) {
            composer.h();
        } else {
            SnackbarKt.b(snackbarData, null, null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, composer, iIntValue & 14);
        }
        return az2.a;
    }
}
