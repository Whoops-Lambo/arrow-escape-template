package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.gms.internal.ads.zzes;
import io.p071bidmachine.media3.common.util.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rq1 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rq1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                ((NetworkTypeObserver) obj).updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
                break;
            case 1:
                int overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
                ((o) obj).c(overrideNetworkType2 == 3 || overrideNetworkType2 == 4 || overrideNetworkType2 == 5 ? 10 : 5);
                break;
            default:
                int overrideNetworkType3 = telephonyDisplayInfo.getOverrideNetworkType();
                ((zzes) obj).c(true != (overrideNetworkType3 == 3 || overrideNetworkType3 == 4 || overrideNetworkType3 == 5) ? 5 : 10);
                break;
        }
    }
}
