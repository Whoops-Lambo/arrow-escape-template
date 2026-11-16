package defpackage;

import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import com.usercentrics.sdk.v2.ruleset.data.DefaultGeoRule;
import com.usercentrics.sdk.v2.ruleset.data.GeoRule;
import com.usercentrics.sdk.v2.ruleset.data.RuleSet;
import com.usercentrics.sdk.v2.ruleset.data.SessionGeoRule;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k62 {
    public final i62 a;
    public final kf1 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, fy fyVar) {
        j62 j62Var;
        k62 k62Var;
        boolean z;
        String str2;
        boolean z2;
        if (fyVar instanceof j62) {
            j62Var = (j62) fyVar;
            int i = j62Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                j62Var.v = i - Integer.MIN_VALUE;
            } else {
                j62Var = new j62(this, fyVar);
            }
        } else {
            j62Var = new j62(this, fyVar);
        }
        Object obj = j62Var.t;
        int i2 = j62Var.v;
        GeoRule geoRule = null;
        if (i2 == 0) {
            wz2.a0(obj);
            boolean zA = this.b.a();
            j62Var.r = this;
            j62Var.s = zA;
            j62Var.v = 1;
            Serializable serializableJ = this.a.j(str, !zA, j62Var);
            dz dzVar = dz.a;
            if (serializableJ == dzVar) {
                return dzVar;
            }
            k62Var = this;
            z = zA;
            obj = serializableJ;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = j62Var.s;
            k62Var = j62Var.r;
            wz2.a0(obj);
        }
        dt1 dt1Var = (dt1) obj;
        UsercentricsLocation usercentricsLocation = (UsercentricsLocation) dt1Var.b;
        if (usercentricsLocation.a()) {
            if (!z) {
                throw new r23("Unable to initialise because location is not available; check permission or connectivity.", null, 2, null);
            }
            usercentricsLocation = k62Var.b.b;
        }
        RuleSet ruleSet = (RuleSet) dt1Var.a;
        k62Var.getClass();
        List<GeoRule> list = ruleSet.a;
        DefaultGeoRule defaultGeoRule = ruleSet.b;
        GeoRule geoRule2 = null;
        for (GeoRule geoRule3 : list) {
            if (geoRule3.b.contains(usercentricsLocation.b)) {
                geoRule = geoRule3;
                break;
            }
            if (geoRule3.b.contains(usercentricsLocation.a)) {
                geoRule2 = geoRule3;
            }
        }
        if (geoRule != null) {
            geoRule2 = geoRule;
        }
        if (geoRule2 == null) {
            z2 = defaultGeoRule.b;
            str2 = defaultGeoRule.a;
        } else {
            str2 = geoRule2.a;
            z2 = false;
        }
        HashSet hashSetP = kc2.p(defaultGeoRule.a);
        Iterator it = ruleSet.a.iterator();
        while (it.hasNext()) {
            hashSetP.add(((GeoRule) it.next()).a);
        }
        return new SessionGeoRule(str2, z2, usercentricsLocation, hashSetP);
    }

    public k62(i62 i62Var, kf1 kf1Var) {
        kf1Var.getClass();
        this.a = i62Var;
        this.b = kf1Var;
    }
}
