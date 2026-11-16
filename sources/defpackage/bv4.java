package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bv4 extends i05 {
    public static final Pair z = new Pair("", 0L);
    public SharedPreferences c;
    public SharedPreferences d;
    public zzhf e;
    public final zzhe f;
    public final zzhg g;
    public String h;
    public boolean i;
    public long j;
    public final zzhe k;
    public final zzhc l;
    public final zzhg m;
    public final zzhd n;
    public final zzhc o;
    public final zzhe p;
    public final zzhe q;
    public boolean r;
    public final zzhc s;
    public final zzhc t;
    public final zzhe u;
    public final zzhg v;
    public final zzhg w;
    public final zzhe x;
    public final zzhd y;

    @Override // defpackage.i05
    public final boolean u() {
        return true;
    }

    public final boolean C(long j) {
        return j - this.k.a() > this.p.a();
    }

    public final SparseArray z() {
        Bundle bundleA = this.n.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzgu zzguVar = ((zzic) this.a).f;
            zzic.l(zzguVar);
            zzguVar.f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public bv4(zzic zzicVar) {
        super(zzicVar);
        this.k = new zzhe(this, "session_timeout", 1800000L);
        this.l = new zzhc(this, "start_new_session", true);
        this.p = new zzhe(this, "last_pause_time", 0L);
        this.q = new zzhe(this, "session_id", 0L);
        this.m = new zzhg(this, "non_personalized_ads");
        this.n = new zzhd(this, "last_received_uri_timestamps_by_source");
        this.o = new zzhc(this, "allow_remote_dynamite", false);
        this.f = new zzhe(this, "first_open_time", 0L);
        new zzhe(this, "app_install_time", 0L);
        this.g = new zzhg(this, "app_instance_id");
        this.s = new zzhc(this, "app_backgrounded", false);
        this.t = new zzhc(this, "deep_link_retrieval_complete", false);
        this.u = new zzhe(this, "deep_link_retrieval_attempts", 0L);
        this.v = new zzhg(this, "firebase_feature_rollouts");
        this.w = new zzhg(this, "deferred_attribution_cache");
        this.x = new zzhe(this, "deferred_attribution_cache_timestamp", 0L);
        this.y = new zzhd(this, "default_event_parameters");
    }

    public final zzjl A() {
        t();
        return zzjl.c(x().getInt("consent_source", 100), x().getString("consent_settings", "G1"));
    }

    public final void B(boolean z2) {
        t();
        zzgu zzguVar = ((zzic) this.a).f;
        zzic.l(zzguVar);
        zzguVar.n.b(Boolean.valueOf(z2), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = x().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    public final SharedPreferences x() {
        t();
        v();
        Preconditions.checkNotNull(this.c);
        return this.c;
    }

    public final SharedPreferences y() {
        t();
        v();
        if (this.d == null) {
            zzic zzicVar = (zzic) this.a;
            String strValueOf = String.valueOf(zzicVar.a.getPackageName());
            zzgu zzguVar = zzicVar.f;
            zzic.l(zzguVar);
            zzgs zzgsVar = zzguVar.n;
            String strConcat = strValueOf.concat("_preferences");
            zzgsVar.b(strConcat, "Default prefs file");
            this.d = zzicVar.a.getSharedPreferences(strConcat, 0);
        }
        return this.d;
    }
}
