package com.inmobi.media;

import android.app.Activity;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Rb extends Sb {
    public final Activity a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rb)) {
            return false;
        }
        Rb rb = (Rb) obj;
        return s71.b(this.a, rb.a) && s71.b(this.b, rb.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.a + ", finalUrl=" + this.b + ")";
    }

    public Rb(Activity activity, String str) {
        activity.getClass();
        str.getClass();
        this.a = activity;
        this.b = str;
    }
}
