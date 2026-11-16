package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class SystemAlarmScheduler implements Scheduler {
    public static final String a = Logger.g("SystemAlarmScheduler");

    @Override // androidx.work.impl.Scheduler
    public final boolean b() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public final void d(WorkSpec... workSpecArr) {
        if (workSpecArr.length <= 0) {
            return;
        }
        WorkSpec workSpec = workSpecArr[0];
        Logger.e().a(a, "Scheduling work with workSpecId " + workSpec.a);
        WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec);
        String str = CommandHandler.e;
        Intent intent = new Intent((Context) null, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        CommandHandler.c(intent, workGenerationalIdA);
        throw null;
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(String str) {
        String str2 = CommandHandler.e;
        Intent intent = new Intent((Context) null, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        throw null;
    }
}
