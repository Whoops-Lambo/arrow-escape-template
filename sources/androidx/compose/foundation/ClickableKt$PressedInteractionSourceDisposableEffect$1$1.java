package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ClickableKt$PressedInteractionSourceDisposableEffect$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableInteractionSource j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$1$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.i = mutableState;
        this.j = mutableInteractionSource;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final MutableState mutableState = this.i;
        final MutableInteractionSource mutableInteractionSource = this.j;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                MutableState mutableState2 = mutableState;
                PressInteraction.Press press = (PressInteraction.Press) mutableState2.getA();
                if (press != null) {
                    mutableInteractionSource.b(new PressInteraction.Cancel(press));
                    mutableState2.setValue(null);
                }
            }
        };
    }
}
