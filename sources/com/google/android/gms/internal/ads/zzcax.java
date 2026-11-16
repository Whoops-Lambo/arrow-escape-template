package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "NativeAdLayoutInfoParcelCreator")
public final class zzcax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcax> CREATOR = new zzcay();
    public final View a;
    public final Map b;

    public zzcax(IBinder iBinder, IBinder iBinder2) {
        this.a = (View) ObjectWrapper.z1(IObjectWrapper.Stub.r(iBinder));
        this.b = (Map) ObjectWrapper.z1(IObjectWrapper.Stub.r(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, new ObjectWrapper(this.a).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, new ObjectWrapper(this.b).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
