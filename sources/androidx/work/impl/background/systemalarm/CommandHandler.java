package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.StopWorkRunnable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RestrictTo
public class CommandHandler implements ExecutionListener {
    public static final String e = Logger.g("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final StartStopTokens d;

    public static WorkGenerationalId b(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId.b);
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.c) {
            try {
                DelayMetCommandHandler delayMetCommandHandler = (DelayMetCommandHandler) this.b.remove(workGenerationalId);
                this.d.b(workGenerationalId);
                if (delayMetCommandHandler != null) {
                    delayMetCommandHandler.g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CommandHandler(Context context, StartStopTokens startStopTokens) {
        this.a = context;
        this.d = startStopTokens;
    }

    public final void a(int i, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        List<StartStopToken> listC;
        ArrayList arrayList;
        boolean z;
        String action = intent.getAction();
        int i2 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger.e().a(e, "Handling constraints changed " + intent);
            Context context = this.a;
            ConstraintsCommandHandler constraintsCommandHandler = new ConstraintsCommandHandler(context, i, systemAlarmDispatcher);
            WorkConstraintsTrackerImpl workConstraintsTrackerImpl = constraintsCommandHandler.b;
            ArrayList arrayListM = systemAlarmDispatcher.e.c.workSpecDao().m();
            String str = ConstraintProxy.a;
            int size = arrayListM.size();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListM.get(i3);
                i3++;
                Constraints constraints = ((WorkSpec) obj).j;
                z2 |= constraints.d;
                z3 |= constraints.b;
                z4 |= constraints.e;
                if (constraints.a != NetworkType.a) {
                    z = true;
                } else {
                    z = false;
                }
                z5 |= z;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            workConstraintsTrackerImpl.d(arrayListM);
            ArrayList arrayList2 = new ArrayList(arrayListM.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListM.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayListM.get(i4);
                i4++;
                WorkSpec workSpec = (WorkSpec) obj2;
                String str3 = workSpec.a;
                if (jCurrentTimeMillis >= workSpec.a() && (!workSpec.b() || workConstraintsTrackerImpl.c(str3))) {
                    arrayList2.add(workSpec);
                }
            }
            int size3 = arrayList2.size();
            while (i2 < size3) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                WorkSpec workSpec2 = (WorkSpec) obj3;
                String str4 = workSpec2.a;
                WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, workGenerationalIdA);
                Logger.e().a(ConstraintsCommandHandler.c, "Creating a delay_met command for workSpec with id (" + str4 + ")");
                systemAlarmDispatcher.b.b().execute(new SystemAlarmDispatcher.AddRunnable(constraintsCommandHandler.a, intent3, systemAlarmDispatcher));
            }
            workConstraintsTrackerImpl.e();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger.e().a(e, "Handling reschedule " + intent + ", " + i);
            systemAlarmDispatcher.e.f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                Context context2 = this.a;
                WorkGenerationalId workGenerationalIdB = b(intent);
                Logger loggerE = Logger.e();
                String str5 = e;
                loggerE.a(str5, "Handling schedule work for " + workGenerationalIdB);
                WorkDatabase workDatabase = systemAlarmDispatcher.e.c;
                workDatabase.beginTransaction();
                try {
                    WorkSpec workSpecN = workDatabase.workSpecDao().n(workGenerationalIdB.a);
                    if (workSpecN == null) {
                        Logger.e().h(str5, "Skipping scheduling " + workGenerationalIdB + " because it's no longer in the DB");
                        return;
                    }
                    if (workSpecN.b.d()) {
                        Logger.e().h(str5, "Skipping scheduling " + workGenerationalIdB + "because it is finished.");
                        return;
                    }
                    long jA = workSpecN.a();
                    if (!workSpecN.b()) {
                        Logger.e().a(str5, "Setting up Alarms for " + workGenerationalIdB + "at " + jA);
                        Alarms.b(context2, workDatabase, workGenerationalIdB, jA);
                    } else {
                        Logger.e().a(str5, "Opportunistically setting an alarm for " + workGenerationalIdB + "at " + jA);
                        Alarms.b(context2, workDatabase, workGenerationalIdB, jA);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        systemAlarmDispatcher.b.b().execute(new SystemAlarmDispatcher.AddRunnable(i, intent4, systemAlarmDispatcher));
                    }
                    workDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    workDatabase.endTransaction();
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.c) {
                    try {
                        WorkGenerationalId workGenerationalIdB2 = b(intent);
                        Logger loggerE2 = Logger.e();
                        String str6 = e;
                        loggerE2.a(str6, "Handing delay met for " + workGenerationalIdB2);
                        if (!this.b.containsKey(workGenerationalIdB2)) {
                            DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.a, i, systemAlarmDispatcher, this.d.d(workGenerationalIdB2));
                            this.b.put(workGenerationalIdB2, delayMetCommandHandler);
                            delayMetCommandHandler.e();
                        } else {
                            Logger.e().a(str6, "WorkSpec " + workGenerationalIdB2 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                StartStopTokens startStopTokens = this.d;
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                    int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    arrayList = new ArrayList(1);
                    StartStopToken startStopTokenB = startStopTokens.b(new WorkGenerationalId(string, i5));
                    if (startStopTokenB != null) {
                        listC = arrayList;
                        arrayList.add(startStopTokenB);
                        listC = arrayList;
                    }
                } else {
                    listC = startStopTokens.c(string);
                }
                listC = arrayList;
                for (StartStopToken startStopToken : listC) {
                    Logger.e().a(e, "Handing stopWork work for " + string);
                    WorkManagerImpl workManagerImpl = systemAlarmDispatcher.e;
                    workManagerImpl.d.a(new StopWorkRunnable(workManagerImpl, startStopToken, false));
                    Context context3 = this.a;
                    WorkDatabase workDatabase2 = systemAlarmDispatcher.e.c;
                    WorkGenerationalId workGenerationalId = startStopToken.a;
                    String str7 = Alarms.a;
                    SystemIdInfoDao systemIdInfoDao = workDatabase2.systemIdInfoDao();
                    SystemIdInfo systemIdInfoC = systemIdInfoDao.c(workGenerationalId);
                    if (systemIdInfoC != null) {
                        Alarms.a(context3, workGenerationalId, systemIdInfoC.c);
                        Logger.e().a(Alarms.a, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
                        systemIdInfoDao.a(workGenerationalId);
                    }
                    systemAlarmDispatcher.e(startStopToken.a, false);
                }
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                WorkGenerationalId workGenerationalIdB3 = b(intent);
                boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                Logger.e().a(e, "Handling onExecutionCompleted " + intent + ", " + i);
                e(workGenerationalIdB3, z6);
                return;
            }
            Logger.e().h(e, "Ignoring intent " + intent);
            return;
        }
        Logger.e().c(e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
    }
}
