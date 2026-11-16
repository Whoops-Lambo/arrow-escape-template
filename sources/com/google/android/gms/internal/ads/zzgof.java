package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import defpackage.jy4;
import defpackage.pv1;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgof {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final zzioz d;
    public final zzgsw e;

    public final zzgil b(int i) {
        SharedPreferences sharedPreferences = this.c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrStringToBytes = Hex.stringToBytes(string);
                jy4 jy4Var = zzifx.b;
                zzgil zzgilVarI = zzgil.I(zzifx.H(0, bArrStringToBytes.length, bArrStringToBytes));
                String strE = zzgilVarI.E().E();
                File fileA = zzgbj.a(strE, "pcam.jar", c());
                if (fileA == null) {
                    throw null;
                }
                if (!fileA.exists() && (fileA = zzgbj.a(strE, "pcam", c())) == null) {
                    throw null;
                }
                File fileA2 = zzgbj.a(strE, "pcbc", c());
                if (fileA2 == null) {
                    throw null;
                }
                if (fileA.exists() && fileA2.exists()) {
                    return zzgilVarI;
                }
            } catch (zzihu unused) {
                this.e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.a, Integer.toString(((zzbet) this.d.zzb()).a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = ((zzbet) this.d.zzb()).a;
        return pv1.l(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = ((zzbet) this.d.zzb()).a;
        return pv1.l(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public zzgof(Context context, SharedPreferences sharedPreferences, zzioz zziozVar, zzgsw zzgswVar) {
        this.c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        this.a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        if (dir2.exists() && !dir2.isDirectory()) {
            dir2.delete();
        }
        if (!dir2.exists()) {
            dir2.mkdirs();
        }
        this.b = dir2;
        this.d = zziozVar;
        this.e = zzgswVar;
    }

    public final void a(zzgil zzgilVar, byte[] bArr, byte[] bArr2) {
        String strE = zzgilVar.E().E();
        boolean zIsEmpty = TextUtils.isEmpty(strE);
        zzgsw zzgswVar = this.e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file = this.b;
            zzgbj.d(file);
            file.mkdirs();
            File fileC = zzgbj.c(file, strE);
            fileC.getClass();
            fileC.mkdirs();
            File fileA = zzgbj.a(strE, "pcam.jar", file);
            fileA.getClass();
            if (bArr == null || bArr.length <= 0 || zzgbj.b(fileA, bArr)) {
                File fileA2 = zzgbj.a(strE, "pcbc", file);
                fileA2.getClass();
                if (zzgbj.b(fileA2, bArr2)) {
                    String strE2 = zzgilVar.E().E();
                    if (!TextUtils.isEmpty(strE2)) {
                        File fileA3 = zzgbj.a(strE2, "pcam.jar", file);
                        fileA3.getClass();
                        File fileA4 = zzgbj.a(strE2, "pcbc", file);
                        fileA4.getClass();
                        File fileA5 = zzgbj.a(strE2, "pcam.jar", c());
                        fileA5.getClass();
                        File fileA6 = zzgbj.a(strE2, "pcbc", c());
                        fileA6.getClass();
                        if (fileA3.exists() && !fileA3.renameTo(fileA5)) {
                            zzgswVar.b(15318);
                        } else if (fileA4.exists() && fileA4.renameTo(fileA6)) {
                            zzgil zzgilVarB = b(1);
                            SharedPreferences.Editor editorEdit = this.c.edit();
                            if (zzgilVarB != null && !zzgilVar.E().E().equals(zzgilVarB.E().E())) {
                                editorEdit.putString(d(), Hex.bytesToStringLowercase(zzgilVarB.h()));
                            }
                            editorEdit.putString(e(), Hex.bytesToStringLowercase(zzgilVar.h()));
                            if (!editorEdit.commit()) {
                                zzgswVar.b(15320);
                            }
                        } else {
                            zzgswVar.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    zzgil zzgilVarB2 = b(1);
                    if (zzgilVarB2 != null) {
                        hashSet.add(zzgilVarB2.E().E());
                    }
                    zzgil zzgilVarB3 = b(2);
                    if (zzgilVarB3 != null) {
                        hashSet.add(zzgilVarB3.E().E());
                    }
                    File[] fileArrListFiles = c().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileC2 = zzgbj.c(c(), name);
                                fileC2.getClass();
                                zzgbj.d(fileC2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        zzgswVar.b(15316);
    }
}
