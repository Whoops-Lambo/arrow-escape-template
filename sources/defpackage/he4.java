package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.RecallAccess;
import com.google.android.gms.internal.games_v2.zzam;
import com.google.android.gms.internal.games_v2.zzer;
import com.google.android.gms.internal.games_v2.zzfl;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class he4 extends zzfl {
    public final /* synthetic */ TaskCompletionSource a;

    public he4(zzer zzerVar, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.games_v2.zzfl, com.google.android.gms.internal.games_v2.zzai
    public final void N1(zzam zzamVar) {
        this.a.setResult(RecallAccess.zza(zzamVar));
    }

    @Override // com.google.android.gms.internal.games_v2.zzfl, com.google.android.gms.internal.games_v2.zzai
    public final void h(Status status) {
        this.a.setException(new ApiException(status));
    }
}
