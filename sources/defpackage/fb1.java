package defpackage;

import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fb1 extends ha1 {
    public final Serializable a;

    public static boolean h(fb1 fb1Var) {
        Serializable serializable = fb1Var.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean c() {
        Serializable serializable = this.a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(e());
    }

    public final Number d() {
        Serializable serializable = this.a;
        return serializable instanceof String ? new fd1((String) serializable) : (Number) serializable;
    }

    public final String e() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return d().toString();
        }
        return serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fb1.class != obj.getClass()) {
            return false;
        }
        fb1 fb1Var = (fb1) obj;
        Serializable serializable = fb1Var.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (h(this) && h(fb1Var)) {
            return d().longValue() == fb1Var.d().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double dDoubleValue = d().doubleValue();
        double dDoubleValue2 = fb1Var.d().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (h(this)) {
            jDoubleToLongBits = d().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public fb1(String str) {
        str.getClass();
        this.a = str;
    }

    public fb1(Number number) {
        this.a = number;
    }

    public fb1(Boolean bool) {
        this.a = bool;
    }
}
