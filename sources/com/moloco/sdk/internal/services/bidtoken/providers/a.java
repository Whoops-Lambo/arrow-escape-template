package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Float d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s71.b(this.a, aVar.a) && s71.b(this.b, aVar.b) && s71.b(this.c, aVar.c) && s71.b(this.d, aVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f = this.d;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.a + ", accessibilityLargePointerIcon=" + this.b + ", reduceBrightColorsActivated=" + this.c + ", fontScale=" + this.d + ')';
    }

    public a(Boolean bool, Boolean bool2, Boolean bool3, Float f) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = f;
    }
}
