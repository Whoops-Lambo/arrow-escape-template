package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.StateListener;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class du0 implements StateListener {
    public final TaskCompletionSource a;

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        return false;
    }

    public du0(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.f() != 3 && !persistedInstallationEntry.h() && persistedInstallationEntry.f() != 5) {
            return false;
        }
        this.a.trySetResult(persistedInstallationEntry.c());
        return true;
    }
}
