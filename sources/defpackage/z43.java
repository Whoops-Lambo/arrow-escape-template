package defpackage;

import android.media.MediaPlayer;
import com.inmobi.media.C4075hd;
import com.inmobi.media.Ve;
import com.vungle.ads.internal.ui.view.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z43 implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z43(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                Ve.a((Ve) obj, mediaPlayer, i, i2);
                break;
            case 1:
                d.a((d) obj, mediaPlayer, i, i2);
                break;
            default:
                C4075hd.a((C4075hd) obj, mediaPlayer, i, i2);
                break;
        }
    }
}
