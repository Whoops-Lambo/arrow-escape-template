package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzdkb {
    public final HashSet a = new HashSet();
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final HashSet h = new HashSet();
    public final HashSet i = new HashSet();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public final HashSet l = new HashSet();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public zzfhp o;

    public final void a(zzdef zzdefVar, Executor executor) {
        this.i.add(new zzdmb(zzdefVar, executor));
    }

    public final void b(AppEventListener appEventListener, Executor executor) {
        this.k.add(new zzdmb(appEventListener, executor));
    }

    public final void c(zzdmj zzdmjVar, Executor executor) {
        this.d.add(new zzdmb(zzdmjVar, executor));
    }

    public final void d(zzdhi zzdhiVar, Executor executor) {
        this.b.add(new zzdmb(zzdhiVar, executor));
    }
}
