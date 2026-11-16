package androidx.compose.material;

import androidx.compose.runtime.Composer;
import com.unity3d.services.UnityAdsConstants;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class OutlinedTextFieldKt$OutlinedTextField$2 extends rc1 implements as0 {

    /* JADX INFO: renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements zr0 {
        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
                composer.h();
            } else {
                TextFieldDefaults.a.a(false, false, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, composer, ((0 >> 9) & 14) | 12582912 | ((0 << 3) & 112) | ((0 >> 12) & 896) | ((0 >> 15) & 7168) | ((0 >> 9) & 57344), 96);
            }
            return az2.a;
        }
    }

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
