package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4718e4 {
    MutableContextWrapper a;

    public synchronized void a(Activity activity) {
        try {
            if (this.a == null) {
                this.a = new MutableContextWrapper(activity);
            }
            this.a.setBaseContext(activity);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.a = null;
    }

    public Activity a() {
        return (Activity) this.a.getBaseContext();
    }
}
