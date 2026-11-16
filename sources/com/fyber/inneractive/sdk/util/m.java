package com.fyber.inneractive.sdk.util;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(WindowInsets.Type.displayCutout());
        int iA = o.a();
        if (iA != 1) {
            if (iA != 2) {
                if (iA != 3) {
                    view.setPadding(0, insets.top, 0, 0);
                    return windowInsets;
                }
                view.setPadding(0, 0, insets.right, 0);
                return windowInsets;
            }
            view.setPadding(0, 0, 0, insets.bottom);
            return windowInsets;
        }
        view.setPadding(insets.left, 0, 0, 0);
        return windowInsets;
    }
}
