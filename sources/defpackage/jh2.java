package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.internal.zzah;
import com.google.android.gms.internal.games_v2.zzap;
import com.google.android.gms.internal.games_v2.zzau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class jh2 implements zzau, RemoteCall, zzap {
    public final /* synthetic */ int a;
    public final String b;
    public final boolean c;

    public jh2(boolean z, String str) {
        this.a = 1;
        this.b = str;
        this.c = z;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        zzah zzahVar = (zzah) obj;
        switch (this.a) {
            case 3:
                zzahVar.zzR(taskCompletionSource, this.b, this.c);
                break;
            case 4:
            default:
                zzahVar.zzs(taskCompletionSource, this.b, this.c);
                break;
            case 5:
                zzahVar.zzv(taskCompletionSource, this.b, this.c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.games_v2.zzap
    public /* synthetic */ Task b(GoogleApi googleApi) {
        int i = this.a;
        boolean z = this.c;
        String str = this.b;
        switch (i) {
            case 4:
                return googleApi.doWrite(TaskApiCall.builder().run(new jh2(3, str, z)).setMethodKey(6699).build());
            case 5:
            default:
                return googleApi.doRead(TaskApiCall.builder().run(new jh2(7, str, z)).setMethodKey(6711).build());
            case 6:
                return googleApi.doRead(TaskApiCall.builder().run(new jh2(5, str, z)).setMethodKey(6702).build());
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = this.c ? "Applink" : "Unclassified";
                String str2 = this.b;
                if (str2 == null) {
                    return str;
                }
                return str + '(' + str2 + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Task a(GoogleApi googleApi, List list) {
        TaskApiCall.Builder builder = TaskApiCall.builder();
        ma maVar = new ma();
        maVar.b = this.b;
        maVar.a = this.c;
        maVar.c = list;
        return googleApi.doWrite(builder.run(maVar).setMethodKey(6748).build());
    }

    public /* synthetic */ jh2(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
