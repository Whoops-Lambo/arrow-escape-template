package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollableStateKt$rememberScrollableState$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableStateKt$rememberScrollableState$1$1(MutableState mutableState) {
        super(1);
        this.i = mutableState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        return (Float) ((wr0) this.i.getA()).invoke(Float.valueOf(((Number) obj).floatValue()));
    }
}
