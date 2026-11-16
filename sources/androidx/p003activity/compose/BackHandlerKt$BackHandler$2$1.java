package androidx.p003activity.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleOwner;
import androidx.p003activity.OnBackPressedDispatcher;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class BackHandlerKt$BackHandler$2$1 extends rc1 implements wr0 {
    public final /* synthetic */ OnBackPressedDispatcher i;
    public final /* synthetic */ LifecycleOwner j;
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$2$1(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
        super(1);
        this.i = onBackPressedDispatcher;
        this.j = lifecycleOwner;
        this.k = backHandlerKt$BackHandler$backCallback$1$1;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        OnBackPressedDispatcher onBackPressedDispatcher = this.i;
        LifecycleOwner lifecycleOwner = this.j;
        final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = this.k;
        onBackPressedDispatcher.a(lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                e();
            }
        };
    }
}
