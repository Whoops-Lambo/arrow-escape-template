package com.moloco.sdk.acm.db;

import android.content.Context;
import androidx.room.Room;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public final MetricsDb a(Context context) {
        MetricsDb metricsDb;
        context.getClass();
        MetricsDb metricsDb2 = MetricsDb.b;
        if (metricsDb2 == null) {
            synchronized (this) {
                try {
                    metricsDb = MetricsDb.b;
                    if (metricsDb == null) {
                        try {
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            metricsDb = (MetricsDb) Room.a(applicationContext, MetricsDb.class, "metrics-db").b();
                            MetricsDb.b = metricsDb;
                        } catch (Exception e) {
                            throw new IllegalStateException("Database creation failed", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return metricsDb;
        }
        return metricsDb2;
    }
}
