package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.singular.sdk.internal.Constants;
import defpackage.az2;
import defpackage.b8;
import defpackage.d;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.kc2;
import defpackage.n3;
import defpackage.pz1;
import defpackage.qo;
import defpackage.s71;
import defpackage.w3;
import defpackage.wz2;
import defpackage.zs1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002!\"J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0097@¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "i", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "j", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "reportImpressionRequest", "Laz2;", "g", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "m", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "a", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Ldy;)Ljava/lang/Object;", "Ext10Impl", "Ext8Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo
public class AdSelectionManagerImplCommon extends AdSelectionManager {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext10Impl {
        public static final Companion a = new Companion();

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion;", "", "Landroid/adservices/adselection/AdSelectionManager;", "adSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "a", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "b", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "c", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Ldy;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object a(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull GetAdSelectionDataRequest getAdSelectionDataRequest, @NotNull dy dyVar) {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1;
                if (dyVar instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) dyVar;
                    int i = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.u;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.u = i - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(this, dyVar);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(this, dyVar);
                }
                Object obj = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.s;
                int i2 = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.u;
                if (i2 != 0) {
                    if (i2 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n3.z(adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.r);
                    wz2.a0(obj);
                    return new GetAdSelectionDataOutcome(w3.d(obj));
                }
                wz2.a0(obj);
                adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.r = adSelectionManager;
                adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.u = 1;
                new qo(1, kc2.q(adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1)).s();
                getAdSelectionDataRequest.getClass();
                if (AdServicesInfo.a() >= 12 || AdServicesInfo.b() >= 12) {
                    w3.A();
                    throw null;
                }
                w3.A();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object b(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest, @NotNull dy dyVar) {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1;
                if (dyVar instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) dyVar;
                    int i = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.u;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.u = i - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1(this, dyVar);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1(this, dyVar);
                }
                Object objR = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.s;
                int i2 = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.u;
                if (i2 == 0) {
                    wz2.a0(objR);
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.r = adSelectionManager;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.u = 1;
                    qo qoVar = new qo(1, kc2.q(adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1));
                    qoVar.s();
                    persistAdSelectionResultRequest.getClass();
                    android.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequestBuild = w3.e().setAdSelectionId(0L).setSeller((AdTechIdentifier) null).setAdSelectionResult((byte[]) null).build();
                    persistAdSelectionResultRequestBuild.getClass();
                    adSelectionManager.persistAdSelectionResult(persistAdSelectionResultRequestBuild, new b8(1), OutcomeReceiverKt.a(qoVar));
                    objR = qoVar.r();
                    dz dzVar = dz.a;
                    if (objR == dzVar) {
                        return dzVar;
                    }
                } else {
                    if (i2 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n3.z(adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.r);
                    wz2.a0(objR);
                }
                return new AdSelectionOutcome(n3.k(objR));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object c(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, @NotNull dy dyVar) {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1;
                if (dyVar instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) dyVar;
                    int i = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.u;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.u = i - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, dyVar);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, dyVar);
                }
                Object obj = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.s;
                int i2 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.u;
                if (i2 != 0) {
                    if (i2 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n3.z(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.r);
                    wz2.a0(obj);
                    return new AdSelectionOutcome(n3.k(obj));
                }
                wz2.a0(obj);
                adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.r = adSelectionManager;
                adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.u = 1;
                new qo(1, kc2.q(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1)).s();
                adSelectionFromOutcomesConfig.getClass();
                w3.n();
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext8Impl {
        public static final Companion a = new Companion();

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion;", "", "Landroid/adservices/adselection/AdSelectionManager;", "adSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "Laz2;", "b", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", "a", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Ldy;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object a(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull ReportEventRequest reportEventRequest, @NotNull dy dyVar) {
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild;
                qo qoVar = new qo(1, kc2.q(dyVar));
                qoVar.s();
                reportEventRequest.getClass();
                if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
                    pz1.v();
                    reportEventRequestBuild = pz1.d().setInputEvent((InputEvent) null).build();
                    reportEventRequestBuild.getClass();
                } else {
                    pz1.v();
                    reportEventRequestBuild = pz1.d().build();
                    reportEventRequestBuild.getClass();
                }
                adSelectionManager.reportEvent(reportEventRequestBuild, new b8(1), OutcomeReceiverKt.a(qoVar));
                Object objR = qoVar.r();
                return objR == dz.a ? objR : az2.a;
            }

            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object b(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, @NotNull dy dyVar) {
                new qo(1, kc2.q(dyVar)).s();
                updateAdCounterHistogramRequest.getClass();
                pz1.x();
                throw null;
            }
        }
    }

    @RequiresPermission
    @DoNotInline
    public static Object h(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportImpressionRequest reportImpressionRequest, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        adSelectionManagerImplCommon.getClass();
        reportImpressionRequest.getClass();
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            if (s71.b(null, AdSelectionConfig.d)) {
                d.u("adSelectionConfig is mandatory forAPI versions lower than ext 10");
                return null;
            }
            zs1.B();
            throw null;
        }
        if (!s71.b(null, AdSelectionConfig.d)) {
            zs1.B();
            throw null;
        }
        zs1.B();
        ((android.adservices.adselection.AdSelectionManager) null).reportImpression(pz1.g(), new b8(1), OutcomeReceiverKt.a(qoVar));
        Object objR = qoVar.r();
        return objR == dz.a ? objR : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission
    @DoNotInline
    public static Object k(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionConfig adSelectionConfig, dy dyVar) {
        AdSelectionManagerImplCommon$selectAds$1 adSelectionManagerImplCommon$selectAds$1;
        if (dyVar instanceof AdSelectionManagerImplCommon$selectAds$1) {
            adSelectionManagerImplCommon$selectAds$1 = (AdSelectionManagerImplCommon$selectAds$1) dyVar;
            int i = adSelectionManagerImplCommon$selectAds$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                adSelectionManagerImplCommon$selectAds$1.t = i - Integer.MIN_VALUE;
            } else {
                adSelectionManagerImplCommon$selectAds$1 = new AdSelectionManagerImplCommon$selectAds$1(adSelectionManagerImplCommon, dyVar);
            }
        } else {
            adSelectionManagerImplCommon$selectAds$1 = new AdSelectionManagerImplCommon$selectAds$1(adSelectionManagerImplCommon, dyVar);
        }
        Object objR = adSelectionManagerImplCommon$selectAds$1.r;
        int i2 = adSelectionManagerImplCommon$selectAds$1.t;
        if (i2 == 0) {
            wz2.a0(objR);
            adSelectionConfig.getClass();
            android.adservices.adselection.AdSelectionConfig.Builder builderD = n3.d();
            AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString("");
            adSelectionSignalsFromString.getClass();
            android.adservices.adselection.AdSelectionConfig.Builder customAudienceBuyers = builderD.setAdSelectionSignals(adSelectionSignalsFromString).setCustomAudienceBuyers(new ArrayList());
            Uri uri = Uri.EMPTY;
            android.adservices.adselection.AdSelectionConfig.Builder decisionLogicUri = customAudienceBuyers.setDecisionLogicUri(Uri.EMPTY);
            AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString("");
            adTechIdentifierFromString.getClass();
            android.adservices.adselection.AdSelectionConfig.Builder perBuyerSignals = decisionLogicUri.setSeller(adTechIdentifierFromString).setPerBuyerSignals(new HashMap());
            AdSelectionSignals adSelectionSignalsFromString2 = AdSelectionSignals.fromString("");
            adSelectionSignalsFromString2.getClass();
            android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = perBuyerSignals.setSellerSignals(adSelectionSignalsFromString2).setTrustedScoringSignalsUri(Uri.EMPTY).build();
            adSelectionConfigBuild.getClass();
            adSelectionManagerImplCommon$selectAds$1.t = 1;
            adSelectionManagerImplCommon.getClass();
            qo qoVar = new qo(1, kc2.q(adSelectionManagerImplCommon$selectAds$1));
            qoVar.s();
            ((android.adservices.adselection.AdSelectionManager) null).selectAds(adSelectionConfigBuild, new b8(1), OutcomeReceiverKt.a(qoVar));
            objR = qoVar.r();
            dz dzVar = dz.a;
            if (objR == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objR);
        }
        return new AdSelectionOutcome(n3.k(objR));
    }

    @RequiresPermission
    @DoNotInline
    public static /* synthetic */ Object b(AdSelectionManagerImplCommon adSelectionManagerImplCommon, GetAdSelectionDataRequest getAdSelectionDataRequest, dy dyVar) {
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            d.u("API is not available. Min version is API 31 ext 10");
            return null;
        }
        adSelectionManagerImplCommon.getClass();
        return Ext10Impl.a.a(null, getAdSelectionDataRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    public static /* synthetic */ Object d(AdSelectionManagerImplCommon adSelectionManagerImplCommon, PersistAdSelectionResultRequest persistAdSelectionResultRequest, dy dyVar) {
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            d.u("API is not available. Min version is API 31 ext 10");
            return null;
        }
        adSelectionManagerImplCommon.getClass();
        return Ext10Impl.a.b(null, persistAdSelectionResultRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    public static Object f(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportEventRequest reportEventRequest, dy dyVar) {
        if (AdServicesInfo.a() < 8 && AdServicesInfo.b() < 9) {
            d.u("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
            return null;
        }
        adSelectionManagerImplCommon.getClass();
        Object objA = Ext8Impl.a.a(null, reportEventRequest, dyVar);
        if (objA == dz.a) {
            return objA;
        }
        return az2.a;
    }

    @RequiresPermission
    @DoNotInline
    public static /* synthetic */ Object l(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, dy dyVar) {
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            d.u("API is not available. Min version is API 31 ext 10");
            return null;
        }
        adSelectionManagerImplCommon.getClass();
        return Ext10Impl.a.c(null, adSelectionFromOutcomesConfig, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    public static Object n(AdSelectionManagerImplCommon adSelectionManagerImplCommon, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, dy dyVar) {
        if (AdServicesInfo.a() < 8 && AdServicesInfo.b() < 9) {
            d.u("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
            return null;
        }
        adSelectionManagerImplCommon.getClass();
        Object objB = Ext8Impl.a.b(null, updateAdCounterHistogramRequest, dyVar);
        if (objB == dz.a) {
            return objB;
        }
        return az2.a;
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull GetAdSelectionDataRequest getAdSelectionDataRequest, @NotNull dy dyVar) {
        return b(this, getAdSelectionDataRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object c(@NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest, @NotNull dy dyVar) {
        return d(this, persistAdSelectionResultRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object e(@NotNull ReportEventRequest reportEventRequest, @NotNull dy dyVar) {
        return f(this, reportEventRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object g(@NotNull ReportImpressionRequest reportImpressionRequest, @NotNull dy dyVar) {
        return h(this, reportImpressionRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object i(@NotNull AdSelectionConfig adSelectionConfig, @NotNull dy dyVar) {
        return k(this, adSelectionConfig, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object j(@NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, @NotNull dy dyVar) {
        return l(this, adSelectionFromOutcomesConfig, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object m(@NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, @NotNull dy dyVar) {
        return n(this, updateAdCounterHistogramRequest, dyVar);
    }
}
