package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import com.moloco.sdk.internal.MolocoLogger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {
    public final com.moloco.sdk.internal.services.j a;
    public a b;

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AcSignalProvider";
    }

    public final a d() {
        boolean zIsEnabled;
        com.moloco.sdk.internal.services.j jVar = this.a;
        try {
            jVar.getClass();
            boolean z = false;
            try {
                Object systemService = jVar.a.getSystemService("captioning");
                systemService.getClass();
                zIsEnabled = ((CaptioningManager) systemService).isEnabled();
            } catch (Exception unused) {
                zIsEnabled = false;
            }
            Boolean boolValueOf = Boolean.valueOf(zIsEnabled);
            Context context = jVar.a;
            Object systemService2 = context.getSystemService("accessibility");
            systemService2.getClass();
            Boolean boolValueOf2 = Boolean.valueOf(((AccessibilityManager) systemService2).isEnabled() && Settings.Secure.getInt(context.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1);
            try {
                if (Settings.Secure.getInt(jVar.a.getContentResolver(), "reduce_bright_colors_activated") == 1) {
                    z = true;
                }
            } catch (Settings.SettingNotFoundException | SecurityException unused2) {
            }
            Boolean boolValueOf3 = Boolean.valueOf(z);
            Context context2 = jVar.a;
            Object systemService3 = context2.getSystemService("accessibility");
            systemService3.getClass();
            return new a(boolValueOf, boolValueOf2, boolValueOf3, Float.valueOf(((AccessibilityManager) systemService3).isEnabled() ? context2.getResources().getConfiguration().fontScale : 1.0f));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] ACS Error", e, false, 8, null);
            return new a(null, null, null, null);
        }
    }

    public b(com.moloco.sdk.internal.services.j jVar) {
        jVar.getClass();
        this.a = jVar;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        a aVarD = d();
        boolean z = !aVarD.equals(this.b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] needsRefresh: " + z + ", with current: " + aVarD + ", cached: " + this.b, false, 4, null);
        return z;
    }
}
