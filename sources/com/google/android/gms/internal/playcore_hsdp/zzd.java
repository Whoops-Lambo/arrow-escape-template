package com.google.android.gms.internal.playcore_hsdp;

import android.os.Process;
import android.util.Log;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzd {
    public final String a = jc1.n("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PhoneskyVerificationUtils");

    public final void a(String str) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", this.a + " : " + str);
        }
    }
}
