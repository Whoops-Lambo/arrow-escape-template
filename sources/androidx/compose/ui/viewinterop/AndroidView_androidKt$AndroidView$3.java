package androidx.compose.ui.viewinterop;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.Ref;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidView_androidKt$AndroidView$3 extends rc1 implements wr0 {
    public final /* synthetic */ SaveableStateRegistry i;
    public final /* synthetic */ String j;
    public final /* synthetic */ Ref k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$3(SaveableStateRegistry saveableStateRegistry, String str, Ref ref) {
        super(1);
        this.i = saveableStateRegistry;
        this.j = str;
        this.k = ref;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final SaveableStateRegistry.Entry entryC = this.i.c(this.j, new AndroidView_androidKt$AndroidView$3$valueProvider$1(this.k));
        return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                entryC.c();
            }
        };
    }
}
