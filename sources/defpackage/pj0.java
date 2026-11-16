package defpackage;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import io.p071bidmachine.BidMachine;
import io.p071bidmachine.media3.common.l0;
import io.p071bidmachine.media3.common.util.j;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pj0 implements ListenerSet.Event, b, j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ pj0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 3:
                return BidMachine.lambda$setTestMode$2(z);
            default:
                return BidMachine.lambda$setConsentStatus$5(z);
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Player.Listener) obj).onShuffleModeEnabledChanged(z);
                break;
            case 1:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(z);
                break;
            case 2:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(z);
                break;
            case 3:
            case 4:
            default:
                ((l0) obj).onSkipSilenceEnabledChanged(z);
                break;
            case 5:
                ((l0) obj).onShuffleModeEnabledChanged(z);
                break;
        }
    }
}
