package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.gd5;
import defpackage.md5;
import defpackage.nd5;
import defpackage.sk3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaas extends zzaag {
    public static final Set f;
    public static final gd5 g;
    public static final zzaaq h;
    public final String b;
    public final Level c;
    public final Set d;
    public final zzzq e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzxx.a, zzyw.c, zzyx.a)));
        f = setUnmodifiableSet;
        gd5 gd5Var = new gd5(zzzt.a(setUnmodifiableSet));
        g = gd5Var;
        h = new zzaaq(Level.ALL, setUnmodifiableSet, gd5Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    public static void e(zzxz zzxzVar, String str, Level level, Set set, zzzq zzzqVar) {
        zzaaa md5Var;
        StringBuilder sb;
        zzaaf zzaafVar;
        zzzc zzzcVar;
        zzaaf zzaafVar2;
        int i;
        String string;
        Level level2 = zzxzVar.a;
        Boolean bool = (Boolean) zzxzVar.j().d(zzyx.a);
        if (bool == null || !bool.booleanValue()) {
            zzzj zzzjVarC = sk3.a.c().c();
            zzzj zzzjVarJ = zzxzVar.j();
            int iA = zzzjVarJ.a();
            if (iA == 0) {
                md5Var = zzaaa.a;
            } else {
                md5Var = iA <= 28 ? new md5(zzzjVarC, zzzjVarJ) : new nd5(zzzjVarC, zzzjVarJ);
            }
            boolean z = level2.intValue() < level.intValue();
            if (z) {
                sb = new StringBuilder();
                if (zzze.a(2, zzxzVar.g(), sb)) {
                    sb.append(" ");
                }
                if (z) {
                    zzaafVar = zzxzVar.f;
                    if (zzaafVar != null) {
                        zzyy zzyyVar = new zzyy(zzaafVar, zzxzVar.h(), sb);
                        zzaafVar2 = zzyyVar.a;
                        zzaafVar2.a.a(zzyyVar);
                        i = zzyyVar.b;
                        if (((i + 1) & i) == 0) {
                        }
                        throw zzabo.d(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i))), zzaafVar2.b);
                    }
                    sb.append(zzzh.a(zzxzVar.i()));
                    Set set2 = zzaae.a;
                    zzzcVar = new zzzc(sb);
                    md5Var.a(zzzqVar, zzzcVar);
                    if (zzzcVar.b) {
                        sb.append(" ]");
                    }
                } else {
                    zzaafVar = zzxzVar.f;
                    if (zzaafVar != null) {
                        zzyy zzyyVar2 = new zzyy(zzaafVar, zzxzVar.h(), sb);
                        zzaafVar2 = zzyyVar2.a;
                        zzaafVar2.a.a(zzyyVar2);
                        i = zzyyVar2.b;
                        if (((i + 1) & i) == 0) {
                        }
                        throw zzabo.d(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i))), zzaafVar2.b);
                    }
                    sb.append(zzzh.a(zzxzVar.i()));
                    Set set3 = zzaae.a;
                    zzzcVar = new zzzc(sb);
                    md5Var.a(zzzqVar, zzzcVar);
                    if (zzzcVar.b) {
                        sb.append(" ]");
                    }
                }
                string = sb.toString();
            } else {
                Set set4 = zzaae.a;
                if (zzxzVar.f == null && md5Var.b() <= set.size() && set.containsAll(md5Var.c())) {
                    string = zzzh.a(zzxzVar.i());
                } else {
                    sb = new StringBuilder();
                    if (zzze.a(2, zzxzVar.g(), sb)) {
                        sb.append(" ");
                    }
                    if (z || zzxzVar.f == null) {
                        zzaafVar = zzxzVar.f;
                        if (zzaafVar != null) {
                            zzyy zzyyVar3 = new zzyy(zzaafVar, zzxzVar.h(), sb);
                            zzaafVar2 = zzyyVar3.a;
                            zzaafVar2.a.a(zzyyVar3);
                            i = zzyyVar3.b;
                            if (((i + 1) & i) == 0 || (zzyyVar3.c > 31 && i != -1)) {
                                throw zzabo.d(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i))), zzaafVar2.b);
                            }
                            zzabn zzabnVar = zzaafVar2.a;
                            String str2 = zzaafVar2.b;
                            int i2 = zzyyVar3.f;
                            int length = str2.length();
                            StringBuilder sb2 = zzyyVar3.e;
                            zzabnVar.b(i2, length, str2, sb2);
                            if (zzxzVar.h().length > zzyyVar3.c + 1) {
                                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                            }
                        } else {
                            sb.append(zzzh.a(zzxzVar.i()));
                        }
                        Set set5 = zzaae.a;
                        zzzcVar = new zzzc(sb);
                        md5Var.a(zzzqVar, zzzcVar);
                        if (zzzcVar.b) {
                            sb.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(zzxzVar.f.b);
                    }
                    string = sb.toString();
                }
            }
            Throwable th = (Throwable) zzxzVar.j().d(zzxx.a);
            int iB = zzaal.b(level2);
            if (iB == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iB == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iB == 4) {
                Log.i(str, string, th);
            } else if (iB != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        e(zzxzVar, this.b, this.c, this.d, this.e);
    }

    public /* synthetic */ zzaas(String str, Level level, Set set, zzzq zzzqVar) {
        super(str);
        this.b = zzaal.a(str);
        this.c = level;
        this.d = set;
        this.e = zzzqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        int iB = zzaal.b(level);
        if (!Log.isLoggable(this.b, iB) && !Log.isLoggable(TtmlNode.COMBINE_ALL, iB)) {
            return false;
        }
        return true;
    }
}
