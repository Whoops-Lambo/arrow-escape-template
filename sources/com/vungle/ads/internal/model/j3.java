package com.vungle.ads.internal.model;

import defpackage.ep0;
import defpackage.iw;
import defpackage.jc1;
import defpackage.s71;
import defpackage.zj2;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class j3 {

    @NotNull
    public static final i3 Companion = new i3();
    public final String a;
    public final boolean b;
    public final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return s71.b(this.a, j3Var.a) && this.b == j3Var.b && s71.b(this.c, j3Var.c);
    }

    public /* synthetic */ j3(int i, String str, boolean z, String str2) {
        if (1 != (i & 1)) {
            ep0.J(i, 1, h3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return s71.b(this.c, "appopen");
    }

    public final boolean e() {
        return s71.b(this.c, "banner");
    }

    public final boolean f() {
        return s71.b(this.c, "in_line");
    }

    public final boolean g() {
        return s71.b(this.c, "interstitial");
    }

    public final boolean h() {
        return s71.b(this.c, "mrec");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return s71.b(this.c, "native");
    }

    public final boolean j() {
        return s71.b(this.c, "rewarded");
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Placement(referenceId=");
        sbA.append(this.a);
        sbA.append(", headerBidding=");
        sbA.append(this.b);
        sbA.append(", type=");
        return jc1.q(sbA, this.c, ')');
    }

    public static final void a(j3 j3Var, iw iwVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        j3Var.getClass();
        iwVar.getClass();
        pluginGeneratedSerialDescriptor.getClass();
        iwVar.q(pluginGeneratedSerialDescriptor, 0, j3Var.a);
        if (iwVar.B(pluginGeneratedSerialDescriptor) || j3Var.b) {
            iwVar.p(pluginGeneratedSerialDescriptor, 1, j3Var.b);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || j3Var.c != null) {
            iwVar.h(pluginGeneratedSerialDescriptor, 2, zj2.a, j3Var.c);
        }
    }

    public j3(String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public /* synthetic */ j3(String str) {
        this(str, null, false);
    }

    public final boolean a() {
        return this.b;
    }
}
