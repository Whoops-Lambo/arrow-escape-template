package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.C4664b4;
import com.unity3d.services.UnityAdsConstants;
import defpackage.o54;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepr implements zzenj {
    public final Context a;
    public final zzdpn b;
    public final Executor c;

    public static final boolean c(zzfmb zzfmbVar, int i) {
        return zzfmbVar.a.a.h.contains(Integer.toString(i));
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0528  */
    /* JADX WARN: Code duplicated, block: B:93:0x053e  */
    @Override // com.google.android.gms.internal.ads.zzenj
    public final Object a(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) throws zzfmq, zzeqs {
        zzfnh zzfnhVar;
        zzbwr zzbwrVar;
        zzbwv zzbwvVar;
        zzbws zzbwsVar;
        zzdre zzdreVarM;
        zzbws zzbwsVar2;
        zzfnh zzfnhVar2 = (zzfnh) zzengVar.b;
        zzbwj zzbwjVar = zzfnhVar2.a;
        try {
            zzbwr zzbwrVarZzO = zzbwjVar.zzO();
            try {
                zzbws zzbwsVarZzP = zzbwjVar.zzP();
                try {
                    zzbwv zzbwvVarZzC = zzbwjVar.zzC();
                    if (zzbwvVarZzC == null || !c(zzfmbVar, 6)) {
                        if (zzbwrVarZzO != null && c(zzfmbVar, 6)) {
                            try {
                                Parcel parcelZzdb = zzbwrVarZzO.zzdb(17, zzbwrVarZzO.zzda());
                                com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzdb.readStrongBinder());
                                parcelZzdb.recycle();
                                zzdrd zzdrdVar = zzeaVarZza == null ? null : new zzdrd(zzeaVarZza, null);
                                Parcel parcelZzdb2 = zzbwrVarZzO.zzdb(19, zzbwrVarZzO.zzda());
                                zzbmz zzbmzVarO3 = zzbmy.O3(parcelZzdb2.readStrongBinder());
                                parcelZzdb2.recycle();
                                Parcel parcelZzdb3 = zzbwrVarZzO.zzdb(18, zzbwrVarZzO.zzda());
                                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcelZzdb3.readStrongBinder());
                                parcelZzdb3.recycle();
                                View view = (View) zzdre.n(iObjectWrapperR);
                                Parcel parcelZzdb4 = zzbwrVarZzO.zzdb(2, zzbwrVarZzO.zzda());
                                String string = parcelZzdb4.readString();
                                parcelZzdb4.recycle();
                                Parcel parcelZzdb5 = zzbwrVarZzO.zzdb(3, zzbwrVarZzO.zzda());
                                ArrayList arrayList = parcelZzdb5.readArrayList(zzbfh.a);
                                parcelZzdb5.recycle();
                                Parcel parcelZzdb6 = zzbwrVarZzO.zzdb(4, zzbwrVarZzO.zzda());
                                String string2 = parcelZzdb6.readString();
                                parcelZzdb6.recycle();
                                Parcel parcelZzdb7 = zzbwrVarZzO.zzdb(15, zzbwrVarZzO.zzda());
                                Bundle bundle = (Bundle) zzbfh.b(parcelZzdb7, Bundle.CREATOR);
                                parcelZzdb7.recycle();
                                Parcel parcelZzdb8 = zzbwrVarZzO.zzdb(6, zzbwrVarZzO.zzda());
                                String string3 = parcelZzdb8.readString();
                                parcelZzdb8.recycle();
                                View view2 = (View) zzdre.n(zzbwrVarZzO.r());
                                Parcel parcelZzdb9 = zzbwrVarZzO.zzdb(21, zzbwrVarZzO.zzda());
                                IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcelZzdb9.readStrongBinder());
                                parcelZzdb9.recycle();
                                Parcel parcelZzdb10 = zzbwrVarZzO.zzdb(8, zzbwrVarZzO.zzda());
                                String string4 = parcelZzdb10.readString();
                                parcelZzdb10.recycle();
                                Parcel parcelZzdb11 = zzbwrVarZzO.zzdb(9, zzbwrVarZzO.zzda());
                                String string5 = parcelZzdb11.readString();
                                parcelZzdb11.recycle();
                                Parcel parcelZzdb12 = zzbwrVarZzO.zzdb(7, zzbwrVarZzO.zzda());
                                double d = parcelZzdb12.readDouble();
                                parcelZzdb12.recycle();
                                Parcel parcelZzdb13 = zzbwrVarZzO.zzdb(5, zzbwrVarZzO.zzda());
                                zzbng zzbngVarO3 = zzbnf.O3(parcelZzdb13.readStrongBinder());
                                parcelZzdb13.recycle();
                                zzdreVarM = zzdre.m(zzdrdVar, zzbmzVarO3, view, string, arrayList, string2, bundle, string3, view2, iObjectWrapperR2, string4, string5, d, zzbngVarO3, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } catch (RemoteException e) {
                                int i = com.google.android.gms.ads.internal.util.zze.zza;
                                zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
                                zzdreVarM = null;
                            }
                        } else if (zzbwrVarZzO == null || !c(zzfmbVar, 2)) {
                            zzfnhVar = zzfnhVar2;
                            zzbwrVar = zzbwrVarZzO;
                            zzbwvVar = zzbwvVarZzC;
                            if (zzbwsVarZzP != null && c(zzfmbVar, 6)) {
                                try {
                                    zzbwsVar2 = zzbwsVarZzP;
                                    try {
                                        Parcel parcelZzdb14 = zzbwsVar2.zzdb(16, zzbwsVarZzP.zzda());
                                        com.google.android.gms.ads.internal.client.zzea zzeaVarZza2 = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzdb14.readStrongBinder());
                                        parcelZzdb14.recycle();
                                        zzdrd zzdrdVar2 = zzeaVarZza2 == null ? null : new zzdrd(zzeaVarZza2, null);
                                        Parcel parcelZzdb15 = zzbwsVar2.zzdb(19, zzbwsVar2.zzda());
                                        zzbmz zzbmzVarO4 = zzbmy.O3(parcelZzdb15.readStrongBinder());
                                        parcelZzdb15.recycle();
                                        Parcel parcelZzdb16 = zzbwsVar2.zzdb(15, zzbwsVar2.zzda());
                                        IObjectWrapper iObjectWrapperR3 = IObjectWrapper.Stub.r(parcelZzdb16.readStrongBinder());
                                        parcelZzdb16.recycle();
                                        View view3 = (View) zzdre.n(iObjectWrapperR3);
                                        Parcel parcelZzdb17 = zzbwsVar2.zzdb(2, zzbwsVar2.zzda());
                                        String string6 = parcelZzdb17.readString();
                                        parcelZzdb17.recycle();
                                        Parcel parcelZzdb18 = zzbwsVar2.zzdb(3, zzbwsVar2.zzda());
                                        ArrayList arrayList2 = parcelZzdb18.readArrayList(zzbfh.a);
                                        parcelZzdb18.recycle();
                                        Parcel parcelZzdb19 = zzbwsVar2.zzdb(4, zzbwsVar2.zzda());
                                        String string7 = parcelZzdb19.readString();
                                        parcelZzdb19.recycle();
                                        Parcel parcelZzdb20 = zzbwsVar2.zzdb(13, zzbwsVar2.zzda());
                                        Bundle bundle2 = (Bundle) zzbfh.b(parcelZzdb20, Bundle.CREATOR);
                                        parcelZzdb20.recycle();
                                        Parcel parcelZzdb21 = zzbwsVar2.zzdb(6, zzbwsVar2.zzda());
                                        String string8 = parcelZzdb21.readString();
                                        parcelZzdb21.recycle();
                                        View view4 = (View) zzdre.n(zzbwsVar2.zzu());
                                        Parcel parcelZzdb22 = zzbwsVar2.zzdb(21, zzbwsVar2.zzda());
                                        IObjectWrapper iObjectWrapperR4 = IObjectWrapper.Stub.r(parcelZzdb22.readStrongBinder());
                                        parcelZzdb22.recycle();
                                        Parcel parcelZzdb23 = zzbwsVar2.zzdb(5, zzbwsVar2.zzda());
                                        zzbng zzbngVarO4 = zzbnf.O3(parcelZzdb23.readStrongBinder());
                                        parcelZzdb23.recycle();
                                        Parcel parcelZzdb24 = zzbwsVar2.zzdb(7, zzbwsVar2.zzda());
                                        String string9 = parcelZzdb24.readString();
                                        parcelZzdb24.recycle();
                                        zzdreVarM = zzdre.m(zzdrdVar2, zzbmzVarO4, view3, string6, arrayList2, string7, bundle2, string8, view4, iObjectWrapperR4, null, null, -1.0d, zzbngVarO4, string9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    } catch (RemoteException e2) {
                                        e = e2;
                                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzj("Failed to get native ad assets from content ad mapper", e);
                                        zzdreVarM = null;
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    zzbwsVar2 = zzbwsVarZzP;
                                }
                                zzbwsVar = zzbwsVar2;
                            } else {
                                if (zzbwsVarZzP == null || !c(zzfmbVar, 1)) {
                                    throw new zzeqs(1, "No native ad mappers");
                                }
                                try {
                                    Parcel parcelZzdb25 = zzbwsVarZzP.zzdb(16, zzbwsVarZzP.zzda());
                                    com.google.android.gms.ads.internal.client.zzea zzeaVarZza3 = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzdb25.readStrongBinder());
                                    parcelZzdb25.recycle();
                                    zzdrd zzdrdVar3 = zzeaVarZza3 == null ? null : new zzdrd(zzeaVarZza3, null);
                                    Parcel parcelZzdb26 = zzbwsVarZzP.zzdb(19, zzbwsVarZzP.zzda());
                                    zzbmz zzbmzVarO5 = zzbmy.O3(parcelZzdb26.readStrongBinder());
                                    parcelZzdb26.recycle();
                                    Parcel parcelZzdb27 = zzbwsVarZzP.zzdb(15, zzbwsVarZzP.zzda());
                                    IObjectWrapper iObjectWrapperR5 = IObjectWrapper.Stub.r(parcelZzdb27.readStrongBinder());
                                    parcelZzdb27.recycle();
                                    View view5 = (View) zzdre.n(iObjectWrapperR5);
                                    Parcel parcelZzdb28 = zzbwsVarZzP.zzdb(2, zzbwsVarZzP.zzda());
                                    String string10 = parcelZzdb28.readString();
                                    parcelZzdb28.recycle();
                                    Parcel parcelZzdb29 = zzbwsVarZzP.zzdb(3, zzbwsVarZzP.zzda());
                                    ArrayList arrayList3 = parcelZzdb29.readArrayList(zzbfh.a);
                                    parcelZzdb29.recycle();
                                    Parcel parcelZzdb30 = zzbwsVarZzP.zzdb(4, zzbwsVarZzP.zzda());
                                    String string11 = parcelZzdb30.readString();
                                    parcelZzdb30.recycle();
                                    Parcel parcelZzdb31 = zzbwsVarZzP.zzdb(13, zzbwsVarZzP.zzda());
                                    Bundle bundle3 = (Bundle) zzbfh.b(parcelZzdb31, Bundle.CREATOR);
                                    parcelZzdb31.recycle();
                                    Parcel parcelZzdb32 = zzbwsVarZzP.zzdb(6, zzbwsVarZzP.zzda());
                                    String string12 = parcelZzdb32.readString();
                                    parcelZzdb32.recycle();
                                    View view6 = (View) zzdre.n(zzbwsVarZzP.zzu());
                                    Parcel parcelZzdb33 = zzbwsVarZzP.zzdb(21, zzbwsVarZzP.zzda());
                                    IObjectWrapper iObjectWrapperR6 = IObjectWrapper.Stub.r(parcelZzdb33.readStrongBinder());
                                    parcelZzdb33.recycle();
                                    Parcel parcelZzdb34 = zzbwsVarZzP.zzdb(7, zzbwsVarZzP.zzda());
                                    String string13 = parcelZzdb34.readString();
                                    parcelZzdb34.recycle();
                                    Parcel parcelZzdb35 = zzbwsVarZzP.zzdb(5, zzbwsVarZzP.zzda());
                                    zzbng zzbngVarO5 = zzbnf.O3(parcelZzdb35.readStrongBinder());
                                    parcelZzdb35.recycle();
                                    zzdre zzdreVar = new zzdre();
                                    zzbwsVar = zzbwsVarZzP;
                                    try {
                                        zzdreVar.a = 1;
                                        zzdreVar.b = zzdrdVar3;
                                        zzdreVar.c = zzbmzVarO5;
                                        zzdreVar.d = view5;
                                        zzdreVar.o("headline", string10);
                                        zzdreVar.e = arrayList3;
                                        zzdreVar.o("body", string11);
                                        zzdreVar.h = bundle3;
                                        zzdreVar.o("call_to_action", string12);
                                        zzdreVar.o = view6;
                                        zzdreVar.q = iObjectWrapperR6;
                                        zzdreVar.o(C4664b4.i.F0, string13);
                                        zzdreVar.t = zzbngVarO5;
                                        zzdreVarM = zzdreVar;
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzj("Failed to get native ad from content ad mapper", e);
                                        zzdreVarM = null;
                                    }
                                } catch (RemoteException e5) {
                                    e = e5;
                                    zzbwsVar = zzbwsVarZzP;
                                }
                            }
                        } else {
                            try {
                                Parcel parcelZzdb36 = zzbwrVarZzO.zzdb(17, zzbwrVarZzO.zzda());
                                com.google.android.gms.ads.internal.client.zzea zzeaVarZza4 = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzdb36.readStrongBinder());
                                parcelZzdb36.recycle();
                                zzdrd zzdrdVar4 = zzeaVarZza4 == null ? null : new zzdrd(zzeaVarZza4, null);
                                Parcel parcelZzdb37 = zzbwrVarZzO.zzdb(19, zzbwrVarZzO.zzda());
                                zzbmz zzbmzVarO6 = zzbmy.O3(parcelZzdb37.readStrongBinder());
                                parcelZzdb37.recycle();
                                Parcel parcelZzdb38 = zzbwrVarZzO.zzdb(18, zzbwrVarZzO.zzda());
                                IObjectWrapper iObjectWrapperR7 = IObjectWrapper.Stub.r(parcelZzdb38.readStrongBinder());
                                parcelZzdb38.recycle();
                                View view7 = (View) zzdre.n(iObjectWrapperR7);
                                Parcel parcelZzdb39 = zzbwrVarZzO.zzdb(2, zzbwrVarZzO.zzda());
                                String string14 = parcelZzdb39.readString();
                                parcelZzdb39.recycle();
                                Parcel parcelZzdb40 = zzbwrVarZzO.zzdb(3, zzbwrVarZzO.zzda());
                                ArrayList arrayList4 = parcelZzdb40.readArrayList(zzbfh.a);
                                parcelZzdb40.recycle();
                                zzfnhVar = zzfnhVar2;
                                try {
                                    Parcel parcelZzdb41 = zzbwrVarZzO.zzdb(4, zzbwrVarZzO.zzda());
                                    String string15 = parcelZzdb41.readString();
                                    parcelZzdb41.recycle();
                                    Parcel parcelZzdb42 = zzbwrVarZzO.zzdb(15, zzbwrVarZzO.zzda());
                                    Bundle bundle4 = (Bundle) zzbfh.b(parcelZzdb42, Bundle.CREATOR);
                                    parcelZzdb42.recycle();
                                    zzbwvVar = zzbwvVarZzC;
                                    try {
                                        Parcel parcelZzdb43 = zzbwrVarZzO.zzdb(6, zzbwrVarZzO.zzda());
                                        String string16 = parcelZzdb43.readString();
                                        parcelZzdb43.recycle();
                                        View view8 = (View) zzdre.n(zzbwrVarZzO.r());
                                        zzbwsVar = zzbwsVarZzP;
                                        try {
                                            Parcel parcelZzdb44 = zzbwrVarZzO.zzdb(21, zzbwrVarZzO.zzda());
                                            IObjectWrapper iObjectWrapperR8 = IObjectWrapper.Stub.r(parcelZzdb44.readStrongBinder());
                                            parcelZzdb44.recycle();
                                            Parcel parcelZzdb45 = zzbwrVarZzO.zzdb(8, zzbwrVarZzO.zzda());
                                            String string17 = parcelZzdb45.readString();
                                            parcelZzdb45.recycle();
                                            Parcel parcelZzdb46 = zzbwrVarZzO.zzdb(9, zzbwrVarZzO.zzda());
                                            String string18 = parcelZzdb46.readString();
                                            parcelZzdb46.recycle();
                                            Parcel parcelZzdb47 = zzbwrVarZzO.zzdb(7, zzbwrVarZzO.zzda());
                                            double d2 = parcelZzdb47.readDouble();
                                            parcelZzdb47.recycle();
                                            Parcel parcelZzdb48 = zzbwrVarZzO.zzdb(5, zzbwrVarZzO.zzda());
                                            zzbng zzbngVarO6 = zzbnf.O3(parcelZzdb48.readStrongBinder());
                                            parcelZzdb48.recycle();
                                            zzdre zzdreVar2 = new zzdre();
                                            zzbwrVar = zzbwrVarZzO;
                                            try {
                                                zzdreVar2.a = 2;
                                                zzdreVar2.b = zzdrdVar4;
                                                zzdreVar2.c = zzbmzVarO6;
                                                zzdreVar2.d = view7;
                                                zzdreVar2.o("headline", string14);
                                                zzdreVar2.e = arrayList4;
                                                zzdreVar2.o("body", string15);
                                                zzdreVar2.h = bundle4;
                                                zzdreVar2.o("call_to_action", string16);
                                                zzdreVar2.o = view8;
                                                zzdreVar2.q = iObjectWrapperR8;
                                                zzdreVar2.o(C4664b4.i.U, string17);
                                                zzdreVar2.o("price", string18);
                                                zzdreVar2.r = d2;
                                                zzdreVar2.s = zzbngVarO6;
                                                zzdreVarM = zzdreVar2;
                                            } catch (RemoteException e6) {
                                                e = e6;
                                                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                                zzo.zzj("Failed to get native ad from app install ad mapper", e);
                                                zzdreVarM = null;
                                            }
                                        } catch (RemoteException e7) {
                                            e = e7;
                                            zzbwrVar = zzbwrVarZzO;
                                        }
                                    } catch (RemoteException e8) {
                                        e = e8;
                                        zzbwrVar = zzbwrVarZzO;
                                        zzbwsVar = zzbwsVarZzP;
                                    }
                                } catch (RemoteException e9) {
                                    e = e9;
                                    zzbwrVar = zzbwrVarZzO;
                                    zzbwsVar = zzbwsVarZzP;
                                    zzbwvVar = zzbwvVarZzC;
                                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzj("Failed to get native ad from app install ad mapper", e);
                                    zzdreVarM = null;
                                    if (zzdreVarM != null) {
                                        if (zzfmbVar.a.a.h.contains(Integer.toString(zzdreVarM.q()))) {
                                            o54 o54VarD = this.b.d(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdrp(zzdreVarM), new zzdti(zzbwsVar, zzbwrVar, zzbwvVar));
                                            ((zzeos) zzengVar.c).P3(new zzesh((zzdea) o54VarD.d.zzb(), (zzdmh) o54VarD.f.zzb(), (zzdeu) o54VarD.e.zzb(), (zzdfj) o54VarD.c.zzb(), (zzdfo) o54VarD.g.zzb(), (zzdjg) o54VarD.a.U.zzb(), (zzdgn) o54VarD.h.zzb(), (zzdnf) o54VarD.i.zzb(), (zzdjc) o54VarD.j.zzb(), (zzdep) o54VarD.k.zzb()));
                                            ((zzdfb) o54VarD.b.zzb()).Z(new zzcue(zzfnhVar), this.c);
                                            return o54VarD.d();
                                        }
                                    }
                                    throw new zzeqs(1, "No corresponding native ad listener");
                                }
                            } catch (RemoteException e10) {
                                e = e10;
                                zzfnhVar = zzfnhVar2;
                            }
                        }
                        if (zzdreVarM != null) {
                            if (zzfmbVar.a.a.h.contains(Integer.toString(zzdreVarM.q()))) {
                                o54 o54VarD2 = this.b.d(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdrp(zzdreVarM), new zzdti(zzbwsVar, zzbwrVar, zzbwvVar));
                                ((zzeos) zzengVar.c).P3(new zzesh((zzdea) o54VarD2.d.zzb(), (zzdmh) o54VarD2.f.zzb(), (zzdeu) o54VarD2.e.zzb(), (zzdfj) o54VarD2.c.zzb(), (zzdfo) o54VarD2.g.zzb(), (zzdjg) o54VarD2.a.U.zzb(), (zzdgn) o54VarD2.h.zzb(), (zzdnf) o54VarD2.i.zzb(), (zzdjc) o54VarD2.j.zzb(), (zzdep) o54VarD2.k.zzb()));
                                ((zzdfb) o54VarD2.b.zzb()).Z(new zzcue(zzfnhVar), this.c);
                                return o54VarD2.d();
                            }
                        }
                        throw new zzeqs(1, "No corresponding native ad listener");
                    }
                    zzdreVarM = zzdre.l(zzbwvVarZzC);
                    zzfnhVar = zzfnhVar2;
                    zzbwrVar = zzbwrVarZzO;
                    zzbwsVar = zzbwsVarZzP;
                    zzbwvVar = zzbwvVarZzC;
                    if (zzdreVarM != null) {
                        if (zzfmbVar.a.a.h.contains(Integer.toString(zzdreVarM.q()))) {
                            o54 o54VarD3 = this.b.d(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdrp(zzdreVarM), new zzdti(zzbwsVar, zzbwrVar, zzbwvVar));
                            ((zzeos) zzengVar.c).P3(new zzesh((zzdea) o54VarD3.d.zzb(), (zzdmh) o54VarD3.f.zzb(), (zzdeu) o54VarD3.e.zzb(), (zzdfj) o54VarD3.c.zzb(), (zzdfo) o54VarD3.g.zzb(), (zzdjg) o54VarD3.a.U.zzb(), (zzdgn) o54VarD3.h.zzb(), (zzdnf) o54VarD3.i.zzb(), (zzdjc) o54VarD3.j.zzb(), (zzdep) o54VarD3.k.zzb()));
                            ((zzdfb) o54VarD3.b.zzb()).Z(new zzcue(zzfnhVar), this.c);
                            return o54VarD3.d();
                        }
                    }
                    throw new zzeqs(1, "No corresponding native ad listener");
                } catch (Throwable th) {
                    throw new zzfmq(th);
                }
            } catch (Throwable th2) {
                throw new zzfmq(th2);
            }
        } catch (Throwable th3) {
            throw new zzfmq(th3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final void b(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) throws zzfmq {
        zzfnh zzfnhVar = (zzfnh) zzengVar.b;
        zzfmj zzfmjVar = zzfmbVar.a.a;
        String string = zzflqVar.v.toString();
        String strZzm = zzbp.zzm(zzflqVar.s);
        Context context = this.a;
        zzbwm zzbwmVar = (zzbwm) zzengVar.c;
        zzbmv zzbmvVar = zzfmjVar.j;
        ArrayList arrayList = zzfmjVar.h;
        try {
            zzfnhVar.a.w2(new ObjectWrapper(context), zzfmjVar.d, string, strZzm, zzbwmVar, zzbmvVar, arrayList);
        } catch (Throwable th) {
            throw new zzfmq(th);
        }
    }

    public zzepr(Context context, zzdpn zzdpnVar, Executor executor) {
        this.a = context;
        this.b = zzdpnVar;
        this.c = executor;
    }
}
