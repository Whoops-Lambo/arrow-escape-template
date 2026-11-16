package com.unity3d.player;

import android.os.SystemClock;
import android.view.KeyEvent;

/* JADX INFO: renamed from: com.unity3d.player.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC5255h0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC5255h0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        KeyEvent keyEvent = new KeyEvent(jUptimeMillis, jUptimeMillis, 0, 4, 1, 0, -1, 0, 0, 257);
        KeyEvent keyEvent2 = new KeyEvent(jUptimeMillis, 1 + jUptimeMillis, 1, 4, 1, 0, -1, 0, 0, 257);
        this.a.getActivity().dispatchKeyEvent(keyEvent);
        this.a.getActivity().dispatchKeyEvent(keyEvent2);
    }
}
