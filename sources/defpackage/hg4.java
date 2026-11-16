package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzefm;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfee;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzffv;
import com.google.android.gms.internal.ads.zzfqb;
import com.google.android.gms.internal.ads.zzgae;
import com.google.android.gms.internal.ads.zzgan;
import com.google.android.gms.internal.ads.zzgjv;
import com.google.android.gms.internal.ads.zzgko;
import com.google.android.gms.internal.ads.zzgso;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzheh;
import com.google.android.gms.internal.ads.zzioz;
import com.google.android.gms.internal.ads.zzipv;
import com.google.android.gms.internal.measurement.zztp;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpg;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class hg4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg4(nu4 nu4Var) {
        this.a = 3;
        nu4 nu4Var2 = nu4.b;
        this.b = nu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x031a  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ActivityInfo activityInfo;
        boolean z;
        String string;
        String string2;
        String str;
        String strZza;
        boolean zEquals;
        boolean z2;
        int i;
        boolean zIsActiveNetworkMetered;
        int i2;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                Context context = ((zzfeb) this.b).a;
                return new zzfec(zzbjc.b(context, "init_without_write"), zzbjc.b(context, "crash_without_write"));
            case 1:
                ig4 ig4Var = (ig4) this.b;
                Context context2 = ig4Var.b;
                PackageManager packageManager = context2.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
                ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536);
                String country = locale.getCountry();
                zzt.zzc();
                zzay.zza();
                boolean zZzy = zzf.zzy();
                boolean zIsLatchsky = DeviceProperties.isLatchsky(context2);
                boolean zIsSidewinder = DeviceProperties.isSidewinder(context2);
                String language = locale.getLanguage();
                ArrayList arrayList = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i3 = 0; i3 < localeList.size(); i3++) {
                    arrayList.add(localeList.get(i3).getLanguage());
                }
                ResolveInfo resolveInfoResolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 65536);
                if (resolveInfoResolveActivity3 == null || (activityInfo = resolveInfoResolveActivity3.activityInfo) == null) {
                    string = null;
                    z = true;
                } else {
                    try {
                        PackageInfo packageInfo = Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
                        if (packageInfo != null) {
                            int i4 = packageInfo.versionCode;
                            String str2 = activityInfo.packageName;
                            z = true;
                            try {
                                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(str2).length());
                                sb.append(i4);
                                sb.append(UserDetailsUtils.UserDetailsLiterals.DOT);
                                sb.append(str2);
                                string = sb.toString();
                            } catch (PackageManager.NameNotFoundException unused) {
                                string = null;
                            }
                        } else {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    string = null;
                }
                try {
                    PackageInfo packageInfo2 = Wrappers.packageManager(context2).getPackageInfo("com.android.vending", 128);
                    if (packageInfo2 != null) {
                        int i5 = packageInfo2.versionCode;
                        String str3 = packageInfo2.packageName;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(str3).length());
                        sb2.append(i5);
                        sb2.append(UserDetailsUtils.UserDetailsLiterals.DOT);
                        sb2.append(str3);
                        string2 = sb2.toString();
                    } else {
                        string2 = null;
                    }
                } catch (Exception unused3) {
                }
                String str4 = Build.FINGERPRINT;
                String language2 = Locale.getDefault().getLanguage();
                if (((Boolean) zzba.zzc().a(zzbjr.zf)).booleanValue()) {
                    zzq zzqVarZzk = zzs.zzk(context2);
                    String strZzb = zzqVarZzk.zzb();
                    strZza = zzqVarZzk.zza();
                    str = strZzb;
                } else {
                    if (((Boolean) zzba.zzc().a(zzbjr.yf)).booleanValue()) {
                        language2 = zzs.zzk(context2).zzb();
                    }
                    str = language2;
                    strZza = null;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfoResolveActivity4 = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (listQueryIntentActivities == null || resolveInfoResolveActivity4 == null) {
                    zEquals = false;
                } else {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= listQueryIntentActivities.size()) {
                            zEquals = false;
                        } else if (resolveInfoResolveActivity4.activityInfo.name.equals(listQueryIntentActivities.get(i6).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity4.activityInfo.packageName.equals(zzipv.a(context2));
                        } else {
                            i6++;
                        }
                    }
                }
                zzt.zzc();
                long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) zzba.zzc().a(zzbjr.hd)).booleanValue()) {
                    zzt.zzc();
                    if (zzs.zzE(context2)) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                String strZzf = ((Boolean) zzba.zzc().a(zzbjr.ld)).booleanValue() ? ((Boolean) zzba.zzc().a(zzbjr.nd)).booleanValue() ? ig4Var.d : zzf.zzf(context2) : "";
                boolean z4 = resolveInfoResolveActivity2 != null ? z : false;
                boolean z5 = resolveInfoResolveActivity != null ? z : false;
                zzefm zzefmVar = ig4Var.c;
                String str5 = Build.MODEL;
                return new zzfee(z5, z4, country, zZzy, zIsLatchsky, zIsSidewinder, language, arrayList, string, string2, zEquals, availableBytes, z2, strZzf, Build.VERSION.SDK_INT, str, strZza, zzefmVar.a());
            case 2:
                Context context3 = ((zzfek) this.b).b;
                TelephonyManager telephonyManager = (TelephonyManager) context3.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                zzt.zzc();
                int iOrdinal = -1;
                if (zzs.zzD(context3, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i2 = type;
                    } else {
                        i2 = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    i = i2;
                } else {
                    i = -2;
                    zIsActiveNetworkMetered = false;
                }
                return new zzfei(networkOperator, i, zzt.zzf().zzk(context3), phoneType, zIsActiveNetworkMetered, iOrdinal);
            case 3:
                String str6 = (String) ((nu4) this.b).a;
                nu4 nu4Var = nu4.b;
                return new zzffr(str6, null);
            case 4:
                return new zzffv(((zzffu) this.b).b);
            case 5:
                ((zzfqb) this.b).mo81zza();
                return null;
            case 6:
                Context context4 = ((zzgan) this.b).a;
                return zzgae.a(context4, context4.getPackageName(), Integer.toString(context4.getPackageManager().getPackageInfo(context4.getPackageName(), 0).versionCode));
            case 7:
                tl4 tl4Var = (tl4) this.b;
                ((zzgjv) tl4Var.c.zzb()).a();
                ((zzgko) tl4Var.b.zzb()).zza();
                return null;
            case 8:
                return ((zzioz) this.b).zzb();
            case 9:
                jo4 jo4Var = (jo4) this.b;
                wm4 wm4Var = new wm4(jo4Var, 12);
                synchronized (jo4Var) {
                    zzgsw zzgswVar = jo4Var.b;
                    vt4 vt4VarI = zzheh.i(CallbackToFutureAdapter.a(new ca4(jo4Var.a, jo4Var.c, z3, 17)), wm4Var, jo4Var.d);
                    zzgswVar.e(52, vt4VarI);
                    jo4Var.f = vt4VarI;
                    break;
                }
                return "";
            case 10:
                zzgso zzgsoVar = (zzgso) this.b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                zzgsoVar.a.registerReceiver(zzgsoVar, intentFilter);
                return null;
            case 11:
                return new com.google.android.gms.internal.measurement.zzt(((zzht) this.b).l);
            case 12:
                zzjd zzjdVar = (zzjd) this.b;
                zzjdVar.a.V();
                b25 b25Var = zzjdVar.a.h;
                zzpg.T(b25Var);
                b25Var.t();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                v35 v35Var = (v35) this.b;
                synchronized (((zztp) v35Var.c).g) {
                    v35Var.b = null;
                    break;
                }
                return null;
        }
    }

    public /* synthetic */ hg4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public hg4(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.a = 12;
        this.b = zzjdVar;
    }
}
