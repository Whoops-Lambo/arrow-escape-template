package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = Logger.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.e().a(a, "Received intent " + intent);
        try {
            WorkManagerImpl workManagerImplC = WorkManagerImpl.c(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            workManagerImplC.getClass();
            synchronized (WorkManagerImpl.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = workManagerImplC.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    workManagerImplC.i = pendingResultGoAsync;
                    if (workManagerImplC.h) {
                        pendingResultGoAsync.finish();
                        workManagerImplC.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            Logger.e().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
