package io.p071bidmachine.rendering.internal;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k {
    public final long a;
    public final TimeInterpolator b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && s71.b(this.b, kVar.b);
    }

    public k() {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        this.a = 200L;
        this.b = decelerateInterpolator;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationConfig(durationMs=" + this.a + ", interpolator=" + this.b + ')';
    }
}
