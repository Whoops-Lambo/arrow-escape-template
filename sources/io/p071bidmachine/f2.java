package io.p071bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import io.p071bidmachine.core.b;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.models.g;
import io.p071bidmachine.protobuf.AdNetwork;
import io.p071bidmachine.protobuf.InitResponse;
import io.p071bidmachine.tracking.d;
import io.p071bidmachine.util.p;
import io.p071bidmachine.utils.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class f2 implements b, InitializationParams {
    public static volatile f2 d;
    public static final String[] e = {"IABConsent_SubjectToGDPR", "IABTCF_gdprApplies", "IABConsent_ConsentString", AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABUSPrivacy_String", "IABGPP_HDR_GppString", "IABGPP_GppSID"};
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public f2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new v1(this);
                break;
            default:
                this.b = new Object();
                this.c = new HashMap();
                break;
        }
    }

    public static f2 a() {
        f2 f2Var;
        f2 f2Var2 = d;
        if (f2Var2 != null) {
            return f2Var2;
        }
        synchronized (f2.class) {
            try {
                f2Var = d;
                if (f2Var == null) {
                    f2Var = new f2(0);
                    d = f2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2Var;
    }

    public void c(String str) {
        synchronized (this.b) {
        }
    }

    @Override // io.p071bidmachine.core.b
    public void f(Object obj) {
        switch (this.a) {
            case 2:
                a aVarC = (a) obj;
                if (aVarC == null) {
                    aVarC = a.c("Failed to track URL");
                }
                m1.e((List) this.b, (d) this.c, TrackEventType.Error.getActionValue(), aVarC);
                break;
            default:
                b2 b2Var = (b2) this.c;
                w wVar = b2Var.c;
                Objects.requireNonNull(wVar);
                b2Var.a(new y1(wVar, 1));
                break;
        }
    }

    @Override // io.p071bidmachine.GeneralParams
    public io.p071bidmachine.models.d getDataRestrictions() {
        return (DataRestrictionsImpl) this.c;
    }

    @Override // io.p071bidmachine.GeneralParams
    public g getTargetingInfo() {
        return (TargetingInfoImpl) this.b;
    }

    @Override // io.p071bidmachine.core.b
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 2:
                break;
            default:
                InitResponse initResponse = (InitResponse) obj;
                String str = (String) this.b;
                b2 b2Var = (b2) this.c;
                b2Var.b();
                if (initResponse != null) {
                    Context context = b2Var.a;
                    try {
                        p.P(c.a(context), "initData", Base64.encodeToString(initResponse.toByteArray(), 0));
                        p.P(c.a(context), "init_data_session_id", str);
                        break;
                    } catch (Exception unused) {
                    }
                    w wVar = b2Var.c;
                    wVar.getClass();
                    p1 p1Var = (p1) wVar.a;
                    p1Var.b(SessionManager.get().getSessionId(), initResponse, str);
                    if (p1Var.s != null) {
                        ExtraParamsManager.get().setExtras(p1Var.s, initResponse.getExtras());
                        Context context2 = p1Var.s;
                        List<AdNetwork> adNetworksList = initResponse.getAdNetworksList();
                        if (adNetworksList != null) {
                            Iterator<AdNetwork> it = adNetworksList.iterator();
                            while (it.hasNext()) {
                                NetworkRegistry.registerInitNetwork(context2, it.next());
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public void b(SharedPreferences sharedPreferences, String str) {
        Integer numValueOf;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "IABTCF_gdprApplies":
                    p.F(sharedPreferences, "IABTCF_gdprApplies", -1);
                    break;
                case "IABGPP_GppSID":
                    String strH = p.H(sharedPreferences, "IABGPP_GppSID");
                    if (TextUtils.isEmpty(strH)) {
                        this.c = null;
                        break;
                    } else {
                        try {
                            String[] strArrSplit = strH.split("_");
                            if (strArrSplit.length == 0) {
                                this.c = null;
                            } else {
                                this.c = new ArrayList();
                                for (String str2 : strArrSplit) {
                                    Handler handler = j.a;
                                    if (!TextUtils.isEmpty(str2)) {
                                        try {
                                            numValueOf = Integer.valueOf(Integer.parseInt(str2));
                                        } catch (Throwable unused) {
                                            numValueOf = null;
                                        }
                                    } else {
                                        numValueOf = null;
                                    }
                                    if (numValueOf != null) {
                                        ((ArrayList) this.c).add(numValueOf);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            io.p071bidmachine.core.a.i(th);
                            this.c = null;
                            return;
                        }
                        break;
                    }
                    break;
                case "IABUSPrivacy_String":
                    p.H(sharedPreferences, "IABUSPrivacy_String");
                    break;
                case "IABConsent_ConsentString":
                    p.H(sharedPreferences, "IABConsent_ConsentString");
                    break;
                case "IABTCF_TCString":
                    p.H(sharedPreferences, AndroidTcfDataSource.TCF_TCSTRING_KEY);
                    break;
                case "IABConsent_SubjectToGDPR":
                    String strH2 = p.H(sharedPreferences, "IABConsent_SubjectToGDPR");
                    if (strH2 != null) {
                        strH2.equals("1");
                        break;
                    }
                    break;
                case "IABGPP_HDR_GppString":
                    p.H(sharedPreferences, "IABGPP_HDR_GppString");
                    break;
            }
        }
    }

    @Override // io.p071bidmachine.GeneralParams
    public boolean isTestMode() {
        return p1.d().w;
    }

    public f2(TargetingParams targetingParams, DataRestrictionsImpl dataRestrictionsImpl) {
        this.a = 4;
        this.b = new TargetingInfoImpl(targetingParams);
        this.c = dataRestrictionsImpl;
    }

    public f2(b2 b2Var, String str) {
        this.a = 3;
        this.c = b2Var;
        this.b = str;
    }

    public f2(ArrayList arrayList, d dVar) {
        this.a = 2;
        this.b = arrayList;
        this.c = dVar;
    }
}
