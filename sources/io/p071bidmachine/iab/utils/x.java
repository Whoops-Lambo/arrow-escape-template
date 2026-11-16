package io.p071bidmachine.iab.utils;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class x implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(this.a);
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsets;
    }

    public x(int i) {
        this.a = i;
    }
}
