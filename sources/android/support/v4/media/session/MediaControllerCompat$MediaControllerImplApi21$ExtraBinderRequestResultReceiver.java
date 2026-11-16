package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import defpackage.q11;
import defpackage.r11;
import defpackage.s11;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        s11 s11Var;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = r11.a;
            VersionedParcelable versionedParcelable = null;
            if (binder == null) {
                s11Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s11)) {
                    q11 q11Var = new q11();
                    q11Var.a = binder;
                    s11Var = q11Var;
                } else {
                    s11Var = (s11) iInterfaceQueryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.a) {
                mediaSessionCompat$Token.c = s11Var;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    versionedParcelable = ((ParcelImpl) parcelable).a;
                }
            } catch (RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.a) {
                mediaSessionCompat$Token2.d = versionedParcelable;
            }
            aVar.a();
        }
    }
}
