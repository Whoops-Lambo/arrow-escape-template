package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdSelectionSignals;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.singular.sdk.internal.Constants;
import defpackage.a30;
import defpackage.az2;
import defpackage.b8;
import defpackage.d;
import defpackage.dy;
import defpackage.dz;
import defpackage.kc2;
import defpackage.qo;
import defpackage.w3;
import java.time.Instant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\rJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0097@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "request", "Laz2;", "c", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "a", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;Ldy;)Ljava/lang/Object;", "Ext10Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo
public class CustomAudienceManagerImplCommon extends CustomAudienceManager {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext10Impl {
        public static final Companion a = new Companion();

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion;", "", "Landroid/adservices/customaudience/CustomAudienceManager;", "customAudienceManager", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "fetchAndJoinCustomAudienceRequest", "Laz2;", "a", "(Landroid/adservices/customaudience/CustomAudienceManager;Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Ldy;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object a(@NotNull android.adservices.customaudience.CustomAudienceManager customAudienceManager, @NotNull FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NotNull dy dyVar) {
                qo qoVar = new qo(1, kc2.q(dyVar));
                qoVar.s();
                fetchAndJoinCustomAudienceRequest.getClass();
                android.adservices.customaudience.FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequestBuild = w3.h().setName((String) null).setActivationTime((Instant) null).setExpirationTime((Instant) null).setUserBiddingSignals((AdSelectionSignals) null).build();
                fetchAndJoinCustomAudienceRequestBuild.getClass();
                customAudienceManager.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequestBuild, new b8(1), OutcomeReceiverKt.a(qoVar));
                Object objR = qoVar.r();
                return objR == dz.a ? objR : az2.a;
            }
        }
    }

    @RequiresPermission
    @DoNotInline
    public static Object d(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest, dy dyVar) {
        new qo(1, kc2.q(dyVar)).s();
        customAudienceManagerImplCommon.getClass();
        a30.D();
        joinCustomAudienceRequest.getClass();
        a30.b();
        throw null;
    }

    @RequiresPermission
    @DoNotInline
    public static Object f(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, LeaveCustomAudienceRequest leaveCustomAudienceRequest, dy dyVar) {
        new qo(1, kc2.q(dyVar)).s();
        customAudienceManagerImplCommon.getClass();
        a30.C();
        leaveCustomAudienceRequest.getClass();
        throw null;
    }

    @RequiresPermission
    @DoNotInline
    public static Object b(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, dy dyVar) {
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            d.u("API is not available. Min version is API 31 ext 10");
            return null;
        }
        customAudienceManagerImplCommon.getClass();
        Object objA = Ext10Impl.a.a(null, fetchAndJoinCustomAudienceRequest, dyVar);
        if (objA == dz.a) {
            return objA;
        }
        return az2.a;
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NotNull dy dyVar) {
        return b(this, fetchAndJoinCustomAudienceRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object c(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest, @NotNull dy dyVar) {
        return d(this, joinCustomAudienceRequest, dyVar);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object e(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest, @NotNull dy dyVar) {
        return f(this, leaveCustomAudienceRequest, dyVar);
    }
}
