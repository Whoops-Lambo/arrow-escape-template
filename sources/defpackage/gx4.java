package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzpp;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class gx4 implements v15, zzgm {
    public final /* synthetic */ zzic a;

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // defpackage.v15
    public void a(int i, Throwable th, byte[] bArr) {
        zzgu zzguVar;
        zzgu zzguVar2;
        int i2 = i;
        zzic zzicVar = this.a;
        zzgu zzguVar3 = zzicVar.f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                bv4 bv4Var = zzicVar.e;
                zzic.j(bv4Var);
                bv4Var.t.b(true);
                if (bArr != null || bArr.length == 0) {
                    zzic.l(zzguVar3);
                    zzguVar3.m.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        zzic.l(zzguVar3);
                        zzguVar3.m.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    zzpp zzppVar = zzicVar.i;
                    zzic.j(zzppVar);
                    zzic zzicVar2 = (zzic) zzppVar.a;
                    if (TextUtils.isEmpty(strOptString)) {
                        zzguVar2 = zzguVar3;
                    } else {
                        Context context = zzicVar2.a;
                        zzguVar2 = zzguVar3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                zzicVar.m.A("auto", bundle, "_cmp");
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = zzicVar2.a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    zzgu zzguVar4 = ((zzic) zzppVar.a).f;
                                    zzic.l(zzguVar4);
                                    zzguVar4.f.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            zzguVar = zzguVar2;
                            zzic.l(zzguVar);
                            zzguVar.f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    zzic.l(zzguVar2);
                    zzguVar = zzguVar2;
                    try {
                        zzguVar.i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        zzic.l(zzguVar);
                        zzguVar.f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    zzguVar = zzguVar3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                bv4 bv4Var2 = zzicVar.e;
                zzic.j(bv4Var2);
                bv4Var2.t.b(true);
                if (bArr != null) {
                }
                zzic.l(zzguVar3);
                zzguVar3.m.a("Deferred Deep Link response empty.");
                return;
            }
        }
        zzic.l(zzguVar3);
        zzguVar3.i.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public boolean b() {
        zzgu zzguVar = this.a.f;
        zzic.l(zzguVar);
        return Log.isLoggable(zzguVar.D(), 3);
    }

    public gx4(zzjs zzjsVar, zzic zzicVar) {
        this.a = zzicVar;
    }
}
