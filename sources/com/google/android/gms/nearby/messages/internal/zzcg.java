package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "UnsubscribeRequestCreator")
public final class zzcg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcg> CREATOR = new zzch();
    public final int a;
    public final zzo b;
    public final zzr c;
    public final PendingIntent d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final ClientAppContext i;

    public zzcg(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        zzo zzmVar;
        this.a = i;
        zzr zzpVar = null;
        if (iBinder == null) {
            zzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (iInterfaceQueryLocalInterface instanceof zzo) {
                zzmVar = (zzo) iInterfaceQueryLocalInterface;
            } else {
                zzmVar = new zzm(iBinder);
            }
        }
        this.b = zzmVar;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzr) {
                zzpVar = (zzr) iInterfaceQueryLocalInterface2;
            } else {
                zzpVar = new zzp(iBinder2);
            }
        }
        this.c = zzpVar;
        this.d = pendingIntent;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = ClientAppContext.d(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        zzo zzoVar = this.b;
        if (zzoVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzoVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinderAsBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.c.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeString(parcel, 7, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.h);
        SafeParcelWriter.writeParcelable(parcel, 9, this.i, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
