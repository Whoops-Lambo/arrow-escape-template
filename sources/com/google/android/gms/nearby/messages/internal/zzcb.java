package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "RegisterStatusCallbackRequestCreator")
public final class zzcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcb> CREATOR = new zzcc();
    public final int a;
    public final zzr b;
    public final zzy c;
    public final boolean d;
    public final String e;
    public final ClientAppContext f;

    public zzcb(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        zzr zzpVar;
        zzy zzwVar;
        this.a = i;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (iInterfaceQueryLocalInterface instanceof zzr) {
                zzpVar = (zzr) iInterfaceQueryLocalInterface;
            } else {
                zzpVar = new zzp(iBinder);
            }
        }
        this.b = zzpVar;
        if (iBinder2 == null) {
            zzwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzy) {
                zzwVar = (zzy) iInterfaceQueryLocalInterface2;
            } else {
                zzwVar = new zzw(iBinder2, "com.google.android.gms.nearby.messages.internal.IStatusCallback");
            }
        }
        this.c = zzwVar;
        this.d = z;
        this.e = str;
        this.f = ClientAppContext.d(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeIBinder(parcel, 2, this.b.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.c.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
