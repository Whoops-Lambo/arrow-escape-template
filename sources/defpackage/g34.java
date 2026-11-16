package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.internal.zzah;
import com.google.android.gms.internal.games_v2.zzap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g34 implements zzap, RemoteCall {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ g34(boolean z, String[] strArr) {
        this.a = z;
        this.b = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ((zzah) obj).zzH((TaskCompletionSource) obj2, this.a, this.b);
    }

    @Override // com.google.android.gms.internal.games_v2.zzap
    public /* synthetic */ Task b(GoogleApi googleApi) {
        return googleApi.doRead(TaskApiCall.builder().run(new g34(this.a, this.b)).setMethodKey(6728).build());
    }
}
