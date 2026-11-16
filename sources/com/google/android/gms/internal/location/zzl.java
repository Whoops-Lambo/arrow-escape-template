package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzaw;
import com.google.android.gms.location.zzax;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final int a;
    public final zzj b;
    public final zzax c;
    public final zzai d;

    public zzl(int i, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        zzax zzavVar;
        this.a = i;
        this.b = zzjVar;
        zzai zzagVar = null;
        if (iBinder == null) {
            zzavVar = null;
        } else {
            int i2 = zzaw.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (iInterfaceQueryLocalInterface instanceof zzax) {
                zzavVar = (zzax) iInterfaceQueryLocalInterface;
            } else {
                zzavVar = new com.google.android.gms.location.zzav(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
            }
        }
        this.c = zzavVar;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzai) {
                zzagVar = (zzai) iInterfaceQueryLocalInterface2;
            } else {
                zzagVar = new zzag(iBinder2);
            }
        }
        this.d = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        IBinder iBinderAsBinder2 = null;
        zzax zzaxVar = this.c;
        if (zzaxVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzaxVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinderAsBinder, false);
        zzai zzaiVar = this.d;
        if (zzaiVar != null) {
            iBinderAsBinder2 = zzaiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinderAsBinder2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
