package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class V5 implements T5 {
    public volatile CrashConfig a;
    public final C4518xd b;
    public final List c;

    /* JADX WARN: Code duplicated, block: B:10:0x0078  */
    public V5(Context context, CrashConfig crashConfig, C4518xd c4518xd) {
        V5 v5;
        context.getClass();
        crashConfig.getClass();
        c4518xd.getClass();
        this.a = crashConfig;
        this.b = c4518xd;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        listSynchronizedList.getClass();
        this.c = listSynchronizedList;
        if (this.a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new C4401t5(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.a.getAnr().getAppExitReason().getEnabled()) {
            Y5.a.getClass();
            if (Y5.t()) {
                v5 = this;
                listSynchronizedList.add(new S1(context, v5, this.a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.a.getAnr().getAppExitReason().getMaxNumberOfLines()));
            } else {
                v5 = this;
            }
        } else {
            v5 = this;
        }
        if (v5.a.getAnr().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C3922c(v5.a.getAnr().getWatchdog().getInterval(), v5));
        }
    }

    public final void a(Ca ca) {
        int i;
        ca.getClass();
        if ((ca instanceof T1) && this.a.getAnr().getAppExitReason().getEnabled()) {
            i = 152;
        } else if ((ca instanceof C4429u5) && this.a.getCrashConfig().getEnabled()) {
            i = 150;
        } else if ((ca instanceof C4199lq) && this.a.getAnr().getWatchdog().getEnabled()) {
            i = 151;
        } else {
            return;
        }
        C4518xd c4518xd = this.b;
        String str = ca.a;
        Map mapSingletonMap = Collections.singletonMap("data", ca);
        mapSingletonMap.getClass();
        c4518xd.b(new C4009f3(i, str, mapSingletonMap));
    }
}
