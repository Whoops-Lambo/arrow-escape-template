package com.ironsource;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class D4 implements A7 {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5094z4.values().length];
            try {
                iArr[EnumC5094z4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5094z4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5094z4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5094z4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.A7
    @Nullable
    public F4 a(@NotNull Context context, @NotNull EnumC5094z4 enumC5094z4) {
        context.getClass();
        enumC5094z4.getClass();
        int i = a.a[enumC5094z4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return null;
                }
                return new C4(context, E4.c);
            }
            return new C4(context, "unityads-installinfo");
        }
        return new C4(context, "supersonic_shared_preferen");
    }
}
