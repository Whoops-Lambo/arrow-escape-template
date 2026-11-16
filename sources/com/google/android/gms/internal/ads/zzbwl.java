package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbwl extends zzbfg implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbwm O3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbwm ? (zzbwm) iInterfaceQueryLocalInterface : new zzbwk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzcdj zzcdhVar;
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i3 = parcel.readInt();
                zzbfh.f(parcel);
                zzg(i3);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzbfh.f(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzbfh.f(parcel);
                p0(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                }
                parcel.readString();
                zzbfh.f(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzbfh.f(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzcdf zzcdfVar = (zzcdf) zzbfh.b(parcel, zzcdf.CREATOR);
                zzbfh.f(parcel);
                o0(zzcdfVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzcdhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (iInterfaceQueryLocalInterface instanceof zzcdj) {
                        zzcdhVar = (zzcdj) iInterfaceQueryLocalInterface;
                    } else {
                        zzcdhVar = new zzcdh(strongBinder3);
                    }
                }
                zzbfh.f(parcel);
                p(zzcdhVar);
                break;
            case 17:
                int i4 = parcel.readInt();
                zzbfh.f(parcel);
                zzs(i4);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzbfh.f(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String string3 = parcel.readString();
                zzbfh.f(parcel);
                zzv(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                zzbfh.f(parcel);
                M3(i5, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbfh.f(parcel);
                s(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbfh.f(parcel);
                H(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
