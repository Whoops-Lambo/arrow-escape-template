package defpackage;

import android.app.GameState;
import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n62 {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof OnBackInvokedCallback;
    }

    public static /* synthetic */ GameState c(int i, int i2, int i3, boolean z) {
        return new GameState(z, i, i2, i3);
    }

    public static /* synthetic */ GameState d(int i, boolean z) {
        return new GameState(z, i);
    }
}
