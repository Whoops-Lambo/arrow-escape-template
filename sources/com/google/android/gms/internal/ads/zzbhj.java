package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbhj extends zzbfg implements zzbhk {
    public static final /* synthetic */ int a = 0;

    public zzbhj() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbhr zzbhpVar;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                zzbfh.e(parcel2, ((zzcwl) this).c);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                zzbfh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbhpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (iInterfaceQueryLocalInterface instanceof zzbhr) {
                        zzbhpVar = (zzbhr) iInterfaceQueryLocalInterface;
                    } else {
                        zzbhpVar = new zzbhp(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    }
                }
                zzbfh.f(parcel);
                ((zzcwl) this).q2(iObjectWrapperR, zzbhpVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarZzg = ((zzcwl) this).zzg();
                parcel2.writeNoException();
                zzbfh.e(parcel2, zzdxVarZzg);
                return true;
            case 6:
                boolean zA = zzbfh.a(parcel);
                zzbfh.f(parcel);
                ((zzcwl) this).e = zA;
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZza = com.google.android.gms.ads.internal.client.zzdp.zza(parcel.readStrongBinder());
                zzbfh.f(parcel);
                ((zzcwl) this).r0(zzdqVarZza);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzj = ((zzcwl) this).zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 9:
                long jZzk = ((zzcwl) this).zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j = parcel.readLong();
                zzbfh.f(parcel);
                ((zzcwl) this).zzl(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
