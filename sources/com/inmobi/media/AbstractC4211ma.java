package com.inmobi.media;

import defpackage.aj0;
import defpackage.cz;
import defpackage.gd1;
import defpackage.kc2;
import defpackage.tb5;
import defpackage.zi0;
import java.util.concurrent.ExecutorService;
import okhttp3.Dispatcher;

/* JADX INFO: renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4211ma {
    public static final Dispatcher a;
    public static final Dispatcher b;
    public static final zi0 c;
    public static final cz d;
    public static final cz e;
    public static final cz f;
    public static final cz g;

    static {
        Object value = P6.b.getValue();
        value.getClass();
        a = new Dispatcher((ExecutorService) value);
        Object value2 = P6.a.getValue();
        value2.getClass();
        b = new Dispatcher((ExecutorService) value2);
        gd1 gd1Var = P6.f;
        Object value3 = gd1Var.getValue();
        value3.getClass();
        c = new aj0((ExecutorService) value3);
        Object value4 = P6.c.getValue();
        value4.getClass();
        d = kc2.a(new aj0((ExecutorService) value4).plus(tb5.a()));
        Object value5 = P6.d.getValue();
        value5.getClass();
        e = kc2.a(new aj0((ExecutorService) value5).plus(tb5.a()));
        Object value6 = gd1Var.getValue();
        value6.getClass();
        f = kc2.a(new aj0((ExecutorService) value6).plus(tb5.a()));
        g = kc2.a(defpackage.ak.h((Wc) P6.e.getValue()).plus(tb5.a()));
    }
}
