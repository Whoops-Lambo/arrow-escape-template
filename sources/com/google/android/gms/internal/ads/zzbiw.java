package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.cz4;
import defpackage.dy4;
import defpackage.gz4;
import defpackage.hz4;
import defpackage.wy4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbiw {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zza extends zzihc<zza, zzb> implements zzf {
        private static final zza zzB;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private zziho<zzat> zzA;
        private int zzl;
        private int zzm;
        private int zzn = 1000;
        private zzg zzo;
        private zzi zzp;
        private zziho<zzd> zzu;
        private zzk zzv;
        private zzah zzw;
        private zzac zzx;
        private zzx zzy;
        private zzz zzz;

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbiw$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public enum EnumC0295zza implements zzihg {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            EnumC0295zza(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zzb extends zzigw<zza, zzb> implements zzf {
            private zzb() {
                super(zza.zzB);
            }

            public /* synthetic */ zzb(int i) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzB = zzaVar;
            zzihc.z(zza.class, zzaVar);
        }

        public static zza E() {
            return zzB;
        }

        public final void F(EnumC0295zza enumC0295zza) {
            this.zzm = enumC0295zza.a;
            this.zzl |= 1;
        }

        public final void G(zzi zziVar) {
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        public final zzi I() {
            zzi zziVar = this.zzp;
            return zziVar == null ? zzi.E() : zziVar;
        }

        private zza() {
            gz4 gz4Var = gz4.e;
            this.zzu = gz4Var;
            this.zzA = gz4Var;
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zzb(0);
                }
                return new zza();
            }
            return new hz4(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", a.a, "zzn", j.a, "zzo", "zzp", "zzu", zzd.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzat.class});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzaa extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzab extends zzihc<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzf;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public enum zzb implements zzihg {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            zzb(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public enum zzc implements zzihg {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            zzc(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzab, zza> implements zzae {
            private zza() {
                super(zzab.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzf = zzabVar;
            zzihc.z(zzab.class, zzabVar);
        }

        public static zza E() {
            return (zza) zzf.v();
        }

        public final void F(zzc zzcVar) {
            this.zzd = zzcVar.a;
            this.zzc |= 1;
        }

        public final void G(zzb zzbVar) {
            this.zze = zzbVar.a;
            this.zzc |= 2;
        }

        private zzab() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzab();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", c.a, "zze", b.a});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzac extends zzihc<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzf;
        private int zzc;
        private int zzd;
        private zzap zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public final class zza extends zzigw<zzac, zza> implements zzad {
            private zza() {
                super(zzac.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzf = zzacVar;
            zzihc.z(zzac.class, zzacVar);
        }

        private zzac() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzac();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", j.a, "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzad extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzae extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzaf extends zzihc<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzv;
        private int zzi;
        private int zzk;
        private int zzl;
        private long zzm;
        private long zzp;
        private int zzu;
        private zziho<zza> zzj = gz4.e;
        private String zzn = "";
        private String zzo = "";

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes3.dex */
        public final class zza extends zzihc<zza, C0296zza> implements zzb {
            private static final zza zzG;
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzihl<zzd.zza> zzx = new d();
            private int zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private long zzF;
            private int zzn;
            private long zzo;
            private int zzp;
            private long zzu;
            private long zzv;
            private zzihk zzw = wy4.e;
            private zzab zzy;
            private int zzz;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbiw$zzaf$zza$zza, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            /* JADX INFO: loaded from: classes8.dex */
            public final class C0296zza extends zzigw<zza, C0296zza> implements zzb {
                private C0296zza() {
                    super(zza.zzG);
                }

                public /* synthetic */ C0296zza(int i) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzG = zzaVar;
                zzihc.z(zza.class, zzaVar);
            }

            public static zza U(byte[] bArr) {
                zza zzaVar = zzG;
                int length = bArr.length;
                zzigm zzigmVar = zzigm.b;
                int i = dy4.a;
                zzihc zzihcVarC = zzihc.C(zzaVar, bArr, length, zzigm.c);
                zzihc.D(zzihcVarC);
                return (zza) zzihcVarC;
            }

            public static C0296zza V() {
                return (C0296zza) zzG.v();
            }

            public final void E(long j) {
                this.zzn |= 1;
                this.zzo = j;
            }

            public final void F(zzq zzqVar) {
                this.zzp = zzqVar.a;
                this.zzn |= 2;
            }

            public final void G(long j) {
                this.zzn |= 4;
                this.zzu = j;
            }

            public final void H(long j) {
                this.zzn |= 8;
                this.zzv = j;
            }

            public final void I(ArrayList arrayList) {
                zzihk zzihkVar = this.zzw;
                if (!zzihkVar.zza()) {
                    int size = zzihkVar.size();
                    this.zzw = zzihkVar.zzh(size + size);
                }
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.zzw.zzi(((zzd.zza) obj).a);
                }
            }

            public final void J(zzab zzabVar) {
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            public final void K(zzq zzqVar) {
                this.zzz = zzqVar.a;
                this.zzn |= 32;
            }

            public final void L(zzq zzqVar) {
                this.zzA = zzqVar.a;
                this.zzn |= 64;
            }

            public final void M(zzq zzqVar) {
                this.zzB = zzqVar.a;
                this.zzn |= 128;
            }

            public final void N(int i) {
                this.zzn |= 256;
                this.zzC = i;
            }

            public final void O(zzq zzqVar) {
                this.zzD = zzqVar.a;
                this.zzn |= 512;
            }

            public final void P(zzd zzdVar) {
                this.zzE = zzdVar.a;
                this.zzn |= 1024;
            }

            public final void Q(long j) {
                this.zzn |= 2048;
                this.zzF = j;
            }

            public final long S() {
                return this.zzo;
            }

            public final zzq T() {
                zzq zzqVar;
                int i = this.zzp;
                zzq zzqVar2 = zzq.ENUM_FALSE;
                if (i == 0) {
                    zzqVar = zzqVar2;
                } else if (i != 1) {
                    zzqVar = i != 1000 ? null : zzq.ENUM_UNKNOWN;
                } else {
                    zzqVar = zzq.ENUM_TRUE;
                }
                return zzqVar == null ? zzqVar2 : zzqVar;
            }

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzihc
            public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
                int iOrdinal = zzihbVar.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            return null;
                        }
                        return new C0296zza(0);
                    }
                    return new zza();
                }
                e eVar = e.a;
                j jVar = j.a;
                return new hz4(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", jVar, "zzu", "zzv", "zzw", h.a, "zzy", "zzz", jVar, "zzA", jVar, "zzB", jVar, "zzC", "zzD", jVar, "zzE", eVar, "zzF"});
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes3.dex */
        public interface zzb extends zziij {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes3.dex */
        public enum zzd implements zzihg {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            zzd(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes3.dex */
        public final class zzc extends zzigw<zzaf, zzc> implements zzag {
            private zzc() {
                super(zzaf.zzv);
            }

            public /* synthetic */ zzc(int i) {
                this();
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzv = zzafVar;
            zzihc.z(zzaf.class, zzafVar);
        }

        public static zzc E() {
            return (zzc) zzv.v();
        }

        public final void F(ArrayList arrayList) {
            zziho<zza> zzihoVar = this.zzj;
            if (!zzihoVar.zza()) {
                int size = zzihoVar.size();
                this.zzj = zzihoVar.zzh(size + size);
            }
            zzifg.l(arrayList, this.zzj);
        }

        public final void G(int i) {
            this.zzi |= 1;
            this.zzk = i;
        }

        public final void H(int i) {
            this.zzi |= 2;
            this.zzl = i;
        }

        public final void I(long j) {
            this.zzi |= 4;
            this.zzm = j;
        }

        public final void K() {
            String str = Build.MODEL;
            Objects.requireNonNull(str);
            this.zzi |= 16;
            this.zzo = str;
        }

        public final void L(long j) {
            this.zzi |= 32;
            this.zzp = j;
        }

        public final void M(int i) {
            this.zzi |= 64;
            this.zzu = i;
        }

        private zzaf() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zzc(0);
                }
                return new zzaf();
            }
            return new hz4(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", zza.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }

        public final void J(String str) {
            Objects.requireNonNull(str);
            this.zzi |= 8;
            this.zzn = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzag extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzah extends zzihc<zzah, zza> implements zzak {
        private static final zzah zzB;
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private zzai zzA;
        private int zzl;
        private int zzm = 1000;
        private int zzn = 1000;
        private int zzo;
        private int zzp;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public final class zza extends zzigw<zzah, zza> implements zzak {
            private zza() {
                super(zzah.zzB);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzB = zzahVar;
            zzihc.z(zzah.class, zzahVar);
        }

        private zzah() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzah();
            }
            j jVar = j.a;
            return new hz4(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", jVar, "zzn", jVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzai extends zzihc<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzf;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzai, zza> implements zzaj {
            private zza() {
                super(zzai.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzf = zzaiVar;
            zzihc.z(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzai();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzaj extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzak extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzal extends zzihc<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzf;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final class zza extends zzigw<zzal, zza> implements zzam {
            private zza() {
                super(zzal.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzf = zzalVar;
            zzihc.z(zzal.class, zzalVar);
        }

        private zzal() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzal();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzam extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzan extends zzihc<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzh;
        private int zzd;
        private String zze = "";
        private int zzf;
        private zzap zzg;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzan, zza> implements zzao {
            private zza() {
                super(zzan.zzh);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzh = zzanVar;
            zzihc.z(zzan.class, zzanVar);
        }

        private zzan() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzan();
            }
            return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", j.a, "zzg"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzao extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzap extends zzihc<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzf;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzap, zza> implements zzaq {
            private zza() {
                super(zzap.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzf = zzapVar;
            zzihc.z(zzap.class, zzapVar);
        }

        private zzap() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzap();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzaq extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzar extends zzihc<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzh;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes3.dex */
        public final class zza extends zzigw<zzar, zza> implements zzas {
            private zza() {
                super(zzar.zzh);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzh = zzarVar;
            zzihc.z(zzar.class, zzarVar);
        }

        public static zza G() {
            return (zza) zzh.v();
        }

        public final void E(int i) {
            this.zzd |= 4;
            this.zzg = i;
        }

        public final void H(int i) {
            this.zzd |= 1;
            this.zze = i;
        }

        public final void I(int i) {
            this.zzd |= 2;
            this.zzf = i;
        }

        private zzar() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzar();
            }
            return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzas extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzat extends zzihc<zzat, zza> implements zzbi {
        private static final zzat zzL;
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private zzbc zzA;
        private zzay zzB;
        private int zzC;
        private int zzD;
        private zzap zzE;
        private int zzF;
        private int zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private long zzK;
        private int zzu;
        private zzba zzv;
        private zzbe zzw;
        private zzbg zzx;
        private zzbj zzy;
        private zzau zzz;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes5.dex */
        public final class zza extends zzigw<zzat, zza> implements zzbi {
            private zza() {
                super(zzat.zzL);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzL = zzatVar;
            zzihc.z(zzat.class, zzatVar);
        }

        private zzat() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzat();
            }
            return new hz4(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzau extends zzihc<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzh;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzau, zza> implements zzav {
            private zza() {
                super(zzau.zzh);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzh = zzauVar;
            zzihc.z(zzau.class, zzauVar);
        }

        private zzau() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzau();
            }
            return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", j.a, "zzf", "zzg"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzav extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzaw extends zzihc<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzd;
        private int zzb;
        private int zzc;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public enum zzb implements zzihg {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            zzb(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final class zza extends zzigw<zzaw, zza> implements zzax {
            private zza() {
                super(zzaw.zzd);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzd = zzawVar;
            zzihc.z(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzaw();
            }
            return new hz4(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", f.a});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzax extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzay extends zzihc<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zzj;
        private int zze;
        private zzar zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public final class zza extends zzigw<zzay, zza> implements zzaz {
            private zza() {
                super(zzay.zzj);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzay zzayVar = new zzay();
            zzj = zzayVar;
            zzihc.z(zzay.class, zzayVar);
        }

        private zzay() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzay();
            }
            return new hz4(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", j.a, "zzh", "zzi"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzaz extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzb extends zzihc<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzc;
        private zziho<zza> zzb = gz4.e;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public final class zza extends zzihc<zza, C0297zza> implements InterfaceC0298zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzh;
            private int zzd;
            private int zze;
            private zze zzf;
            private zzg zzg;

            public final void H() {
                this.zze = 1;
                this.zzd = 1 | this.zzd;
            }

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbiw$zzb$zza$zza, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            /* JADX INFO: loaded from: classes10.dex */
            public final class C0297zza extends zzigw<zza, C0297zza> implements InterfaceC0298zzb {
                private C0297zza() {
                    super(zza.zzh);
                }

                public /* synthetic */ C0297zza(int i) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzh = zzaVar;
                zzihc.z(zza.class, zzaVar);
            }

            public static C0297zza G() {
                return (C0297zza) zzh.v();
            }

            public final void E(zzg zzgVar) {
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzihc
            public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
                int iOrdinal = zzihbVar.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            return null;
                        }
                        return new C0297zza(0);
                    }
                    return new zza();
                }
                return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", g.a, "zzf", "zzg"});
            }

            public final void I(zze zzeVar) {
                Objects.requireNonNull(zzeVar);
                this.zzf = zzeVar;
                this.zzd |= 2;
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbiw$zzb$zzb, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public interface InterfaceC0298zzb extends zziij {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public enum zzd implements zzihg {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            zzd(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public final class zze extends zzihc<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzf;
            private int zzc;
            private boolean zzd;
            private int zze;

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            /* JADX INFO: loaded from: classes4.dex */
            public final class zza extends zzigw<zze, zza> implements zzf {
                private zza() {
                    super(zze.zzf);
                }

                public /* synthetic */ zza(int i) {
                    this();
                }
            }

            static {
                zze zzeVar = new zze();
                zzf = zzeVar;
                zzihc.z(zze.class, zzeVar);
            }

            public static zza E() {
                return (zza) zzf.v();
            }

            public static zze F() {
                return zzf;
            }

            public final void G(boolean z) {
                this.zzc |= 1;
                this.zzd = z;
            }

            public final void H(int i) {
                this.zzc |= 2;
                this.zze = i;
            }

            private zze() {
            }

            @Override // com.google.android.gms.internal.ads.zzihc
            public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
                int iOrdinal = zzihbVar.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            return null;
                        }
                        return new zza(0);
                    }
                    return new zze();
                }
                return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public interface zzf extends zziij {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public final class zzg extends zzihc<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzh;
            private int zzd;
            private boolean zze;
            private boolean zzf;
            private int zzg;

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            /* JADX INFO: loaded from: classes3.dex */
            public final class zza extends zzigw<zzg, zza> implements zzh {
                private zza() {
                    super(zzg.zzh);
                }

                public /* synthetic */ zza(int i) {
                    this();
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzh = zzgVar;
                zzihc.z(zzg.class, zzgVar);
            }

            public static zza G() {
                return (zza) zzh.v();
            }

            public final void E(int i) {
                this.zzd |= 4;
                this.zzg = i;
            }

            public final void H(boolean z) {
                this.zzd |= 1;
                this.zze = z;
            }

            public final void I(boolean z) {
                this.zzd |= 2;
                this.zzf = z;
            }

            private zzg() {
            }

            @Override // com.google.android.gms.internal.ads.zzihc
            public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
                int iOrdinal = zzihbVar.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            return null;
                        }
                        return new zza(0);
                    }
                    return new zzg();
                }
                return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public interface zzh extends zziij {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public final class zzc extends zzigw<zzb, zzc> implements zzc {
            private zzc() {
                super(zzb.zzc);
            }

            public /* synthetic */ zzc(int i) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzihc.z(zzb.class, zzbVar);
        }

        public static zzc F() {
            return (zzc) zzc.v();
        }

        public final void G(zza zzaVar) {
            zziho<zza> zzihoVar = this.zzb;
            if (!zzihoVar.zza()) {
                int size = zzihoVar.size();
                this.zzb = zzihoVar.zzh(size + size);
            }
            this.zzb.add(zzaVar);
        }

        private zzb() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zzc(0);
                }
                return new zzb();
            }
            return new hz4(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zza.class});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzba extends zzihc<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzl;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public final class zza extends zzigw<zzba, zza> implements zzbb {
            private zza() {
                super(zzba.zzl);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzl = zzbaVar;
            zzihc.z(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzba();
            }
            return new hz4(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", j.a, "zzh", "zzi", "zzj", "zzk"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzbb extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzbc extends zzihc<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzh;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes5.dex */
        public final class zza extends zzigw<zzbc, zza> implements zzbd {
            private zza() {
                super(zzbc.zzh);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzh = zzbcVar;
            zzihc.z(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzbc();
            }
            return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", j.a, "zzf", "zzg"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzbd extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzbe extends zzihc<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzn;
        private int zzg;
        private int zzh = 1000;
        private zzaw zzi;
        private int zzj;
        private int zzk;
        private int zzl;
        private long zzm;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes4.dex */
        public final class zza extends zzigw<zzbe, zza> implements zzbf {
            private zza() {
                super(zzbe.zzn);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzn = zzbeVar;
            zzihc.z(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzbe();
            }
            return new hz4(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", j.a, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzbf extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzbg extends zzihc<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzh;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzbg, zza> implements zzbh {
            private zza() {
                super(zzbg.zzh);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzh = zzbgVar;
            zzihc.z(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzbg();
            }
            return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", j.a, "zzf", "zzg"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzbh extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzbi extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzbj extends zzihc<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzf;
        private int zzc;
        private int zzd = 1000;
        private zzaw zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public final class zza extends zzigw<zzbj, zza> implements zzbk {
            private zza() {
                super(zzbj.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzf = zzbjVar;
            zzihc.z(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzbj();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", j.a, "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzbk extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzbl extends zzihc<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzf;
        private int zzc;
        private boolean zzd;
        private int zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes4.dex */
        public final class zza extends zzigw<zzbl, zza> implements zzbm {
            private zza() {
                super(zzbl.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzf = zzblVar;
            zzihc.z(zzbl.class, zzblVar);
        }

        public static zza F() {
            return (zza) zzf.v();
        }

        public final boolean E() {
            return this.zzd;
        }

        public final void G(boolean z) {
            this.zzc |= 1;
            this.zzd = z;
        }

        public final void H(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        private zzbl() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzbl();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzbm extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzc extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzd extends zzihc<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzf;
        private int zzc;
        private int zzd;
        private zzal zze;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public enum zza implements zzihg {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            zza(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public final class zzb extends zzigw<zzd, zzb> implements zze {
            private zzb() {
                super(zzd.zzf);
            }

            public /* synthetic */ zzb(int i) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzf = zzdVar;
            zzihc.z(zzd.class, zzdVar);
        }

        private zzd() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zzb(0);
                }
                return new zzd();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", h.a, "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zze extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzf extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzg extends zzihc<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzh;
        private int zzd;
        private String zze = "";
        private zziho<zzd> zzf = gz4.e;
        private int zzg;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes5.dex */
        public final class zza extends zzigw<zzg, zza> implements zzh {
            private zza() {
                super(zzg.zzh);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzh = zzgVar;
            zzihc.z(zzg.class, zzgVar);
        }

        private zzg() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzg();
            }
            return new hz4(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzd.class, "zzg", j.a});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzh extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzi extends zzihc<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzl;
        private int zzf;
        private String zzg = "";
        private zziho<zzd> zzh = gz4.e;
        private int zzi = 1000;
        private int zzj = 1000;
        private int zzk = 1000;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        public final class zza extends zzigw<zzi, zza> implements zzj {
            private zza() {
                super(zzi.zzl);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzl = zziVar;
            zzihc.z(zzi.class, zziVar);
        }

        public static zzi E() {
            return zzl;
        }

        private zzi() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzi();
            }
            j jVar = j.a;
            return new hz4(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", jVar, "zzj", jVar, "zzk", jVar});
        }

        public final void F(String str) {
            Objects.requireNonNull(str);
            this.zzf |= 1;
            this.zzg = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzj extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzk extends zzihc<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzn;
        private int zzg;
        private int zzh;
        private zzap zzi;
        private zzap zzj;
        private zzap zzk;
        private zziho<zzap> zzl = gz4.e;
        private int zzm;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public final class zza extends zzigw<zzk, zza> implements zzl {
            private zza() {
                super(zzk.zzn);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzn = zzkVar;
            zzihc.z(zzk.class, zzkVar);
        }

        private zzk() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzk();
            }
            return new hz4(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzap.class, "zzm"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzl extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzm extends zzihc<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzv;
        private int zzi;
        private zzap zzk;
        private int zzl;
        private zzar zzm;
        private int zzn;
        private String zzj = "";
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu = 1000;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final class zza extends zzigw<zzm, zza> implements zzn {
            private zza() {
                super(zzm.zzv);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzv = zzmVar;
            zzihc.z(zzm.class, zzmVar);
        }

        public static zzm E() {
            return zzv;
        }

        public final void F(String str) {
            this.zzi |= 1;
            this.zzj = str;
        }

        public final void G(zzar zzarVar) {
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        private zzm() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzm();
            }
            j jVar = j.a;
            return new hz4(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", jVar, "zzp", jVar, "zzu", jVar});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzn extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzo extends zzihc<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zzj;
        private int zze;
        private int zzf;
        private zzar zzg;
        private String zzh = "";
        private String zzi = "";

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public enum zzb implements zzihg {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            public final int a;

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.a);
            }

            @Override // com.google.android.gms.internal.ads.zzihg
            public final int zza() {
                return this.a;
            }

            zzb(int i) {
                this.a = i;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzo, zza> implements zzp {
            private zza() {
                super(zzo.zzj);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzj = zzoVar;
            zzihc.z(zzo.class, zzoVar);
        }

        private zzo() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzo();
            }
            return new hz4(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", i.a, "zzg", "zzh", "zzi"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzp extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public enum zzq implements zzihg {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);

        public final int a;

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.a);
        }

        @Override // com.google.android.gms.internal.ads.zzihg
        public final int zza() {
            return this.a;
        }

        zzq(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzr extends zzihc<zzr, zza> implements zzs {
        private static final zzr zzB;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private int zzk;
        private int zzl;
        private zzar zzn;
        private int zzo;
        private int zzv;
        private int zzw;
        private zzihk zzx;
        private zzihk zzz;
        private static final zzihl<zzd.zza> zzy = new k();
        private static final zzihl<zzd.zza> zzA = new l();
        private String zzm = "";
        private String zzp = "";
        private String zzu = "";

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public final class zza extends zzigw<zzr, zza> implements zzs {
            private zza() {
                super(zzr.zzB);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzB = zzrVar;
            zzihc.z(zzr.class, zzrVar);
        }

        private zzr() {
            wy4 wy4Var = wy4.e;
            this.zzx = wy4Var;
            this.zzz = wy4Var;
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzr();
            }
            h hVar = h.a;
            return new hz4(zzB, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", i.a, "zzp", "zzu", "zzv", c.a, "zzw", a.a, "zzx", hVar, "zzz", hVar});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzs extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzt extends zzihc<zzt, zza> implements zzu {
        private static final zzt zzF;
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private zzab zzA;
        private zza zzB;
        private zzaf zzC;
        private zzbl zzD;
        private zzb zzE;
        private int zzn;
        private int zzo;
        private int zzu;
        private zzar zzw;
        private zzm zzy;
        private zzo zzz;
        private String zzp = "";
        private int zzv = 1000;
        private zzihn zzx = cz4.e;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final class zza extends zzigw<zzt, zza> implements zzu {
            private zza() {
                super(zzt.zzF);
            }

            public final void o(zzb zzbVar) {
                l();
                ((zzt) this.b).H(zzbVar);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzt zztVar = new zzt();
            zzF = zztVar;
            zzihc.z(zzt.class, zztVar);
        }

        public static zza Q() {
            return (zza) zzF.v();
        }

        public final zzm E() {
            zzm zzmVar = this.zzy;
            return zzmVar == null ? zzm.E() : zzmVar;
        }

        public final zza G() {
            zza zzaVar = this.zzB;
            return zzaVar == null ? zza.E() : zzaVar;
        }

        public final void H(zzb zzbVar) {
            this.zzE = zzbVar;
            this.zzn |= 2048;
        }

        public final void J(List list) {
            zzihn zzihnVar = this.zzx;
            if (!zzihnVar.zza()) {
                int size = zzihnVar.size();
                this.zzx = zzihnVar.zzh(size + size);
            }
            zzifg.l(list, this.zzx);
        }

        public final void K() {
            this.zzx = cz4.e;
        }

        public final void L(zzm zzmVar) {
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        public final void M(zza zzaVar) {
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        public final void N(zzaf zzafVar) {
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        public final void O(zzbl zzblVar) {
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        public final String P() {
            return this.zzp;
        }

        private zzt() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzt();
            }
            return new hz4(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", j.a, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }

        public final void F(String str) {
            Objects.requireNonNull(str);
            this.zzn |= 2;
            this.zzp = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzu extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzv extends zzihc<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zzj;
        private int zze;
        private int zzg;
        private zzap zzi;
        private String zzf = "";
        private zzihk zzh = wy4.e;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        public final class zza extends zzigw<zzv, zza> implements zzw {
            private zza() {
                super(zzv.zzj);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzv zzvVar = new zzv();
            zzj = zzvVar;
            zzihc.z(zzv.class, zzvVar);
        }

        private zzv() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzv();
            }
            return new hz4(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", j.a, "zzh", "zzi"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzw extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzx extends zzihc<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzf;
        private int zzc;
        private int zzd;
        private zzihk zze = wy4.e;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final class zza extends zzigw<zzx, zza> implements zzy {
            private zza() {
                super(zzx.zzf);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzf = zzxVar;
            zzihc.z(zzx.class, zzxVar);
        }

        private zzx() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzx();
            }
            return new hz4(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", j.a, "zze"});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zzy extends zziij {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public final class zzz extends zzihc<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zzj;
        private int zze;
        private zzv zzf;
        private zziho<zzan> zzg = gz4.e;
        private int zzh;
        private zzap zzi;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        public final class zza extends zzigw<zzz, zza> implements zzaa {
            private zza() {
                super(zzz.zzj);
            }

            public /* synthetic */ zza(int i) {
                this();
            }
        }

        static {
            zzz zzzVar = new zzz();
            zzj = zzzVar;
            zzihc.z(zzz.class, zzzVar);
        }

        private zzz() {
        }

        @Override // com.google.android.gms.internal.ads.zzihc
        public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
            int iOrdinal = zzihbVar.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                    return new zza(0);
                }
                return new zzz();
            }
            return new hz4(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzan.class, "zzh", j.a, "zzi"});
        }
    }

    private zzbiw() {
    }
}
