package com.safedk.android.analytics.brandsafety;

import com.inmobi.media.core.config.models.CrashConfig;
import com.safedk.android.analytics.events.MaxEvents;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class q {
    public static final int a = 50;
    public static final int b = 10;
    public static final int c = 30000;
    private static final String d = "MaxEventsManager";
    private static final Object e = new Object();
    private static q f;
    private MaxEvents g = new MaxEvents(50);
    private MaxEvents h = new MaxEvents(5);

    private q() {
    }

    public static q a() {
        q qVar;
        synchronized (e) {
            if (f == null) {
                f = new q();
            }
            qVar = f;
        }
        return qVar;
    }

    public synchronized void a(com.safedk.android.analytics.events.a aVar) {
        this.g.add(aVar);
    }

    public void b(com.safedk.android.analytics.events.a aVar) {
        Logger.d(d, "Adding MAX Will display event. #event is ", Integer.valueOf(this.h.size()), ",  maxEvent=", aVar.toString());
        this.h.add(aVar);
    }

    public MaxEvents b() {
        MaxEvents maxEventsD = d();
        if (maxEventsD.size() >= 10) {
            return maxEventsD;
        }
        return a(10);
    }

    private synchronized MaxEvents d() {
        MaxEvents maxEvents;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.d(d, "");
        maxEvents = new MaxEvents(50);
        for (com.safedk.android.analytics.events.a aVar : this.g) {
            if (jCurrentTimeMillis - (aVar.c() * 1000) < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                Logger.d(d, "getEventFromLastInterval Adding max event ts = ", Long.valueOf(jCurrentTimeMillis), ", ", aVar.toString());
                maxEvents.add(aVar);
            }
        }
        return maxEvents;
    }

    public synchronized MaxEvents a(int i) {
        MaxEvents maxEvents;
        int size;
        maxEvents = new MaxEvents(i);
        if (this.g.size() >= 10) {
            size = this.g.size() - 10;
        } else {
            size = 0;
        }
        while (size < this.g.size()) {
            Logger.d(d, "getLastXEvents adding max event index ", Integer.valueOf(size), " ", this.g.get(size).toString());
            maxEvents.add(new com.safedk.android.analytics.events.a(this.g.get(size)));
            size++;
        }
        return maxEvents;
    }

    public MaxEvents c() {
        return this.h;
    }
}
