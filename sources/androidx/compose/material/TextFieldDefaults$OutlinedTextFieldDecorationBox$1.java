package androidx.compose.material;

import androidx.compose.runtime.Composer;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldDefaults$OutlinedTextFieldDecorationBox$1 extends rc1 implements zr0 {
    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
            composer.h();
        } else {
            TextFieldDefaults.a.a(false, false, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, composer, ((0 >> 6) & 14) | 12582912 | ((0 >> 15) & 112) | ((0 >> 9) & 896) | ((0 << 6) & 7168), 112);
        }
        return az2.a;
    }
}
