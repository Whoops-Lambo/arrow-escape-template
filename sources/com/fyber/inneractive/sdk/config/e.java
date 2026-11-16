package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.w1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements u {
    public w1 d;
    public final c1 e;
    public final d g;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean b = new AtomicBoolean(false);
    public boolean c = false;
    public final Handler f = new Handler(Looper.getMainLooper(), new b(this));

    public final void a() {
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        v vVar = iAConfigManager.u;
        if (!vVar.d) {
            vVar.c.add(this);
        }
        w1 w1Var = new w1(TimeUnit.MINUTES, iAConfigManager.u.b.a("session_duration", 30, 1));
        this.d = w1Var;
        w1Var.e = this.g;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final void onGlobalConfigChanged(v vVar, r rVar) {
        w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.d = false;
            w1Var.f = 0L;
            u1 u1Var = w1Var.c;
            if (u1Var != null) {
                u1Var.removeMessages(1932593528);
            }
            long jA = rVar.a("session_duration", 30, 1);
            long j = this.d.f;
            w1 w1Var2 = new w1(TimeUnit.MINUTES, jA);
            w1Var2.f = j;
            IAlog.a("Visible time counter init - time %d", Long.valueOf(jA));
            this.d = w1Var2;
            w1Var2.e = this.g;
        }
        vVar.c.remove(this);
    }

    public e(c1 c1Var) {
        c cVar = new c(this);
        this.g = new d(this);
        this.e = c1Var;
        Application application = com.fyber.inneractive.sdk.util.o.a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }
}
