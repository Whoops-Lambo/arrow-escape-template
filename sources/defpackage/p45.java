package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.games_v2.zzk;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p45 extends GoogleApi implements zzk {
    public static final Api a = new Api("GamesConnect.API", new l15(), new Api.ClientKey());

    public final Task a(zzq zzqVar, boolean z) {
        TaskApiCall taskApiCallBuild = TaskApiCall.builder().run(new ca4(this, zzqVar, false, 29)).setMethodKey(6737).setAutoResolveMissingFeatures(z).build();
        if (z) {
            return doWrite(taskApiCallBuild);
        }
        return doBestEffortWrite(taskApiCallBuild);
    }
}
