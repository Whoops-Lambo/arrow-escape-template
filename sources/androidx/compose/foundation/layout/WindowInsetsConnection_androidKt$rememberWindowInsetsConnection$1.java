package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.li2;
import defpackage.qo;
import defpackage.rc1;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1 extends rc1 implements wr0 {
    public final /* synthetic */ WindowInsetsNestedScrollConnection i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
        super(1);
        this.i = windowInsetsNestedScrollConnection;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.i;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                qo qoVar = windowInsetsNestedScrollConnection2.j;
                if (qoVar != null) {
                    qoVar.C(null, WindowInsetsNestedScrollConnection$dispose$1.i);
                }
                li2 li2Var = windowInsetsNestedScrollConnection2.i;
                if (li2Var != null) {
                    li2Var.cancel(null);
                }
                WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsNestedScrollConnection2.e;
                if (windowInsetsAnimationController != null) {
                    windowInsetsAnimationController.finish(!s71.b(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
                }
            }
        };
    }
}
