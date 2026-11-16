package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DefaultDrmSession$ProvisioningManager;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h80 extends Handler {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(b bVar, Looper looper) {
        super(looper);
        this.a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        b bVar = this.a;
        ExoMediaDrm exoMediaDrm = bVar.b;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            DefaultDrmSession$ProvisioningManager defaultDrmSession$ProvisioningManager = bVar.c;
            if (obj == bVar.x) {
                if (bVar.o == 2 || bVar.b()) {
                    bVar.x = null;
                    if (obj2 instanceof Exception) {
                        defaultDrmSession$ProvisioningManager.onProvisionError((Exception) obj2, false);
                        return;
                    }
                    try {
                        exoMediaDrm.provideProvisionResponse((byte[]) obj2);
                        defaultDrmSession$ProvisioningManager.onProvisionCompleted();
                        return;
                    } catch (Exception e) {
                        defaultDrmSession$ProvisioningManager.onProvisionError(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        CopyOnWriteMultiset copyOnWriteMultiset = bVar.i;
        int i2 = bVar.e;
        if (obj == bVar.w && bVar.b()) {
            bVar.w = null;
            if (obj2 instanceof Exception) {
                bVar.d((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (i2 == 3) {
                    exoMediaDrm.provideKeyResponse((byte[]) Util.castNonNull(bVar.v), bArr);
                    Iterator it = copyOnWriteMultiset.elementSet().iterator();
                    while (it.hasNext()) {
                        ((DrmSessionEventListener.EventDispatcher) it.next()).drmKeysRemoved();
                    }
                    return;
                }
                byte[] bArrProvideKeyResponse = exoMediaDrm.provideKeyResponse(bVar.u, bArr);
                if ((i2 == 2 || (i2 == 0 && bVar.v != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    bVar.v = bArrProvideKeyResponse;
                }
                bVar.o = 4;
                Iterator it2 = copyOnWriteMultiset.elementSet().iterator();
                while (it2.hasNext()) {
                    ((DrmSessionEventListener.EventDispatcher) it2.next()).drmKeysLoaded();
                }
            } catch (Exception e2) {
                bVar.d(e2, true);
            }
        }
    }
}
