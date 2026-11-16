package com.google.android.gms.internal.ads;

import defpackage.dy4;
import defpackage.nl4;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzghu implements nl4 {
    public final zziii a;

    @Override // defpackage.nl4
    public final Object a(FileInputStream fileInputStream) {
        try {
            zziiq zziiqVarB = this.a.b();
            zzigm zzigmVar = zzigm.b;
            int i = dy4.a;
            return zziiqVarB.a(fileInputStream, zzigm.c);
        } catch (zzihu e) {
            throw new t("Cannot read proto.", e);
        }
    }

    @Override // defpackage.nl4
    public final /* synthetic */ void b(Object obj, FileOutputStream fileOutputStream) {
        ((zziii) obj).d(fileOutputStream);
    }

    @Override // defpackage.nl4
    public final /* synthetic */ Object zzc() {
        return this.a;
    }

    public zzghu(zzgil zzgilVar) {
        this.a = zzgilVar;
    }
}
