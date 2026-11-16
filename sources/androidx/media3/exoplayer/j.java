package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ j(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        Player.Listener listener = (Player.Listener) obj;
        switch (i) {
            case 0:
                listener.onSkipSilenceEnabledChanged(z);
                break;
            case 1:
                listener.onShuffleModeEnabledChanged(z);
                break;
            default:
                listener.onSkipSilenceEnabledChanged(z);
                break;
        }
    }
}
