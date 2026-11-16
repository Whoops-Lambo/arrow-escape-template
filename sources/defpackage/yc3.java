package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yc3 implements OnBackInvokedCallback {
    public final /* synthetic */ hi3 a;

    public final void onBackInvoked() {
        Runnable runnable = this.a.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public yc3(hi3 hi3Var) {
        this.a = hi3Var;
    }
}
