package defpackage;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.v2.settings.data.CCPASettings;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import com.usercentrics.sdk.v2.settings.data.FirstLayer;
import com.usercentrics.sdk.v2.settings.data.GppSettings;
import com.usercentrics.sdk.v2.settings.data.SecondLayer;
import com.usercentrics.sdk.v2.settings.data.ServiceConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.SubConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.TCF2Settings;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCustomization;
import com.usercentrics.sdk.v2.settings.data.UsercentricsLabels;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.settings.data.UsercentricsStyles;
import com.usercentrics.sdk.v2.settings.data.VariantsSettings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class nd2 {
    public final id2 a;
    public final g4 b;
    public final fn c;
    public uq1 d;

    /* JADX WARN: Code duplicated, block: B:74:0x029c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable a(String str, UsercentricsSettings usercentricsSettings, boolean z, fy fyVar) {
        kd2 kd2Var;
        Map map;
        int iIntValue;
        Object objK;
        Object next;
        nd2 nd2Var = this;
        UsercentricsSettings usercentricsSettings2 = usercentricsSettings;
        if (fyVar instanceof kd2) {
            kd2Var = (kd2) fyVar;
            int i = kd2Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                kd2Var.x = i - Integer.MIN_VALUE;
            } else {
                kd2Var = new kd2(nd2Var, fyVar);
            }
        } else {
            kd2Var = new kd2(nd2Var, fyVar);
        }
        Object obj = kd2Var.v;
        int i2 = kd2Var.x;
        String str2 = null;
        boolean z2 = true;
        if (i2 == 0) {
            wz2.a0(obj);
            List list = usercentricsSettings2.K;
            if (list == null) {
                map = hg0.a;
            } else {
                List list2 = list;
                int iU = rh1.U(eu.f(list2, 10));
                if (iU < 16) {
                    iU = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                for (Object obj2 : list2) {
                    linkedHashMap.put(((UsercentricsCategory) obj2).a, obj2);
                }
                map = linkedHashMap;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (ServiceConsentTemplate serviceConsentTemplate : usercentricsSettings2.J) {
                if (map.containsKey(serviceConsentTemplate.f)) {
                    arrayList.add(new ei(serviceConsentTemplate.getD(), serviceConsentTemplate.getE()));
                    for (SubConsentTemplate subConsentTemplate : serviceConsentTemplate.i) {
                        arrayList.add(new ei(subConsentTemplate.getD(), subConsentTemplate.getE()));
                    }
                    i3++;
                }
            }
            List listS0 = du.s0(arrayList, new zm(9));
            Integer numValueOf = Integer.valueOf(i3);
            List list3 = listS0;
            if (list3.isEmpty()) {
                return new dt1(gg0.a, new Integer(0));
            }
            iIntValue = numValueOf.intValue();
            kd2Var.r = nd2Var;
            kd2Var.s = usercentricsSettings2;
            kd2Var.t = map;
            kd2Var.u = iIntValue;
            kd2Var.x = 1;
            objK = nd2Var.b.k(str, list3, z, kd2Var);
            dz dzVar = dz.a;
            if (objK == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = kd2Var.u;
            Map map2 = (Map) kd2Var.t;
            UsercentricsSettings usercentricsSettings3 = kd2Var.s;
            nd2 nd2Var2 = kd2Var.r;
            wz2.a0(obj);
            iIntValue = i4;
            nd2Var = nd2Var2;
            objK = obj;
            map = map2;
            usercentricsSettings2 = usercentricsSettings3;
        }
        List list4 = usercentricsSettings2.J;
        nd2Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        List<UsercentricsService> list5 = (List) objK;
        ArrayList arrayList3 = new ArrayList(eu.f(list5, 10));
        for (UsercentricsService usercentricsService : list5) {
            Iterator it = list4.iterator();
            do {
                if (!it.hasNext()) {
                    next = str2;
                    break;
                }
                next = it.next();
            } while (!s71.b(usercentricsService.a, ((ServiceConsentTemplate) next).d));
            ServiceConsentTemplate serviceConsentTemplate2 = (ServiceConsentTemplate) next;
            UsercentricsCategory usercentricsCategory = (UsercentricsCategory) map.get(serviceConsentTemplate2 != null ? serviceConsentTemplate2.f : str2);
            if (serviceConsentTemplate2 != null) {
                List list6 = serviceConsentTemplate2.k;
                if (usercentricsCategory != null) {
                    if (list6 == null || list6.isEmpty()) {
                        list6 = usercentricsService.p;
                    }
                    List list7 = list6;
                    String str3 = usercentricsCategory.a;
                    Boolean bool = serviceConsentTemplate2.a;
                    Boolean bool2 = serviceConsentTemplate2.j;
                    Boolean bool3 = serviceConsentTemplate2.l;
                    boolean z3 = usercentricsCategory.d;
                    boolean z4 = (usercentricsCategory.e || serviceConsentTemplate2.h) ? z2 : false;
                    String str4 = serviceConsentTemplate2.m;
                    UsercentricsService.Companion companion = UsercentricsService.INSTANCE;
                    String str5 = usercentricsService.a;
                    String str6 = usercentricsService.b;
                    String str7 = usercentricsService.c;
                    List list8 = usercentricsService.d;
                    String str8 = usercentricsService.e;
                    List list9 = usercentricsService.f;
                    String str9 = usercentricsService.g;
                    String str10 = usercentricsService.h;
                    String str11 = usercentricsService.i;
                    String str12 = usercentricsService.j;
                    List list10 = usercentricsService.k;
                    List list11 = usercentricsService.l;
                    List list12 = usercentricsService.m;
                    List list13 = usercentricsService.n;
                    List list14 = usercentricsService.o;
                    List list15 = usercentricsService.q;
                    List list16 = usercentricsService.r;
                    String str13 = usercentricsService.s;
                    String str14 = usercentricsService.t;
                    String str15 = usercentricsService.u;
                    Boolean bool4 = usercentricsService.v;
                    String str16 = usercentricsService.w;
                    String str17 = usercentricsService.x;
                    String str18 = usercentricsService.y;
                    String str19 = usercentricsService.z;
                    String str20 = usercentricsService.B;
                    String str21 = usercentricsService.C;
                    String str22 = usercentricsService.D;
                    String str23 = usercentricsService.E;
                    String str24 = usercentricsService.F;
                    String str25 = usercentricsService.G;
                    String str26 = usercentricsService.H;
                    String str27 = usercentricsService.I;
                    String str28 = usercentricsService.J;
                    Long l = usercentricsService.K;
                    Boolean bool5 = usercentricsService.L;
                    String str29 = usercentricsService.M;
                    ConsentDisclosureObject consentDisclosureObject = usercentricsService.N;
                    String str30 = usercentricsService.O;
                    String str31 = usercentricsService.Q;
                    boolean z5 = usercentricsService.W;
                    list9.getClass();
                    str10.getClass();
                    str11.getClass();
                    str12.getClass();
                    list10.getClass();
                    list11.getClass();
                    list12.getClass();
                    list13.getClass();
                    list14.getClass();
                    list7.getClass();
                    list15.getClass();
                    str13.getClass();
                    str16.getClass();
                    str17.getClass();
                    str18.getClass();
                    str19.getClass();
                    str21.getClass();
                    str22.getClass();
                    str23.getClass();
                    str24.getClass();
                    str25.getClass();
                    str27.getClass();
                    consentDisclosureObject.getClass();
                    arrayList2.add(new UsercentricsService(str5, str6, str7, list8, str8, list9, str9, str10, str11, str12, list10, list11, list12, list13, list14, list7, list15, list16, str13, str14, str15, bool4, str16, str17, str18, str19, str3, str20, str21, str22, str23, str24, str25, str26, str27, str28, l, bool5, str29, consentDisclosureObject, str30, z4, str31, bool, bool2, bool3, z3, str4, z5));
                }
            }
            arrayList3.add(az2.a);
            list4 = list4;
            str2 = null;
            z2 = true;
        }
        return new dt1(arrayList2, new Integer(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(SettingsInitializationParameters settingsInitializationParameters, fy fyVar) {
        ld2 ld2Var;
        nd2 nd2Var = this;
        SettingsInitializationParameters settingsInitializationParameters2 = settingsInitializationParameters;
        if (fyVar instanceof ld2) {
            ld2Var = (ld2) fyVar;
            int i = ld2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld2Var.v = i - Integer.MIN_VALUE;
            } else {
                ld2Var = new ld2(nd2Var, fyVar);
            }
        } else {
            ld2Var = new ld2(nd2Var, fyVar);
        }
        Object objJ = ld2Var.t;
        int i2 = ld2Var.v;
        boolean z = true;
        if (i2 == 0) {
            wz2.a0(objJ);
            ld2Var.r = nd2Var;
            ld2Var.s = settingsInitializationParameters2;
            ld2Var.v = 1;
            objJ = nd2Var.a.j(settingsInitializationParameters2, ld2Var);
            dz dzVar = dz.a;
            if (objJ == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SettingsInitializationParameters settingsInitializationParameters3 = ld2Var.s;
            nd2 nd2Var2 = ld2Var.r;
            wz2.a0(objJ);
            settingsInitializationParameters2 = settingsInitializationParameters3;
            nd2Var = nd2Var2;
        }
        UsercentricsSettings usercentricsSettings = (UsercentricsSettings) objJ;
        fn fnVar = nd2Var.c;
        boolean z2 = settingsInitializationParameters2.e;
        boolean z3 = nd2Var.a.h;
        fnVar.getClass();
        if (!z2 && !z3) {
            z = false;
        }
        fnVar.a = z;
        List list = usercentricsSettings.J;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!s71.b(((ServiceConsentTemplate) obj).a, Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        UsercentricsLabels usercentricsLabels = usercentricsSettings.a;
        SecondLayer secondLayer = usercentricsSettings.b;
        String str = usercentricsSettings.c;
        String str2 = usercentricsSettings.d;
        String str3 = usercentricsSettings.e;
        String str4 = usercentricsSettings.f;
        String str5 = usercentricsSettings.g;
        String str6 = usercentricsSettings.h;
        String str7 = usercentricsSettings.i;
        String str8 = usercentricsSettings.j;
        boolean z4 = usercentricsSettings.k;
        boolean z5 = usercentricsSettings.l;
        boolean z6 = usercentricsSettings.m;
        boolean z7 = usercentricsSettings.n;
        Integer num = usercentricsSettings.o;
        List list2 = usercentricsSettings.p;
        List list3 = usercentricsSettings.q;
        List list4 = usercentricsSettings.r;
        CCPASettings cCPASettings = usercentricsSettings.s;
        TCF2Settings tCF2Settings = usercentricsSettings.t;
        GppSettings gppSettings = usercentricsSettings.u;
        boolean z8 = usercentricsSettings.v;
        boolean z9 = usercentricsSettings.w;
        UsercentricsCustomization usercentricsCustomization = usercentricsSettings.x;
        FirstLayer firstLayer = usercentricsSettings.y;
        UsercentricsStyles usercentricsStyles = usercentricsSettings.z;
        boolean z10 = usercentricsSettings.A;
        boolean z11 = usercentricsSettings.B;
        boolean z12 = usercentricsSettings.C;
        VariantsSettings variantsSettings = usercentricsSettings.D;
        de0 de0Var = usercentricsSettings.E;
        oy2 oy2Var = usercentricsSettings.F;
        List list5 = usercentricsSettings.G;
        Long l = usercentricsSettings.H;
        boolean z13 = usercentricsSettings.I;
        List list6 = usercentricsSettings.K;
        usercentricsLabels.getClass();
        secondLayer.getClass();
        str.getClass();
        str2.getClass();
        str8.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new UsercentricsSettings(usercentricsLabels, secondLayer, str, str2, str3, str4, str5, str6, str7, str8, z4, z5, z6, z7, num, list2, list3, list4, cCPASettings, tCF2Settings, gppSettings, z8, z9, usercentricsCustomization, firstLayer, usercentricsStyles, z10, z11, z12, variantsSettings, de0Var, oy2Var, list5, l, z13, arrayList, list6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(SettingsInitializationParameters settingsInitializationParameters, fy fyVar) {
        md2 md2Var;
        nd2 nd2Var;
        UsercentricsSettings usercentricsSettings;
        if (fyVar instanceof md2) {
            md2Var = (md2) fyVar;
            int i = md2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                md2Var.v = i - Integer.MIN_VALUE;
            } else {
                md2Var = new md2(this, fyVar);
            }
        } else {
            md2Var = new md2(this, fyVar);
        }
        Object objB = md2Var.t;
        int i2 = md2Var.v;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(objB);
            md2Var.r = this;
            md2Var.s = settingsInitializationParameters;
            md2Var.v = 1;
            objB = b(settingsInitializationParameters, md2Var);
            if (objB != dzVar) {
            }
            return dzVar;
        }
        if (i2 == 1) {
            settingsInitializationParameters = (SettingsInitializationParameters) md2Var.s;
            this = md2Var.r;
            wz2.a0(objB);
        } else {
            if (i2 != 2) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            usercentricsSettings = (UsercentricsSettings) md2Var.s;
            nd2Var = md2Var.r;
            wz2.a0(objB);
        }
        dt1 dt1Var = (dt1) objB;
        nd2Var.d = new uq1(usercentricsSettings, (List) dt1Var.a, ((Number) dt1Var.b).intValue());
        return az2.a;
        UsercentricsSettings usercentricsSettings2 = (UsercentricsSettings) objB;
        String str = settingsInitializationParameters.c;
        boolean z = this.c.a;
        md2Var.r = this;
        md2Var.s = usercentricsSettings2;
        md2Var.v = 2;
        Serializable serializableA = this.a(str, usercentricsSettings2, z, md2Var);
        if (serializableA != dzVar) {
            nd2Var = this;
            usercentricsSettings = usercentricsSettings2;
            objB = serializableA;
            dt1 dt1Var2 = (dt1) objB;
            nd2Var.d = new uq1(usercentricsSettings, (List) dt1Var2.a, ((Number) dt1Var2.b).intValue());
            return az2.a;
        }
        return dzVar;
    }

    public nd2(id2 id2Var, g4 g4Var, fn fnVar) {
        fnVar.getClass();
        this.a = id2Var;
        this.b = g4Var;
        this.c = fnVar;
    }
}
