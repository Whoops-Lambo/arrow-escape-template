package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import defpackage.il3;
import defpackage.m62;
import defpackage.ol3;
import defpackage.rp3;
import defpackage.wx2;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaet {
    public static final Logger c = new Logger("FirebaseAuth", "FirebaseAuthFallback:");
    public final zzaba a;
    public final rp3 b;

    public static boolean e(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        c.w("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public zzaet(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(firebaseApp);
        Context applicationContext = firebaseApp.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = new zzaba(new zzafk(firebaseApp, zzafh.a()));
        this.b = new rp3(applicationContext, scheduledExecutorService);
    }

    public final void a(zzahc zzahcVar, zzaer zzaerVar) {
        Preconditions.checkNotNull(zzaerVar);
        Preconditions.checkNotNull(zzahcVar.c);
        EmailAuthCredential emailAuthCredential = zzahcVar.c;
        String str = zzahcVar.e;
        zzaeu zzaeuVar = new zzaeu(zzaerVar, c);
        zzaba zzabaVar = this.a;
        zzabaVar.getClass();
        Preconditions.checkNotNull(emailAuthCredential);
        Preconditions.checkNotNull(zzaeuVar);
        if (emailAuthCredential.e) {
            zzabaVar.e(emailAuthCredential.d, new m62(zzabaVar, emailAuthCredential, str, zzaeuVar));
            return;
        }
        zzahc zzahcVar2 = new zzahc(emailAuthCredential, null, str);
        Preconditions.checkNotNull(zzahcVar2);
        Preconditions.checkNotNull(zzaeuVar);
        zzabaVar.a.c(zzahcVar2, new ol3(zzabaVar, zzaeuVar, 2));
    }

    public final void b(zzaie zzaieVar, zzaer zzaerVar) {
        Preconditions.checkNotNull(zzaerVar);
        Preconditions.checkNotNull(zzaieVar);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(zzaieVar.a);
        zzajp zzajpVar = zzaieVar.b;
        zzaeu zzaeuVar = new zzaeu(zzaerVar, c);
        zzaba zzabaVar = this.a;
        zzabaVar.getClass();
        Preconditions.checkNotEmpty(strCheckNotEmpty);
        Preconditions.checkNotNull(zzajpVar);
        Preconditions.checkNotNull(zzaeuVar);
        zzabaVar.e(strCheckNotEmpty, new wx2(zzabaVar, zzajpVar, zzaeuVar));
    }

    public final void c(zzajg zzajgVar, zzaer zzaerVar) {
        Preconditions.checkNotNull(zzajgVar);
        Preconditions.checkNotNull(zzaerVar);
        zzaeu zzaeuVar = new zzaeu(zzaerVar, c);
        zzaba zzabaVar = this.a;
        zzabaVar.getClass();
        Preconditions.checkNotNull(zzajgVar);
        Preconditions.checkNotNull(zzaeuVar);
        zzajgVar.o = true;
        zzabaVar.a.p(zzajgVar, new ol3(zzabaVar, zzaeuVar, 6));
    }

    public final void d(PhoneAuthCredential phoneAuthCredential, String str, zzaer zzaerVar) {
        Preconditions.checkNotNull(zzaerVar);
        Preconditions.checkNotNull(phoneAuthCredential);
        zzajp zzajpVarA = zzagf.a(phoneAuthCredential);
        zzajpVarA.g = str;
        zzaeu zzaeuVar = new zzaeu(zzaerVar, c);
        zzaba zzabaVar = this.a;
        zzabaVar.getClass();
        Preconditions.checkNotNull(zzajpVarA);
        Preconditions.checkNotNull(zzaeuVar);
        zzabaVar.a.s(zzajpVarA, new ol3(zzabaVar, zzaeuVar, 4));
    }

    public final void f(String str, String str2, String str3, String str4, zzaer zzaerVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaerVar);
        Preconditions.checkNotNull(zzaerVar);
        zzaeu zzaeuVar = new zzaeu(zzaerVar, c);
        zzaba zzabaVar = this.a;
        zzabaVar.getClass();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaeuVar);
        zzabaVar.a.r(new zzajn(str, str2, str3, str4), new ol3(zzabaVar, zzaeuVar, 0));
    }

    public final void g(String str, String str2, zzaer zzaerVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaerVar);
        zzaeu zzaeuVar = new zzaeu(zzaerVar, c);
        zzaba zzabaVar = this.a;
        zzabaVar.getClass();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaeuVar);
        zzabaVar.a.j(new zzail(str, null, str2), new il3(zzabaVar, zzaeuVar, 2));
    }
}
