package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.os.Process;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Seedless implements Consumer {
    public static final Sapodilla c = new Sapodilla();
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final void a() {
        synchronized (this.b) {
            try {
                if (this.b.get()) {
                    return;
                }
                Context contextA = Cconst.a();
                if (contextA == null) {
                    return;
                }
                if (contextA.checkPermission("android.permission.DETECT_SCREEN_RECORDING", Process.myPid(), Process.myUid()) != 0) {
                    return;
                }
                try {
                    this.a.set(((WindowManager) contextA.getSystemService("window")).addScreenRecordingCallback(Cepheus.b, this));
                    this.b.set(true);
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.set(((Integer) obj).intValue());
    }
}
