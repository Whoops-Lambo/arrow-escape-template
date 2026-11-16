package com.bytedance.sdk.component.gf.kgy;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class noq {
    public final Handler kgy;

    public abstract boolean kgy();

    public noq(Handler handler) {
        this.kgy = handler;
    }

    public void ahm(final Runnable runnable) {
        if (kgy()) {
            rz(new Runnable() { // from class: com.bytedance.sdk.component.gf.kgy.noq.2
                @Override // java.lang.Runnable
                public void run() {
                    Handler handler = noq.this.kgy;
                    if (handler != null) {
                        handler.removeCallbacks(runnable);
                    }
                }
            });
            return;
        }
        Handler handler = this.kgy;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void kgy(final Runnable runnable) {
        if (kgy()) {
            rz(new Runnable() { // from class: com.bytedance.sdk.component.gf.kgy.noq.1
                @Override // java.lang.Runnable
                public void run() {
                    Handler handler = noq.this.kgy;
                    if (handler != null) {
                        handler.post(runnable);
                    }
                }
            });
            return;
        }
        Handler handler = this.kgy;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void rz(Runnable runnable) {
        ct.kgy().kgy(runnable);
    }

    public void kgy(final Runnable runnable, final long j) {
        if (kgy()) {
            rz(new Runnable() { // from class: com.bytedance.sdk.component.gf.kgy.noq.3
                @Override // java.lang.Runnable
                public void run() {
                    Handler handler = noq.this.kgy;
                    if (handler != null) {
                        handler.postDelayed(runnable, j);
                    }
                }
            });
            return;
        }
        Handler handler = this.kgy;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }
}
