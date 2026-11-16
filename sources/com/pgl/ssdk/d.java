package com.pgl.ssdk;

import defpackage.h50;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    public static class a {
        private final long a;
        private final q b;

        public q a() {
            return this.b;
        }

        public long b() {
            return this.a;
        }

        public a(long j, q qVar) {
            this.a = j;
            this.b = qVar;
        }
    }

    public static a a(q qVar, t tVar) throws b {
        long jA = tVar.a();
        long jC = tVar.c() + jA;
        long jE = tVar.e();
        if (jC == jE) {
            if (jA >= 32) {
                ByteBuffer byteBufferA = qVar.a(jA - 24, 24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferA.order(byteOrder);
                if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                    long j = byteBufferA.getLong(0);
                    if (j >= byteBufferA.capacity() && j <= 2147483639) {
                        long j2 = (int) (8 + j);
                        long j3 = jA - j2;
                        if (j3 >= 0) {
                            ByteBuffer byteBufferA2 = qVar.a(j3, 8);
                            byteBufferA2.order(byteOrder);
                            long j4 = byteBufferA2.getLong(0);
                            if (j4 == j) {
                                return new a(j3, qVar.a(j3, j2));
                            }
                            StringBuilder sbO = h50.o(j4, "APK Signing Block sizes in header and footer do not match: ", " vs ");
                            sbO.append(j);
                            throw new b(sbO.toString());
                        }
                        throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j3)));
                    }
                    throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
                }
                throw new b("No APK Signing Block before ZIP Central Directory");
            }
            throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
        }
        StringBuilder sbO2 = h50.o(jC, "ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ");
        sbO2.append(jE);
        throw new b(sbO2.toString());
    }

    public static t a(q qVar) throws s {
        o<ByteBuffer, Long> oVarA = p.a(qVar);
        if (oVarA == null) {
            throw new s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = oVarA.a();
        long jLongValue = oVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = p.c(byteBufferA);
        if (jC > jLongValue) {
            StringBuilder sbO = h50.o(jC, "ZIP Central Directory start offset out of range: ", ". ZIP End of Central Directory offset: ");
            sbO.append(jLongValue);
            throw new s(sbO.toString());
        }
        long jD = p.d(byteBufferA);
        long j = jC + jD;
        if (j <= jLongValue) {
            return new t(jC, jD, p.e(byteBufferA), jLongValue, byteBufferA);
        }
        StringBuilder sbO2 = h50.o(j, "ZIP Central Directory overlaps with End of Central Directory. CD end: ", ", EoCD start: ");
        sbO2.append(jLongValue);
        throw new s(sbO2.toString());
    }
}
