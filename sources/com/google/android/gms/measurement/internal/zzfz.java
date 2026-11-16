package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfz extends zzbl implements zzgb {
    public zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void D1(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        A1(20, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void F1(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        zzbn.b(parcelZ1, zzooVar);
        zzbn.c(parcelZ1, zzghVar);
        A1(29, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void F3(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        A1(27, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List H1(String str, String str2, String str3, boolean z) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(null);
        parcelZ1.writeString(str2);
        parcelZ1.writeString(str3);
        ClassLoader classLoader = zzbn.a;
        parcelZ1.writeInt(z ? 1 : 0);
        Parcel parcelR = r(15, parcelZ1);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(zzpl.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void K0(long j, String str, String str2, String str3) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeLong(j);
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        parcelZ1.writeString(str3);
        A1(10, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void N0(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        A1(18, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] R(zzbh zzbhVar, String str) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzbhVar);
        parcelZ1.writeString(str);
        Parcel parcelR = r(9, parcelZ1);
        byte[] bArrCreateByteArray = parcelR.createByteArray();
        parcelR.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List V1(String str, String str2, String str3) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(null);
        parcelZ1.writeString(str2);
        parcelZ1.writeString(str3);
        Parcel parcelR = r(17, parcelZ1);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(zzah.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void W(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        A1(6, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void a1(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        zzbn.b(parcelZ1, zzafVar);
        A1(30, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void a2(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        A1(25, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void b0(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzplVar);
        zzbn.b(parcelZ1, zzrVar);
        A1(2, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao f1(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        Parcel parcelR = r(21, parcelZ1);
        zzao zzaoVar = (zzao) zzbn.a(parcelR, zzao.CREATOR);
        parcelR.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void g1(Bundle bundle, zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, bundle);
        zzbn.b(parcelZ1, zzrVar);
        A1(19, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void k2(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        A1(26, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void l3(zzr zzrVar, Bundle bundle, zzge zzgeVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        zzbn.b(parcelZ1, bundle);
        zzbn.c(parcelZ1, zzgeVar);
        A1(31, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void q(zzah zzahVar, zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzahVar);
        zzbn.b(parcelZ1, zzrVar);
        A1(12, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List s1(String str, String str2, boolean z, zzr zzrVar) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        ClassLoader classLoader = zzbn.a;
        parcelZ1.writeInt(z ? 1 : 0);
        zzbn.b(parcelZ1, zzrVar);
        Parcel parcelR = r(14, parcelZ1);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(zzpl.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String u0(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        Parcel parcelR = r(11, parcelZ1);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void v1(zzbh zzbhVar, zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzbhVar);
        zzbn.b(parcelZ1, zzrVar);
        A1(1, parcelZ1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List w1(String str, String str2, zzr zzrVar) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        zzbn.b(parcelZ1, zzrVar);
        Parcel parcelR = r(16, parcelZ1);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(zzah.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void y3(zzr zzrVar) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzrVar);
        A1(4, parcelZ1);
    }
}
