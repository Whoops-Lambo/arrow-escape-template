package defpackage;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import io.p071bidmachine.media3.common.l0;
import io.p071bidmachine.media3.common.util.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wj0 implements ListenerSet.Event, j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ wj0(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Player.Listener) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((l0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
