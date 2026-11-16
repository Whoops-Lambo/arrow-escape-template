package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import defpackage.e32;

/* JADX INFO: renamed from: com.ironsource.i5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class HandlerC4791i5 extends Handler {
    private static final String b = "DownloadHandler";
    Vc a;

    public void a(Vc vc) {
        if (vc != null) {
            this.a = vc;
        } else {
            e32.a();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Vc vc = this.a;
        if (vc == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                vc.a((D8) message.obj);
            } else {
                this.a.a((D8) message.obj, new C5008u8(i, C5052wg.a(i)));
            }
        } catch (Throwable th) {
            C4950r4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public HandlerC4791i5(Looper looper) {
        super(looper);
    }

    public void a() {
        this.a = null;
    }
}
