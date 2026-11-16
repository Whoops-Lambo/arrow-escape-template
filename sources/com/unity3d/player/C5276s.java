package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import defpackage.dr0;
import defpackage.mi3;
import defpackage.yc3;

/* JADX INFO: renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5276s extends mi3 {
    public yc3 d;
    public final OnBackInvokedDispatcher e;
    public final int f;

    public static mi3 a(Object obj, int i, Runnable runnable) {
        mi3 mi3Var;
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (PlatformSupport.TIRAMISU_SUPPORT && (((z = obj instanceof Activity)) || (obj instanceof Dialog))) {
            if (z) {
                onBackInvokedDispatcher = ((Activity) obj).getOnBackInvokedDispatcher();
            } else {
                if (!(obj instanceof Dialog)) {
                    dr0.r(obj.getClass().getName(), "' OnBackInvokedDispatcher", "Unsupported context type when getting '");
                    return null;
                }
                onBackInvokedDispatcher = ((Dialog) obj).getOnBackInvokedDispatcher();
            }
            mi3Var = new C5276s(onBackInvokedDispatcher, i, runnable);
        } else {
            mi3Var = new mi3(runnable);
        }
        mi3Var.registerOnBackPressedCallback();
        return mi3Var;
    }

    @Override // defpackage.mi3
    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            yc3 yc3Var = new yc3(this.a);
            this.d = yc3Var;
            this.e.registerOnBackInvokedCallback(this.f, yc3Var);
        }
    }

    @Override // defpackage.mi3
    public void unregisterOnBackPressedCallback() {
        if (this.a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                this.e.unregisterOnBackInvokedCallback(this.d);
                this.d = null;
            }
            this.a = null;
        }
    }

    public C5276s(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }
}
