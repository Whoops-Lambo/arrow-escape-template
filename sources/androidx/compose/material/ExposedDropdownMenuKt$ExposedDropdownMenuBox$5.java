package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$5 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(null, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1(null, null, 0, null));
        return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                View view = onGlobalLayoutListener2.a;
                if (onGlobalLayoutListener2.c) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                    onGlobalLayoutListener2.c = false;
                }
                view.removeOnAttachStateChangeListener(onGlobalLayoutListener2);
            }
        };
    }
}
