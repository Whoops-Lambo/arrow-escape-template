package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jp implements gr2 {
    public final x41 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final os e;
    public final os f;
    public final int g;

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(n30.y("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    public final df a(df dfVar) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        cf cfVarC = dfVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) cfVarC.h;
        if (map2 == null) {
            e32.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        cfVarC.e(R6.B, Build.MODEL);
        cfVarC.e("hardware", Build.HARDWARE);
        cfVarC.e(C4664b4.i.G, Build.DEVICE);
        cfVarC.e(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        cfVarC.e("os-uild", Build.ID);
        cfVarC.e("manufacturer", Build.MANUFACTURER);
        cfVarC.e(FileUploadManager.c, Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) cfVarC.h;
        if (map3 == null) {
            e32.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = jq1.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) cfVarC.h;
        if (map4 == null) {
            e32.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = iq1.a;
                subtype = 100;
            } else if (((iq1) iq1.a.get(subtype)) == null) {
            }
            map = (HashMap) cfVarC.h;
            if (map != null) {
                e32.i("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            cfVarC.e("country", Locale.getDefault().getCountry());
            cfVarC.e("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            cfVarC.e("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                ak.g("CctTransportBackend", "Unable to find version code for package", e);
            }
            cfVarC.e("application_build", Integer.toString(i2));
            return cfVarC.f();
        }
        SparseArray sparseArray3 = iq1.a;
        subtype = 0;
        map = (HashMap) cfVarC.h;
        if (map != null) {
            e32.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        cfVarC.e("country", Locale.getDefault().getCountry());
        cfVarC.e("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        cfVarC.e("mcc_mnc", simOperator);
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        cfVarC.e("application_build", Integer.toString(i2));
        return cfVarC.f();
    }

    public jp(Context context, os osVar, os osVar2) {
        da1 da1Var = new da1();
        ib ibVar = ib.a;
        da1Var.a(hi.class, ibVar);
        da1Var.a(jd.class, ibVar);
        pb pbVar = pb.a;
        da1Var.a(vf1.class, pbVar);
        da1Var.a(pf.class, pbVar);
        jb jbVar = jb.a;
        da1Var.a(hs.class, jbVar);
        da1Var.a(kd.class, jbVar);
        hb hbVar = hb.a;
        da1Var.a(d6.class, hbVar);
        da1Var.a(hd.class, hbVar);
        ob obVar = ob.a;
        da1Var.a(rf1.class, obVar);
        da1Var.a(of.class, obVar);
        kb kbVar = kb.a;
        da1Var.a(nv.class, kbVar);
        da1Var.a(ld.class, kbVar);
        nb nbVar = nb.a;
        da1Var.a(rk0.class, nbVar);
        da1Var.a(hf.class, nbVar);
        mb mbVar = mb.a;
        da1Var.a(qk0.class, mbVar);
        da1Var.a(gf.class, mbVar);
        qb qbVar = qb.a;
        da1Var.a(kq1.class, qbVar);
        da1Var.a(rf.class, qbVar);
        lb lbVar = lb.a;
        da1Var.a(ik0.class, lbVar);
        da1Var.a(ff.class, lbVar);
        da1Var.d = true;
        this.a = new x41(da1Var, 4);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(cn.c);
        this.e = osVar2;
        this.f = osVar;
        this.g = 130000;
    }
}
