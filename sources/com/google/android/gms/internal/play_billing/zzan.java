package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.p071bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzan extends zzas implements zzap {
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle C0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelR = r();
        parcelR.writeInt(i);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        parcelR.writeString(null);
        int i2 = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        Parcel parcelZ1 = z1(8, parcelR);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzau.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle D0(String str, String str2, String str3) {
        Parcel parcelR = r();
        parcelR.writeInt(3);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        Parcel parcelZ1 = z1(4, parcelR);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzau.a(parcelZ1);
        parcelZ1.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void E2(String str, Bundle bundle, zzak zzakVar) {
        Parcel parcelR = r();
        parcelR.writeInt(21);
        parcelR.writeString(str);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, (zzat) zzakVar);
        w3(1401, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle K(String str, Bundle bundle, String str2) {
        Parcel parcelR = r();
        parcelR.writeInt(9);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        Parcel parcelZ1 = z1(12, parcelR);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzau.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void M1(String str, Bundle bundle, zzam zzamVar) {
        Parcel parcelR = r();
        parcelR.writeInt(24);
        parcelR.writeString(str);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, (zzat) zzamVar);
        w3(1701, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void T(Bundle bundle, zzab zzabVar) {
        Parcel parcelR = r();
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, zzabVar);
        w3(2001, parcelR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void U2(String str, Bundle bundle, zzag zzagVar) {
        Parcel parcelR = r();
        parcelR.writeInt(18);
        parcelR.writeString(str);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, (zzat) zzagVar);
        A1(1301, parcelR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void c2(String str, Bundle bundle, zzz zzzVar) {
        Parcel parcelR = r();
        parcelR.writeInt(22);
        parcelR.writeString(str);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, (zzat) zzzVar);
        w3(1801, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int h2(int i, String str, String str2) {
        Parcel parcelR = r();
        parcelR.writeInt(i);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        Parcel parcelZ1 = z1(1, parcelR);
        int i2 = parcelZ1.readInt();
        parcelZ1.recycle();
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void l1(String str, Bundle bundle, zzx zzxVar) {
        Parcel parcelR = r();
        parcelR.writeInt(21);
        parcelR.writeString(str);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, (zzat) zzxVar);
        w3(1501, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle n0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelR = r();
        parcelR.writeInt(i);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        int i2 = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        Parcel parcelZ1 = z1(11, parcelR);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzau.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void p1(String str, Bundle bundle, zzar zzarVar) {
        Parcel parcelR = r();
        parcelR.writeInt(12);
        parcelR.writeString(str);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, (zzat) zzarVar);
        A1(1201, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int r1(int i, String str, String str2, Bundle bundle) {
        Parcel parcelR = r();
        parcelR.writeInt(i);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        int i2 = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        Parcel parcelZ1 = z1(10, parcelR);
        int i3 = parcelZ1.readInt();
        parcelZ1.recycle();
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void t(int i, String str, Bundle bundle, zzah zzahVar) {
        Parcel parcelR = r();
        parcelR.writeInt(i);
        parcelR.writeString(str);
        int i2 = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, zzahVar);
        w3(1901, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle t1(String str, String str2, String str3) {
        Parcel parcelR = r();
        parcelR.writeInt(3);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        parcelR.writeString(null);
        Parcel parcelZ1 = z1(3, parcelR);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzau.a(parcelZ1);
        parcelZ1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle u(String str, Bundle bundle, String str2) {
        Parcel parcelR = r();
        parcelR.writeInt(9);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        Parcel parcelZ1 = z1(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE, parcelR);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzau.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle u1(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelR = r();
        parcelR.writeInt(i);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        int i2 = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        parcelR.writeInt(1);
        bundle2.writeToParcel(parcelR, 0);
        Parcel parcelZ1 = z1(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, parcelR);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) zzau.a(parcelZ1);
        parcelZ1.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void x3(String str, Bundle bundle, zzae zzaeVar) {
        Parcel parcelR = r();
        parcelR.writeInt(21);
        parcelR.writeString(str);
        int i = zzau.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        zzau.b(parcelR, (zzat) zzaeVar);
        w3(1601, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int zza(String str, String str2) {
        Parcel parcelR = r();
        parcelR.writeInt(3);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        Parcel parcelZ1 = z1(5, parcelR);
        int i = parcelZ1.readInt();
        parcelZ1.recycle();
        return i;
    }
}
