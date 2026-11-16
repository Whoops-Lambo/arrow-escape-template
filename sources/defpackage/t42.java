package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t42 extends BroadcastReceiver {
    public final /* synthetic */ RequirementsWatcher a;

    public t42(RequirementsWatcher requirementsWatcher) {
        this.a = requirementsWatcher;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            this.a.checkRequirements();
        }
    }
}
