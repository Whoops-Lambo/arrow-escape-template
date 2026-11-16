package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.core.view.ViewCompat;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class WindowInsetsHolder$Companion$current$1 extends rc1 implements wr0 {
    public final /* synthetic */ WindowInsetsHolder i;
    public final /* synthetic */ View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsHolder$Companion$current$1(WindowInsetsHolder windowInsetsHolder, View view) {
        super(1);
        this.i = windowInsetsHolder;
        this.j = view;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final WindowInsetsHolder windowInsetsHolder = this.i;
        InsetsListener insetsListener = windowInsetsHolder.u;
        final View view = this.j;
        view.getClass();
        if (windowInsetsHolder.t == 0) {
            ViewCompat.G(view, insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(insetsListener);
            if (Build.VERSION.SDK_INT >= 30) {
                ViewCompat.N(view, insetsListener);
            }
        }
        windowInsetsHolder.t++;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                View view2 = view;
                view2.getClass();
                WindowInsetsHolder windowInsetsHolder2 = windowInsetsHolder;
                int i = windowInsetsHolder2.t - 1;
                windowInsetsHolder2.t = i;
                if (i == 0) {
                    ViewCompat.G(view2, null);
                    ViewCompat.N(view2, null);
                    view2.removeOnAttachStateChangeListener(windowInsetsHolder2.u);
                }
            }
        };
    }
}
