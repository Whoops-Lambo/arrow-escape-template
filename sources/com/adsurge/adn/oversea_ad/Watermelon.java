package com.adsurge.adn.oversea_ad;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Watermelon extends Thread {
    public final /* synthetic */ IBinder a;
    public final /* synthetic */ White b;

    public Watermelon(White white, IBinder iBinder) {
        this.b = white;
        this.a = iBinder;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #1 {all -> 0x00c2, blocks: (B:13:0x001f, B:15:0x0028, B:17:0x0046, B:19:0x004f, B:20:0x0055, B:16:0x0030), top: B:51:0x001f, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:22:0x0057, B:24:0x0065, B:25:0x0079, B:27:0x0096, B:29:0x00b9, B:30:0x00bf, B:26:0x0083), top: B:50:0x0057, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:22:0x0057, B:24:0x0065, B:25:0x0079, B:27:0x0096, B:29:0x00b9, B:30:0x00bf, B:26:0x0083), top: B:50:0x0057, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Perseus orion;
        Perseus perseus;
        int i;
        Orion orion2;
        Wild wildA;
        int i2;
        Parcel parcelObtain;
        Parcel parcelObtain2;
        Parcel parcelObtain3;
        Parcel parcelObtain4;
        IBinder iBinder = this.a;
        try {
            try {
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(Pegasus.a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Perseus)) {
                        orion = new Orion(iBinder);
                    } else {
                        perseus = (Perseus) iInterfaceQueryLocalInterface;
                    }
                    orion2 = (Orion) orion;
                    if (orion2.b()) {
                        i = 0;
                    } else {
                        parcelObtain3 = Parcel.obtain();
                        parcelObtain4 = Parcel.obtain();
                        try {
                            parcelObtain3.writeInterfaceToken(Pegasus.a);
                            parcelObtain3.writeInt(2000);
                            orion2.a.transact(1, parcelObtain3, parcelObtain4, 0);
                            parcelObtain4.readException();
                            parcelObtain4.readInt();
                            parcelObtain4.recycle();
                            parcelObtain3.recycle();
                            i = 1;
                        } catch (Throwable th) {
                            parcelObtain4.recycle();
                            parcelObtain3.recycle();
                            throw th;
                        }
                    }
                    wildA = a.a(orion2.a().b);
                    i2 = wildA.a;
                    if (i2 != 0) {
                        this.b.a.set(new Teazle(i2, 200, -1L, "", -1, i));
                    } else {
                        Warden warden = wildA.b;
                        parcelObtain = Parcel.obtain();
                        parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(Pegasus.a);
                            orion2.a.transact(12, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            int i3 = parcelObtain2.readInt();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            this.b.a.set(new Teazle(0, 200, System.currentTimeMillis() - this.b.b, warden.c, i3, i));
                        } catch (Throwable th2) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th2;
                        }
                    }
                    if (a0.f.a("s_t_d_ask", false)) {
                        try {
                            ((Orion) orion).c();
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                    synchronized (this.b.c) {
                        this.b.c.notify();
                    }
                }
                String str = Pegasus.a;
                perseus = null;
                wildA = a.a(orion2.a().b);
                i2 = wildA.a;
                if (i2 != 0) {
                    this.b.a.set(new Teazle(i2, 200, -1L, "", -1, i));
                } else {
                    Warden warden2 = wildA.b;
                    parcelObtain = Parcel.obtain();
                    parcelObtain2 = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(Pegasus.a);
                    orion2.a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i4 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    this.b.a.set(new Teazle(0, 200, System.currentTimeMillis() - this.b.b, warden2.c, i4, i));
                }
            } catch (Throwable unused) {
                this.b.a.set(new Teazle(-2003, 200, -1L, "", -1, i));
            }
            orion2 = (Orion) orion;
            if (orion2.b()) {
                parcelObtain3 = Parcel.obtain();
                parcelObtain4 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(Pegasus.a);
                parcelObtain3.writeInt(2000);
                orion2.a.transact(1, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                parcelObtain4.readInt();
                parcelObtain4.recycle();
                parcelObtain3.recycle();
                i = 1;
            } else {
                i = 0;
            }
        } catch (Throwable unused2) {
            i = -1;
        }
        orion = perseus;
        if (a0.f.a("s_t_d_ask", false)) {
            ((Orion) orion).c();
        }
        synchronized (this.b.c) {
            this.b.c.notify();
        }
    }
}
