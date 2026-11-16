package androidx.compose.ui.platform;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2 extends rc1 implements wr0 {
    public final /* synthetic */ DisposableSaveableStateRegistry i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        super(1);
        this.i = disposableSaveableStateRegistry;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final DisposableSaveableStateRegistry disposableSaveableStateRegistry = this.i;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                ((DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1) disposableSaveableStateRegistry.a).invoke();
            }
        };
    }
}
