package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class a80 {
    public final Handler a = new Handler(Looper.myLooper());
    public final e b = new e(this);
    public final /* synthetic */ DefaultAudioSink c;

    public a80(DefaultAudioSink defaultAudioSink) {
        this.c = defaultAudioSink;
    }
}
