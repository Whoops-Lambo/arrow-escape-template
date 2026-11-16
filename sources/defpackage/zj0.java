package defpackage;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj0 implements ListenerSet.Event, b {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ zj0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        return "MediaView videoPlayerActivityClosed, position: " + this.a + ", finished: " + this.b;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onDeviceVolumeChanged(this.a, this.b);
    }
}
