package defpackage;

import com.adsurge.adn.oversea_ad.ITuringIoTFeatureMap;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dz3 extends zzbd {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ dz3(TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public void G1(ProxyResponse proxyResponse) {
        switch (this.a) {
            case 0:
                TaskUtil.setResultOrApiException(new Status(proxyResponse.a), proxyResponse, (TaskCompletionSource<ProxyResponse>) this.b);
                break;
            default:
                super.G1(proxyResponse);
                break;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public void d(String str) {
        switch (this.a) {
            case 1:
                TaskUtil.setResultOrApiException(str != null ? Status.RESULT_SUCCESS : new Status(ITuringIoTFeatureMap.RIOT_BLUE_TOOTH_MAC_ADDRESS), str, (TaskCompletionSource<String>) this.b);
                break;
            default:
                super.d(str);
                break;
        }
    }
}
