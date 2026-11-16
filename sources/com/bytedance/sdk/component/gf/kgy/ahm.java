package com.bytedance.sdk.component.gf.kgy;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ft;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ahm extends ft implements rz {
    private final HandlerThread ahm;

    @Override // com.bytedance.sdk.component.gf.kgy.rz
    public void kgy() {
        removeCallbacksAndMessages(null);
        WeakReference<ft.kgy> weakReference = this.kgy;
        if (weakReference != null) {
            weakReference.clear();
            this.kgy = null;
        }
    }

    public void ahm() {
        HandlerThread handlerThread = this.ahm;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public ahm(HandlerThread handlerThread, ft.kgy kgyVar) {
        super(handlerThread.getLooper(), kgyVar);
        this.ahm = handlerThread;
    }

    public void kgy(ft.kgy kgyVar) {
        this.kgy = new WeakReference<>(kgyVar);
    }
}
