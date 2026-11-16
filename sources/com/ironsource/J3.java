package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import defpackage.ar1;
import defpackage.az2;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class J3 implements InterfaceC4989t7, InterfaceC4989t7.a {

    @NotNull
    private final C4727ed a;

    @NotNull
    private final C5051wf b;

    @Override // com.ironsource.InterfaceC4989t7.a
    @NotNull
    public synchronized Object a(@NotNull String str, @NotNull N3 n3, @NotNull InterfaceC4953r7 interfaceC4953r7) {
        Object objA;
        try {
            str.getClass();
            n3.getClass();
            interfaceC4953r7.getClass();
            int i = a.a[n3.ordinal()];
            if (i == 1) {
                objA = this.a.a(str, n3, interfaceC4953r7);
            } else if (i == 2) {
                objA = this.b.a(str, n3, interfaceC4953r7);
            } else {
                if (i != 3) {
                    throw new ar1();
                }
                objA = az2.a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return objA;
    }

    @Override // com.ironsource.InterfaceC4989t7.a
    public synchronized void b(@NotNull String str) {
        str.getClass();
        this.a.b(str);
        this.b.b(str);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[N3.values().length];
            try {
                iArr[N3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ J3(InterfaceC4986t4 interfaceC4986t4, N7 n7, U8 u8, int i, e80 e80Var) {
        interfaceC4986t4 = (i & 1) != 0 ? new InterfaceC4986t4.a() : interfaceC4986t4;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            applicationContext.getClass();
            n7 = new C4745fd(new C4944qf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            applicationContext2.getClass();
            u8 = new C5015uf(new C4944qf(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC4986t4, n7, u8);
    }

    @Override // com.ironsource.InterfaceC4989t7
    @NotNull
    public synchronized L3 a(@NotNull String str) {
        str.getClass();
        L3 l3A = this.a.a(str);
        if (l3A.d()) {
            return l3A;
        }
        return this.b.a(str);
    }

    public J3(@NotNull InterfaceC4986t4 interfaceC4986t4, @NotNull N7 n7, @NotNull U8 u8) {
        interfaceC4986t4.getClass();
        n7.getClass();
        u8.getClass();
        this.a = new C4727ed(interfaceC4986t4, n7);
        this.b = new C5051wf(interfaceC4986t4, u8);
    }

    public J3() {
        this(null, null, null, 7, null);
    }
}
