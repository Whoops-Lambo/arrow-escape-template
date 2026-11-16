package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcn extends zzbl implements zzcp {
    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeLong(j);
        A1(23, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        zzbn.b(parcelZ1, bundle);
        A1(9, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeLong(j);
        A1(24, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void generateEventId(zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcsVar);
        A1(22, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getAppInstanceId(zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcsVar);
        A1(20, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCachedAppInstanceId(zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcsVar);
        A1(19, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getConditionalUserProperties(String str, String str2, zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        zzbn.c(parcelZ1, zzcsVar);
        A1(10, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenClass(zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcsVar);
        A1(17, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenName(zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcsVar);
        A1(16, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getGmpAppId(zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcsVar);
        A1(21, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getMaxUserProperties(String str, zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        zzbn.c(parcelZ1, zzcsVar);
        A1(6, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getSessionId(zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcsVar);
        A1(46, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getUserProperties(String str, String str2, boolean z, zzcs zzcsVar) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        ClassLoader classLoader = zzbn.a;
        parcelZ1.writeInt(z ? 1 : 0);
        zzbn.c(parcelZ1, zzcsVar);
        A1(5, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, iObjectWrapper);
        zzbn.b(parcelZ1, zzdbVar);
        parcelZ1.writeLong(j);
        A1(1, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j, long j2) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, iObjectWrapper);
        zzbn.b(parcelZ1, zzdbVar);
        parcelZ1.writeLong(j);
        parcelZ1.writeLong(j2);
        A1(60, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        zzbn.b(parcelZ1, bundle);
        parcelZ1.writeInt(z ? 1 : 0);
        parcelZ1.writeInt(1);
        parcelZ1.writeLong(j);
        parcelZ1.writeLong(j2);
        A1(59, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeInt(5);
        parcelZ1.writeString(str);
        zzbn.c(parcelZ1, iObjectWrapper);
        zzbn.c(parcelZ1, iObjectWrapper2);
        zzbn.c(parcelZ1, iObjectWrapper3);
        A1(33, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        zzbn.b(parcelZ1, bundle);
        parcelZ1.writeLong(j);
        A1(53, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        parcelZ1.writeLong(j);
        A1(54, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        parcelZ1.writeLong(j);
        A1(55, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        parcelZ1.writeLong(j);
        A1(56, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        zzbn.c(parcelZ1, zzcsVar);
        parcelZ1.writeLong(j);
        A1(57, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        parcelZ1.writeLong(j);
        A1(51, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        parcelZ1.writeLong(j);
        A1(52, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void registerOnMeasurementEventListener(zzcy zzcyVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcyVar);
        A1(35, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void resetAnalyticsData(long j) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeLong(j);
        A1(12, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeLong(j);
        parcelZ1.writeLong(j2);
        A1(61, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void retrieveAndUploadBatches(zzcv zzcvVar) {
        Parcel parcelZ1 = z1();
        zzbn.c(parcelZ1, zzcvVar);
        A1(58, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, bundle);
        parcelZ1.writeLong(j);
        A1(8, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, bundle);
        parcelZ1.writeLong(j);
        A1(45, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, zzddVar);
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        parcelZ1.writeLong(j);
        A1(50, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelZ1 = z1();
        ClassLoader classLoader = zzbn.a;
        parcelZ1.writeInt(z ? 1 : 0);
        A1(39, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, bundle);
        A1(42, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelZ1 = z1();
        ClassLoader classLoader = zzbn.a;
        parcelZ1.writeInt(z ? 1 : 0);
        parcelZ1.writeLong(j);
        A1(11, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeLong(j);
        A1(14, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, intent);
        A1(48, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserId(String str, long j) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeLong(j);
        A1(7, parcelZ1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(null);
        parcelZ1.writeString(str2);
        zzbn.c(parcelZ1, iObjectWrapper);
        parcelZ1.writeInt(0);
        parcelZ1.writeLong(j);
        A1(4, parcelZ1);
    }
}
