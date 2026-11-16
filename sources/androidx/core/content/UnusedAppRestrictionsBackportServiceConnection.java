package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    public IUnusedAppRestrictionsBackportService a;

    /* JADX INFO: renamed from: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes10.dex */
    class AnonymousClass1 extends IUnusedAppRestrictionsBackportCallback.Stub {
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public final void G2(boolean z, boolean z2) {
            if (z && !z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceR = IUnusedAppRestrictionsBackportService.Stub.r(iBinder);
        this.a = iUnusedAppRestrictionsBackportServiceR;
        try {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.attachInterface(anonymousClass1, IUnusedAppRestrictionsBackportCallback.Y8);
            iUnusedAppRestrictionsBackportServiceR.d3(anonymousClass1);
        } catch (RemoteException unused) {
            throw null;
        }
    }
}
