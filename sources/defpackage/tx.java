package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.internal.zzah;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdlk;
import com.google.android.gms.internal.ads.zzdmv;
import com.google.android.gms.internal.ads.zzelr;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.internal.ads.zzgcq;
import com.google.android.gms.internal.ads.zzhed;
import com.google.android.gms.internal.games_v2.zzap;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.p002firebaseauthapi.zzmj;
import com.google.android.gms.internal.p002firebaseauthapi.zzms;
import com.google.android.gms.internal.p002firebaseauthapi.zzqu;
import com.google.android.gms.internal.p002firebaseauthapi.zzzi;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ironsource.C5074y2;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.utils.n;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class tx implements zzg, zzap, RemoteCall, zzhed, zzgcq, zzdjz, zzfpv, zzmj {
    public final /* synthetic */ int a;
    public String b;

    public tx(String str) {
        this.a = 5;
        str.getClass();
        this.b = str;
    }

    private final void l(Object obj) {
    }

    private final void m(Object obj) {
    }

    public byte[] h(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return i(bArr, i, zzzi.d(zzms.b(2, i), zzms.o, bArr3, str.getBytes(zzqu.a), bArr2));
    }

    public static void a(ls lsVar, jd2 jd2Var) {
        c(lsVar, "X-CRASHLYTICS-GOOGLE-APP-ID", (String) jd2Var.b);
        HashMap map = (HashMap) lsVar.d;
        map.put("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(lsVar, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        map.put(n.c, G5.M);
        c(lsVar, "X-CRASHLYTICS-DEVICE-MODEL", (String) jd2Var.c);
        c(lsVar, "X-CRASHLYTICS-OS-BUILD-VERSION", (String) jd2Var.d);
        c(lsVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", (String) jd2Var.e);
        c(lsVar, "X-CRASHLYTICS-INSTALLATION-ID", ((IdManager) jd2Var.i).c().a);
    }

    public static void c(ls lsVar, String str, String str2) {
        if (str2 != null) {
            ((HashMap) lsVar.d).put(str, str2);
        }
    }

    public static HashMap e(jd2 jd2Var) {
        HashMap map = new HashMap();
        map.put("build_version", (String) jd2Var.h);
        map.put("display_version", (String) jd2Var.g);
        map.put("source", Integer.toString(jd2Var.a));
        String str = (String) jd2Var.f;
        if (!TextUtils.isEmpty(str)) {
            map.put(C5074y2.p, str);
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 12:
                ((zzah) obj).zzD(taskCompletionSource, this.b);
                break;
            case 13:
                ((zzah) obj).zzC(taskCompletionSource, this.b);
                break;
            case 21:
                int i = zzkk.a;
                c15 c15Var = new c15(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) obj).getService();
                String str = this.b;
                Parcel parcelZ1 = zzktVar.z1();
                zzbn.c(parcelZ1, c15Var);
                parcelZ1.writeString(str);
                parcelZ1.writeString("");
                parcelZ1.writeString(null);
                zzktVar.A1(11, parcelZ1);
                break;
            default:
                int i2 = zzkk.a;
                c15 c15Var2 = new c15(taskCompletionSource);
                zzkt zzktVar2 = (zzkt) ((zzku) obj).getService();
                String str2 = this.b;
                Parcel parcelZ2 = zzktVar2.z1();
                zzbn.c(parcelZ2, c15Var2);
                parcelZ2.writeString(str2);
                zzktVar2.A1(5, parcelZ2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.games_v2.zzap
    public /* synthetic */ Task b(GoogleApi googleApi) {
        switch (this.a) {
            case 10:
                return googleApi.doWrite(TaskApiCall.builder().run(new tx(this.b, 13)).setMethodKey(6694).build());
            default:
                return googleApi.doWrite(TaskApiCall.builder().run(new tx(this.b, 12)).setMethodKey(6695).build());
        }
    }

    public ls d(HashMap map) {
        ls lsVar = new ls(this.b, map);
        String str = "Crashlytics Android SDK/" + CrashlyticsCore.getVersion();
        HashMap map2 = (HashMap) lsVar.d;
        map2.put(Command.HTTP_HEADER_USER_AGENT, str);
        map2.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return lsVar;
    }

    public JSONObject f(e01 e01Var) {
        String str = this.b;
        int i = e01Var.c;
        ng1 ng1Var = ng1.h;
        ng1Var.u("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String strF = q63.f(i, "Settings request failed; (status: ", ") from ", str);
            if (ng1Var.k(6)) {
                Log.e("FirebaseCrashlytics", strF, null);
            }
            return null;
        }
        String str2 = e01Var.b;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            ng1Var.B("Failed to parse settings JSON from ".concat(str), e);
            ng1Var.B("Settings response " + str2, null);
            return null;
        }
    }

    public byte[] g(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return j(zzzi.d(zzms.o, bArr3, str.getBytes(zzqu.a), bArr2), bArr);
    }

    public byte[] i(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        zzzr zzzrVar = zzzr.c;
        String str = this.b;
        Mac mac = (Mac) zzzrVar.a.a(str);
        if (i > mac.getMacLength() * 255) {
            e.d("size too large");
            return null;
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i2++;
        }
    }

    public byte[] j(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        zzzr zzzrVar = zzzr.c;
        String str = this.b;
        Mac mac = (Mac) zzzrVar.a.a(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    public byte[] k() throws GeneralSecurityException {
        switch (this.b) {
            case "HmacSha256":
                return zzms.f;
            case "HmacSha384":
                return zzms.g;
            case "HmacSha512":
                return zzms.h;
            default:
                e.d("Could not determine HPKE KDF ID");
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return nj.q(new StringBuilder("Phase('"), this.b, "')");
            case 8:
                return jc1.q(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        switch (this.a) {
            case 17:
                ((zzdlk) obj).zzb(this.b);
                break;
            case 18:
                ((zzdlk) obj).zza(this.b);
                break;
            default:
                ((zzdmv) obj).zze(this.b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zzb(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ tx(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public tx(String str, k92 k92Var) {
        this.a = 2;
        this.b = str;
    }

    public /* synthetic */ tx(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfpv
    public Object zza(Object obj) {
        String str = this.b;
        int i = zzelr.c;
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public Object zza() {
        HandlerThread handlerThread = new HandlerThread(this.b, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zza(Throwable th) {
        switch (this.a) {
            case 14:
                zzt.zzh().d(this.b, th);
                break;
            default:
                zzt.zzh().e(this.b, th);
                break;
        }
    }
}
