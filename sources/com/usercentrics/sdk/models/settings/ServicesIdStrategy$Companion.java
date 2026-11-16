package com.usercentrics.sdk.models.settings;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4664b4;
import com.ironsource.G5;
import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.UserDecision;
import com.usercentrics.sdk.services.tcf.interfaces.TCFFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import defpackage.ab2;
import defpackage.at0;
import defpackage.bb2;
import defpackage.dk2;
import defpackage.e32;
import defpackage.e80;
import defpackage.en2;
import defpackage.gg0;
import defpackage.gn2;
import defpackage.hn2;
import defpackage.in2;
import defpackage.jn2;
import defpackage.kk2;
import defpackage.n30;
import defpackage.pv1;
import defpackage.rw1;
import defpackage.wd1;
import defpackage.wh;
import defpackage.y3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001cJ\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u0015\u0010\u001fJ\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u0015\u0010\"J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u0015\u0010%J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b\u0015\u0010(J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b\u0015\u0010+J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b\u0015\u0010.J!\u00103\u001a\b\u0012\u0004\u0012\u0002020/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u0002052\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"com/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion", "", "<init>", "()V", "", "serviceId", "", "isTCFDecision", "(Ljava/lang/String;)Z", "Len2;", "tcfServiceType", "(Ljava/lang/String;)Len2;", "isGDPRDecision", "Lwh;", "serviceType", "matchesServiceType", "(Ljava/lang/String;Lwh;)Z", "actualServiceId", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "category", "id", "(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;)Ljava/lang/String;", "Lwd1;", NotificationCompat.CATEGORY_SERVICE, "(Lwd1;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "vendor", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;", "stack", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "specialFeature", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "purpose", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;", "specialPurpose", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;", "feature", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;)Ljava/lang/String;", "Lcom/usercentrics/sdk/AdTechProvider;", "adTechProvider", "(Lcom/usercentrics/sdk/AdTechProvider;)Ljava/lang/String;", "", "Lrw1;", "userDecisions", "Lcom/usercentrics/sdk/UserDecision;", "userDecisionsGDPR", "(Ljava/util/List;)Ljava/util/List;", "Ljn2;", "userDecisionsTCF", "(Ljava/util/List;)Ljn2;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ServicesIdStrategy$Companion {
    private final String actualServiceId(String serviceId) {
        List listM0 = dk2.m0(serviceId, new char[]{G5.U}, 6);
        if (1 <= listM0.size() - 1) {
            return (String) listM0.get(1);
        }
        e32.i("invalid id");
        return null;
    }

    public /* synthetic */ ServicesIdStrategy$Companion(e80 e80Var) {
        this();
    }

    private final boolean isGDPRDecision(String serviceId) {
        for (at0 at0Var : at0.values()) {
            if (bb2.Companion.matchesServiceType(serviceId, at0Var)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isTCFDecision(String serviceId) {
        if (tcfServiceType(serviceId) != null) {
            return true;
        }
        return false;
    }

    private final boolean matchesServiceType(String serviceId, wh serviceType) {
        return kk2.L(serviceId, serviceType.getPrefix(), false);
    }

    private final en2 tcfServiceType(String serviceId) {
        for (en2 en2Var : en2.values()) {
            if (bb2.Companion.matchesServiceType(serviceId, en2Var)) {
                return en2Var;
            }
        }
        return null;
    }

    @NotNull
    public final String id(@NotNull AdTechProvider adTechProvider) {
        adTechProvider.getClass();
        return pv1.k(adTechProvider.a, "AdTechProvider=");
    }

    @NotNull
    public final List<UserDecision> userDecisionsGDPR(@NotNull List<rw1> userDecisions) {
        UserDecision userDecision;
        userDecisions.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : userDecisions) {
            if (bb2.Companion.isGDPRDecision(((rw1) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            rw1 rw1Var = (rw1) obj2;
            Boolean bool = (Boolean) rw1Var.b.get(C4664b4.j.b0);
            if (bool != null) {
                userDecision = new UserDecision(bb2.Companion.actualServiceId(rw1Var.a), bool.booleanValue());
            } else {
                userDecision = null;
            }
            if (userDecision != null) {
                arrayList2.add(userDecision);
            }
        }
        return arrayList2;
    }

    @NotNull
    public final jn2 userDecisionsTCF(@NotNull List<rw1> userDecisions) {
        int i;
        boolean zBooleanValue;
        userDecisions.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : userDecisions) {
            if (bb2.Companion.isTCFDecision(((rw1) obj).a)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            gg0 gg0Var = gg0.a;
            return new jn2(gg0Var, gg0Var, gg0Var, gg0Var);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            rw1 rw1Var = (rw1) obj2;
            ServicesIdStrategy$Companion servicesIdStrategy$Companion = bb2.Companion;
            String str = rw1Var.a;
            Map map = rw1Var.b;
            int i3 = Integer.parseInt(servicesIdStrategy$Companion.actualServiceId(str));
            en2 en2VarTcfServiceType = servicesIdStrategy$Companion.tcfServiceType(rw1Var.a);
            if (en2VarTcfServiceType == null) {
                i = -1;
            } else {
                i = ab2.$EnumSwitchMapping$0[en2VarTcfServiceType.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            Boolean bool = (Boolean) map.get(C4664b4.j.b0);
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            arrayList5.add(new y3(i3, zBooleanValue));
                        }
                    } else {
                        arrayList2.add(new gn2(i3, (Boolean) map.get(C4664b4.j.b0), (Boolean) map.get("legitimateInterest")));
                    }
                } else {
                    Boolean bool2 = (Boolean) map.get(C4664b4.j.b0);
                    hn2 hn2Var = new hn2();
                    hn2Var.a = i3;
                    hn2Var.b = bool2;
                    arrayList3.add(hn2Var);
                }
            } else {
                arrayList4.add(new in2(i3, (Boolean) map.get(C4664b4.j.b0), (Boolean) map.get("legitimateInterest")));
            }
        }
        return new jn2(arrayList2, arrayList3, arrayList4, arrayList5);
    }

    private ServicesIdStrategy$Companion() {
    }

    @NotNull
    public final String id(@NotNull UsercentricsCategory category) {
        category.getClass();
        return n30.y("Category=", category.a);
    }

    @NotNull
    public final String id(@NotNull TCFFeature feature) {
        feature.getClass();
        return pv1.k(feature.c, "TCFFeature=");
    }

    @NotNull
    public final String id(@NotNull TCFPurpose purpose) {
        purpose.getClass();
        return pv1.k(purpose.c, "TCFPurpose=");
    }

    @NotNull
    public final String id(@NotNull wd1 service) {
        service.getClass();
        return n30.y("Service=", service.f);
    }

    @NotNull
    public final String id(@NotNull TCFSpecialPurpose specialPurpose) {
        specialPurpose.getClass();
        return pv1.k(specialPurpose.c, "TCFSpecialPurpose=");
    }

    @NotNull
    public final String id(@NotNull TCFSpecialFeature specialFeature) {
        specialFeature.getClass();
        return pv1.k(specialFeature.c, "TCFSpecialFeature=");
    }

    @NotNull
    public final String id(@NotNull TCFStack stack) {
        stack.getClass();
        return pv1.k(stack.b, "TCFStack=");
    }

    @NotNull
    public final String id(@NotNull TCFVendor vendor) {
        vendor.getClass();
        return pv1.k(vendor.d, "TCFVendor=");
    }
}
