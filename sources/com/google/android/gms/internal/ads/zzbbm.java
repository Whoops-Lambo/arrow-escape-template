package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzbbm extends zzbbk {
    public static zzbbu A;
    public static zzbda B;
    public static zzbcs C;
    public static zzbal D;
    public static zzbbr E;
    public static final Object x = new Object();
    public static boolean y;
    public static long z;
    public final zzbbl v;
    public zzbcy w;

    public final void j(zzbcr zzbcrVar, zzayj zzayjVar, View view, Activity activity, boolean z2, Context context) {
        List listAsList;
        long j;
        long j2;
        MotionEvent motionEvent;
        boolean z3 = true;
        if (zzbcrVar.n) {
            synchronized (this) {
                try {
                    try {
                        zzbct zzbctVarI = i(zzbcrVar, this.a, this.s);
                        Long l = zzbctVarI.a;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).W0(jLongValue);
                        }
                        Long l2 = zzbctVarI.b;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).X0(jLongValue2);
                        }
                        Long l3 = zzbctVarI.c;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).Y0(jLongValue3);
                        }
                        if (this.r) {
                            Long l4 = zzbctVarI.d;
                            if (l4 != null) {
                                long jLongValue4 = l4.longValue();
                                zzayjVar.l();
                                ((zzazk) zzayjVar.b).M(jLongValue4);
                            }
                            Long l5 = zzbctVarI.e;
                            if (l5 != null) {
                                long jLongValue5 = l5.longValue();
                                zzayjVar.l();
                                ((zzazk) zzayjVar.b).N(jLongValue5);
                            }
                        }
                    } catch (zzbch unused) {
                    }
                    zzazg zzazgVarE = zzazh.E();
                    if (this.c > 0) {
                        DisplayMetrics displayMetrics = this.s;
                        char[] cArr = zzbcu.a;
                        if ((displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true) {
                            long jB = zzbcu.b(this.j, displayMetrics);
                            zzazgVarE.l();
                            ((zzazh) zzazgVarE.b).S(jB);
                            long jB2 = zzbcu.b(this.o - this.m, this.s);
                            zzazgVarE.l();
                            ((zzazh) zzazgVarE.b).T(jB2);
                            long jB3 = zzbcu.b(this.p - this.n, this.s);
                            zzazgVarE.l();
                            ((zzazh) zzazgVarE.b).U(jB3);
                            long jB4 = zzbcu.b(this.m, this.s);
                            zzazgVarE.l();
                            ((zzazh) zzazgVarE.b).X(jB4);
                            long jB5 = zzbcu.b(this.n, this.s);
                            zzazgVarE.l();
                            ((zzazh) zzazgVarE.b).Y(jB5);
                            if (this.r && (motionEvent = this.a) != null) {
                                long jB6 = zzbcu.b(((this.m - this.o) + motionEvent.getRawX()) - this.a.getX(), this.s);
                                if (jB6 != 0) {
                                    zzazgVarE.l();
                                    ((zzazh) zzazgVarE.b).V(jB6);
                                }
                                long jB7 = zzbcu.b(((this.n - this.p) + this.a.getRawY()) - this.a.getY(), this.s);
                                if (jB7 != 0) {
                                    zzazgVarE.l();
                                    ((zzazh) zzazgVarE.b).W(jB7);
                                }
                            }
                        }
                    }
                    try {
                        zzbct zzbctVarD = d(this.a);
                        Long l6 = zzbctVarD.a;
                        if (l6 != null) {
                            long jLongValue6 = l6.longValue();
                            zzazgVarE.l();
                            ((zzazh) zzazgVarE.b).F(jLongValue6);
                        }
                        Long l7 = zzbctVarD.b;
                        if (l7 != null) {
                            long jLongValue7 = l7.longValue();
                            zzazgVarE.l();
                            ((zzazh) zzazgVarE.b).G(jLongValue7);
                        }
                        long jLongValue8 = zzbctVarD.c.longValue();
                        zzazgVarE.l();
                        ((zzazh) zzazgVarE.b).N(jLongValue8);
                        if (this.r) {
                            Long l8 = zzbctVarD.e;
                            if (l8 != null) {
                                long jLongValue9 = l8.longValue();
                                zzazgVarE.l();
                                ((zzazh) zzazgVarE.b).H(jLongValue9);
                            }
                            Long l9 = zzbctVarD.d;
                            if (l9 != null) {
                                long jLongValue10 = l9.longValue();
                                zzazgVarE.l();
                                ((zzazh) zzazgVarE.b).K(jLongValue10);
                            }
                            Long l10 = zzbctVarD.f;
                            if (l10 != null) {
                                zzazv zzazvVar = l10.longValue() != 0 ? zzazv.ENUM_TRUE : zzazv.ENUM_FALSE;
                                zzazgVarE.l();
                                ((zzazh) zzazgVarE.b).M(zzazvVar);
                            }
                            long j3 = this.d;
                            if (j3 > 0) {
                                DisplayMetrics displayMetrics2 = this.s;
                                char[] cArr2 = zzbcu.a;
                                if (displayMetrics2 == null || displayMetrics2.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    z3 = false;
                                }
                                Long lValueOf = z3 ? Long.valueOf(Math.round(this.i / j3)) : null;
                                if (lValueOf != null) {
                                    long jLongValue11 = lValueOf.longValue();
                                    zzazgVarE.l();
                                    ((zzazh) zzazgVarE.b).I(jLongValue11);
                                } else {
                                    zzazgVarE.l();
                                    ((zzazh) zzazgVarE.b).J();
                                }
                                long jRound = Math.round(this.h / this.d);
                                zzazgVarE.l();
                                ((zzazh) zzazgVarE.b).L(jRound);
                            }
                            Long l11 = zzbctVarD.i;
                            if (l11 != null) {
                                long jLongValue12 = l11.longValue();
                                zzazgVarE.l();
                                ((zzazh) zzazgVarE.b).P(jLongValue12);
                            }
                            Long l12 = zzbctVarD.j;
                            if (l12 != null) {
                                long jLongValue13 = l12.longValue();
                                zzazgVarE.l();
                                ((zzazh) zzazgVarE.b).O(jLongValue13);
                            }
                            Long l13 = zzbctVarD.k;
                            if (l13 != null) {
                                zzazv zzazvVar2 = l13.longValue() != 0 ? zzazv.ENUM_TRUE : zzazv.ENUM_FALSE;
                                zzazgVarE.l();
                                ((zzazh) zzazgVarE.b).Q(zzazvVar2);
                            }
                        }
                    } catch (zzbch unused2) {
                    }
                    long j4 = this.g;
                    if (j4 > 0) {
                        zzazgVarE.l();
                        ((zzazh) zzazgVarE.b).R(j4);
                    }
                    zzazh zzazhVar = (zzazh) zzazgVarE.m();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).c0(zzazhVar);
                    long j5 = this.c;
                    if (j5 > 0) {
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).Q(j5);
                    }
                    long j6 = this.d;
                    if (j6 > 0) {
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).P(j6);
                    }
                    long j7 = this.e;
                    if (j7 > 0) {
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).O(j7);
                    }
                    long j8 = this.f;
                    if (j8 > 0) {
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).R(j8);
                    }
                    try {
                        LinkedList linkedList = this.b;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            zzayjVar.l();
                            ((zzazk) zzayjVar.b).f0();
                            for (int i = 0; i < size; i++) {
                                zzbct zzbctVarI2 = i(zzbbk.u, (MotionEvent) linkedList.get(i), this.s);
                                zzazg zzazgVarE2 = zzazh.E();
                                long jLongValue14 = zzbctVarI2.a.longValue();
                                zzazgVarE2.l();
                                ((zzazh) zzazgVarE2.b).F(jLongValue14);
                                long jLongValue15 = zzbctVarI2.b.longValue();
                                zzazgVarE2.l();
                                ((zzazh) zzazgVarE2.b).G(jLongValue15);
                                zzazh zzazhVar2 = (zzazh) zzazgVarE2.m();
                                zzayjVar.l();
                                ((zzazk) zzayjVar.b).d0(zzazhVar2);
                            }
                        }
                    } catch (zzbch unused3) {
                        zzayjVar.l();
                        ((zzazk) zzayjVar.b).f0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (zzbcrVar.b != null) {
                int iE = zzbcrVar.e();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.O3)).booleanValue()) {
                    arrayList.add(new zzbdf(zzbcrVar, zzayjVar, iE, context, this.v.c, D));
                    arrayList.add(new zzbde(zzbcrVar, zzayjVar, iE, context));
                    arrayList.add(new zzbdu(zzbcrVar, zzayjVar, iE, context));
                    arrayList.add(new zzbdz(zzbcrVar, zzayjVar, iE));
                    zzbda zzbdaVar = B;
                    if (zzbdaVar != null) {
                        long j9 = zzbdaVar.d ? zzbdaVar.b - zzbdaVar.a : -1L;
                        long j10 = zzbdaVar.c;
                        zzbdaVar.c = -1L;
                        j2 = j9;
                        j = j10;
                    } else {
                        j = -1;
                        j2 = -1;
                    }
                    arrayList.add(new zzbdp(zzbcrVar, zzayjVar, iE, A, j2, j));
                    arrayList.add(new zzbdt(zzbcrVar, zzayjVar, iE));
                }
                arrayList.add(new zzbdk(zzbcrVar, zzayjVar));
                arrayList.add(new zzbdr(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbdi(zzbcrVar, zzayjVar, z, iE));
                arrayList.add(new zzbdh(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbdq(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbds(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbdm(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbdg(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbea(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbdd(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbdx(zzbcrVar, zzayjVar, iE));
                arrayList.add(new zzbdw(zzbcrVar, zzayjVar, iE, new Throwable().getStackTrace()));
                arrayList.add(new zzbeb(zzbcrVar, zzayjVar, iE, view));
                arrayList.add(new zzbdv(zzbcrVar, zzayjVar, iE));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.F3)).booleanValue()) {
                    arrayList.add(new zzbdb(zzbcrVar, zzayjVar, iE, view, activity));
                }
                arrayList.add(new zzbdc(zzbcrVar, zzayjVar, iE));
                if (!z2) {
                    arrayList.add(new zzbdl(zzbcrVar, zzayjVar, iE, C));
                    arrayList.add(new zzbdo(zzbcrVar, zzayjVar, iE, this.t));
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H3)).booleanValue()) {
                    arrayList.add(new zzbdy(zzbcrVar, zzayjVar, iE, this.w));
                }
            }
            listAsList = arrayList;
        } else {
            zzayjVar.p(16384L);
            listAsList = Arrays.asList(new zzbdk(zzbcrVar, zzayjVar));
        }
        k(listAsList);
    }

    public static zzbcr h(Context context, boolean z2) {
        if (zzbbk.u == null) {
            synchronized (x) {
                try {
                    if (zzbbk.u == null) {
                        zzbcr zzbcrVarA = zzbcr.a(context, z2, E);
                        if (zzbcrVarA.n) {
                            try {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.w4)).booleanValue()) {
                                    zzbcrVarA.c("bfw5IHsKaCfsUR8ZsMZaZX2nD1/L2wbGGcnXyH/M2lJLhchh0T+80186x5aftws2", "i8mAdwbsd68hBaSQrE+z2u+th3TYAPVhYQrCCL6Gk2A=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            zzbcrVarA.c("12aV5CsAoy5fVyoKI8rv1Fb9/odLGOnRl5PggltGjYjyyskhW5fwpVEWgWmYsJQu", "XIsUH/ICKFxo+Zu8mpDkLnONAiVOrcYjrRZjBOznm+M=", Context.class);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.A4)).booleanValue()) {
                                zzbcrVarA.c("Dsuuh9zFUNR9eujY9ForFH3HnvHSyJZ6IpD+mYwKs8+2A4HbkgDuy2K4/YuRYYuE", "Pl1vP1sFHPI7fmZyCJQA2haTl6Y/gtqwJVzNcK/duUw=", new Class[0]);
                            }
                            zzbcrVarA.c("1bSMI9gtrb/6DFih4hkOd9khQZ24/v9AA5GSj7Q51UAxl5p5xEQJQqApre3l/qe1", "sKQcJmt2Y5CCra93mMKp8imJbWnEO7kxeAvbY1EsgKo=", Context.class);
                            zzbcrVarA.c("OMIkKkze+2oS5rKE0AgnXxEyEgkFs1kR2zAHokfUBSjbvOKi2WmToSQD7cE9iakR", "JlWZq3R71evFvCoApPRiHmYv3OARdN7jQdew17n0tIs=", Context.class);
                            zzbcrVarA.c("fUOZxUYRWSrmCYljRXALaL4mtJY2kforh1a9OtEVbPk4fsIvQVwzLFav+rB7f2tx", "fWNSdz1TkY6OkzXsM9q0GiRgZuxFRMq5z60cr8yn5EA=", Context.class);
                            zzbcrVarA.c("iRn9mXRBQFygYtwSEOdoYDhrSS0taZLlsRBLj4dS5mtUOXsnmQdi372xgnOVvbyG", "y6ljlrSa0fq6gt6x8YEbpSYBGVIsTMQBTIn4PX93OQU=", Context.class);
                            Class cls = Boolean.TYPE;
                            zzbcrVarA.c("oV5C//Ksoskol477gFUb2RWueLgQXI+NjeJFuX7QNxfQYH3xMswhWcYG8FvnmINo", "Gm5Esq6QJvfaQzK+JcnYzv9G4I8+p+Ggtol6TUc2QQc=", Context.class, cls);
                            zzbcrVarA.c("O8qfkV4xiwXPHiRd2hJ4MmfnNAmVkjY5RlomMTcyKvcjXsKUKdcw5SdTGzigSGvF", "Ho2oXpvwAH2wkTK/qQg7551UqKcxBHGQPl8v/EyXYgQ=", Context.class);
                            zzbcrVarA.c("FyVzDtLpepPODM8rHCqlpJ7mRF4hOLizoQ7m+OELl5heeUSWM0ddA07DvIt274Yp", "Ze5bQm636R9gguAR8HfthID2Ye3jtW2CtZF5SdDl7G4=", Context.class);
                            zzbcrVarA.c("1WS46w6qhkjg1yOC9LTNOop94+h8drfE/O3fC8dzVsG5k2MkfCMstnaKyykUqjSN", "+/4LPu3KTzAdgyypjgq+RhO2PMLvLQ0ssyh7FFHX9HU=", MotionEvent.class, DisplayMetrics.class);
                            zzbcrVarA.c("Jcq9U2mtFVanVe7guIv467FNLJrv5fSCoJDBA+m1ih0PmlNWGbWlNpgr0CfNhKXj", "lfTSaeHgGXcPM+R6RHTujE6IyLkRM6nPU3+Ji2AWDI4=", MotionEvent.class, DisplayMetrics.class);
                            zzbcrVarA.c("GN3pwajeSKC9vStuq8/7toSg5Hl8NuHCGYd/lap9KB2W9wK7JFaYvfpiW9ms3dza", "qP7oA5YZCnlM0GasGhjRykxMC65mV5SDJ64BQ3cUrQM=", new Class[0]);
                            zzbcrVarA.c("a1bl2YBsMX8ZEuh7Sv9mAYHDtkJKMbhmkeCE0yHazhDqHtE6BFZ+lcW5byAL/cKe", "lj7uKl20Z39le8FFlGLjX0UxKMr0Ru+oOKgfaN7408I=", new Class[0]);
                            zzbcrVarA.c("2b0e/8kjL/JJaZQF+qskNLXwBtDvq9td5KivSMoLh+S5/XNjSHz7CAAxVtNPdCQT", "bgWvsXamVnI491RFt5WDaLbzxI4oxEjQdP0Cd+Kk7dY=", new Class[0]);
                            zzbcrVarA.c("eyBYeoGjEgfxCFt0zBq150mjeuYBZZfRFjwfGjyxK5zsnU3NgxYxzLWRWzJttpW0", "PgfPBTz/xAC8BcaE7LzXUISk9rXlu5fG+DY0yfrGG7A=", new Class[0]);
                            zzbcrVarA.c("/JTivgRoct9ikgssPIiQVzCI0kNPYiayO78jO5/dem1ZrF7Yt5UwETss7pIj1ois", "vigwgBhnlQhzvrsrA0nJteS1TlzLnPhKS3FDHvdvPUw=", new Class[0]);
                            zzbcrVarA.c("yqbsjshUWeXWCmXix2S4X8f061MbNeryT6W/PbupOEHLPKjx/EpzXhDLNyWloRp7", "cftsF+P0KaORnSr1rqTMLuenqLHeL16vZ1HXshLqxJc=", new Class[0]);
                            zzbcrVarA.c("5tUk9VxyvTk3voVA19VssXEpkgkE0rID8yw+7qBRH7R71EgY9frXFegVq0zGNcs6", "aaiDbhpe3WNQUBV6TnvkJc6bxYe8eeWPm6eGk9+g6C8=", Context.class, cls, String.class);
                            zzbcrVarA.c("GZf/veAWBQM0/jbyrn8H67cJiuqpXpAd+9T53BBfmWzP5T3uqttu9ou0WokFZSq8", "O4B/kAjR/YQMOddpgzIrgUcoaK62iIn/Qlm3PN6Mw/o=", StackTraceElement[].class);
                            zzbcrVarA.c("VzDqK2Qhy8m7H6PB3RHMrYQm7t7BOqRME2wj8aNqSR2BjSd40n1j7ifz58mO7qiY", "hfynBEe6dOlNQP0Wi5l4Y33EmMRACcuQi8Wz4tphvls=", View.class, DisplayMetrics.class, cls, cls);
                            zzbcrVarA.c("+itqyWABhjkXWCrP+LwEc7+wh38E9mu5dWERZiHrTPoJ6fPCVtHVwfYISIenqwzi", "LLeJbxD3ywwWaUj9EY4DZz0z20ls4UWdNUANUE/kGMo=", Context.class, cls);
                            zzbcrVarA.c("QyYMDi1LgA5BLpFAKlMkwtyQ7ImSzOvajxXj984RYUAaZnlZhFCfUXIG8OVC2W7R", "1ge5AUvIi0iL/j5B0zvENe2mm1b5DmQtOieWYx8cLeo=", View.class, Activity.class, cls);
                            Class cls2 = Long.TYPE;
                            zzbcrVarA.c("uSD+CiV7I7tsadG9ogkeFViGtrSRVJxupLuHakWX5hwAfRBTyhysGKuyr4wnj+1s", "ixbxgJnXLn8A0/JkQkN6ZoXaTnLM2gufE7Jz4GvMA7k=", cls2);
                            zzbcrVarA.c("3AhSPry/E1fYNbnF2O83WMVkZBW0B8/z3oPj99Oii/90cvunh/rZO+lax0shEYak", "OKFACVZrXxQ1sI0SAr7pfIH1wzltllJwYiKIbizZ+ng=", new Class[0]);
                            zzbcrVarA.c("jEkShiaVCdbWK5K8KFjNS1GKPCqZ+IFEh2TRJcT/Iu2xFgvEe75qCwilibBDhYE9", "KKcbzxEcE2MWwd1xH2pvw3sTr922MugNg6p/ZAuVV8s=", Context.class);
                            zzbcrVarA.c("mvEeCdbKl0UtetArsSPQA7SJ2bQ+/xbTKTNUfbWs4GUJ+C8cYcWlIBETlZPzous2", "HNEOxj5vLj+LgSL0J7uuzLYxZkAV3VVT7cUL+NRJ4IQ=", Context.class);
                            zzbcrVarA.c("doPNhtWFgjK86AYDqjLnkjmRU6pVmlnTYvKAFVlvd1J+haSnVQfplqwhHFumdMPj", "JZhG+MCqbcF5vZPXuiPwkxfhXvLZOSaUPhCvw50g47U=", NetworkCapabilities.class, cls2, cls2);
                            zzbcrVarA.c("GPSX0oVi73Ib8ecKWrSO3VUHY/Mu2TTTkcz/0tATF/nBEKf0stmuRgI/3NEubSXp", "0ZzYmiv0qxgWNUCiGggnRm3zxanwNQmqihAv5i6tqkg=", List.class);
                            zzbcrVarA.c("E/sg0vUYFi5Bw2LDcnUx8YELJ5gJbWpKSsyXBS4wtTA0vM6aRXc8TfjEIpMXOBOU", "C6Zx/ReDfes3xuOLYM/P73Od5EVB6nq/3rtPt/P4yDY=", cls2, cls2, cls2, cls2);
                        }
                        zzbbk.u = zzbcrVarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzbbk.u;
    }

    public static zzbct i(zzbcr zzbcrVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzbch {
        Method methodD = zzbcrVar.d("1WS46w6qhkjg1yOC9LTNOop94+h8drfE/O3fC8dzVsG5k2MkfCMstnaKyykUqjSN", "+/4LPu3KTzAdgyypjgq+RhO2PMLvLQ0ssyh7FFHX9HU=");
        if (methodD == null || motionEvent == null) {
            throw new zzbch();
        }
        try {
            return new zzbct((String) methodD.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbch(e);
        }
    }

    public static final void k(List list) {
        ExecutorService executorService;
        if (zzbbk.u == null || (executorService = zzbbk.u.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.E3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            char[] cArr = zzbcu.a;
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Log.d("zzbbm", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final zzayj a(Context context) {
        long j;
        zzbda zzbdaVar = B;
        if (zzbdaVar != null && zzbdaVar.d) {
            zzbdaVar.b = System.currentTimeMillis();
        }
        zzbcs zzbcsVar = C;
        zzbcsVar.b = zzbcsVar.a;
        zzbcsVar.a = SystemClock.uptimeMillis();
        zzayj zzayjVarN0 = zzazk.N0();
        zzbbl zzbblVar = this.v;
        String str = zzbblVar.b;
        if (!TextUtils.isEmpty(str)) {
            zzayjVarN0.l();
            ((zzazk) zzayjVarN0.b).Q0(str);
        }
        zzbcr zzbcrVarH = h(context, zzbblVar.a);
        if (zzbcrVarH.b != null) {
            int iE = zzbcrVarH.e();
            ArrayList arrayList = new ArrayList();
            if (zzbcrVarH.n) {
                arrayList.add(new zzbdf(zzbcrVarH, zzayjVarN0, iE, context, zzbblVar.c, D));
                arrayList.add(new zzbdi(zzbcrVarH, zzayjVarN0, z, iE));
                arrayList.add(new zzbdr(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbdu(zzbcrVarH, zzayjVarN0, iE, context));
                arrayList.add(new zzbdz(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbde(zzbcrVarH, zzayjVarN0, iE, context));
                arrayList.add(new zzbdg(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbdq(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbds(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbdh(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbdm(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbea(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbdd(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbdx(zzbcrVarH, zzayjVarN0, iE));
                arrayList.add(new zzbdv(zzbcrVarH, zzayjVarN0, iE));
                zzbda zzbdaVar2 = B;
                long j2 = -1;
                if (zzbdaVar2 != null) {
                    long j3 = zzbdaVar2.d ? zzbdaVar2.b - zzbdaVar2.a : -1L;
                    long j4 = zzbdaVar2.c;
                    zzbdaVar2.c = -1L;
                    j2 = j3;
                    j = j4;
                } else {
                    j = -1;
                }
                arrayList.add(new zzbdp(zzbcrVarH, zzayjVarN0, iE, A, j2, j));
                arrayList.add(new zzbdt(zzbcrVarH, zzayjVarN0, iE));
                zzbdn zzbdnVar = new zzbdn(zzbcrVarH, "mvEeCdbKl0UtetArsSPQA7SJ2bQ+/xbTKTNUfbWs4GUJ+C8cYcWlIBETlZPzous2", "HNEOxj5vLj+LgSL0J7uuzLYxZkAV3VVT7cUL+NRJ4IQ=", zzayjVarN0, iE, 76);
                zzayjVarN0 = zzayjVarN0;
                arrayList.add(zzbdnVar);
                arrayList.add(new zzbdc(zzbcrVarH, zzayjVarN0, iE));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.A4)).booleanValue()) {
                    zzbdj zzbdjVar = new zzbdj(zzbcrVarH, "Dsuuh9zFUNR9eujY9ForFH3HnvHSyJZ6IpD+mYwKs8+2A4HbkgDuy2K4/YuRYYuE", "Pl1vP1sFHPI7fmZyCJQA2haTl6Y/gtqwJVzNcK/duUw=", zzayjVarN0, iE, 82);
                    zzayjVarN0 = zzayjVarN0;
                    arrayList.add(zzbdjVar);
                }
            } else {
                zzayjVarN0.p(16384L);
            }
            k(arrayList);
        }
        return zzayjVarN0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final zzayj b(Context context, View view, Activity activity) {
        zzbda zzbdaVar = B;
        if (zzbdaVar != null && zzbdaVar.d) {
            zzbdaVar.b = System.currentTimeMillis();
        }
        zzbcs zzbcsVar = C;
        zzbcsVar.h = zzbcsVar.g;
        zzbcsVar.g = SystemClock.uptimeMillis();
        zzayj zzayjVarN0 = zzazk.N0();
        zzbbl zzbblVar = this.v;
        String str = zzbblVar.b;
        if (!TextUtils.isEmpty(str)) {
            zzayjVarN0.l();
            ((zzazk) zzayjVarN0.b).Q0(str);
        }
        j(h(context, zzbblVar.a), zzayjVarN0, view, activity, true, context);
        return zzayjVarN0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final zzayj c(Context context, View view, Activity activity) {
        zzbda zzbdaVar = B;
        if (zzbdaVar != null && zzbdaVar.d) {
            zzbdaVar.b = System.currentTimeMillis();
        }
        C.a(context, view);
        zzayj zzayjVarN0 = zzazk.N0();
        zzbbl zzbblVar = this.v;
        String str = zzbblVar.b;
        zzayjVarN0.l();
        ((zzazk) zzayjVarN0.b).Q0(str);
        j(h(context, zzbblVar.a), zzayjVarN0, view, activity, false, context);
        return zzayjVarN0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final zzbct d(MotionEvent motionEvent) throws zzbch {
        Method methodD = zzbbk.u.d("Jcq9U2mtFVanVe7guIv467FNLJrv5fSCoJDBA+m1ih0PmlNWGbWlNpgr0CfNhKXj", "lfTSaeHgGXcPM+R6RHTujE6IyLkRM6nPU3+Ji2AWDI4=");
        if (methodD == null || motionEvent == null) {
            throw new zzbch();
        }
        try {
            return new zzbct((String) methodD.invoke(null, motionEvent, this.s));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbch(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final long e(StackTraceElement[] stackTraceElementArr) throws zzbch {
        Method methodD = zzbbk.u.d("GZf/veAWBQM0/jbyrn8H67cJiuqpXpAd+9T53BBfmWzP5T3uqttu9ou0WokFZSq8", "O4B/kAjR/YQMOddpgzIrgUcoaK62iIn/Qlm3PN6Mw/o=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new zzbch();
        }
        try {
            return new zzbci((String) methodD.invoke(null, stackTraceElementArr)).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbch(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbk, com.google.android.gms.internal.ads.zzbbj
    public final void zzh(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H3)).booleanValue()) {
            if (this.w == null) {
                zzbcr zzbcrVar = zzbbk.u;
                this.w = new zzbcy(zzbcrVar.a, zzbcrVar.o);
            }
            this.w.a(view);
        }
    }

    public zzbbm(Context context, zzbbl zzbblVar) {
        super(context);
        new HashMap();
        this.v = zzbblVar;
    }
}
