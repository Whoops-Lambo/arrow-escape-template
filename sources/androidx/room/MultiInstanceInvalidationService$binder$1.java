package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationService$binder$1", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MultiInstanceInvalidationService$binder$1 extends IMultiInstanceInvalidationService.Stub {
    public final /* synthetic */ MultiInstanceInvalidationService b;

    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void L3(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
        iMultiInstanceInvalidationCallback.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.b;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(iMultiInstanceInvalidationCallback);
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void M2(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.b;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                int i2 = 0;
                while (true) {
                    MultiInstanceInvalidationService$callbackList$1 multiInstanceInvalidationService$callbackList$1 = multiInstanceInvalidationService.c;
                    if (i2 < iBeginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService$callbackList$1.getBroadcastCookie(i2);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService.b.get(num);
                            if (i != iIntValue && str.equals(str2)) {
                                try {
                                    multiInstanceInvalidationService.c.getBroadcastItem(i2).I(strArr);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.c.finishBroadcast();
                            throw th;
                        }
                    } else {
                        multiInstanceInvalidationService$callbackList$1.finishBroadcast();
                        return;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
