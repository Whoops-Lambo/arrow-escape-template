package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class zzafg {
    public static zzafi a(String str, zzafi zzafiVar) throws zzacw {
        if (zzafiVar == null) {
            return null;
        }
        try {
            return zzafiVar.zza(str);
        } catch (Exception e) {
            throw new zzacw(n30.y("Json conversion failed! ", e.getMessage()), e);
        }
    }

    public static String b(String str) throws zzacw {
        if (str.isEmpty()) {
            return null;
        }
        try {
            zzagy zzagyVar = new zzagy();
            zzagyVar.zza(str);
            if (TextUtils.isEmpty(zzagyVar.a)) {
                throw new zzacw("No error message: ".concat(str));
            }
            return zzagyVar.a;
        } catch (Exception e) {
            throw new zzacw(n30.y("Json conversion failed! ", e.getMessage()), e);
        }
    }

    private zzafg() {
    }
}
