package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class HandlerC4592a6 extends Handler {
    private final ConcurrentHashMap<String, Vc> a;

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            D8 d8 = (D8) message.obj;
            String path = d8.getPath();
            Vc vc = this.a.get(path);
            if (vc == null) {
                return;
            }
            if (a(message.what)) {
                vc.a(d8);
            } else {
                int i = message.what;
                vc.a(d8, new C5008u8(i, C5052wg.a(i)));
            }
            this.a.remove(path);
        } catch (Throwable th) {
            C4950r4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public HandlerC4592a6(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap<>();
    }

    public void a(String str, Vc vc) {
        if (str == null || vc == null) {
            return;
        }
        this.a.put(str, vc);
    }
}
