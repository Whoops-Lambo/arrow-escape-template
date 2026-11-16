package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzanz;
import com.google.android.gms.internal.ads.zzcy;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzdf;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzv;
import com.google.firebase.installations.Utils;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ip implements zzdu, zzeb {
    public final /* synthetic */ int a;
    public long b;
    public int c;
    public Object d;

    public ip() {
        this.a = 1;
        if (t40.m == null) {
            Pattern pattern = Utils.b;
            t40.m = new t40(15);
        }
        t40 t40Var = t40.m;
        if (Utils.c == null) {
            Utils.c = new Utils(t40Var);
        }
        this.d = Utils.c;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public synchronized boolean a() {
        boolean z;
        if (this.c != 0) {
            ((Utils) this.d).a.getClass();
            if (System.currentTimeMillis() > this.b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.c);
                ((Utils) this.d).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            } else {
                jMin = 86400000;
            }
            ((Utils) this.d).a.getClass();
            this.b = System.currentTimeMillis() + jMin;
        }
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x013b  */
    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public void mo82zza(Object obj) {
        long j;
        int i;
        long j2;
        Iterator it;
        switch (this.a) {
            case 5:
                vt3 vt3Var = (vt3) this.d;
                long j3 = this.b;
                int i2 = this.c;
                zzanz zzanzVar = (zzanz) obj;
                vt3Var.h.getClass();
                zzgzb zzgzbVar = zzanzVar.a;
                long j4 = zzanzVar.c;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgzbVar.size());
                Iterator it2 = zzgzbVar.iterator();
                while (true) {
                    int i3 = 0;
                    if (!it2.hasNext()) {
                        int i4 = i2;
                        long j5 = j3;
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("c", arrayList);
                        bundle.putLong("d", j4);
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeBundle(bundle);
                        byte[] bArrMarshall = parcelObtain.marshall();
                        parcelObtain.recycle();
                        zzey zzeyVar = vt3Var.c;
                        int length = bArrMarshall.length;
                        zzeyVar.z(length, bArrMarshall);
                        zzaia zzaiaVar = vt3Var.a;
                        zzaiaVar.b(length, zzeyVar);
                        long j6 = zzanzVar.b;
                        zzv zzvVar = vt3Var.h;
                        if (j6 == -9223372036854775807L) {
                            zzgvz.f(zzvVar.t == Long.MAX_VALUE);
                            j = j5;
                        } else {
                            long j7 = zzvVar.t;
                            j = j7 == Long.MAX_VALUE ? j5 + j6 : j6 + j7;
                        }
                        zzaiaVar.e(j, i4 | 1, length, 0, null);
                    } else {
                        zzcy zzcyVar = (zzcy) it2.next();
                        zzcyVar.getClass();
                        Bundle bundle2 = new Bundle();
                        CharSequence charSequence = zzcyVar.a;
                        if (charSequence != null) {
                            bundle2.putCharSequence(zzcy.q, charSequence);
                            if (charSequence instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence;
                                String str = p74.a;
                                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                zzdd[] zzddVarArr = (zzdd[]) spanned.getSpans(0, spanned.length(), zzdd.class);
                                int length2 = zzddVarArr.length;
                                while (i3 < length2) {
                                    int i5 = i2;
                                    zzdd zzddVar = zzddVarArr[i3];
                                    zzddVar.getClass();
                                    long j8 = j3;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString(zzdd.c, zzddVar.a);
                                    bundle3.putInt(zzdd.d, zzddVar.b);
                                    arrayList2.add(p74.a(spanned, zzddVar, 1, bundle3));
                                    i3++;
                                    i2 = i5;
                                    j3 = j8;
                                    it2 = it2;
                                }
                                i = i2;
                                j2 = j3;
                                it = it2;
                                for (zzdf zzdfVar : (zzdf[]) spanned.getSpans(0, spanned.length(), zzdf.class)) {
                                    zzdfVar.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putInt(zzdf.d, zzdfVar.a);
                                    bundle4.putInt(zzdf.e, zzdfVar.b);
                                    bundle4.putInt(zzdf.f, zzdfVar.c);
                                    arrayList2.add(p74.a(spanned, zzdfVar, 2, bundle4));
                                }
                                for (zzdc zzdcVar : (zzdc[]) spanned.getSpans(0, spanned.length(), zzdc.class)) {
                                    arrayList2.add(p74.a(spanned, zzdcVar, 3, null));
                                }
                                for (zzdg zzdgVar : (zzdg[]) spanned.getSpans(0, spanned.length(), zzdg.class)) {
                                    zzdgVar.getClass();
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString(zzdg.b, zzdgVar.a);
                                    arrayList2.add(p74.a(spanned, zzdgVar, 4, bundle5));
                                }
                                if (!arrayList2.isEmpty()) {
                                    bundle2.putParcelableArrayList(zzcy.r, arrayList2);
                                }
                            } else {
                                i = i2;
                                j2 = j3;
                                it = it2;
                            }
                        } else {
                            i = i2;
                            j2 = j3;
                            it = it2;
                        }
                        bundle2.putSerializable(zzcy.s, zzcyVar.b);
                        bundle2.putSerializable(zzcy.t, zzcyVar.c);
                        bundle2.putFloat(zzcy.v, zzcyVar.e);
                        bundle2.putInt(zzcy.w, zzcyVar.f);
                        bundle2.putInt(zzcy.x, zzcyVar.g);
                        bundle2.putFloat(zzcy.y, zzcyVar.h);
                        bundle2.putInt(zzcy.z, zzcyVar.i);
                        bundle2.putInt(zzcy.A, zzcyVar.l);
                        bundle2.putFloat(zzcy.B, zzcyVar.m);
                        bundle2.putFloat(zzcy.C, zzcyVar.j);
                        bundle2.putFloat(zzcy.D, zzcyVar.k);
                        bundle2.putBoolean(zzcy.F, false);
                        bundle2.putInt(zzcy.E, -16777216);
                        bundle2.putInt(zzcy.G, zzcyVar.n);
                        bundle2.putFloat(zzcy.H, zzcyVar.o);
                        bundle2.putInt(zzcy.I, zzcyVar.p);
                        Bitmap bitmap = zzcyVar.d;
                        if (bitmap != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            zzgvz.f(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                            bundle2.putByteArray(zzcy.u, byteArrayOutputStream.toByteArray());
                        }
                        arrayList.add(bundle2);
                        i2 = i;
                        j3 = j2;
                        it2 = it;
                    }
                    break;
                }
                break;
            default:
                ((zznx) obj).h((zznv) this.d, this.c, this.b);
                break;
        }
    }

    public /* synthetic */ ip(zznv zznvVar, int i, long j, long j2) {
        this.a = 7;
        this.d = zznvVar;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ ip(vt3 vt3Var, long j, int i) {
        this.a = 5;
        this.d = vt3Var;
        this.b = j;
        this.c = i;
    }

    public ip(int i, long j, Long l) {
        this.a = 4;
        this.c = i;
        this.b = j;
        this.d = l;
    }

    public /* synthetic */ ip(int i) {
        this.a = i;
    }

    public ip(int i, URL url, long j) {
        this.a = 0;
        this.c = i;
        this.d = url;
        this.b = j;
    }

    public ip(int i, long j) {
        this.a = 2;
        this.c = i;
        this.b = j;
    }
}
