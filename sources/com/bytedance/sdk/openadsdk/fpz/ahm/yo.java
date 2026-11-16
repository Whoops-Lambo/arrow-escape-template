package com.bytedance.sdk.openadsdk.fpz.ahm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.sx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class yo {
    private static HandlerThread ahm;
    private static kgy kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ahm ahmVar = (ahm) message.obj;
            if (ahmVar == null) {
                return;
            }
            int iAhm = ahmVar.ahm();
            if (iAhm == 1) {
                ahmVar.yo();
            } else {
                if (iAhm != 2) {
                    ct.ahm(ahmVar.nu());
                    return;
                }
                ahmVar.fi();
            }
            if (ahmVar.gf()) {
                ct.ahm(ahmVar.nu());
            } else if (ahmVar.at()) {
                kgy(ahmVar);
            }
        }

        public void kgy(ahm ahmVar) {
            if (ahmVar == null) {
                return;
            }
            int iIntValue = ahmVar.nu().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = ahmVar;
            sendMessageDelayed(messageObtain, ahmVar.noq());
        }

        public kgy(Looper looper) {
            super(looper);
        }
    }

    public static void ahm() {
        if (kgy != null) {
            return;
        }
        try {
            HandlerThread handlerThread = ahm;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (yo.class) {
                try {
                    HandlerThread handlerThread2 = ahm;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        ahm = com.bytedance.sdk.component.utils.fi.kgy("pag_MRC");
                        kgy = new kgy(ahm.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5gDoStQoCCHAA==", "a88KoQqxbNWtS9lcixSy", "UuAkgTe1ZMKSZ9ZTjRalOg==", 79);
            sx.rz("MRC", th2.getMessage());
        }
    }

    public static void kgy(ahm ahmVar) {
        if (ahmVar == null) {
            return;
        }
        ahm();
        kgy kgyVar = kgy;
        if (kgyVar != null) {
            kgyVar.kgy(ahmVar);
        }
    }

    public static void kgy() {
    }

    public static void ahm(ahm ahmVar) {
        if (ahmVar == null || kgy == null) {
            return;
        }
        try {
            int iIntValue = ahmVar.nu().intValue();
            if (kgy.hasMessages(iIntValue)) {
                kgy.removeMessages(iIntValue);
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5gDoStQoCCHAA==", "a88KoQqxbNWtS9lcixSy", "SesgmhW5XcaTQQ==", 44);
        }
    }
}
