package com.bytedance.sdk.component.gf.kgy;

import android.os.Handler;
import com.bytedance.sdk.component.utils.fi;
import com.bytedance.sdk.component.utils.ft;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy {
    private Handler ahm;
    private final uq<ahm> kgy;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.gf.kgy.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0215kgy {
        private static final kgy kgy = new kgy();
    }

    public Handler ahm() {
        if (this.ahm == null) {
            synchronized (kgy.class) {
                try {
                    if (this.ahm == null) {
                        this.ahm = kgy("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ahm;
    }

    private kgy() {
        this.kgy = uq.kgy(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.gf.kgy.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    kgy.this.kgy(handler, handler2);
                }
            }, 1000L);
        }
    }

    private ahm ahm(ft.kgy kgyVar, String str) {
        return new ahm(fi.kgy(str), kgyVar);
    }

    public static kgy kgy() {
        return C0215kgy.kgy;
    }

    public ft kgy(ft.kgy kgyVar, final String str) {
        ahm ahmVar = (ahm) this.kgy.kgy();
        if (ahmVar != null) {
            ahmVar.kgy(kgyVar);
            ahmVar.post(new Runnable() { // from class: com.bytedance.sdk.component.gf.kgy.kgy.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return ahmVar;
        }
        return ahm(kgyVar, str);
    }

    public ft kgy(String str) {
        return kgy((ft.kgy) null, str);
    }

    public boolean kgy(ft ftVar) {
        if (!(ftVar instanceof ahm)) {
            return false;
        }
        ahm ahmVar = (ahm) ftVar;
        if (this.kgy.kgy(ahmVar)) {
            return true;
        }
        ahmVar.ahm();
        return true;
    }
}
