package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ọ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1073 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0949 f3097;

    public C1073(C0949 c0949) {
        this.f3097 = c0949;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            AbstractC1290.m904(StringFog.decrypt("iAU66gHwg5e6\n", "yWtbhniE6vQ=\n"), StringFog.decrypt("uLtEnC1c+cnNsF+ePUvl1IK7\n", "7dUn/Vg7kb0=\n"), StringFog.decrypt("GizErJpBXQ0l\n", "Tl6lz/8jPG4=\n"), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        this.f3097.m721();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3097.f2556;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (SecurityException unused2) {
        }
    }
}
