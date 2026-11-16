package com.google.firebase.crashlytics.internal;

import defpackage.bq1;
import defpackage.dj2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface CrashlyticsNativeComponent {
    bq1 getSessionFileProvider(String str);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(String str);

    void prepareNativeSession(String str, String str2, long j, dj2 dj2Var);
}
