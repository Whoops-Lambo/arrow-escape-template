package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.CommandsCompletedListener {
    public static final String d = Logger.g("SystemAlarmService");
    public SystemAlarmDispatcher b;
    public boolean c;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.b = systemAlarmDispatcher;
        if (systemAlarmDispatcher.i != null) {
            Logger.e().c(SystemAlarmDispatcher.j, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            systemAlarmDispatcher.i = this;
        }
        this.c = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        SystemAlarmDispatcher systemAlarmDispatcher = this.b;
        systemAlarmDispatcher.getClass();
        Logger.e().a(SystemAlarmDispatcher.j, "Destroying SystemAlarmDispatcher");
        systemAlarmDispatcher.d.f(systemAlarmDispatcher);
        systemAlarmDispatcher.i = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            Logger.e().f(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            SystemAlarmDispatcher systemAlarmDispatcher = this.b;
            systemAlarmDispatcher.getClass();
            Logger loggerE = Logger.e();
            String str = SystemAlarmDispatcher.j;
            loggerE.a(str, "Destroying SystemAlarmDispatcher");
            systemAlarmDispatcher.d.f(systemAlarmDispatcher);
            systemAlarmDispatcher.i = null;
            SystemAlarmDispatcher systemAlarmDispatcher2 = new SystemAlarmDispatcher(this);
            this.b = systemAlarmDispatcher2;
            if (systemAlarmDispatcher2.i != null) {
                Logger.e().c(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                systemAlarmDispatcher2.i = this;
            }
            this.c = false;
        }
        if (intent != null) {
            this.b.a(i2, intent);
            return 3;
        }
        return 3;
    }
}
