package com.adsurge.adn.oversea_ad;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Mango {
    public static final Avocado a = new Avocado(3);
    public static final Avocado b = new Avocado(3);
    public static final Cprivate[] c = new Cprivate[0];
    public static long d = 0;
    public static final Mandarin e = new Mandarin();

    public static String a() {
        Cprivate[] cprivateArr;
        Cprivate[] cprivateArr2;
        try {
            StringBuilder sb = new StringBuilder();
            Avocado avocado = b;
            synchronized (avocado) {
                cprivateArr = (Cprivate[]) avocado.b.toArray(c);
                avocado.b.clear();
            }
            for (Cprivate cprivate : cprivateArr) {
                if (cprivate == null) {
                    break;
                }
                sb.append(cprivate.a());
                sb.append(C4664b4.j.c);
            }
            Avocado avocado2 = a;
            synchronized (avocado2) {
                cprivateArr2 = (Cprivate[]) avocado2.b.toArray(c);
                avocado2.b.clear();
            }
            for (Cprivate cprivate2 : cprivateArr2) {
                if (cprivate2 == null) {
                    break;
                }
                sb.append(cprivate2.a());
                sb.append(C4664b4.j.c);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
