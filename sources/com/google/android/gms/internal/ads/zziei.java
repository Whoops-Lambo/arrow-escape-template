package com.google.android.gms.internal.ads;

import defpackage.dw4;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziei extends zziee {
    public final Serializable a;

    public static boolean k(zziei zzieiVar) {
        Serializable serializable = zzieiVar.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    public final String c() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return h().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        defpackage.d.p("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zziei.class != obj.getClass()) {
            return false;
        }
        zziei zzieiVar = (zziei) obj;
        Serializable serializable = zzieiVar.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (k(this) && k(zzieiVar)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return i().equals(zzieiVar.i());
            }
            return h().longValue() == zzieiVar.h().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : zzieu.a(c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : zzieu.a(zzieiVar.c())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? h().doubleValue() : Double.parseDouble(c());
        double dDoubleValue2 = serializable instanceof Number ? zzieiVar.h().doubleValue() : Double.parseDouble(zzieiVar.c());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final Number h() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new zziem((String) serializable);
        }
        defpackage.d.u("Primitive is neither a number nor a string");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[PHI: r3
  0x001d: PHI (r3v1 long) = (r3v0 long), (r3v2 long) binds: [B:18:0x003a, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        long j;
        long jDoubleToLongBits;
        long j2;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (k(this)) {
            double dDoubleValue = h().doubleValue();
            j = (long) dDoubleValue;
            if (dDoubleValue == j) {
                j2 = (j >>> 32) ^ j;
            } else {
                jDoubleToLongBits = Double.doubleToLongBits(dDoubleValue);
                j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
            }
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            double dDoubleValue2 = h().doubleValue();
            j = (long) dDoubleValue2;
            if (dDoubleValue2 == j) {
                j2 = (j >>> 32) ^ j;
            } else {
                jDoubleToLongBits = Double.doubleToLongBits(dDoubleValue2);
                j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
            }
        }
        return (int) j2;
    }

    public final BigInteger i() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (k(this)) {
            return BigInteger.valueOf(h().longValue());
        }
        String strC = c();
        zzieu.b(strC);
        return new BigInteger(strC);
    }

    public zziei(Boolean bool) {
        this.a = bool;
    }

    public zziei(dw4 dw4Var) {
        this.a = dw4Var;
    }

    public zziei(String str) {
        this.a = str;
    }
}
