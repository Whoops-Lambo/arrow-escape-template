package io.p071bidmachine.media3.exoplayer.video;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ u b;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            u.a(this.b, this.a.getDisplay(0));
        }
    }

    public s(u uVar, DisplayManager displayManager) {
        this.b = uVar;
        this.a = displayManager;
    }
}
