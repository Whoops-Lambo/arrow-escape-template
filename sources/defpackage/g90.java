package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Size;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.upstream.DataSource;
import io.p071bidmachine.media3.exoplayer.source.p;
import io.p071bidmachine.media3.exoplayer.source.u0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g90 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g90(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new ProgressiveMediaSource.Factory((DataSource.Factory) obj, ((g) obj2).a);
            case 1:
                return SimpleBasePlayer.lambda$setVideoTextureView$20((SimpleBasePlayer.State) obj2, (Size) obj);
            case 2:
                return SimpleBasePlayer.lambda$setPlaylistMetadata$15((SimpleBasePlayer.State) obj2, (MediaMetadata) obj);
            case 3:
                return SimpleBasePlayer.lambda$setVideoSurfaceHolder$18((SimpleBasePlayer.State) obj2, (SurfaceHolder) obj);
            case 4:
                return SimpleBasePlayer.lambda$setVideoSurfaceView$19((SimpleBasePlayer.State) obj2, (SurfaceView) obj);
            case 5:
                return SimpleBasePlayer.lambda$setAudioAttributes$30((SimpleBasePlayer.State) obj2, (AudioAttributes) obj);
            case 6:
                return ((SimpleBasePlayer) obj2).lambda$stop$12((SimpleBasePlayer.State) obj);
            case 7:
                return SimpleBasePlayer.lambda$setPlaybackParameters$11((SimpleBasePlayer.State) obj2, (PlaybackParameters) obj);
            case 8:
                return SimpleBasePlayer.lambda$setTrackSelectionParameters$14((SimpleBasePlayer.State) obj2, (TrackSelectionParameters) obj);
            default:
                return new u0((io.p071bidmachine.media3.datasource.g) obj, ((p) obj2).a);
        }
    }
}
