package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface IWorkManagerImpl extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Proxy implements IWorkManagerImpl {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    Z2();
                    return true;
                case 2:
                    parcel.readString();
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    U();
                    return true;
                case 3:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    e1();
                    return true;
                case 4:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    z2();
                    return true;
                case 5:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    I1();
                    return true;
                case 6:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    C();
                    return true;
                case 7:
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    m3();
                    return true;
                case 8:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    S();
                    return true;
                case 9:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    K1();
                    return true;
                case 10:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.r(parcel.readStrongBinder());
                    n2();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void C();

    void I1();

    void K1();

    void S();

    void U();

    void Z2();

    void e1();

    void m3();

    void n2();

    void z2();
}
