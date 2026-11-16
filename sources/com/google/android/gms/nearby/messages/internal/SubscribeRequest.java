package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "SubscribeRequestCreator")
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzcd();
    public final int a;
    public final zzo b;
    public final Strategy c;
    public final zzr d;
    public final MessageFilter e;
    public final PendingIntent f;
    public final int g;
    public final String h;
    public final String i;
    public final byte[] j;
    public final boolean k;
    public final zzab l;
    public final boolean m;
    public final ClientAppContext n;
    public final boolean o;
    public final int p;
    public final int q;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        IBinder iBinder4;
        zzo zzmVar;
        zzr zzpVar;
        this.a = i;
        zzab zzzVar = null;
        if (iBinder == null || (iBinder4 = (IBinder) Preconditions.checkNotNull(iBinder)) == null) {
            zzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder4.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzmVar = iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzm(iBinder4);
        }
        this.b = zzmVar;
        this.c = strategy;
        if (iBinder2 == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface2 instanceof zzr ? (zzr) iInterfaceQueryLocalInterface2 : new zzp(iBinder2);
        }
        this.d = zzpVar;
        this.e = messageFilter;
        this.f = pendingIntent;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = bArr;
        this.k = z;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            zzzVar = iInterfaceQueryLocalInterface3 instanceof zzab ? (zzab) iInterfaceQueryLocalInterface3 : new zzz(iBinder3, "com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
        }
        this.l = zzzVar;
        this.m = z2;
        this.n = ClientAppContext.d(clientAppContext, str2, str, z2);
        this.o = z3;
        this.p = i3;
        this.q = i4;
    }

    public final String toString() {
        String strL;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.e);
        String strValueOf5 = String.valueOf(this.f);
        byte[] bArr = this.j;
        if (bArr == null) {
            strL = null;
        } else {
            strL = nj.l(bArr.length, " bytes>", new StringBuilder("<"));
        }
        String strValueOf6 = String.valueOf(this.l);
        String strValueOf7 = String.valueOf(this.n);
        StringBuilder sbR = pv1.r("SubscribeRequest{messageListener=", strValueOf, ", strategy=", strValueOf2, ", callback=");
        q63.y(sbR, strValueOf3, ", filter=", strValueOf4, ", pendingIntent=");
        q63.y(sbR, strValueOf5, ", hint=", strL, ", subscribeCallback=");
        sbR.append(strValueOf6);
        sbR.append(", useRealClientApiKey=");
        sbR.append(this.m);
        sbR.append(", clientAppContext=");
        sbR.append(strValueOf7);
        sbR.append(", isDiscardPendingIntent=");
        sbR.append(this.o);
        sbR.append(", zeroPartyPackageName=");
        q63.y(sbR, this.h, ", realClientPackageName=", this.i, ", isIgnoreNearbyPermission=");
        sbR.append(this.k);
        sbR.append(", callingContext=");
        sbR.append(this.q);
        sbR.append("}");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        IBinder iBinderAsBinder3 = null;
        zzo zzoVar = this.b;
        if (zzoVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzoVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinderAsBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        zzr zzrVar = this.d;
        if (zzrVar == null) {
            iBinderAsBinder2 = null;
        } else {
            iBinderAsBinder2 = zzrVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinderAsBinder2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        SafeParcelWriter.writeString(parcel, 8, this.h, false);
        SafeParcelWriter.writeString(parcel, 9, this.i, false);
        SafeParcelWriter.writeByteArray(parcel, 10, this.j, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.k);
        zzab zzabVar = this.l;
        if (zzabVar != null) {
            iBinderAsBinder3 = zzabVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 12, iBinderAsBinder3, false);
        SafeParcelWriter.writeBoolean(parcel, 13, this.m);
        SafeParcelWriter.writeParcelable(parcel, 14, this.n, i, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.o);
        SafeParcelWriter.writeInt(parcel, 16, this.p);
        SafeParcelWriter.writeInt(parcel, 17, this.q);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
