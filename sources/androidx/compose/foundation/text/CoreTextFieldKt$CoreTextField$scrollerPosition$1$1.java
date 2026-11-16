package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends rc1 implements sr0 {
    public final /* synthetic */ Orientation i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.i = orientation;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return new TextFieldScrollerPosition(this.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
