package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.workers.DiagnosticsWorker;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = Logger.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Logger loggerE = Logger.e();
        String str = a;
        loggerE.a(str, "Requesting diagnostics");
        try {
            WorkManagerImpl.c(context).a((OneTimeWorkRequest) new OneTimeWorkRequest.Builder(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e) {
            Logger.e().d(str, "WorkManager is not initialized", e);
        }
    }
}
