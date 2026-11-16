package defpackage;

import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzayy;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzazv;
import com.google.android.gms.internal.ads.zzgko;
import com.google.android.gms.internal.ads.zzglw;
import com.google.android.gms.internal.ads.zzgsw;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lm4 extends zzglw {
    public final /* synthetic */ int f;
    public final Map g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm4(zzayj zzayjVar, zzgko zzgkoVar, Map map, zzgsw zzgswVar, int i) {
        super("GURqWW4QG4REAys/dgFhV2rABuJukglkUpCWgGo2gA8o+tUa4gm5w5mbLTr1WVBG", "PM6sqImGl2uv8ekyTTAKbgbICIvsUCCuiaNt0GnSUZg=", zzayjVar, zzgkoVar, zzgswVar.a(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        this.f = i;
        switch (i) {
            case 1:
                super("JHPgrF/GJ+xfdFc5M0Va3VgcDOPprwjcv3t5xEePlXbcDZRjC1x7kZViVabklJhB", "PXMSyPL2PaN0Txfytv/w/tYKy/8JjWBBsH5AksHt7WE=", zzayjVar, zzgkoVar, zzgswVar.a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
                this.g = map;
                break;
            default:
                this.g = map;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        switch (this.f) {
            case 0:
                List list = (List) this.g.get("vst");
                if (list == null) {
                    return;
                }
                Object objInvoke = method.invoke("", list);
                objInvoke.getClass();
                Long l = (Long) objInvoke;
                synchronized (zzayjVar) {
                    try {
                        zzayy zzayyVarA = zzayy.a(l.intValue());
                        if (zzayyVarA == null) {
                            throw null;
                        }
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).A0(zzayyVarA);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Map map = this.g;
                Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr.getClass();
                synchronized (zzayjVar) {
                    try {
                        long jLongValue = ((Long) objArr[0]).longValue();
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).U0(jLongValue);
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        if (jLongValue2 >= 0) {
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).t0(jLongValue2);
                        }
                        long jLongValue3 = ((Long) objArr[2]).longValue();
                        if (jLongValue3 >= 0) {
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).u0(jLongValue3);
                        }
                        if (objArr.length > 3 && (obj = objArr[3]) != null) {
                            zzazv zzazvVarA = zzazv.a(((Long) obj).intValue());
                            if (zzazvVarA == null) {
                                throw null;
                            }
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).q0(zzazvVarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
