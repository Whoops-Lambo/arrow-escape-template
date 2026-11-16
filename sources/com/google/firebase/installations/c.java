package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import defpackage.e32;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements StateListener {
    public final Utils a;
    public final TaskCompletionSource b;

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    public c(Utils utils, TaskCompletionSource taskCompletionSource) {
        this.a = utils;
        this.b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        String str;
        if (persistedInstallationEntry.h() && !this.a.a(persistedInstallationEntry)) {
            a aVarA = InstallationTokenResult.builder().a(persistedInstallationEntry.a());
            aVarA.b = persistedInstallationEntry.b();
            aVarA.c = (byte) (aVarA.c | 1);
            long jG = persistedInstallationEntry.g();
            byte b = (byte) (aVarA.c | 2);
            aVarA.c = b;
            if (b == 3 && (str = aVarA.a) != null) {
                this.b.setResult(new b(str, aVarA.b, jG));
                return true;
            }
            StringBuilder sb = new StringBuilder();
            if (aVarA.a == null) {
                sb.append(" token");
            }
            if ((aVarA.c & 1) == 0) {
                sb.append(" tokenExpirationTimestamp");
            }
            if ((aVarA.c & 2) == 0) {
                sb.append(" tokenCreationTimestamp");
            }
            e32.i(nj.p(sb, "Missing required properties:"));
        }
        return false;
    }
}
