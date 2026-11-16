package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.d31;
import defpackage.jc1;
import defpackage.p91;
import defpackage.pv1;
import defpackage.q63;
import defpackage.y21;
import defpackage.y32;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzrz {
    public final String a;
    public String b = FileUploadManager.i;
    public String c = "common";
    public final Account d = zzsa.b;
    public String e = "";
    public final y21 f = d31.x();

    public final void a(String str) {
        zzsq.a(zzsa.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        zzsq.a(!zzsa.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public final void b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = zzsa.a;
        this.e = str;
    }

    public final Uri c() {
        String strO;
        String str = this.b;
        String str2 = this.c;
        Account account = zzrv.a;
        Account account2 = this.d;
        zzsq.a(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        zzsq.a(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        zzsq.a(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (zzrv.a.equals(account2)) {
            strO = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strO = jc1.o(str3, ":", new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str4);
        }
        String str5 = this.e;
        StringBuilder sb = new StringBuilder(q63.a(q63.a(str.length() + 2, 1, str2), 1, strO) + String.valueOf(str5).length());
        q63.y(sb, "/", str, "/", str2);
        String strP = pv1.p(sb, "/", strO, "/", str5);
        y32 y32VarG = this.f.g();
        Pattern pattern = zzsp.a;
        return new Uri.Builder().scheme("android").authority(this.a).path(strP).encodedFragment(y32VarG.isEmpty() ? null : "transform=".concat(new p91(UserDetailsUtils.UserDetailsLiterals.PLUS).b(y32VarG))).build();
    }

    public /* synthetic */ zzrz(Context context) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        zzsq.a(z, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }
}
