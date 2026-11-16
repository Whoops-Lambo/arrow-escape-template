package com.unity3d.player;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5280u {
    public final Class a;
    public final String b;
    public final String c;
    public final int d;
    public volatile AccessibleObject e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5280u) {
            C5280u c5280u = (C5280u) obj;
            if (this.d == c5280u.d && this.c.equals(c5280u.c) && this.b.equals(c5280u.b) && this.a.equals(c5280u.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public C5280u(Class cls, String str, String str2) {
        this.a = cls;
        this.b = str;
        this.c = str2;
        this.d = str2.hashCode() + n30.c((cls.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31, str);
    }
}
