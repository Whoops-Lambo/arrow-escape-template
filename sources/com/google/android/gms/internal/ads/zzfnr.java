package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.singular.sdk.internal.Constants;
import defpackage.i24;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfnr implements zzdef {
    public final HashSet a = new HashSet();
    public final Context b;
    public final zzcgm c;

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void m(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            zzcgm zzcgmVar = this.c;
            HashSet hashSet = this.a;
            synchronized (zzcgmVar.a) {
                zzcgmVar.e.addAll(hashSet);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Bundle b() {
        String str;
        Bundle bundle;
        boolean z;
        Bundle bundle2;
        zzcgm zzcgmVar = this.c;
        Context context = this.b;
        zzcgmVar.getClass();
        HashSet<zzcgb> hashSet = new HashSet();
        synchronized (zzcgmVar.a) {
            HashSet hashSet2 = zzcgmVar.e;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        zzcgj zzcgjVar = zzcgmVar.d;
        zzcgk zzcgkVar = zzcgmVar.c;
        synchronized (zzcgkVar) {
            str = zzcgkVar.b;
        }
        synchronized (zzcgjVar.f) {
            try {
                bundle = new Bundle();
                if (!zzcgjVar.i.zzx()) {
                    bundle.putString("session_id", zzcgjVar.h);
                }
                bundle.putLong("basets", zzcgjVar.b);
                bundle.putLong("currts", zzcgjVar.a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", zzcgjVar.c);
                bundle.putInt("preqs_in_session", zzcgjVar.d);
                bundle.putLong("time_in_session", zzcgjVar.e);
                bundle.putInt("pclick", zzcgjVar.j);
                bundle.putInt("pimp", zzcgjVar.k);
                Context contextA = zzccr.a(context);
                int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
                if (identifier == 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z = true;
                            bundle.putBoolean("support_transparent_background", z);
                            synchronized (zzcgjVar.f) {
                                int i2 = zzcgjVar.l;
                            }
                            bundle.putInt("consent_form_action_identifier", i2);
                        } else {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Fail to fetch AdActivity theme");
                        zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                z = false;
                bundle.putBoolean("support_transparent_background", z);
                synchronized (zzcgjVar.f) {
                    int i5 = zzcgjVar.l;
                    bundle.putInt("consent_form_action_identifier", i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = zzcgmVar.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (zzcgb zzcgbVar : hashSet) {
            synchronized (zzcgbVar.d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", zzcgbVar.e);
                    bundle2.putString("slotid", zzcgbVar.f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", zzcgbVar.j);
                    bundle2.putLong("tresponse", zzcgbVar.k);
                    bundle2.putLong("timp", zzcgbVar.g);
                    bundle2.putLong("tload", zzcgbVar.h);
                    bundle2.putLong(Constants.REVENUE_CURRENCY_KEY, zzcgbVar.i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (i24 i24Var : zzcgbVar.c) {
                        i24Var.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", i24Var.a);
                        bundle5.putLong("tclose", i24Var.b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList("ads", arrayList);
        a(hashSet);
        return bundle3;
    }

    public zzfnr(Context context, zzcgm zzcgmVar) {
        this.b = context;
        this.c = zzcgmVar;
    }
}
