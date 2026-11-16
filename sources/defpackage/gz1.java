package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gz1 {
    public final Context a;
    public final cm2 b;
    public final int c;
    public final cm2 d;
    public final cm2 e;
    public boolean f;

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        cm2 cm2Var = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new ez1(Process.myPid(), (String) cm2Var.getValue()));
            return qh1.h0(linkedHashMap);
        }
        Map mapSingletonMap = Collections.singletonMap(a(), new ez1(Process.myPid(), (String) cm2Var.getValue()));
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public gz1(Context context, n43 n43Var) {
        context.getClass();
        n43Var.getClass();
        this.a = context;
        final int i = 0;
        this.b = new cm2(new sr0(this) { // from class: fz1
            public final /* synthetic */ gz1 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i2 = i;
                gz1 gz1Var = this.b;
                switch (i2) {
                    case 0:
                        return ((hz1) gz1Var.e.getValue()).a;
                    default:
                        return os2.s(gz1Var.a);
                }
            }
        });
        this.c = Process.myPid();
        final int i2 = 1;
        this.d = new cm2(new sv1(n43Var, i2));
        this.e = new cm2(new sr0(this) { // from class: fz1
            public final /* synthetic */ gz1 b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i3 = i2;
                gz1 gz1Var = this.b;
                switch (i3) {
                    case 0:
                        return ((hz1) gz1Var.e.getValue()).a;
                    default:
                        return os2.s(gz1Var.a);
                }
            }
        });
    }
}
