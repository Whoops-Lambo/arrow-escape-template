package io.p071bidmachine.internal;

import android.content.Context;
import io.p071bidmachine.BidMachineSharedPreferenceKt;
import io.p071bidmachine.SessionManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements SessionManager.Observer {
    public Context a;
    public int b;
    public String c;

    @Override // io.bidmachine.SessionManager.Observer
    public final void onSessionEvent(SessionManager.Status status) {
        Context context;
        status.getClass();
        if (status == SessionManager.Status.START && (context = this.a) != null) {
            BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
            BidMachineSharedPreferenceKt.decreaseBMIFVTtlSessionCountRemaining$default(bidMachineSharedPreferenceKt, context, 0, 2, null);
            int i = this.b;
            if (i > 0 && bidMachineSharedPreferenceKt.getBMIFVTtlSessionCountRemaining(context) <= 0) {
                this.c = bidMachineSharedPreferenceKt.generateBMIFV(context, i);
            }
        }
    }
}
