package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public final Integer a;
    public final Integer b;
    public final Boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s71.b(this.a, hVar.a) && s71.b(this.b, hVar.b) && s71.b(this.c, hVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.a + ", batteryStatus=" + this.b + ", isPowerSaveMode=" + this.c + ')';
    }

    public h(Integer num, Integer num2, Boolean bool) {
        this.a = num;
        this.b = num2;
        this.c = bool;
    }
}
