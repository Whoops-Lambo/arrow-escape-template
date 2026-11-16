package androidx.compose.foundation.text;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldScrollKt$textFieldScrollable$2$controller$1 extends rc1 implements wr0 {
    public final /* synthetic */ TextFieldScrollerPosition i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$controller$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.i = textFieldScrollerPosition;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        TextFieldScrollerPosition textFieldScrollerPosition = this.i;
        float fA = textFieldScrollerPosition.a() + fFloatValue;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldScrollerPosition.b;
        if (fA > ((Number) parcelableSnapshotMutableState.getA()).floatValue()) {
            fFloatValue = ((Number) parcelableSnapshotMutableState.getA()).floatValue() - textFieldScrollerPosition.a();
        } else if (fA < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fFloatValue = -textFieldScrollerPosition.a();
        }
        textFieldScrollerPosition.a.setValue(Float.valueOf(textFieldScrollerPosition.a() + fFloatValue));
        return Float.valueOf(fFloatValue);
    }
}
