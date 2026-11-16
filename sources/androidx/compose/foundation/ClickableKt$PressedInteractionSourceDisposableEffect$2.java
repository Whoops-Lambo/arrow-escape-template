package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ClickableKt$PressedInteractionSourceDisposableEffect$2 extends rc1 implements zr0 {
    public final /* synthetic */ MutableInteractionSource i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$2(MutableInteractionSource mutableInteractionSource, MutableState mutableState, int i) {
        super(2);
        this.i = mutableInteractionSource;
        this.j = mutableState;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        MutableState mutableState = this.j;
        ClickableKt.a(this.i, mutableState, (Composer) obj, 49);
        return az2.a;
    }
}
