package defpackage;

import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter$Factory;
import io.p071bidmachine.media3.exoplayer.mediacodec.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q9 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ q9(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return AsynchronousMediaCodecAdapter$Factory.lambda$new$0(i2);
            case 1:
                return AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i2);
            case 2:
                return AsynchronousMediaCodecAdapter$Factory.lambda$new$1(i2);
            case 3:
                return AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i2);
            case 4:
                return new HandlerThread(b.t(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(b.t(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
