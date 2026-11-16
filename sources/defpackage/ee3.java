package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ee3 extends yb3 {
    @Override // defpackage.yb3
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) hc3.a(parcel);
            hc3.b(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) hc3.a(parcel);
            hc3.b(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) hc3.a(parcel);
            hc3.b(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) hc3.a(parcel);
        hc3.b(parcel);
        b(bundle4);
        return true;
    }

    public abstract void b(Bundle bundle);

    public abstract void c(Bundle bundle);

    public abstract void d(Bundle bundle);

    public abstract void e(Bundle bundle);
}
