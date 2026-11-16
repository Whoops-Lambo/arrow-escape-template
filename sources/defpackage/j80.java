package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class j80 extends Handler {
    public final /* synthetic */ DefaultDrmSessionManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(DefaultDrmSessionManager defaultDrmSessionManager, Looper looper) {
        super(looper);
        this.a = defaultDrmSessionManager;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (b bVar : this.a.sessions) {
            if (Arrays.equals(bVar.u, bArr)) {
                if (message.what == 2 && bVar.e == 0 && bVar.o == 4) {
                    Util.castNonNull(bVar.u);
                    bVar.a(false);
                    return;
                }
                return;
            }
        }
    }
}
