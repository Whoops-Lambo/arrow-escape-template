package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dv4;
import defpackage.e32;
import defpackage.ev4;
import defpackage.ga4;
import defpackage.h72;
import defpackage.ia4;
import defpackage.pv1;
import defpackage.rl3;
import defpackage.y84;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhgn implements zzhgo {
    public final List a;
    public final Map b;
    public final zzhgn c;

    public static final zzhgn a(zzhvp zzhvpVar) {
        zzhgc zzhouVar;
        boolean z;
        if (zzhvpVar == null || zzhvpVar.G() <= 0) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(zzhvpVar.G());
        Iterator it = zzhvpVar.F().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i = 11;
            dv4 dv4Var = zzhhf.a;
            boolean z2 = false;
            if (!zHasNext) {
                List<zzhgl> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                if ((zzhqn.class.equals(zzhgy.class) ? zzhqn.class.cast(dv4Var) : (!zzhqn.class.equals(zzhqn.class) || zzhnl.a.a.get()) ? null : zzhqn.class.cast(new y84(i))) == null) {
                    HashSet hashSet = new HashSet();
                    for (zzhgl zzhglVar : listUnmodifiableList) {
                        int i2 = zzhglVar.c;
                        if (hashSet.contains(Integer.valueOf(i2))) {
                            throw new GeneralSecurityException(rl3.k(new StringBuilder(String.valueOf(i2).length() + Sdk.SDKError.Reason.TPAT_ERROR_VALUE), "KeyID ", i2, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                        }
                        hashSet.add(Integer.valueOf(i2));
                        z2 |= zzhglVar.d;
                    }
                    if (!z2) {
                        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                        return null;
                    }
                }
                return new zzhgn(listUnmodifiableList, new HashMap());
            }
            zzhvo zzhvoVar = (zzhvo) it.next();
            int iF = zzhvoVar.F();
            try {
                zzhgx zzhgxVarG = g(zzhvoVar);
                zzhgy zzhgyVar = (zzhgy) (zzhgy.class.equals(zzhgy.class) ? zzhgy.class.cast(dv4Var) : (!zzhgy.class.equals(zzhqn.class) || zzhnl.a.a.get()) ? null : zzhgy.class.cast(new y84(i)));
                if (zzhgyVar == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                zzhouVar = zzhgyVar.c(zzhgxVarG, zzhhg.a);
                z = false;
            } catch (GeneralSecurityException e) {
                if ((zzhqn.class.equals(zzhgy.class) ? zzhqn.class.cast(dv4Var) : (!zzhqn.class.equals(zzhqn.class) || zzhnl.a.a.get()) ? null : zzhqn.class.cast(new y84(i))) == null) {
                    throw e;
                }
                zzhgx zzhgxVarG2 = g(zzhvoVar);
                zzhhg zzhhgVar = zzhhg.a;
                zzhouVar = new zzhou(zzhgxVarG2);
                z = true;
            }
            zzhgc zzhgcVar = zzhouVar;
            if ((zzhqn.class.equals(zzhgy.class) ? zzhqn.class.cast(dv4Var) : (!zzhqn.class.equals(zzhqn.class) || zzhnl.a.a.get()) ? null : zzhqn.class.cast(new y84(i))) == null && !h(zzhvoVar.J())) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new zzhgl(zzhgcVar, zzhvoVar.J(), iF, iF == zzhvpVar.E(), z, ga4.l));
        }
    }

    public final zzhgl d(int i) {
        List list = this.a;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            io.p071bidmachine.media3.extractor.ts.y.p(pv1.j(i, size, "Invalid index ", " for keyset of size ", new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length())));
            return null;
        }
        zzhgl zzhglVar = (zzhgl) list.get(i);
        if (!h(zzhglVar.g)) {
            e32.i(rl3.k(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
            return null;
        }
        if (!zzhglVar.e) {
            return (zzhgl) list.get(i);
        }
        e32.i(rl3.k(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        return null;
    }

    public final Object f(zzhfz zzhfzVar, Class cls) throws GeneralSecurityException {
        String str;
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("keyset must contain at least one ENABLED key");
                return null;
            }
            zzhge zzhgeVar = ((zzhgl) list.get(i)).b;
            zzhge zzhgeVar2 = zzhge.b;
            if (zzhgeVar == zzhgeVar2) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (((zzhgl) list.get(i2)).e || !h(((zzhgl) list.get(i2)).g)) {
                        zzhgc zzhgcVar = ((zzhgl) list.get(i2)).a;
                        if (zzhgcVar instanceof zzhou) {
                            zzhhg zzhhgVar = zzhhg.a;
                            zzhgx zzhgxVar = ((zzhou) zzhgcVar).a;
                            zzhgv zzhgvVar = zzhgxVar.c;
                            str = zzhgxVar.a;
                        } else {
                            str = "(unknown)";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(i2).length() + 44 + 32);
                        rl3.m(i2, "Key parsing of key with index ", " and type_url ", str, sb);
                        sb.append(" failed, unable to get primitive");
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
                zzhgn zzhgnVar = this.c;
                zzhgn zzhgnVar2 = zzhgnVar == null ? this : zzhgnVar;
                int i3 = ev4.a;
                boolean z = false;
                for (int i4 = 0; i4 < zzhgnVar2.a.size(); i4++) {
                    zzhgl zzhglVarD = zzhgnVar2.d(i4);
                    if (zzhglVarD.b == zzhgeVar2 && zzhglVarD.d) {
                        if (z) {
                            io.p071bidmachine.ads.networks.adaptiverendering.e.d("keyset contains multiple primary keys");
                            return null;
                        }
                        z = true;
                    }
                }
                if (zzhgnVar != null) {
                    this = zzhgnVar;
                }
                return zzhfzVar.a(this, cls);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final zzhgn e(zzhgf zzhgfVar) {
        int i;
        zzhgt zzhgtVarB = zzhgfVar.a;
        if (zzhgtVarB == null) {
            try {
                zzhgz zzhgzVarE = zzhgtVarB instanceof zzhov ? ((zzhov) zzhgtVarB).a : ((zzhqm) zzhpn.b.a.get()).e(zzhgtVarB);
                zzhvi zzhviVarH = zzhvj.H();
                String str = zzhgzVarE.b;
                zzhviVarH.l();
                ((zzhvj) zzhviVarH.b).K(str);
                zzifx zzifxVar = zzhgzVarE.a;
                zzhviVarH.l();
                ((zzhvj) zzhviVarH.b).L(zzifxVar);
                int iE = zzhqi.e(zzhgzVarE.c);
                zzhviVarH.l();
                ((zzhvj) zzhviVarH.b).N(iE);
                zzhgtVarB = zzhhj.b(((zzhvj) zzhviVarH.m()).h());
            } catch (GeneralSecurityException e) {
                throw new zzhqp("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(zzhgtVarB)), e);
            }
        }
        zzhgi zzhgiVar = new zzhgi();
        zzhgiVar.b = zzhhf.b;
        zzhgg zzhggVar = new zzhgg(zzhgtVarB);
        h72 h72Var = h72.e;
        zzhggVar.c = h72Var;
        zzhggVar.a = true;
        ArrayList arrayList = zzhgiVar.a;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((zzhgg) obj).a = false;
        }
        arrayList.add(zzhggVar);
        zzhgn zzhgnVar = null;
        if (zzhgiVar.d) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        zzhgiVar.d = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i4 = 0;
        while (i4 < arrayList.size() - 1) {
            int i5 = i4 + 1;
            if (((zzhgg) arrayList.get(i4)).c == h72Var && ((zzhgg) arrayList.get(i5)).c != h72Var) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
            i4 = i5;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        Integer num = null;
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            zzhgg zzhggVar2 = (zzhgg) obj2;
            zzhggVar2.getClass();
            zzhgt zzhgtVar = zzhggVar2.b;
            h72 h72Var2 = zzhggVar2.c;
            if (h72Var2 == null) {
                zzhgn zzhgnVar2 = zzhgnVar;
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("No ID was set (with withFixedId or withRandomId)");
                return zzhgnVar2;
            }
            if (h72Var2 == h72Var) {
                int i7 = 0;
                while (true) {
                    if (i7 != 0 && !hashSet.contains(Integer.valueOf(i7))) {
                        break;
                    }
                    int i8 = zzhqq.a;
                    i7 = 0;
                    while (i7 == 0) {
                        byte[] bArrA = zzhqk.a(4);
                        i7 = (bArrA[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrA[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArrA[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArrA[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                        zzhgnVar = zzhgnVar;
                    }
                }
                i = i7;
            } else {
                i = 0;
            }
            zzhgn zzhgnVar3 = zzhgnVar;
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                int i9 = i;
                throw new GeneralSecurityException(rl3.k(new StringBuilder(String.valueOf(i9).length() + 31), "Id ", i9, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            if (zzhgiVar.b == null) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build keyset: a target Configuration is required to generate a key from Parameters. Use Builder#setConfiguration.");
                return zzhgnVar3;
            }
            zzhgc zzhgcVarB = zzhpd.b.b(zzhgtVar, true != zzhgtVar.a() ? zzhgnVar3 : numValueOf);
            boolean z = zzhggVar2.a;
            zzhgl zzhglVar = new zzhgl(zzhgcVarB, 3, i, z, false, ga4.l);
            if (z) {
                if (num != null) {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.d("Two primaries were set");
                    return zzhgnVar3;
                }
                num = numValueOf;
            }
            arrayList2.add(zzhglVar);
            zzhgnVar = zzhgnVar3;
        }
        zzhgn zzhgnVar4 = zzhgnVar;
        if (num == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("No primary was set");
            return zzhgnVar4;
        }
        zzhgn zzhgnVar5 = new zzhgn(arrayList2, zzhgiVar.c);
        zzhox zzhoxVar = (zzhox) zzhgnVar5.zzf();
        if (zzhoxVar == null) {
            return zzhgnVar5;
        }
        ia4 ia4Var = new ia4(zzhgnVar5, zzhoxVar);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            zzhgl zzhglVar2 = (zzhgl) obj3;
            arrayList3.add(new zzhgl(zzhglVar2.a, zzhglVar2.g, zzhglVar2.c, zzhglVar2.d, zzhglVar2.e, ia4Var));
        }
        return new zzhgn(arrayList3, zzhgnVar5.b, zzhgnVar5);
    }

    public static boolean h(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final zzhgl c() {
        for (zzhgl zzhglVar : this.a) {
            if (zzhglVar != null && zzhglVar.d) {
                if (zzhglVar.b == zzhge.b) {
                    return zzhglVar;
                }
                e32.i("Keyset has primary which isn't enabled");
                return null;
            }
        }
        e32.i("Keyset has no valid primary");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhgo
    public final int zzd() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhgo
    public final zzhfx zzf() {
        return (zzhfx) this.b.get(zzhox.class);
    }

    public zzhgn(List list, Map map) {
        this.a = list;
        this.b = map;
        this.c = null;
    }

    public static zzhgx g(zzhvo zzhvoVar) {
        Integer numValueOf;
        int iF = zzhvoVar.F();
        if (zzhvoVar.K() == 5) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(iF);
        }
        return zzhgx.a(zzhvoVar.E().E(), zzhvoVar.E().F(), zzhqi.c(zzhvoVar.E().K()), zzhqi.d(zzhvoVar.K()), numValueOf);
    }

    public final zzhvp b() throws GeneralSecurityException {
        Object objCast;
        zzhvm zzhvmVarJ = zzhvp.J();
        for (zzhgl zzhglVar : this.a) {
            zzhgc zzhgcVarA = zzhglVar.a();
            int i = zzhglVar.c;
            int i2 = zzhglVar.g;
            if (zzhgy.class.equals(zzhgy.class)) {
                objCast = zzhgy.class.cast(zzhhf.a);
            } else if (zzhgy.class.equals(zzhqn.class) && !zzhnl.a.a.get()) {
                objCast = zzhgy.class.cast(new y84(11));
            } else {
                objCast = null;
            }
            zzhgy zzhgyVar = (zzhgy) objCast;
            if (zzhgyVar != null) {
                zzhgx zzhgxVarD = zzhgyVar.d(zzhgcVarA, zzhhg.a);
                Integer numB = zzhgcVarA.b();
                if (numB != null && numB.intValue() != i) {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.d("Wrong ID set for key with ID requirement");
                    return null;
                }
                zzhvn zzhvnVarG = zzhvo.G();
                zzhvf zzhvfVarG = zzhvg.G();
                String str = zzhgxVarD.a;
                zzhvfVarG.l();
                ((zzhvg) zzhvfVarG.b).I(str);
                zzifx zzifxVar = zzhgxVarD.b;
                zzhvfVarG.l();
                ((zzhvg) zzhvfVarG.b).J(zzifxVar);
                int iB = zzhqi.b(zzhgxVarD.c);
                zzhvfVarG.l();
                ((zzhvg) zzhvfVarG.b).L(iB);
                zzhvnVarG.l();
                ((zzhvo) zzhvnVarG.b).H((zzhvg) zzhvfVarG.m());
                zzhvnVarG.l();
                ((zzhvo) zzhvnVarG.b).L(i2);
                zzhvnVarG.l();
                ((zzhvo) zzhvnVarG.b).I(i);
                int iE = zzhqi.e(zzhgxVarD.d);
                zzhvnVarG.l();
                ((zzhvo) zzhvnVarG.b).M(iE);
                zzhvo zzhvoVar = (zzhvo) zzhvnVarG.m();
                zzhvmVarJ.l();
                ((zzhvp) zzhvmVarJ.b).L(zzhvoVar);
                if (zzhglVar.d) {
                    zzhvmVarJ.l();
                    ((zzhvp) zzhvmVarJ.b).K(i);
                }
            } else {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("Passed in configuration cannot be used to parse and serialize proto keysets.");
                return null;
            }
        }
        return (zzhvp) zzhvmVarJ.m();
    }

    public final String toString() {
        try {
            zzhvp zzhvpVarB = b();
            int i = ev4.a;
            zzhvq zzhvqVarE = zzhvt.E();
            int iE = zzhvpVarB.E();
            zzhvqVarE.l();
            ((zzhvt) zzhvqVarE.b).F(iE);
            for (zzhvo zzhvoVar : zzhvpVarB.F()) {
                zzhvr zzhvrVarE = zzhvs.E();
                String strE = zzhvoVar.E().E();
                zzhvrVarE.l();
                ((zzhvs) zzhvrVarE.b).F(strE);
                int iJ = zzhvoVar.J();
                zzhvrVarE.l();
                ((zzhvs) zzhvrVarE.b).H(iJ);
                int iK = zzhvoVar.K();
                zzhvrVarE.l();
                ((zzhvs) zzhvrVarE.b).I(iK);
                int iF = zzhvoVar.F();
                zzhvrVarE.l();
                ((zzhvs) zzhvrVarE.b).G(iF);
                zzhvs zzhvsVar = (zzhvs) zzhvrVarE.m();
                zzhvqVarE.l();
                ((zzhvt) zzhvqVarE.b).G(zzhvsVar);
            }
            return ((zzhvt) zzhvqVarE.m()).toString();
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("Cannot get keyset info: key cannot be serialized", e);
        }
    }

    public zzhgn(ArrayList arrayList, Map map, zzhgn zzhgnVar) {
        this.a = arrayList;
        this.b = map;
        this.c = zzhgnVar;
    }
}
