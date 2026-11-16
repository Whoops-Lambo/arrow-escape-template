package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.exoplayer2.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class la extends BroadcastReceiver implements Runnable {
    public final a a;
    public final Handler b;
    public final /* synthetic */ ma c;

    public la(ma maVar, Handler handler, a aVar) {
        this.c = maVar;
        this.b = handler;
        this.a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.a) {
            this.a.onAudioBecomingNoisy();
        }
    }
}
