package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollableKt$pointerScrollable$3 extends rc1 implements sr0 {
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$3(MutableState mutableState) {
        super(0);
        this.i = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // defpackage.sr0
    public final Object invoke() {
        boolean z;
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.i.getA();
        if (!scrollingLogic.d.b()) {
            OverscrollEffect overscrollEffect = scrollingLogic.f;
            z = overscrollEffect != null ? overscrollEffect.a() : false;
        }
        return Boolean.valueOf(z);
    }
}
