package defpackage;

import android.graphics.Point;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.p003activity.result.ActivityResult;
import com.explorestack.protobuf.z;
import com.facebook.login.r;
import com.usercentrics.sdk.UpdatedConsentPayload;
import com.usercentrics.sdk.UsercentricsReadyStatus;
import com.usercentrics.sdk.services.deviceStorage.models.StorageSessionEntry;
import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.v2.consent.data.SaveConsentsData;
import com.usercentrics.sdk.v2.settings.data.CCPASettings;
import com.usercentrics.tcf.core.model.gvl.RetentionPeriod;
import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.iab.mraid.MraidAdView;
import io.p071bidmachine.rendering.model.q;
import io.p071bidmachine.util.m;
import io.p071bidmachine.util.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class oi extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(int i, Object obj, Object obj2) {
        super(1);
        this.i = i;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v0, types: [dy] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Map map;
        Object j52Var;
        String str;
        int i = this.i;
        ?? r1 = 0;
        r1 = 0;
        boolean z = false;
        int i2 = 1;
        az2 az2Var = az2.a;
        Object obj2 = this.j;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ri riVar = (ri) obj2;
                riVar.a.b(new q6(riVar, (StorageSessionEntry) obj3, th, null, 1));
                return az2Var;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                gx gxVar = (gx) obj2;
                gxVar.b.error("Failed while trying to save consents", th2);
                gxVar.a.b(new ex(gxVar, (SaveConsentsData) obj3, r1, z ? 1 : 0));
                return az2Var;
            case 2:
                List list = (List) obj;
                list.getClass();
                ((my) obj2).a.c(new fx(i2, (o5) obj3, list));
                return az2Var;
            case 3:
                ((Throwable) obj).getClass();
                ((my) obj2).a.c(new r6((vu2) obj3, 3));
                return az2Var;
            case 4:
                List list2 = (List) obj;
                list2.getClass();
                ((my) obj2).a.c(new fx(2, (o5) obj3, list2));
                return az2Var;
            case 5:
                ((Throwable) obj).getClass();
                ((my) obj2).a.c(new r6((lw2) obj3, 4));
                return az2Var;
            case 6:
                r23 r23Var = (r23) obj;
                r23Var.getClass();
                ((f50) obj2).g.error("Failed while restoring user session", r23Var);
                ((j33) obj3).invoke(new r23(r23Var.toString(), r23Var));
                return az2Var;
            case 7:
                try {
                    ((r6) ((v7) obj3).b).invoke();
                    break;
                } catch (Throwable unused) {
                }
                return az2Var;
            case 8:
                IdAndName idAndName = (IdAndName) obj;
                idAndName.getClass();
                RetentionPeriod retentionPeriod = (RetentionPeriod) obj2;
                if (retentionPeriod != null && (map = retentionPeriod.a) != null) {
                    r1 = (Integer) map.get(Integer.valueOf(idAndName.a));
                }
                String str2 = idAndName.b;
                if (r1 == 0) {
                    return n30.y("• ", dk2.y0(str2).toString());
                }
                ?? R = pv1.r("• ", dk2.y0(str2).toString(), " (", ((ln2) obj3).b().C, ": ");
                R.append(r1);
                R.append(")");
                return R.toString();
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ls lsVar = ((hx2) obj2).b;
                List list3 = (List) obj3;
                lsVar.getClass();
                list3.getClass();
                lsVar.j(list3, new gy1(!zBooleanValue));
                return az2Var;
            case 10:
                Object obj4 = ((k52) obj).a;
                wr0 wr0Var = (wr0) obj2;
                wr0 wr0Var2 = (wr0) obj3;
                if (!(obj4 instanceof j52)) {
                    try {
                        j52Var = ((g33) obj4).l();
                    } catch (Throwable th3) {
                        j52Var = new j52(th3);
                    }
                    if (!(j52Var instanceof j52)) {
                        wr0Var.invoke((UsercentricsReadyStatus) j52Var);
                    }
                    Throwable thB = k52.b(j52Var);
                    if (thB != null) {
                        String message = thB.getMessage();
                        wr0Var2.invoke(new p23(new r23(message != null ? message : "", thB)));
                    }
                    break;
                }
                Throwable thB2 = k52.b(obj4);
                if (thB2 != null) {
                    wr0Var2.invoke(((r23) thB2).d());
                }
                return az2Var;
            case 11:
                Object obj5 = ((k52) obj).a;
                ((p33) obj2).a.b().c(new y8((sr0) obj3, i2));
                return az2Var;
            case 12:
                TCFData tCFData = (TCFData) obj;
                p33 p33Var = (p33) obj2;
                vg1 vg1Var = p33Var.a;
                ArrayList arrayList = (ArrayList) obj3;
                String str3 = (tCFData == null || (str = tCFData.g) == null) ? "" : str;
                String str4 = tCFData != null ? p33Var.g().a : "";
                String strJ = p33Var.j();
                CCPASettings cCPASettings = ((wc2) vg1Var.F.getValue()).c.d;
                vg1Var.b().c(new r6(new UpdatedConsentPayload(strJ, str3, cCPASettings != null ? cCPASettings.h : false ? ((gp) vg1Var.I.getValue()).a().a() : "", str4, arrayList), 17));
                return az2Var;
            case 13:
                jy1 jy1Var = (jy1) obj;
                jy1Var.getClass();
                vt vtVar = (vt) obj3;
                ((jh) obj2).invoke(new zw1(jy1Var, new ls((g33) vtVar.b, (y33) vtVar.c, (String) vtVar.d), new x41(new dx2(vtVar, i2), 19)));
                return az2Var;
            case 14:
                p23 p23Var = (p23) obj;
                p23Var.getClass();
                ((a33) ((vt) obj2).e).c(p23Var);
                ((wr0) obj3).invoke(p23Var);
                return az2Var;
            case 15:
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i3 = activityResult.a;
                if (i3 == -1) {
                    ((r) obj2).c().i(z.a(1), i3, activityResult.b);
                } else {
                    ((FragmentActivity) obj3).finish();
                }
                return az2Var;
            case 16:
                AdProcessCallback adProcessCallback = (AdProcessCallback) obj;
                adProcessCallback.getClass();
                adProcessCallback.processClickVerified((m) obj2, (q) obj3);
                return az2Var;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                MraidAdView mraidAdView = (MraidAdView) obj2;
                mraidAdView.f.x(mraidAdView, str5, (Point) obj3);
                return az2Var;
            case 18:
                int iIntValue = ((Number) obj).intValue();
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                if (iIntValue == 0) {
                    return "";
                }
                return iIntValue < q63.a(str7.length(), 1, str6) ? dk2.k0(dk2.w0(Math.min(iIntValue, str7.length()), dk2.k0(str7).toString())).toString() : h50.i(str6, ":", str7);
            default:
                ((View) obj2).removeOnLayoutChangeListener((s) obj3);
                return az2Var;
        }
    }
}
