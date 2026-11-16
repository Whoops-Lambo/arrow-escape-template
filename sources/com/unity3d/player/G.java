package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class G implements Runnable {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ UnityAccessibilityDelegate b;

    public G(UnityAccessibilityDelegate unityAccessibilityDelegate, Semaphore semaphore) {
        this.b = unityAccessibilityDelegate;
        this.a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.b;
            if (unityAccessibilityDelegate.c != null) {
                unityAccessibilityDelegate.d = new S(unityAccessibilityDelegate);
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.b;
            if (unityAccessibilityDelegate2.e != null) {
                unityAccessibilityDelegate2.f = new U(this.b);
            }
        } finally {
            this.a.release();
        }
    }
}
