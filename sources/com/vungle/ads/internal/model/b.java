package com.vungle.ads.internal.model;

import defpackage.h50;
import defpackage.n30;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public a e;
    public long f;

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return s71.b(this.a, "VUNGLE_AI_LABEL_ICON_URL");
    }

    public final boolean e() {
        return this.e == a.DOWNLOAD_SUCCESS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.e == bVar.e && this.f == bVar.f && this.d == bVar.d && s71.b(this.a, bVar.a) && s71.b(this.b, bVar.b)) {
            return s71.b(this.c, bVar.c);
        }
        return false;
    }

    public final boolean f() {
        return s71.b(this.a, "vmURL");
    }

    public final boolean g() {
        return s71.b(this.a, "MAIN_IMAGE") || s71.b(this.a, "MAIN_VIDEO");
    }

    public final boolean h() {
        return s71.b(this.a, "MAIN_VIDEO");
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + n30.c(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        long j = this.f;
        return Boolean.hashCode(this.d) + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final boolean i() {
        return s71.b(this.a, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean j() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("AdAsset(adIdentifier=");
        sbA.append(this.a);
        sbA.append(", serverPath=");
        sbA.append(this.b);
        sbA.append(", localPath=");
        sbA.append(this.c);
        sbA.append(", status=");
        sbA.append(this.e);
        sbA.append(", fileSize=");
        sbA.append(this.f);
        sbA.append(", isRequired=");
        return h50.m(sbA, this.d, ')');
    }

    public b(String str, String str2, String str3, boolean z) {
        com.explorestack.protobuf.z.r(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = a.NEW;
    }

    public final void a(a aVar) {
        aVar.getClass();
        this.e = aVar;
    }

    public final String a() {
        return this.a;
    }

    public final void a(long j) {
        this.f = j;
    }
}
