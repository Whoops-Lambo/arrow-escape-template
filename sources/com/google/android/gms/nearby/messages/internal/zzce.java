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
@SafeParcelable.Class(creator = "UnpublishRequestCreator")
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcf();
    public final int a;
    public final zzae b;
    public final zzr c;
    public final String d;
    public final String e;
    public final boolean f;
    public final ClientAppContext g;

    public zzce(int i, zzae zzaeVar, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        zzr zzpVar;
        this.a = i;
        this.b = zzaeVar;
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
        this.c = zzpVar;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = ClientAppContext.d(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.c.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
