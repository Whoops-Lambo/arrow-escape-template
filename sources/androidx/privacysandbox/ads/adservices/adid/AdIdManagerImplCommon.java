package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import defpackage.b8;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.kc2;
import defpackage.n3;
import defpackage.qo;
import defpackage.wz2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "a", "(Ldy;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure", "NewApi"})
@RestrictTo
public class AdIdManagerImplCommon extends AdIdManager {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission
    @DoNotInline
    public static Object b(AdIdManagerImplCommon adIdManagerImplCommon, dy dyVar) {
        AdIdManagerImplCommon$getAdId$1 adIdManagerImplCommon$getAdId$1;
        if (dyVar instanceof AdIdManagerImplCommon$getAdId$1) {
            adIdManagerImplCommon$getAdId$1 = (AdIdManagerImplCommon$getAdId$1) dyVar;
            int i = adIdManagerImplCommon$getAdId$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                adIdManagerImplCommon$getAdId$1.u = i - Integer.MIN_VALUE;
            } else {
                adIdManagerImplCommon$getAdId$1 = new AdIdManagerImplCommon$getAdId$1(adIdManagerImplCommon, dyVar);
            }
        } else {
            adIdManagerImplCommon$getAdId$1 = new AdIdManagerImplCommon$getAdId$1(adIdManagerImplCommon, dyVar);
        }
        Object objR = adIdManagerImplCommon$getAdId$1.s;
        int i2 = adIdManagerImplCommon$getAdId$1.u;
        if (i2 == 0) {
            wz2.a0(objR);
            adIdManagerImplCommon$getAdId$1.r = adIdManagerImplCommon;
            adIdManagerImplCommon$getAdId$1.u = 1;
            adIdManagerImplCommon.getClass();
            qo qoVar = new qo(1, kc2.q(adIdManagerImplCommon$getAdId$1));
            qoVar.s();
            ((android.adservices.adid.AdIdManager) null).getAdId(new b8(1), OutcomeReceiverKt.a(qoVar));
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
            adIdManagerImplCommon = adIdManagerImplCommon$getAdId$1.r;
            wz2.a0(objR);
        }
        android.adservices.adid.AdId adIdC = n3.c(objR);
        adIdManagerImplCommon.getClass();
        String adId = adIdC.getAdId();
        adId.getClass();
        return new AdId(adId, adIdC.isLimitAdTrackingEnabled());
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull dy dyVar) {
        return b(this, dyVar);
    }
}
