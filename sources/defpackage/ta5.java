package defpackage;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth_blockstore.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ta5 extends zze {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ ta5(TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public void R0(Status status, RetrieveBytesResponse retrieveBytesResponse) {
        switch (this.a) {
            case 0:
                TaskUtil.setResultOrApiException(status, retrieveBytesResponse, (TaskCompletionSource<RetrieveBytesResponse>) this.b);
                break;
            default:
                super.R0(status, retrieveBytesResponse);
                break;
        }
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public void k0(Status status, byte[] bArr) {
        switch (this.a) {
            case 1:
                TaskUtil.setResultOrApiException(status, bArr, (TaskCompletionSource<byte[]>) this.b);
                break;
            default:
                super.k0(status, bArr);
                break;
        }
    }
}
