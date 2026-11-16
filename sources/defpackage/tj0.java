package defpackage;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import io.p071bidmachine.media3.common.l0;
import io.p071bidmachine.media3.common.util.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tj0 implements ListenerSet.Event, j {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ tj0(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                ((Player.Listener) obj).onVolumeChanged(f);
                break;
            default:
                ((l0) obj).onVolumeChanged(f);
                break;
        }
    }
}
