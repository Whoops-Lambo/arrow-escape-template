package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Player.Listener listener = (Player.Listener) obj;
        switch (i) {
            case 0:
                listener.onRepeatModeChanged(i2);
                break;
            default:
                listener.onAudioSessionIdChanged(i2);
                break;
        }
    }
}
