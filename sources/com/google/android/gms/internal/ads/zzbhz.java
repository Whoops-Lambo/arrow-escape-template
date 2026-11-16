package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbhz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbhz> CREATOR = new zzbia();
    public ParcelFileDescriptor a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final boolean e;

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream r0() {
        if (this.a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a);
        this.a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zza() {
        return this.a != null;
    }

    public final synchronized boolean zze() {
        return this.c;
    }

    public final synchronized boolean zzg() {
        return this.e;
    }

    public zzbhz(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.a = parcelFileDescriptor;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        long j;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        synchronized (this) {
            parcelFileDescriptor = this.a;
        }
        SafeParcelWriter.writeParcelable(parcel, 2, parcelFileDescriptor, i, false);
        synchronized (this) {
            z = this.b;
        }
        SafeParcelWriter.writeBoolean(parcel, 3, z);
        SafeParcelWriter.writeBoolean(parcel, 4, zze());
        synchronized (this) {
            j = this.d;
        }
        SafeParcelWriter.writeLong(parcel, 5, j);
        SafeParcelWriter.writeBoolean(parcel, 6, zzg());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzbhz() {
        throw null;
    }
}
