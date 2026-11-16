package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ClickableKt$clickable$4$delayPressInteraction$1 extends rc1 implements sr0 {
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ sr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4$delayPressInteraction$1(MutableState mutableState, sr0 sr0Var) {
        super(0);
        this.i = mutableState;
        this.j = sr0Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return Boolean.valueOf(((Boolean) this.i.getA()).booleanValue() || ((Boolean) ((Clickable_androidKt$isComposeRootInScrollableContainer$1) this.j).invoke()).booleanValue());
    }
}
