package defpackage;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.DebugTextViewHelper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w50 implements Player.Listener, Runnable {
    public final /* synthetic */ DebugTextViewHelper a;

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        this.a.updateAndPost();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        this.a.updateAndPost();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.a.updateAndPost();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.updateAndPost();
    }

    public w50(DebugTextViewHelper debugTextViewHelper) {
        this.a = debugTextViewHelper;
    }
}
