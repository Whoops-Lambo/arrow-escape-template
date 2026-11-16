package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class da3 implements IInterface {
    public final IBinder a;
    public final String b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final void r(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public da3(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }
}
