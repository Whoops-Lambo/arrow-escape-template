package defpackage;

import android.app.ActivityManager;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzlk;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a25 implements ol2 {
    public static final /* synthetic */ a25 b = new a25(0);
    public static final /* synthetic */ a25 c = new a25(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a25(int i) {
        this.a = i;
    }

    @Override // defpackage.ol2
    public final Object get() {
        switch (this.a) {
            case 0:
                Object obj = zzlk.j;
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(rh4.b);
                return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof lo1 ? (lo1) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new lo1(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z = true;
                    }
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return new Boolean(z);
        }
    }
}
