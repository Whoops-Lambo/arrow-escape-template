package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.singular.sdk.internal.Constants;
import defpackage.a30;
import defpackage.az2;
import defpackage.b8;
import defpackage.dy;
import defpackage.dz;
import defpackage.kc2;
import defpackage.qo;
import defpackage.zs1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0017H\u0097@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0097@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "deletionRequest", "Laz2;", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Ldy;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Ldy;)Ljava/lang/Object;", "trigger", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "(Landroid/net/Uri;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "request", InneractiveMediationDefs.GENDER_FEMALE, "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "d", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Ldy;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Ldy;)Ljava/lang/Object;", "", "b", "(Ldy;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo
public class MeasurementManagerImplCommon extends MeasurementManager {
    public final android.adservices.measurement.MeasurementManager a;

    @DoNotInline
    public static Object h(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.a;
        deletionRequest.getClass();
        android.adservices.measurement.DeletionRequest deletionRequestBuild = a30.c().setDeletionMode(0).setMatchBehavior(0).setStart(null).setEnd(null).setDomainUris(null).setOriginUris(null).build();
        deletionRequestBuild.getClass();
        measurementManager.deleteRegistrations(deletionRequestBuild, new b8(1), OutcomeReceiverKt.a(qoVar));
        Object objR = qoVar.r();
        return objR == dz.a ? objR : az2.a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object i(MeasurementManagerImplCommon measurementManagerImplCommon, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        measurementManagerImplCommon.a.getMeasurementApiStatus(new b8(1), OutcomeReceiverKt.a(qoVar));
        return qoVar.r();
    }

    @RequiresPermission
    @DoNotInline
    public static Object j(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        measurementManagerImplCommon.a.registerSource(uri, inputEvent, new b8(1), OutcomeReceiverKt.a(qoVar));
        Object objR = qoVar.r();
        return objR == dz.a ? objR : az2.a;
    }

    @RequiresPermission
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object k(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, dy dyVar) {
        Object objJ = kc2.j(new MeasurementManagerImplCommon$registerSource$4(measurementManagerImplCommon, sourceRegistrationRequest, null), dyVar);
        return objJ == dz.a ? objJ : az2.a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object l(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        measurementManagerImplCommon.a.registerTrigger(uri, new b8(1), OutcomeReceiverKt.a(qoVar));
        Object objR = qoVar.r();
        return objR == dz.a ? objR : az2.a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object m(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, dy dyVar) {
        new qo(1, kc2.q(dyVar)).s();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.a;
        webSourceRegistrationRequest.getClass();
        zs1.C();
        throw null;
    }

    @RequiresPermission
    @DoNotInline
    public static Object n(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, dy dyVar) {
        new qo(1, kc2.q(dyVar)).s();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.a;
        webTriggerRegistrationRequest.getClass();
        zs1.D();
        throw null;
    }

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.a = measurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @DoNotInline
    @Nullable
    public Object a(@NotNull DeletionRequest deletionRequest, @NotNull dy dyVar) {
        return h(this, deletionRequest, dyVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object b(@NotNull dy dyVar) {
        return i(this, dyVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull dy dyVar) {
        return j(this, uri, inputEvent, dyVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @Nullable
    @RequiresPermission
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object d(@NotNull SourceRegistrationRequest sourceRegistrationRequest, @NotNull dy dyVar) {
        return k(this, sourceRegistrationRequest, dyVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull dy dyVar) {
        return l(this, uri, dyVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object f(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest, @NotNull dy dyVar) {
        return m(this, webSourceRegistrationRequest, dyVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object g(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest, @NotNull dy dyVar) {
        return n(this, webTriggerRegistrationRequest, dyVar);
    }
}
