package com.adsurge.adn.oversea_ad;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Date extends Binder implements IInterface {
    public final AtomicReference a;
    public final boolean b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            if (i == 1) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                return true;
            }
            parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
            int i3 = parcel.readInt();
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            if (!this.b) {
                String string = "";
                if (i3 == 0 && bundle != null) {
                    string = bundle.getString("oa_id_flag");
                }
                synchronized (this.a) {
                    this.a.set(string);
                    this.a.notifyAll();
                }
            }
            parcel2.writeNoException();
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final String toString() {
        synchronized (this.a) {
            String str = (String) this.a.get();
            if (str != null) {
                return str;
            }
            try {
                this.a.wait(2000L);
            } catch (InterruptedException unused) {
            }
            return (String) this.a.get();
        }
    }

    public Date(boolean z) {
        attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
        this.a = new AtomicReference(null);
        this.b = z;
    }
}
