package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.MainThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Fg {
    @MainThread
    public static final boolean a(@NotNull View view, @NotNull Rect rect) {
        view.getClass();
        rect.getClass();
        if (view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect)) {
            return true;
        }
        return false;
    }
}
