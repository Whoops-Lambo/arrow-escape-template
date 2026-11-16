package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PublishRequestCreator")
public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzca();
    public final int a;
    public final zzae b;
    public final Strategy c;
    public final zzr d;
    public final String e;
    public final String f;
    public final boolean g;
    public final zzv h;
    public final boolean i;
    public final ClientAppContext j;
    public final int k;

    public zzbz(int i, zzae zzaeVar, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i2) {
        zzr zzpVar;
        this.a = i;
        this.b = zzaeVar;
        this.c = strategy;
        zzv zztVar = null;
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
        this.d = zzpVar;
        this.e = str;
        this.f = str2;
        this.g = z;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzv) {
                zztVar = (zzv) iInterfaceQueryLocalInterface2;
            } else {
                zztVar = new zzt(iBinder2, "com.google.android.gms.nearby.messages.internal.IPublishCallback");
            }
        }
        this.h = zztVar;
        this.i = z2;
        this.j = ClientAppContext.d(clientAppContext, str2, str, z2);
        this.k = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeIBinder(parcel, 4, this.d.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.g);
        zzv zzvVar = this.h;
        if (zzvVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzvVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 8, iBinderAsBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.i);
        SafeParcelWriter.writeParcelable(parcel, 10, this.j, i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.k);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
