package defpackage;

import android.util.Log;
import com.unity.androidnotifications.UnityNotificationManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class uz2 extends Thread {
    public LinkedTransferQueue a;
    public ConcurrentHashMap b;
    public UnityNotificationManager c;
    public int d;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean zA;
        LinkedTransferQueue linkedTransferQueue = this.a;
        while (true) {
            boolean z = false;
            while (true) {
                try {
                    tz2 tz2Var = (tz2) linkedTransferQueue.take();
                    try {
                        zA = tz2Var.a(this.c, this.b);
                    } catch (Exception e) {
                        Log.e("UnityNotifications", "Exception executing notification task", e);
                        zA = false;
                    }
                    z |= zA;
                    if (!(tz2Var instanceof rz2)) {
                        this.d++;
                    }
                    if (linkedTransferQueue.size() == 0 && z) {
                        try {
                            rz2 rz2Var = new rz2();
                            rz2Var.a = this;
                            linkedTransferQueue.add(rz2Var);
                            break;
                        } catch (InterruptedException unused) {
                            z = false;
                            if (linkedTransferQueue.isEmpty()) {
                                return;
                            }
                        }
                    }
                } catch (InterruptedException unused2) {
                }
            }
        }
    }
}
