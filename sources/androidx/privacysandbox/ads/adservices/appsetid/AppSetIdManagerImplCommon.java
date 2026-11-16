package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
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
/* JADX INFO: loaded from: classes4.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "a", "(Ldy;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure", "NewApi"})
@RestrictTo
public class AppSetIdManagerImplCommon extends AppSetIdManager {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @DoNotInline
    public static Object b(AppSetIdManagerImplCommon appSetIdManagerImplCommon, dy dyVar) {
        AppSetIdManagerImplCommon$getAppSetId$1 appSetIdManagerImplCommon$getAppSetId$1;
        if (dyVar instanceof AppSetIdManagerImplCommon$getAppSetId$1) {
            appSetIdManagerImplCommon$getAppSetId$1 = (AppSetIdManagerImplCommon$getAppSetId$1) dyVar;
            int i = appSetIdManagerImplCommon$getAppSetId$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                appSetIdManagerImplCommon$getAppSetId$1.u = i - Integer.MIN_VALUE;
            } else {
                appSetIdManagerImplCommon$getAppSetId$1 = new AppSetIdManagerImplCommon$getAppSetId$1(appSetIdManagerImplCommon, dyVar);
            }
        } else {
            appSetIdManagerImplCommon$getAppSetId$1 = new AppSetIdManagerImplCommon$getAppSetId$1(appSetIdManagerImplCommon, dyVar);
        }
        Object objR = appSetIdManagerImplCommon$getAppSetId$1.s;
        int i2 = appSetIdManagerImplCommon$getAppSetId$1.u;
        if (i2 == 0) {
            wz2.a0(objR);
            appSetIdManagerImplCommon$getAppSetId$1.r = appSetIdManagerImplCommon;
            appSetIdManagerImplCommon$getAppSetId$1.u = 1;
            appSetIdManagerImplCommon.getClass();
            qo qoVar = new qo(1, kc2.q(appSetIdManagerImplCommon$getAppSetId$1));
            qoVar.s();
            ((android.adservices.appsetid.AppSetIdManager) null).getAppSetId(new b8(1), OutcomeReceiverKt.a(qoVar));
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
            appSetIdManagerImplCommon = appSetIdManagerImplCommon$getAppSetId$1.r;
            wz2.a0(objR);
        }
        android.adservices.appsetid.AppSetId appSetIdL = n3.l(objR);
        appSetIdManagerImplCommon.getClass();
        if (appSetIdL.getScope() == 1) {
            String id = appSetIdL.getId();
            id.getClass();
            return new AppSetId(id, 1);
        }
        String id2 = appSetIdL.getId();
        id2.getClass();
        return new AppSetId(id2, 2);
    }

    @DoNotInline
    @Nullable
    public Object a(@NotNull dy dyVar) {
        return b(this, dyVar);
    }
}
