package com.ironsource;

import android.content.Context;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.vungle.ads.BuildConfig;
import defpackage.e80;
import defpackage.eu;
import io.p071bidmachine.BidMachine;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5081y9 {

    @NotNull
    public static final a a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.y9$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        @NotNull
        public final List<String> a() {
            return eu.z("AppLovin", "APS", BidMachine.NAME, "Bigo", "Chartboost", "Fyber", MolocoMediationAdapter.MEDIATION_PLATFORM_NAME, "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", R6.H1, "Verve", "Voodoo", "Yandex", "YSO");
        }

        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }

        public final void a(@NotNull Context context) {
            context.getClass();
            C5099z9.b(context);
        }
    }

    @NotNull
    public static final List<String> a() {
        return a.a();
    }
}
