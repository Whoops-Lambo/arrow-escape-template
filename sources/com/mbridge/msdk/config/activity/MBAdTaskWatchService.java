package com.mbridge.msdk.config.activity;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class MBAdTaskWatchService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public static void a() {
        try {
            Context contextD = c.n().d();
            if (contextD != null) {
                contextD.getApplicationContext().startService(new Intent(contextD, (Class<?>) MBAdTaskWatchService.class));
            }
        } catch (Throwable th) {
            q0.b("MBAdTaskWatchService", "start: " + th.getMessage());
        }
    }

    public static void b() {
        try {
            Context contextD = c.n().d();
            if (contextD != null) {
                contextD.getApplicationContext().stopService(new Intent(contextD, (Class<?>) MBAdTaskWatchService.class));
            }
        } catch (Throwable th) {
            q0.b("MBAdTaskWatchService", "stop: " + th.getMessage());
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        q0.a("MBAdTaskWatchService", "onTaskRemoved: ad task removed, cancel restore");
        b.j();
        stopSelf();
    }
}
