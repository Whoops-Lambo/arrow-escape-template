package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import defpackage.ew3;
import defpackage.jc1;
import defpackage.m62;
import defpackage.mo3;
import defpackage.q63;
import defpackage.yv3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzaua implements Comparable {
    private final ew3 zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @GuardedBy
    private final zzaue zzf;
    private Integer zzg;
    private zzaud zzh;

    @GuardedBy
    private boolean zzi;

    @Nullable
    private zzatj zzj;

    @GuardedBy
    private yv3 zzk;
    private final zzato zzl;

    public byte[] zzn() throws zzati {
        return null;
    }

    public abstract zzaug zzr(zzatw zzatwVar);

    public abstract void zzs(Object obj);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaua) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        q63.y(sb, "[ ] ", str, " ", strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (ew3.c) {
            this.zza.a(Thread.currentThread().getId(), str);
        }
    }

    public final void zzd(String str) {
        zzaud zzaudVar = this.zzh;
        if (zzaudVar != null) {
            HashSet hashSet = zzaudVar.b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = zzaudVar.i;
            synchronized (arrayList) {
                try {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((zzauc) obj).zza();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzaudVar.c();
        }
        if (ew3.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new mo3(this, str, id));
                return;
            }
            ew3 ew3Var = this.zza;
            ew3Var.a(id, str);
            ew3Var.b(toString());
        }
    }

    public final void zze(int i) {
        zzaud zzaudVar = this.zzh;
        if (zzaudVar != null) {
            zzaudVar.c();
        }
    }

    public final zzaua zzf(zzaud zzaudVar) {
        this.zzh = zzaudVar;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return jc1.o(string, "-", new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), str);
    }

    public final zzaua zzj(zzatj zzatjVar) {
        this.zzj = zzatjVar;
        return this;
    }

    @Nullable
    public final zzatj zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzati {
        return Collections.EMPTY_MAP;
    }

    public final int zzo() {
        return this.zzl.a;
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final void zzt(zzauj zzaujVar) {
        zzaue zzaueVar;
        synchronized (this.zze) {
            zzaueVar = this.zzf;
        }
        zzaueVar.zza(zzaujVar);
    }

    public final void zzu(yv3 yv3Var) {
        synchronized (this.zze) {
            this.zzk = yv3Var;
        }
    }

    public final void zzv(zzaug zzaugVar) {
        yv3 yv3Var;
        List list;
        synchronized (this.zze) {
            yv3Var = this.zzk;
        }
        if (yv3Var != null) {
            m62 m62Var = (m62) yv3Var;
            zzatj zzatjVar = zzaugVar.b;
            if (zzatjVar != null) {
                if (zzatjVar.e >= System.currentTimeMillis()) {
                    String strZzi = zzi();
                    synchronized (m62Var) {
                        list = (List) ((HashMap) m62Var.c).remove(strZzi);
                    }
                    if (list != null) {
                        if (zzaum.a) {
                            zzaum.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((zzatr) m62Var.e).a((zzaua) it.next(), zzaugVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            m62Var.v(this);
        }
    }

    public final void zzw() {
        yv3 yv3Var;
        synchronized (this.zze) {
            yv3Var = this.zzk;
        }
        if (yv3Var != null) {
            ((m62) yv3Var).v(this);
        }
    }

    public final /* synthetic */ ew3 zzx() {
        return this.zza;
    }

    public final zzato zzy() {
        return this.zzl;
    }

    public zzaua(int i, String str, zzaue zzaueVar) {
        ew3 ew3Var;
        Uri uri;
        String host;
        if (ew3.c) {
            ew3Var = new ew3();
        } else {
            ew3Var = null;
        }
        this.zza = ew3Var;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaueVar;
        zzato zzatoVar = new zzato();
        zzatoVar.a = 2500;
        this.zzl = zzatoVar;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    public final zzaua zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }
}
