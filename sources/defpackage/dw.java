package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzekz;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.internal.ads.zzihu;
import com.google.android.gms.internal.p002firebaseauthapi.zzajg;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzc;
import com.moloco.sdk.internal.f;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import io.p071bidmachine.media3.common.l;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.rendering.c;
import io.p071bidmachine.rendering.model.t;
import io.p071bidmachine.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class dw implements o12, au1, f, c, zzg, zzfpv {
    public static dw c;
    public boolean a;
    public Object b;

    @Override // io.p071bidmachine.rendering.c
    public void e(e eVar) {
    }

    public void i() {
        this.a = true;
    }

    public void k() {
        this.a = false;
    }

    public void l() {
        this.a = false;
    }

    public void t() {
    }

    public void u() {
    }

    public static void w(Context context) {
        dw dwVar = c;
        dwVar.a = false;
        if (((BroadcastReceiver) dwVar.b) != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver((BroadcastReceiver) c.b);
        }
        c.b = null;
    }

    @Override // defpackage.bk2
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.o12
    public void b(n12 n12Var, int i) {
        StringBuilder sb = (StringBuilder) this.b;
        if (this.a) {
            this.a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void c(int i) {
        a.i(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    @Override // defpackage.bk2
    public void clear() {
        ((au1) this.b).clear();
    }

    @Override // defpackage.bk2
    public Set d() {
        return ((ck2) eu.l((au1) this.b)).d();
    }

    public l h() {
        a.i(!this.a);
        this.a = true;
        return new l((SparseBooleanArray) this.b);
    }

    @Override // defpackage.bk2
    public boolean isEmpty() {
        return ((au1) this.b).isEmpty();
    }

    public qx1 j() {
        yx1 yx1Var;
        List list;
        lt0 lt0Var = (lt0) this.b;
        String str = (String) lt0Var.b;
        iw1 iw1Var = (iw1) lt0Var.g;
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append(iw1Var.C);
            sb.append("\n\n");
        }
        Boolean bool = (Boolean) lt0Var.e;
        if (bool != null) {
            sb.append(n30.n("• ", iw1Var.D, ": ", bool.booleanValue() ? iw1Var.B : iw1Var.q, "\n"));
        }
        Long l = (Long) lt0Var.c;
        if (l != null) {
            String strA = iw1Var.a(l.longValue());
            sb.append("• " + iw1Var.k + ": " + strA);
            sb.append("\n");
        }
        Boolean bool2 = (Boolean) lt0Var.f;
        if (bool2 != null) {
            String str2 = bool2.booleanValue() ? iw1Var.B : iw1Var.q;
            sb.append("• " + iw1Var.E + ": " + str2);
            sb.append("\n");
        }
        String str3 = s71.b((Boolean) lt0Var.d, Boolean.TRUE) ? iw1Var.B : iw1Var.q;
        sb.append("• " + iw1Var.r + ": " + str3);
        String str4 = iw1Var.v;
        String string = sb.toString();
        ConsentDisclosureObject consentDisclosureObject = (ConsentDisclosureObject) lt0Var.h;
        ox1 ox1Var = null;
        String strN = str != null ? ek2.n(str) : null;
        if ((consentDisclosureObject == null || (list = consentDisclosureObject.a) == null || !(!list.isEmpty())) && (strN == null || dk2.Z(strN))) {
            yx1Var = null;
        } else {
            yx1Var = new yx1(consentDisclosureObject == null ? null : new ls(consentDisclosureObject, iw1Var, hg0.a).C(), iw1Var.w, strN);
        }
        String strN2 = str != null ? ek2.n(str) : null;
        if (strN2 != null && !dk2.Z(strN2)) {
            ox1Var = new ox1(iw1Var.J, strN2);
        }
        return new qx1(str4, new zx1(string, yx1Var, ox1Var));
    }

    public void m(byte b) {
        ((uo0) this.b).f(String.valueOf(b));
    }

    public void n(char c2) {
        uo0 uo0Var = (uo0) this.b;
        uo0Var.c(uo0Var.b, 1);
        char[] cArr = (char[]) uo0Var.c;
        int i = uo0Var.b;
        uo0Var.b = i + 1;
        cArr[i] = c2;
    }

    @Override // defpackage.bk2
    public Set names() {
        Set setNames = ((au1) this.b).names();
        ArrayList arrayList = new ArrayList(eu.f(setNames, 10));
        Iterator it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(ht.d(0, 0, 15, (String) it.next()));
        }
        return du.E0(arrayList);
    }

    public void o(int i) {
        ((uo0) this.b).f(String.valueOf(i));
    }

    @Override // io.p071bidmachine.util.i
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        io.p071bidmachine.rendering.internal.adform.image.a aVar = (io.p071bidmachine.rendering.internal.adform.image.a) this.b;
        if (aVar.y.compareAndSet(false, this.a)) {
            aVar.x.setImageBitmap(bitmap);
        }
    }

    public void p(long j) {
        ((uo0) this.b).f(String.valueOf(j));
    }

    public void r(short s) {
        ((uo0) this.b).f(String.valueOf(s));
    }

    public boolean x(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.a) {
            return false;
        }
        zx3 zx3Var = new zx3(this, activity, taskCompletionSource, firebaseAuth, firebaseUser);
        this.b = zx3Var;
        LocalBroadcastManager.getInstance(activity).registerReceiver(zx3Var, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
        this.a = true;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfpv
    public Object zza(Object obj) {
        long j;
        zzelf zzelfVar = (zzelf) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.a) {
            zzelfVar.b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(zzbiw.zzaf.zza.U(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzihu e) {
                int i = zze.zza;
                zzo.zzf("Unable to deserialize proto from offline signals database:");
                zzo.zzf(e.getMessage());
            }
        }
        cursorQuery.close();
        Context context = zzelfVar.b;
        zzbiw.zzaf.zzc zzcVarE = zzbiw.zzaf.E();
        String packageName = context.getPackageName();
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).J(packageName);
        String str = Build.MODEL;
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).K();
        int iA = zzekz.a(sQLiteDatabase, 0);
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).G(iA);
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).F(arrayList);
        int iA2 = zzekz.a(sQLiteDatabase, 1);
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).H(iA2);
        int iA3 = zzekz.a(sQLiteDatabase, 3);
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).M(iA3);
        long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).I(jCurrentTimeMillis);
        Cursor cursorC = zzekz.c(sQLiteDatabase, 2);
        if (cursorC.getCount() > 0) {
            cursorC.moveToNext();
            j = cursorC.getLong(cursorC.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorC.close();
        zzcVarE.l();
        ((zzbiw.zzaf) zzcVarE.b).L(j);
        zzbiw.zzaf zzafVar = (zzbiw.zzaf) zzcVarE.m();
        int size = arrayList.size();
        long jS = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zzbiw.zzaf.zza zzaVar = (zzbiw.zzaf.zza) arrayList.get(i2);
            if (zzaVar.T() == zzbiw.zzq.ENUM_TRUE && zzaVar.S() > jS) {
                jS = zzaVar.S();
            }
        }
        if (jS != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jS));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        zzbiq zzbiqVar = zzelfVar.a;
        synchronized (zzbiqVar) {
            if (zzbiqVar.c) {
                try {
                    zzbiw.zzt.zza zzaVar2 = zzbiqVar.b;
                    zzaVar2.l();
                    ((zzbiw.zzt) zzaVar2.b).N(zzafVar);
                } catch (NullPointerException e2) {
                    zzt.zzh().d("AdMobClearcutLogger.modify", e2);
                }
            }
            VersionInfoParcel versionInfoParcel = zzelfVar.c;
            zzbiw.zzar.zza zzaVarG = zzbiw.zzar.G();
            int i3 = versionInfoParcel.buddyApkVersion;
            zzaVarG.l();
            ((zzbiw.zzar) zzaVarG.b).H(i3);
            int i4 = versionInfoParcel.clientJarVersion;
            zzaVarG.l();
            ((zzbiw.zzar) zzaVarG.b).I(i4);
            int i5 = true != versionInfoParcel.isClientJar ? 2 : 0;
            zzaVarG.l();
            ((zzbiw.zzar) zzaVarG.b).E(i5);
            zzbiw.zzar zzarVar = (zzbiw.zzar) zzaVarG.m();
            synchronized (zzbiqVar) {
                if (zzbiqVar.c) {
                    try {
                        zzbiw.zzt.zza zzaVar3 = zzbiqVar.b;
                        zzbiw.zzm.zza zzaVar4 = (zzbiw.zzm.zza) ((zzbiw.zzt) zzaVar3.b).E().w();
                        zzaVar4.l();
                        ((zzbiw.zzm) zzaVar4.b).G(zzarVar);
                        zzaVar3.l();
                        ((zzbiw.zzt) zzaVar3.b).L((zzbiw.zzm) zzaVar4.m());
                    } catch (NullPointerException e3) {
                        zzt.zzh().d("AdMobClearcutLogger.modify", e3);
                    }
                }
            }
        }
        zzbiqVar.c(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzekz.d(sQLiteDatabase, "failed_requests");
        zzekz.d(sQLiteDatabase, "total_requests");
        zzekz.d(sQLiteDatabase, "completed_requests");
        return null;
    }

    public dw(au1 au1Var) {
        au1Var.getClass();
        this.b = au1Var;
        this.a = au1Var.a();
    }

    public static zzc v(Intent intent) {
        Preconditions.checkNotNull(intent);
        zzajg zzajgVar = (zzajg) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzajg.CREATOR);
        zzajgVar.i = true;
        return zzc.d(zzajgVar);
    }

    @Override // defpackage.bk2
    public boolean contains(String str) {
        str.getClass();
        return ((au1) this.b).contains(ht.e(str, false));
    }

    @Override // defpackage.bk2
    public void f(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        au1 au1Var = (au1) this.b;
        String strE = ht.e(str, false);
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(ht.e(str2, true));
        }
        au1Var.f(strE, arrayList);
    }

    @Override // defpackage.bk2
    public List g(String str) {
        str.getClass();
        List listG = ((au1) this.b).g(ht.e(str, false));
        if (listG != null) {
            List list = listG;
            ArrayList arrayList = new ArrayList(eu.f(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ht.d(0, 0, 11, (String) it.next()));
            }
            return arrayList;
        }
        return null;
    }

    public void q(String str) {
        str.getClass();
        ((uo0) this.b).f(str);
    }

    public void s(String str) {
        byte b;
        str.getClass();
        uo0 uo0Var = (uo0) this.b;
        uo0Var.c(uo0Var.b, str.length() + 2);
        char[] cArr = (char[]) uo0Var.c;
        int i = uo0Var.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c2 = cArr[i4];
            byte[] bArr = wj2.b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    uo0Var.c(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = wj2.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) uo0Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = wj2.a[cCharAt];
                        str2.getClass();
                        uo0Var.c(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) uo0Var.c, i4);
                        int length3 = str2.length() + i4;
                        uo0Var.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) uo0Var.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        uo0Var.b = i4;
                    }
                }
                uo0Var.c(i4, 1);
                ((char[]) uo0Var.c)[i4] = '\"';
                uo0Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        uo0Var.b = i3 + 1;
    }

    public /* synthetic */ dw(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public dw(t tVar, boolean z) {
        tVar.getClass();
        this.b = tVar;
        this.a = z;
    }

    public /* synthetic */ dw(Object obj) {
        this.b = obj;
        this.a = true;
    }

    public dw() {
        this.b = new SparseBooleanArray();
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public Object zza() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$0((Context) this.b, this.a);
    }
}
