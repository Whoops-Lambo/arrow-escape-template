package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import defpackage.ar1;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4906od implements O7, O7.a {

    @NotNull
    private final J3 a;

    @NotNull
    private final R4 b;

    @Override // com.ironsource.O7.a
    @NotNull
    public synchronized Object a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, @NotNull N3 n3, @NotNull InterfaceC4953r7 interfaceC4953r7) {
        Object objA;
        try {
            str.getClass();
            adFormat.getClass();
            n3.getClass();
            interfaceC4953r7.getClass();
            String strA = new C4995td(str, adFormat).a();
            int i = a.a[n3.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new ar1();
                }
                objA = this.a.a(strA, n3, interfaceC4953r7);
            } else {
                objA = this.b.a(strA, n3, interfaceC4953r7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return objA;
    }

    @Override // com.ironsource.O7.a
    public synchronized void b(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        str.getClass();
        adFormat.getClass();
        String strA = new C4995td(str, adFormat).a();
        if (!this.b.a(strA).d()) {
            this.a.b(strA);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.od$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[N3.values().length];
            try {
                iArr[N3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ C4906od(J3 j3, R4 r4, int i, e80 e80Var) {
        this((i & 1) != 0 ? new J3(null, null, null, 7, null) : j3, (i & 2) != 0 ? new R4() : r4);
    }

    public C4906od(@NotNull J3 j3, @NotNull R4 r4) {
        j3.getClass();
        r4.getClass();
        this.a = j3;
        this.b = r4;
    }

    public C4906od() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O7
    @NotNull
    public synchronized L3 a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        str.getClass();
        adFormat.getClass();
        String strA = new C4995td(str, adFormat).a();
        L3 l3A = this.b.a(strA);
        if (l3A.d()) {
            return l3A;
        }
        return this.a.a(strA);
    }
}
