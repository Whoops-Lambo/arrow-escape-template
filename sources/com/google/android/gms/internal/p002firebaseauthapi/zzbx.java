package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.c14;
import defpackage.dr0;
import defpackage.e32;
import defpackage.h72;
import defpackage.jc1;
import defpackage.lr3;
import defpackage.nj;
import defpackage.o74;
import defpackage.pv1;
import defpackage.ur3;
import defpackage.xl1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbx implements zzch {
    public final List a;
    public final Map b;
    public final zzbx c;

    public static final zzbx c(zzxq zzxqVar) throws GeneralSecurityException {
        zzbt zzonVar;
        boolean z;
        if (zzxqVar == null || zzxqVar.u() <= 0) {
            e.d("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(zzxqVar.u());
        Iterator<E> it = zzxqVar.C().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i = 24;
            o74 o74Var = zzda.a;
            boolean z2 = false;
            if (!zHasNext) {
                List<zzcd> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                if ((zzqp.class.equals(zzcy.class) ? zzqp.class.cast(o74Var) : (!zzqp.class.equals(zzqp.class) || zziz.a.a.get()) ? null : zzqp.class.cast(new xl1(i))) == null) {
                    HashSet hashSet = new HashSet();
                    for (zzcd zzcdVar : listUnmodifiableList) {
                        int i2 = zzcdVar.d;
                        if (hashSet.contains(Integer.valueOf(i2))) {
                            throw new GeneralSecurityException(jc1.k(i2, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                        }
                        hashSet.add(Integer.valueOf(i2));
                        if (zzcdVar.e) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        e.d("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                        return null;
                    }
                }
                return new zzbx(listUnmodifiableList, new HashMap());
            }
            zzxq.zza zzaVar = (zzxq.zza) it.next();
            int iV = zzaVar.v();
            try {
                zzct zzctVarD = d(zzaVar);
                zzcy zzcyVar = (zzcy) (zzcy.class.equals(zzcy.class) ? zzcy.class.cast(o74Var) : (!zzcy.class.equals(zzqp.class) || zziz.a.a.get()) ? null : zzcy.class.cast(new xl1(i)));
                if (zzcyVar == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                zzonVar = zzcyVar.a(zzctVarD, zzdd.a);
                z = false;
            } catch (GeneralSecurityException e) {
                if ((zzqp.class.equals(zzcy.class) ? zzqp.class.cast(o74Var) : (!zzqp.class.equals(zzqp.class) || zziz.a.a.get()) ? null : zzqp.class.cast(new xl1(i))) == null) {
                    throw e;
                }
                zzonVar = new zzon(d(zzaVar), zzdd.a);
                z = true;
            }
            zzbt zzbtVar = zzonVar;
            if ((zzqp.class.equals(zzcy.class) ? zzqp.class.cast(o74Var) : (!zzqp.class.equals(zzqp.class) || zziz.a.a.get()) ? null : zzqp.class.cast(new xl1(i))) == null && !h(zzaVar.B())) {
                e.d("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new zzcd(zzbtVar, zzaVar.B(), iV, iV == zzxqVar.z(), z, zzcd.h));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final zzcd zza(int i) {
        List list = this.a;
        if (i < 0 || i >= list.size()) {
            y.p(nj.i(i, list.size(), "Invalid index ", " for keyset of size "));
            return null;
        }
        zzcd zzcdVar = (zzcd) list.get(i);
        if (!h(zzcdVar.b)) {
            e32.i(jc1.k(i, "Keyset-Entry at position ", " has wrong status"));
            return null;
        }
        if (!zzcdVar.f) {
            return (zzcd) list.get(i);
        }
        e32.i(jc1.k(i, "Keyset-Entry at position ", " didn't parse correctly"));
        return null;
    }

    public static final zzbx a(zzbo zzboVar, zznr zznrVar, byte[] bArr) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = zzboVar.a;
        try {
            zzalf zzalfVar = zzalf.b;
            zzwe zzweVarU = zzwe.u(byteArrayInputStream, zzalfVar);
            byteArrayInputStream.close();
            if (zzweVarU.z().d() == 0) {
                e.d("empty keyset");
                return null;
            }
            try {
                zzxq zzxqVarW = zzxq.w(zznrVar.a(zzweVarU.z().A(), bArr), zzalfVar);
                if (zzxqVarW == null || zzxqVarW.u() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                return c(zzxqVarW);
            } catch (zzamd unused) {
                e.d("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static final zzbx b(zzby zzbyVar) throws GeneralSecurityException {
        int i;
        zzcs zzcsVarA = zzbyVar.a;
        if (zzcsVarA == null) {
            try {
                zzcx zzcxVarB = zzcsVarA instanceof zzor ? ((zzor) zzcsVarA).a : zzpf.b.b(zzcsVarA);
                zzxk.zza zzaVarU = zzxk.u();
                zzaVarU.m(zzcxVarB.b);
                zzaVarU.l(zzcxVarB.a);
                zzaVarU.k(zzqk.e(zzcxVarB.c));
                zzcsVarA = zzdg.a(((zzxk) zzaVarU.f()).f());
            } catch (GeneralSecurityException e) {
                throw new zzqs("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(zzcsVarA)), e);
            }
        }
        zzcc zzccVar = new zzcc();
        zzcb zzcbVar = new zzcb(zzcsVarA);
        h72 h72Var = h72.d;
        zzcbVar.c = h72Var;
        zzcbVar.a = true;
        ArrayList arrayList = zzccVar.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((zzcb) obj).a = false;
        }
        arrayList.add(zzcbVar);
        if (zzccVar.c) {
            e.d("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        zzccVar.c = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
            if (((zzcb) arrayList.get(i3)).c == h72Var && ((zzcb) arrayList.get(i3 + 1)).c != h72Var) {
                e.d("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        Integer numValueOf = null;
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            zzcb zzcbVar2 = (zzcb) obj2;
            zzcbVar2.getClass();
            zzcs zzcsVar = zzcbVar2.b;
            h72 h72Var2 = zzcbVar2.c;
            if (h72Var2 == null) {
                e.d("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            if (h72Var2 == h72Var) {
                int i5 = 0;
                while (true) {
                    if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                        break;
                    }
                    Charset charset = zzqu.a;
                    i5 = 0;
                    while (i5 == 0) {
                        byte[] bArrA = zzqm.a(4);
                        i5 = (bArrA[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrA[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArrA[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrA[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                    }
                }
                i = i5;
            } else {
                i = 0;
            }
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new GeneralSecurityException(jc1.k(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i));
            zzcd zzcdVar = new zzcd(zzoy.b.a(zzcsVar, zzcsVar.a() ? Integer.valueOf(i) : null), zzxh.ENABLED, i, zzcbVar2.a, false, zzcd.h);
            int i6 = i;
            if (zzcbVar2.a) {
                if (numValueOf != null) {
                    e.d("Two primaries were set");
                    return null;
                }
                numValueOf = Integer.valueOf(i6);
            }
            arrayList2.add(zzcdVar);
        }
        if (numValueOf != null) {
            return j(new zzbx(arrayList2, zzccVar.b));
        }
        e.d("No primary was set");
        return null;
    }

    public static boolean h(zzxh zzxhVar) {
        int i = c14.a[zzxhVar.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public final Object e(zzbq zzbqVar, Class cls) throws GeneralSecurityException {
        String str;
        zzbx zzbxVar = this.c;
        zzxq zzxqVarK = (zzbxVar == null ? this : zzbxVar).k();
        int i = j.a;
        int iZ = zzxqVarK.z();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        for (zzxq.zza zzaVar : zzxqVarK.C()) {
            if (zzaVar.B() == zzxh.ENABLED) {
                if (!zzaVar.u()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.v())));
                }
                if (zzaVar.E() == zzyi.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.v())));
                }
                if (zzaVar.B() == zzxh.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.v())));
                }
                if (zzaVar.v() == iZ) {
                    if (z) {
                        e.d("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                i3++;
            }
        }
        if (i3 == 0) {
            e.d("keyset must contain at least one ENABLED key");
            return null;
        }
        while (true) {
            List list = this.a;
            if (i2 >= list.size()) {
                if (zzbxVar != null) {
                    this = zzbxVar;
                }
                return zzbqVar.a(this, cls);
            }
            if (((zzcd) list.get(i2)).f || !h(((zzcd) list.get(i2)).b)) {
                zzbt zzbtVar = ((zzcd) list.get(i2)).a;
                if (zzbtVar instanceof zzon) {
                    zzdd zzddVar = zzdd.a;
                    zzct zzctVar = ((zzon) zzbtVar).a;
                    zzon.c(zzctVar, zzddVar);
                    str = zzctVar.a;
                } else {
                    str = "(unknown)";
                }
                throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + str + " failed, unable to get primitive");
            }
            i2++;
        }
    }

    public final zzbx i() throws GeneralSecurityException {
        zzbt zzonVar;
        List<zzcd> list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzcd zzcdVar : list) {
            if (zzcdVar.zzb() instanceof zzcr) {
                zzonVar = ((zzcr) zzcdVar.zzb()).zzc();
            } else {
                if (!(zzcdVar.zzb() instanceof zzon)) {
                    throw new GeneralSecurityException("Cannot get Public Key for key of type ".concat(String.valueOf(zzcdVar.zzb().getClass())));
                }
                zzct zzctVar = ((zzon) zzcdVar.zzb()).a;
                String str = zzctVar.a;
                zzbw zzbwVarE = zzoe.d.e(str);
                if (!(zzbwVarE instanceof zzcu)) {
                    throw new GeneralSecurityException(pv1.n("manager for key type ", str, " is not a PrivateKeyManager"));
                }
                zzxg zzxgVarA = ((zzcu) zzbwVarE).a(zzctVar.b);
                zzonVar = new zzon(zzct.a(zzxgVarA.C(), zzxgVarA.B(), zzqk.c(zzxgVarA.y()), zzctVar.d, zzctVar.e), null);
            }
            zzcd zzcdVar2 = new zzcd(zzonVar, zzcdVar.b, zzcdVar.d, zzcdVar.e, false, zzcd.h);
            int i = zzcdVar.d;
            Integer numB = zzonVar.b();
            if (numB != null && numB.intValue() != i) {
                e.d("Wrong ID set for key with ID requirement");
                return null;
            }
            arrayList.add(zzcdVar2);
        }
        return j(new zzbx(arrayList, this.b));
    }

    public final zzxq k() {
        try {
            zzxq.zzb zzbVarA = zzxq.A();
            for (zzcd zzcdVar : this.a) {
                zzbt zzbtVarZzb = zzcdVar.zzb();
                int i = zzcdVar.d;
                zzxh zzxhVar = zzcdVar.b;
                zzcy zzcyVar = (zzcy) (zzcy.class.equals(zzcy.class) ? zzcy.class.cast(zzda.a) : (!zzcy.class.equals(zzqp.class) || zziz.a.a.get()) ? null : zzcy.class.cast(new xl1(24)));
                if (zzcyVar == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to parse and serialize proto keysets.");
                }
                zzct zzctVarB = zzcyVar.b(zzbtVarZzb, zzdd.a);
                Integer numB = zzbtVarZzb.b();
                if (numB != null && numB.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzxq.zza.C0299zza c0299zzaC = zzxq.zza.C();
                zzxg.zzb zzbVarU = zzxg.u();
                String str = zzctVarB.a;
                zzbVarU.i();
                zzxg.x((zzxg) zzbVarU.b, str);
                zzakb zzakbVar = zzctVarB.b;
                zzbVarU.i();
                zzxg.v((zzxg) zzbVarU.b, zzakbVar);
                zzxg.zza zzaVarD = zzqk.d(zzctVarB.c);
                zzbVarU.i();
                ((zzxg) zzbVarU.b).zzg = zzaVarD.zza();
                c0299zzaC.i();
                zzxq.zza.x((zzxq.zza) c0299zzaC.b, (zzxg) zzbVarU.f());
                c0299zzaC.i();
                ((zzxq.zza) c0299zzaC.b).zzg = zzxhVar.zza();
                c0299zzaC.i();
                ((zzxq.zza) c0299zzaC.b).zzh = i;
                zzyi zzyiVarE = zzqk.e(zzctVarB.d);
                c0299zzaC.i();
                ((zzxq.zza) c0299zzaC.b).zzi = zzyiVarE.zza();
                zzxq.zza zzaVar = (zzxq.zza) c0299zzaC.f();
                zzbVarA.i();
                zzxq.y((zzxq) zzbVarA.b, zzaVar);
                if (zzcdVar.e) {
                    zzbVarA.i();
                    ((zzxq) zzbVarA.b).zze = i;
                }
            }
            return (zzxq) zzbVarA.f();
        } catch (GeneralSecurityException e) {
            throw new zzqs(e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final zzcd zzc() {
        for (zzcd zzcdVar : this.a) {
            if (zzcdVar != null && zzcdVar.e) {
                if (zzcdVar.c == zzbv.b) {
                    return zzcdVar;
                }
                e32.i("Keyset has primary which isn't enabled");
                return null;
            }
        }
        e32.i("Keyset has no valid primary");
        return null;
    }

    public zzbx(List list, Map map) {
        this.a = list;
        this.b = map;
        this.c = null;
    }

    public static zzct d(zzxq.zza zzaVar) {
        Integer numValueOf;
        int iV = zzaVar.v();
        if (zzaVar.E() == zzyi.RAW) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(iV);
        }
        return zzct.a(zzaVar.A().C(), zzaVar.A().B(), zzqk.c(zzaVar.A().y()), zzqk.b(zzaVar.E()), numValueOf);
    }

    public static zzbx j(zzbx zzbxVar) {
        zzbl zzblVarMo302zza = zzbxVar.mo302zza();
        List<zzcd> list = zzbxVar.a;
        if (((zzoq) zzblVarMo302zza) == null) {
            return zzbxVar;
        }
        zzca zzcaVar = new zzca();
        ArrayList arrayList = new ArrayList(list.size());
        for (zzcd zzcdVar : list) {
            arrayList.add(new zzcd(zzcdVar.a, zzcdVar.b, zzcdVar.d, zzcdVar.e, zzcdVar.f, zzcaVar));
        }
        return new zzbx(arrayList, zzbxVar.b, zzbxVar);
    }

    public final void f(zzbn zzbnVar) throws GeneralSecurityException, IOException {
        zzxq zzxqVarK = k();
        for (zzxq.zza zzaVar : zzxqVarK.C()) {
            if (zzaVar.A().y() == zzxg.zza.UNKNOWN_KEYMATERIAL || zzaVar.A().y() == zzxg.zza.SYMMETRIC || zzaVar.A().y() == zzxg.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(pv1.o("keyset contains key material of type ", zzaVar.A().y().name(), " for type url ", zzaVar.A().C()));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = zzbnVar.a;
        try {
            zzxq zzxqVar = zzxqVarK;
            int iC = zzxqVar.c(null);
            if (iC > 4096) {
                iC = 4096;
            }
            ur3 ur3Var = new ur3(byteArrayOutputStream, iC);
            zzxqVar.b(ur3Var);
            if (ur3Var.d > 0) {
                ur3Var.A();
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public final void g(zzns zznsVar, zznr zznrVar, byte[] bArr) throws IOException {
        zzxq zzxqVarK = k();
        byte[] bArrB = zznrVar.b(zzxqVarK.f(), bArr);
        zzwe.zza zzaVarX = zzwe.x();
        lr3 lr3VarK = zzakb.k(0, bArrB.length, bArrB);
        zzaVarX.i();
        zzwe.w((zzwe) zzaVarX.b, lr3VarK);
        zzxt zzxtVarA = j.a(zzxqVarK);
        zzaVarX.i();
        zzwe.v((zzwe) zzaVarX.b, zzxtVarA);
        if (zznsVar.a.putString(zznsVar.b, zzaaf.a(((zzwe) zzaVarX.f()).f())).commit()) {
            return;
        }
        dr0.h("Failed to write to SharedPreferences");
    }

    public final String toString() {
        return j.a(k()).toString();
    }

    public zzbx(ArrayList arrayList, Map map, zzbx zzbxVar) {
        this.a = arrayList;
        this.b = map;
        this.c = zzbxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final zzbl mo302zza() {
        return (zzbl) this.b.get(zzoq.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final int zza() {
        return this.a.size();
    }
}
