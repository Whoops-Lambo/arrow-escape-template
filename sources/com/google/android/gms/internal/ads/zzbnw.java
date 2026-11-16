package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbnw extends zzbfg implements zzbnx {
    public zzbnw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String string = parcel.readString();
                zzbfh.f(parcel);
                String strZze = ((zzdvr) this).zze(string);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzbfh.f(parcel);
                zzbng zzbngVarZzf = ((zzdvr) this).zzf(string2);
                parcel2.writeNoException();
                zzbfh.e(parcel2, zzbngVarZzf);
                return true;
            case 3:
                List listZzg = ((zzdvr) this).zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strG = ((zzdvr) this).b.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzbfh.f(parcel);
                ((zzdvr) this).zzi(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                ((zzdvr) this).zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea zzeaVarR = ((zzdvr) this).b.r();
                parcel2.writeNoException();
                zzbfh.e(parcel2, zzeaVarR);
                return true;
            case 8:
                ((zzdvr) this).zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperZzm = ((zzdvr) this).zzm();
                parcel2.writeNoException();
                zzbfh.e(parcel2, iObjectWrapperZzm);
                return true;
            case 10:
                boolean zS1 = ((zzdvr) this).S1(rl3.i(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zS1 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = zzbfh.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                boolean zZzo = ((zzdvr) this).zzo();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbfh.a;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                boolean zZzp = ((zzdvr) this).zzp();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzbfh.a;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 14:
                ((zzdvr) this).Z1(rl3.i(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 15:
                ((zzdvr) this).zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbnd zzbndVarZzs = ((zzdvr) this).zzs();
                parcel2.writeNoException();
                zzbfh.e(parcel2, zzbndVarZzs);
                return true;
            case 17:
                boolean zG = ((zzdvr) this).g(rl3.i(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
