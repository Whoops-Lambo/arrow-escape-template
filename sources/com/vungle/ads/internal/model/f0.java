package com.vungle.ads.internal.model;

import defpackage.iw;
import defpackage.k71;
import defpackage.rj;
import defpackage.s71;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();
    public final Boolean a;
    public final Boolean b;
    public final Integer c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return s71.b(this.a, f0Var.a) && s71.b(this.b, f0Var.b) && s71.b(this.c, f0Var.c);
    }

    public final Boolean b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("WebViewSettings(allowFileAccessFromFileUrls=");
        sbA.append(this.a);
        sbA.append(", allowUniversalAccessFromFileUrls=");
        sbA.append(this.b);
        sbA.append(", layerType=");
        sbA.append(this.c);
        sbA.append(')');
        return sbA.toString();
    }

    public /* synthetic */ f0(int i, Boolean bool, Boolean bool2, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public static final void a(f0 f0Var, iw iwVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        f0Var.getClass();
        iwVar.getClass();
        pluginGeneratedSerialDescriptor.getClass();
        if (iwVar.B(pluginGeneratedSerialDescriptor) || f0Var.a != null) {
            iwVar.h(pluginGeneratedSerialDescriptor, 0, rj.a, f0Var.a);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || f0Var.b != null) {
            iwVar.h(pluginGeneratedSerialDescriptor, 1, rj.a, f0Var.b);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || f0Var.c != null) {
            iwVar.h(pluginGeneratedSerialDescriptor, 2, k71.a, f0Var.c);
        }
    }

    public final Boolean a() {
        return this.a;
    }
}
