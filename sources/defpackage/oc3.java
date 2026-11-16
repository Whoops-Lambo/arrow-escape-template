package defpackage;

import android.media.MediaPlayer;
import com.inmobi.media.C4421tp;
import com.vungle.ads.internal.ui.view.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oc3 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oc3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                d.b((d) obj, mediaPlayer);
                break;
            default:
                C4421tp.a((C4421tp) obj, mediaPlayer);
                break;
        }
    }
}
