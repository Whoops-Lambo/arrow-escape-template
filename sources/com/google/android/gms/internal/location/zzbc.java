package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzay;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    public final int a;
    public final zzba b;
    public final com.google.android.gms.location.zzbd c;
    public final PendingIntent d;
    public final com.google.android.gms.location.zzba e;
    public final zzai f;

    public zzbc(int i, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        com.google.android.gms.location.zzbd zzbbVar;
        com.google.android.gms.location.zzba zzayVar;
        this.a = i;
        this.b = zzbaVar;
        zzai zzagVar = null;
        if (iBinder == null) {
            zzbbVar = null;
        } else {
            int i2 = com.google.android.gms.location.zzbc.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzbd) {
                zzbbVar = (com.google.android.gms.location.zzbd) iInterfaceQueryLocalInterface;
            } else {
                zzbbVar = new com.google.android.gms.location.zzbb(iBinder, "com.google.android.gms.location.ILocationListener");
            }
        }
        this.c = zzbbVar;
        this.d = pendingIntent;
        if (iBinder2 == null) {
            zzayVar = null;
        } else {
            int i3 = com.google.android.gms.location.zzaz.a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.location.zzba) {
                zzayVar = (com.google.android.gms.location.zzba) iInterfaceQueryLocalInterface2;
            } else {
                zzayVar = new zzay(iBinder2, "com.google.android.gms.location.ILocationCallback");
            }
        }
        this.e = zzayVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface3 instanceof zzai) {
                zzagVar = (zzai) iInterfaceQueryLocalInterface3;
            } else {
                zzagVar = new zzag(iBinder3);
            }
        }
        this.f = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        IBinder iBinderAsBinder3 = null;
        com.google.android.gms.location.zzbd zzbdVar = this.c;
        if (zzbdVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzbdVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinderAsBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        com.google.android.gms.location.zzba zzbaVar = this.e;
        if (zzbaVar == null) {
            iBinderAsBinder2 = null;
        } else {
            iBinderAsBinder2 = zzbaVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinderAsBinder2, false);
        zzai zzaiVar = this.f;
        if (zzaiVar != null) {
            iBinderAsBinder3 = zzaiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinderAsBinder3, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
