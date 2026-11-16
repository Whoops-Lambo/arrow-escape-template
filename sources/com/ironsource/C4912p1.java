package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4912p1 implements InterfaceC4930q1 {

    @NotNull
    private final IronSource.a a;

    /* JADX INFO: renamed from: com.ironsource.p1$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C4912p1(@NotNull IronSource.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @Override // com.ironsource.InterfaceC4930q1
    @NotNull
    public InterfaceC4947r1 a(@NotNull InterfaceC4858m1 interfaceC4858m1) {
        interfaceC4858m1.getClass();
        int i = a.a[this.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new Y2(interfaceC4858m1);
                }
                defpackage.d.q(this.a, "Unsupported ad format: ");
                return null;
            }
            return new C4782he(interfaceC4858m1);
        }
        return new K9(interfaceC4858m1);
    }
}
