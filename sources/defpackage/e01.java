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
/* JADX INFO: loaded from: classes9.dex */
public final class e01 implements zzap, RemoteCall {
    public final /* synthetic */ int a;
    public final String b;
    public final int c;

    public e01(int i, String str) {
        this.a = 0;
        this.c = i;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        int i = this.a;
        int i2 = this.c;
        String str = this.b;
        switch (i) {
            case 3:
                ((zzah) obj).zzF((TaskCompletionSource) obj2, str, i2);
                break;
            case 4:
                ((zzah) obj).zzE((TaskCompletionSource) obj2, str, i2);
                break;
            case 5:
            default:
                ((zzah) obj).zzt((TaskCompletionSource) obj2, this.b, this.c, true, false);
                break;
            case 6:
                ((zzah) obj).zzI(str, i2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.games_v2.zzap
    public /* synthetic */ Task b(GoogleApi googleApi) {
        int i = this.a;
        int i2 = this.c;
        String str = this.b;
        switch (i) {
            case 1:
                return googleApi.doWrite(TaskApiCall.builder().run(new e01(str, i2, 4)).setMethodKey(6696).build());
            case 2:
                return googleApi.doWrite(TaskApiCall.builder().run(new e01(str, i2, 3)).setMethodKey(6697).build());
            case 3:
            case 4:
            default:
                return googleApi.doRead(TaskApiCall.builder().run(new e01(str, i2, 8)).setMethodKey(6716).build());
            case 5:
                return googleApi.doWrite(TaskApiCall.builder().run(new e01(str, i2, 6)).setMethodKey(6729).build());
        }
    }

    public /* synthetic */ e01(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }
}
